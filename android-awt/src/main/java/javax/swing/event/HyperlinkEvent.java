package javax.swing.event;

import java.net.URL;
import java.util.EventObject;
import javax.swing.text.Element;

public class HyperlinkEvent extends EventObject {
    private static final long serialVersionUID = -2031426547250532301L;

    public static final class EventType {
        public static final EventType ENTERED = new EventType("ENTERED");
        public static final EventType EXITED = new EventType("EXITED");
        public static final EventType ACTIVATED = new EventType("ACTIVATED");
        private final String name;
        private EventType(String name) { this.name = name; }
        @Override public String toString() { return name; }
    }

    private final EventType type;
    private final URL url;
    private final String desc;
    private final Element sourceElement;

    public HyperlinkEvent(Object source, EventType type, URL url) { this(source, type, url, null, null); }
    public HyperlinkEvent(Object source, EventType type, URL url, String desc) { this(source, type, url, desc, null); }
    public HyperlinkEvent(Object source, EventType type, URL url, String desc, Element sourceElement) {
        super(source);
        this.type = type; this.url = url; this.desc = desc; this.sourceElement = sourceElement;
    }

    public EventType getEventType() { return type; }
    public URL getURL() { return url; }
    public String getDescription() { return desc; }
    public Element getSourceElement() { return sourceElement; }
}
