package java.awt;

public class ImageCapabilities implements Cloneable {
    private final boolean accelerated;

    public ImageCapabilities(boolean accelerated) { this.accelerated = accelerated; }

    public boolean isAccelerated() { return accelerated; }
    public boolean isTrueVolatile() { return false; }

    @Override
    public Object clone() {
        try { return super.clone(); } catch (CloneNotSupportedException e) { throw new InternalError(e); }
    }
}
