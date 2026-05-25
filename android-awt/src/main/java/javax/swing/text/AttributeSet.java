package javax.swing.text;

import java.util.Enumeration;

public interface AttributeSet {
    String NameAttribute = "$ename";
    String ResolveAttribute = "$resolver";

    int getAttributeCount();
    boolean isDefined(Object attrName);
    boolean isEqual(AttributeSet attr);
    AttributeSet copyAttributes();
    Object getAttribute(Object key);
    Enumeration<?> getAttributeNames();
    boolean containsAttribute(Object name, Object value);
    boolean containsAttributes(AttributeSet attributes);
    AttributeSet getResolveParent();

    interface CharacterAttribute {}
    interface ColorAttribute {}
    interface FontAttribute {}
    interface ParagraphAttribute {}
}
