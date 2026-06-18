<#
.SYNOPSIS
    Run the client-inspector deobfuscation pipeline on a freshly-fetched
    RuneLite injected gamepack jar and sync the cleaned sources into the
    runescape-client module.

.DESCRIPTION
    Given a raw "runelite-<ver>-injected-<hash>.jar" under ./data/, this runs:

        1. :client-inspector:sanitize     raw jar       -> <stem>-clean.jar
        2. :client-inspector:decompile    -clean.jar    -> data/sources/<stem>/
        3. :client-inspector:patchSources fix Vineflower artefacts in <stem>/
        4. :client-inspector:recompile    javac round-trip (verifies it compiles)
        5. :runescape-client:syncSources  data/sources/<stem>/ -> runescape-client/src/main/java

    where <stem> = "runelite-<ver>-injected-<hash>-clean".

    Note: this intentionally does NOT run :client-inspector:updateMap. The
    upstream injected jar already carries @Export/@ObfuscatedName/@Implements,
    so the clean jar is decompiled directly. If you ever need to carry curated
    annotations forward from a previous revision, run updateMap manually with
    -PrefJar pointed at the PREVIOUS revision's -clean.jar.

.PARAMETER RawJar
    Path to the raw injected jar. Defaults to the newest
    data/runelite-*-injected-*.jar that has no pipeline suffix
    (-clean/-mixed/-annotated/-bad/-recompiled).

.PARAMETER JdkHome
    JDK to run Gradle with and to expose javac/jar to the recompile task.
    Defaults to the newest Gradle-8.8-compatible JDK found under
    "C:\Program Files\Java" (prefers 21/17 over 22+). Must contain bin\jar.exe.

.PARAMETER SkipRecompile
    Skip the javac round-trip verification (step 4). Faster, but you lose the
    compile-clean check before syncing.

.EXAMPLE
    .\sync-revision.ps1
    # auto-detect newest raw jar, run the full pipeline

.EXAMPLE
    .\sync-revision.ps1 -RawJar data/runelite-1.12.29.1-injected-27693931657.168.jar
#>
[CmdletBinding()]
param(
    [string]$RawJar,
    [string]$JdkHome,
    [switch]$SkipRecompile
)

$ErrorActionPreference = 'Stop'
$repoRoot = $PSScriptRoot
Set-Location $repoRoot

function Fail([string]$msg) { Write-Host "ERROR: $msg" -ForegroundColor Red; exit 1 }

# --- Resolve the JDK (needs jar.exe; Gradle 8.8 tops out at JDK 22) ----------
if (-not $JdkHome) {
    $candidates = Get-ChildItem 'C:\Program Files\Java' -Directory -ErrorAction SilentlyContinue |
        Where-Object { Test-Path (Join-Path $_.FullName 'bin\jar.exe') } |
        ForEach-Object {
            $ver = 0
            if ($_.Name -match 'jdk-?(\d+)') { $ver = [int]$Matches[1] }
            [pscustomobject]@{ Path = $_.FullName; Major = $ver }
        } |
        Where-Object { $_.Major -ge 17 -and $_.Major -le 22 } |
        Sort-Object Major -Descending
    if (-not $candidates) { Fail "No Gradle-8.8-compatible JDK (17..22, with jar.exe) under C:\Program Files\Java. Pass -JdkHome." }
    $JdkHome = $candidates[0].Path
}
if (-not (Test-Path (Join-Path $JdkHome 'bin\jar.exe')))  { Fail "JdkHome '$JdkHome' has no bin\jar.exe" }
if (-not (Test-Path (Join-Path $JdkHome 'bin\javac.exe'))) { Fail "JdkHome '$JdkHome' has no bin\javac.exe" }

$env:JAVA_HOME = $JdkHome
$env:PATH = (Join-Path $JdkHome 'bin') + [IO.Path]::PathSeparator + $env:PATH
Write-Host "Using JDK: $JdkHome" -ForegroundColor Cyan

# --- Resolve the raw jar -----------------------------------------------------
if (-not $RawJar) {
    $suffixes = '-clean','-mixed','-annotated','-bad','-recompiled'
    $RawJar = Get-ChildItem 'data' -Filter 'runelite-*-injected-*.jar' -ErrorAction SilentlyContinue |
        Where-Object { $n = $_.BaseName; -not ($suffixes | Where-Object { $n.EndsWith($_) }) } |
        Sort-Object LastWriteTime -Descending |
        Select-Object -First 1 -ExpandProperty FullName
    if (-not $RawJar) { Fail "No raw runelite-*-injected-*.jar found under data\. Pass -RawJar." }
}
if (-not (Test-Path $RawJar)) { Fail "Raw jar not found: $RawJar" }

# Normalise to the repo-relative forward-slash form the gradle tasks expect.
# (Windows PowerShell 5.1 has no [IO.Path]::GetRelativePath, so strip manually.)
$rawFull   = (Resolve-Path $RawJar).Path
$rootPrefix = $repoRoot.TrimEnd('\') + '\'
if (-not $rawFull.StartsWith($rootPrefix, [StringComparison]::OrdinalIgnoreCase)) {
    Fail "Raw jar must live under the repo ($repoRoot): $rawFull"
}
$rawRel    = $rawFull.Substring($rootPrefix.Length) -replace '\\','/'
$stem      = [IO.Path]::GetFileNameWithoutExtension($rawFull) + '-clean'
$cleanRel  = "data/$stem.jar"

Write-Host "Raw jar   : $rawRel"      -ForegroundColor Cyan
Write-Host "Clean jar : $cleanRel"    -ForegroundColor Cyan
Write-Host "Stem      : $stem"        -ForegroundColor Cyan
Write-Host ""

# --- Gradle helper (fail-fast on non-zero exit) ------------------------------
function Invoke-Gradle([string]$label, [string[]]$gradleArgs) {
    Write-Host ">>> $label" -ForegroundColor Green
    Write-Host "    gradlew $($gradleArgs -join ' ')" -ForegroundColor DarkGray
    & "$repoRoot\gradlew.bat" @gradleArgs
    if ($LASTEXITCODE -ne 0) { Fail "$label failed (exit $LASTEXITCODE)" }
    Write-Host ""
}

# --- Pipeline ----------------------------------------------------------------
Invoke-Gradle "1/5 sanitize"     @(':client-inspector:sanitize',     "-PinJar=$rawRel")
if (-not (Test-Path $cleanRel)) { Fail "sanitize did not produce $cleanRel" }

Invoke-Gradle "2/5 decompile"    @(':client-inspector:decompile',    "-PinJar=$cleanRel")
if (-not (Test-Path "data/sources/$stem")) { Fail "decompile did not produce data/sources/$stem" }

Invoke-Gradle "3/5 patchSources" @(':client-inspector:patchSources', "-Pstem=$stem")

if (-not $SkipRecompile) {
    Invoke-Gradle "4/5 recompile" @(':client-inspector:recompile',   "-Pstem=$stem")
} else {
    Write-Host ">>> 4/5 recompile SKIPPED (-SkipRecompile)" -ForegroundColor Yellow
    Write-Host ""
}

Invoke-Gradle "5/5 syncSources"  @(':runescape-client:syncSources',  "-Pstem=$stem")

Write-Host "Done. runescape-client sources synced from data/sources/$stem" -ForegroundColor Green
Write-Host "Review with: git status runescape-client/src/main/java" -ForegroundColor Green
