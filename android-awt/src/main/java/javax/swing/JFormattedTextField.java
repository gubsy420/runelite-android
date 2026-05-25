package javax.swing;

import java.io.Serializable;
import java.text.ParseException;

public class JFormattedTextField extends JTextField {
    private static final long serialVersionUID = 1L;

    public abstract static class AbstractFormatter implements Serializable, Cloneable {
        private JFormattedTextField textField;
        public abstract Object stringToValue(String text) throws ParseException;
        public abstract String valueToString(Object value) throws ParseException;
        public void install(JFormattedTextField ftf) { this.textField = ftf; }
        public void uninstall() { this.textField = null; }
        protected JFormattedTextField getFormattedTextField() { return textField; }
        @Override public Object clone() {
            try { return super.clone(); } catch (CloneNotSupportedException e) { throw new InternalError(e); }
        }
    }

    public abstract static class AbstractFormatterFactory {
        public abstract AbstractFormatter getFormatter(JFormattedTextField tf);
    }

    public static final int COMMIT = 0;
    public static final int COMMIT_OR_REVERT = 1;
    public static final int REVERT = 2;
    public static final int PERSIST = 3;

    private Object value;
    private AbstractFormatterFactory formatterFactory;

    public JFormattedTextField() {}
    public JFormattedTextField(Object value) { this.value = value; }
    public JFormattedTextField(java.text.Format format) {}
    public JFormattedTextField(AbstractFormatter formatter) {}
    public JFormattedTextField(AbstractFormatterFactory factory) { this.formatterFactory = factory; }
    public JFormattedTextField(AbstractFormatterFactory factory, Object currentValue) { this.formatterFactory = factory; this.value = currentValue; }

    public void setValue(Object value) { this.value = value; }
    public Object getValue() { return value; }
    public void setFormatterFactory(AbstractFormatterFactory tf) { formatterFactory = tf; }
    public AbstractFormatterFactory getFormatterFactory() { return formatterFactory; }
    public AbstractFormatter getFormatter() { return null; }
    public void commitEdit() throws ParseException {}
    public boolean isEditValid() { return true; }
}
