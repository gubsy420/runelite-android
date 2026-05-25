package javax.swing.text.html;

public class HTML {
    public static class Tag {
        public static final Tag A = new Tag("a");
        public static final Tag BODY = new Tag("body");
        public static final Tag BR = new Tag("br");
        public static final Tag DIV = new Tag("div");
        public static final Tag P = new Tag("p");

        private final String name;
        public Tag() { this("unknown"); }
        public Tag(String name) { this.name = name; }
        public String toString() { return name; }
    }

    public static class Attribute {
        public static final Attribute HREF = new Attribute("href");
        public static final Attribute CLASS = new Attribute("class");
        public static final Attribute ID = new Attribute("id");
        public static final Attribute STYLE = new Attribute("style");

        private final String name;
        Attribute(String name) { this.name = name; }
        public String toString() { return name; }
    }
}
