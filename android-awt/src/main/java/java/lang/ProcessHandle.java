package java.lang;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Stub of {@code java.lang.ProcessHandle} (JDK 9+). Android lacks the class; RuneLite
 * uses it for {@code current().pid()} logging — we return {@link android.os.Process#myPid()}.
 */
public interface ProcessHandle {
    static ProcessHandle current() {
        return CurrentHandle.INSTANCE;
    }

    static Optional<ProcessHandle> of(long pid) {
        return Optional.empty();
    }

    static Stream<ProcessHandle> allProcesses() {
        return Stream.empty();
    }

    long pid();

    default Optional<ProcessHandle> parent() { return Optional.empty(); }
    default Stream<ProcessHandle> children() { return Stream.empty(); }
    default Stream<ProcessHandle> descendants() { return Stream.empty(); }
    default Info info() { return new StubInfo(); }
    default boolean isAlive() { return true; }
    default boolean supportsNormalTermination() { return false; }
    default boolean destroy() { return false; }
    default boolean destroyForcibly() { return false; }
    default java.util.concurrent.CompletableFuture<ProcessHandle> onExit() {
        return java.util.concurrent.CompletableFuture.completedFuture(this);
    }

    interface Info {
        Optional<String> command();
        Optional<String> commandLine();
        Optional<String[]> arguments();
        Optional<java.time.Instant> startInstant();
        Optional<java.time.Duration> totalCpuDuration();
        Optional<String> user();
    }

    final class CurrentHandle implements ProcessHandle {
        static final CurrentHandle INSTANCE = new CurrentHandle();
        @Override public long pid() {
            return android.os.Process.myPid();
        }
    }

    final class StubInfo implements Info {
        @Override public Optional<String> command() { return Optional.empty(); }
        @Override public Optional<String> commandLine() { return Optional.empty(); }
        @Override public Optional<String[]> arguments() { return Optional.empty(); }
        @Override public Optional<java.time.Instant> startInstant() { return Optional.empty(); }
        @Override public Optional<java.time.Duration> totalCpuDuration() { return Optional.empty(); }
        @Override public Optional<String> user() { return Optional.empty(); }
    }
}
