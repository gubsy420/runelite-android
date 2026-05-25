package javax.swing.text;

import java.util.Enumeration;

public interface MutableAttributeSet extends AttributeSet {
    void addAttribute(Object name, Object value);
    void addAttributes(AttributeSet attributes);
    void removeAttribute(Object name);
    void removeAttributes(Enumeration<?> names);
    void removeAttributes(AttributeSet attributes);
    void setResolveParent(AttributeSet parent);
}
