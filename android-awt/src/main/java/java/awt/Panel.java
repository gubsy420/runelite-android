package java.awt;

public class Panel extends Container {
    private static final long serialVersionUID = -2728009084054400034L;

    // Real AWT Panel defaults to FlowLayout, but the patched RuneScape applet (Applet
    // extends Panel) expects setBounds()-positioned children to stay where it put them,
    // not be re-flowed to FlowLayout.CENTER once the applet grows to fill its parent.
    // RuneLite's other panels always setLayout() explicitly, so leaving null here is safe.
    public Panel() {
    }

    public Panel(LayoutManager layout) {
        setLayout(layout);
    }
}
