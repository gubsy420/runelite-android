package net.runelite.mp.util;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.util.function.Function;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/**
 * Runtime helper that {@code DesugarStringConcatTask} rewrites
 * {@code invokedynamic makeConcatWithConstants} sites into. Plain Java 8 bytecode, no
 * invokedynamic — survives D8 untouched.
 */
public final class IndyConcat {
    private IndyConcat() {}

    /**
     * @param recipe the recipe string from the original bootstrap (with {@code } =
     *               next runtime arg, {@code } = next bootstrap-time constant).
     * @param args   the runtime arguments to the indy, boxed in order.
     * @param consts the bootstrap-time constants (positions 1..n of the original BSM args).
     */
    public static String concat(String recipe, Object[] args, Object[] consts) {
        StringBuilder out = new StringBuilder();
        StringBuilder literal = new StringBuilder();
        int argIdx = 0;
        int constIdx = 0;
        int len = recipe.length();
        for (int i = 0; i < len; i++) {
            char c = recipe.charAt(i);
            if (c == '') {
                flush(out, literal);
                out.append(args[argIdx++]);
            } else if (c == '') {
                flush(out, literal);
                out.append(consts[constIdx++]);
            } else {
                literal.append(c);
            }
        }
        flush(out, literal);
        return out.toString();
    }

    private static void flush(StringBuilder out, StringBuilder literal) {
        if (literal.length() > 0) {
            out.append(literal);
            literal.setLength(0);
        }
    }

    /**
     * Replaces Java 9+ Matcher.replaceAll(Function) with Java 8 compatible bytecode.
     */
    public static String replaceAllJava8(Matcher matcher, Function<MatchResult, String> function) {
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            MatchResult matchResult = matcher.toMatchResult();
            String replacement = function.apply(matchResult);
            matcher.appendReplacement(sb, Matcher.quoteReplacement(replacement));
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    /**
     * Polyfills Java 9+ MethodHandles.privateLookupIn(Class, Lookup) for Android.
     */
    public static MethodHandles.Lookup privateLookupInJava8(Class<?> targetClass, MethodHandles.Lookup lookup) throws Exception {
        try {
            // Check if native version exists (future-proofing or high API targets)
            return (MethodHandles.Lookup) MethodHandles.class
                    .getMethod("privateLookupIn", Class.class, MethodHandles.Lookup.class)
                    .invoke(null, targetClass, lookup);
        } catch (NoSuchMethodException e) {
            // Fallback: Emulate deep private lookup via Java 8 reflection trickery
            Constructor<MethodHandles.Lookup> constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, int.class);
            if (!constructor.isAccessible()) {
                constructor.setAccessible(true);
            }
            // 0x40 represents Lookup.PRIVATE | Lookup.PROTECTED | Lookup.PACKAGE | Lookup.PUBLIC
            // This provides all-access internal capability required by RuneLite's eventbus
            return constructor.newInstance(targetClass, 0x40);
        }
    }
}
