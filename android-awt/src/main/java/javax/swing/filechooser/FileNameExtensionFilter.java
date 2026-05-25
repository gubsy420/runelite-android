package javax.swing.filechooser;

import java.io.File;
import java.util.Locale;

public final class FileNameExtensionFilter extends FileFilter {
    private final String description;
    private final String[] extensions;
    private final String[] lowerExtensions;

    public FileNameExtensionFilter(String description, String... extensions) {
        if (extensions == null || extensions.length == 0) {
            throw new IllegalArgumentException("Extensions must be non-null and non-empty");
        }
        this.description = description;
        this.extensions = extensions.clone();
        this.lowerExtensions = new String[extensions.length];
        for (int i = 0; i < extensions.length; i++) {
            lowerExtensions[i] = extensions[i].toLowerCase(Locale.ENGLISH);
        }
    }

    @Override
    public boolean accept(File f) {
        if (f == null) return false;
        if (f.isDirectory()) return true;
        String name = f.getName();
        int dot = name.lastIndexOf('.');
        if (dot < 0 || dot == name.length() - 1) return false;
        String ext = name.substring(dot + 1).toLowerCase(Locale.ENGLISH);
        for (String e : lowerExtensions) if (ext.equals(e)) return true;
        return false;
    }

    @Override public String getDescription() { return description; }
    public String[] getExtensions() { return extensions.clone(); }
}
