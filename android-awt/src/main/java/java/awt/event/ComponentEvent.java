package java.awt.event;

import java.awt.AWTEvent;
import java.awt.Component;



public class ComponentEvent extends AWTEvent {
    private static final long serialVersionUID = 8101406823902992965L;

    public static final int COMPONENT_FIRST   = 100;
    public static final int COMPONENT_MOVED   = 100;
    public static final int COMPONENT_RESIZED = 101;
    public static final int COMPONENT_SHOWN   = 102;
    public static final int COMPONENT_HIDDEN  = 103;
    public static final int COMPONENT_LAST    = 103;

    public ComponentEvent(Component source, int id) {
        super(source, id);
    }

    public Component getComponent() {
        return (source instanceof Component) ? (Component) source : null;
    }
}
