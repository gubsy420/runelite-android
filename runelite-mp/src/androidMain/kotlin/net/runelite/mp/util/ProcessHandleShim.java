package net.runelite.mp.util;

import java.util.Optional;

/**
 * Replacement for {@code ProcessHandle.Info#command()} on Android. The runtime returns the
 * raw {@code /proc/PID/cmdline} buffer, which is a NUL-separated argv on Linux/Android
 * (e.g. {@code "app_process64\0--application\0...\0"}). The patched RuneScape client feeds
 * that string into its login machine-info packet via {@code xi.cq}, which throws
 * {@link IllegalArgumentException} on any string containing a NUL — manifesting as
 * "error_game_crash" the moment the login button is hit.
 *
 * <p>{@code DesugarLambdasTask} rewrites every {@code INVOKEINTERFACE ProcessHandle$Info.command()}
 * site to an {@code INVOKESTATIC} call here with descriptor
 * {@code (Ljava/lang/Object;)Ljava/util/Optional;}. We take {@code Object} because Android's
 * {@code android.jar} hides {@code ProcessHandle} / {@code ProcessHandle$Info} from javac
 * (the classes do exist at runtime since API 26), so we reach the method reflectively.
 */
public final class ProcessHandleShim {
    private ProcessHandleShim() {
    }

    public static Optional<String> sanitizedCommand(Object info) {
        if (info == null) {
            return Optional.empty();
        }
        Optional<?> raw;
        try {
            Object result = info.getClass().getMethod("command").invoke(info);
            if (!(result instanceof Optional)) {
                return Optional.empty();
            }
            raw = (Optional<?>) result;
        } catch (Throwable t) {
            return Optional.empty();
        }
        if (!raw.isPresent()) {
            return Optional.empty();
        }
        Object value = raw.get();
        if (!(value instanceof String)) {
            return Optional.empty();
        }
        String s = (String) value;
        int nul = s.indexOf(0);
        if (nul < 0) {
            return Optional.of(s);
        }
        return Optional.of(s.substring(0, nul));
    }
}
