/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.api.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Records the multiplicative decoder constant ({@code D}) for an obfuscated int/long
 * field, recovered by {@code client-inspector}'s ModArith pass.
 *
 * <p>The OSRS obfuscator stores int/long field values as {@code original * E} mod 2^32
 * (or 2^64), where {@code E} is an odd encoder constant chosen per-field. Every read
 * site multiplies the stored value by {@code D = E^-1} to recover the original. The
 * sanitizer removes the in-bytecode multiplications so the decompiled source reads the
 * field directly, and stamps this annotation on the field declaration so callers that
 * <i>need</i> the raw encoded value (e.g. matching against the server's wire bytes) can
 * recover the encoding without re-doing the analysis.</p>
 *
 * <h2>Using the recorded multipliers</h2>
 * <ul>
 *   <li>To decode a raw stored value: {@code original = stored * intValue()}</li>
 *   <li>To encode a value the way the server would: {@code stored = original * encoder},
 *       where {@code encoder = inverseMod32(intValue())} for int fields, or the equivalent
 *       64-bit modular inverse for long fields.</li>
 * </ul>
 *
 * <p>Either {@link #intValue()} or {@link #longValue()} is populated depending on the
 * field's descriptor — the other stays at its default 0.</p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ObfuscatedGetter
{
    /** Decoder constant for {@code int} fields. Multiply the stored value by this to
     *  recover the original. */
    int intValue() default 0;

    /** Decoder constant for {@code long} fields. */
    long longValue() default 0L;
}
