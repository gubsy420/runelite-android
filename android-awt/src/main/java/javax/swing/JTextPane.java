package javax.swing;

import javax.swing.text.Document;

/**
 * Minimal shadow of {@link javax.swing.JTextPane}. The real component renders styled text
 * via a StyledDocument + StyledEditorKit; android-awt has no styled-document rendering, so
 * we extend {@link JEditorPane} and inherit setText / setEditable / setOpaque / setFont /
 * setBorder / etc.
 *
 * External plugins create these through factory helpers (quest-helper's
 * JGenerator.makeJTextPane) and only call inherited JComponent / JTextComponent methods —
 * but the panel classes declare {@code JTextPane} fields, so without the class present they
 * fail to class-load with NoClassDefFoundError before the plugin can start. Styled text
 * won't be rendered with attributes; text still displays.
 */
public class JTextPane extends JEditorPane {
    public JTextPane() { super(); }

    public JTextPane(Document doc) { super(); if (doc != null) setDocument(doc); }
}
