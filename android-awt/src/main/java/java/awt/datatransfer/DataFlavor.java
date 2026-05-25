package java.awt.datatransfer;

import java.io.Serializable;

public class DataFlavor implements Cloneable, Serializable {
    private static final long serialVersionUID = 8367026044764648243L;

    public static final DataFlavor stringFlavor = new DataFlavor("application/x-java-serialized-object; class=java.lang.String", "Unicode String", String.class);
    public static final DataFlavor plainTextFlavor = new DataFlavor("text/plain; charset=unicode; class=java.io.InputStream", "Plain Text");
    public static final DataFlavor javaFileListFlavor = new DataFlavor("application/x-java-file-list", "Java File List");

    private final String mimeType;
    private final String humanName;
    private final Class<?> representationClass;

    public DataFlavor() {
        this("application/x-java-serialized-object", "(no description)");
    }

    public DataFlavor(String mimeType, String humanName) {
        this(mimeType, humanName, Object.class);
    }

    public DataFlavor(String mimeType, String humanName, Class<?> repClass) {
        this.mimeType = mimeType;
        this.humanName = humanName;
        this.representationClass = repClass;
    }

    public DataFlavor(Class<?> representationClass, String humanName) {
        this("application/x-java-serialized-object; class=" + representationClass.getName(), humanName, representationClass);
    }

    public String getMimeType() { return mimeType; }
    public String getHumanPresentableName() { return humanName; }
    public Class<?> getRepresentationClass() { return representationClass; }
    public boolean isMimeTypeEqual(String mt) { return mimeType.equalsIgnoreCase(mt); }
    public boolean isMimeTypeEqual(DataFlavor flavor) { return flavor != null && isMimeTypeEqual(flavor.mimeType); }
    public boolean equals(DataFlavor f) { return f != null && isMimeTypeEqual(f) && representationClass.equals(f.representationClass); }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof DataFlavor && equals((DataFlavor) obj);
    }

    @Override
    public int hashCode() {
        return mimeType.hashCode() ^ representationClass.hashCode();
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }
}
