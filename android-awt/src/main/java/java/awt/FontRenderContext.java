package java.awt;

import java.awt.geom.AffineTransform;

public class FontRenderContext {
    private final AffineTransform tx;
    private final boolean antialiased;
    private final boolean fractionalMetrics;

    public FontRenderContext() {
        this(null, false, false);
    }

    public FontRenderContext(AffineTransform tx, boolean isAntiAliased, boolean usesFractionalMetrics) {
        this.tx = (tx == null) ? new AffineTransform() : new AffineTransform(tx);
        this.antialiased = isAntiAliased;
        this.fractionalMetrics = usesFractionalMetrics;
    }

    public AffineTransform getTransform()      { return new AffineTransform(tx); }
    public boolean isAntiAliased()             { return antialiased; }
    public boolean usesFractionalMetrics()     { return fractionalMetrics; }
    public boolean isTransformed()             { return !tx.isIdentity(); }
}
