package java.awt;

import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;

public interface Paint extends Transparency {
    default PaintContext createContext(ColorModel cm, Rectangle deviceBounds, Rectangle2D userBounds,
                                        AffineTransform xform, RenderingHints hints) {
        // The runtime renderer pulls colour values directly from concrete Paint
        // subclasses (e.g. Color.getRGB) rather than going through the OpenJDK
        // PaintContext pipeline, so this stays a default no-op.
        throw new UnsupportedOperationException("PaintContext is not used by the runelite-awt renderer");
    }
}
