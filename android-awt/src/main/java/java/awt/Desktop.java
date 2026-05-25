package java.awt;

import java.io.IOException;
import java.net.URI;
import java.util.EnumSet;
import java.util.Set;

public class Desktop {
    public enum Action {
        OPEN, EDIT, PRINT, MAIL, BROWSE, APP_EVENT_FOREGROUND, APP_EVENT_HIDDEN,
        APP_EVENT_REOPENED, APP_EVENT_SCREEN_SLEEP, APP_EVENT_SYSTEM_SLEEP,
        APP_EVENT_USER_SESSION, APP_ABOUT, APP_PREFERENCES, APP_OPEN_FILE, APP_PRINT_FILE,
        APP_OPEN_URI, APP_QUIT_HANDLER, APP_QUIT_STRATEGY, APP_SUDDEN_TERMINATION,
        APP_REQUEST_FOREGROUND, APP_HELP_VIEWER, APP_MENU_BAR, BROWSE_FILE_DIR, MOVE_TO_TRASH
    }

    private static final Desktop INSTANCE = new Desktop();
    private static final Set<Action> SUPPORTED = EnumSet.noneOf(Action.class);

    public static Desktop getDesktop() {
        return INSTANCE;
    }

    public static boolean isDesktopSupported() {
        return false;
    }

    public boolean isSupported(Action action) {
        return SUPPORTED.contains(action);
    }

    public void browse(URI uri) throws IOException {
        // Desktop chrome isn't available on Android; host bridge should override this
        // by launching an android.content.Intent.ACTION_VIEW.
        throw new UnsupportedOperationException("Desktop.browse not implemented in headless shadow");
    }

    public void open(java.io.File file) throws IOException {
        throw new UnsupportedOperationException("Desktop.open not implemented in headless shadow");
    }

    public void edit(java.io.File file) throws IOException {
        throw new UnsupportedOperationException("Desktop.edit not implemented in headless shadow");
    }

    public void mail(URI uri) throws IOException {
        throw new UnsupportedOperationException("Desktop.mail not implemented in headless shadow");
    }
}
