package javax.swing;

import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import javax.swing.table.AbstractTableModel;

public class JTable extends JComponent implements Scrollable {
    private static final long serialVersionUID = 1L;
    public static final int AUTO_RESIZE_OFF = 0;
    public static final int AUTO_RESIZE_NEXT_COLUMN = 1;
    public static final int AUTO_RESIZE_SUBSEQUENT_COLUMNS = 2;
    public static final int AUTO_RESIZE_LAST_COLUMN = 3;
    public static final int AUTO_RESIZE_ALL_COLUMNS = 4;

    protected TableModel dataModel;
    protected int rowHeight = 16;
    protected int rowMargin = 1;
    protected boolean rowSelectionAllowed = true;
    protected boolean columnSelectionAllowed = false;
    protected int autoResizeMode = AUTO_RESIZE_SUBSEQUENT_COLUMNS;
    protected boolean autoCreateColumnsFromModel = true;

    public JTable() { this(new javax.swing.table.AbstractTableModel() {
        private static final long serialVersionUID = 1L;
        @Override public int getRowCount() { return 0; }
        @Override public int getColumnCount() { return 0; }
        @Override public Object getValueAt(int r, int c) { return null; }
    }); }
    public JTable(TableModel dm) { this.dataModel = dm; }
    public JTable(Object[][] rowData, Object[] columnNames) { this(); }
    public JTable(int numRows, int numColumns) { this(); }
    public JTable(java.util.Vector<? extends java.util.Vector> rowData, java.util.Vector<?> columnNames) { this(); }

    public TableModel getModel() { return dataModel; }
    public void setModel(TableModel m) { this.dataModel = m; }
    public int getRowHeight() { return rowHeight; }
    public void setRowHeight(int h) { this.rowHeight = h; }
    public int getRowHeight(int row) { return rowHeight; }
    public void setRowHeight(int row, int h) {}
    public int getRowMargin() { return rowMargin; }
    public void setRowMargin(int m) { this.rowMargin = m; }
    public boolean getRowSelectionAllowed() { return rowSelectionAllowed; }
    public void setRowSelectionAllowed(boolean b) { this.rowSelectionAllowed = b; }
    public boolean getColumnSelectionAllowed() { return columnSelectionAllowed; }
    public void setColumnSelectionAllowed(boolean b) { this.columnSelectionAllowed = b; }
    public int getAutoResizeMode() { return autoResizeMode; }
    public void setAutoResizeMode(int mode) { this.autoResizeMode = mode; }
    public boolean getAutoCreateColumnsFromModel() { return autoCreateColumnsFromModel; }
    public void setAutoCreateColumnsFromModel(boolean v) { this.autoCreateColumnsFromModel = v; }
    public int getSelectedRow() { return -1; }
    public int[] getSelectedRows() { return new int[0]; }
    public int getSelectedRowCount() { return 0; }
    public int getSelectedColumn() { return -1; }
    public int[] getSelectedColumns() { return new int[0]; }
    public int getSelectedColumnCount() { return 0; }
    public boolean isRowSelected(int row) { return false; }
    public boolean isColumnSelected(int col) { return false; }
    public boolean isCellSelected(int row, int col) { return false; }
    public void clearSelection() {}
    public void selectAll() {}
    public Object getValueAt(int row, int col) { return dataModel.getValueAt(row, col); }
    public void setValueAt(Object value, int row, int col) { dataModel.setValueAt(value, row, col); }
    public int getRowCount() { return dataModel.getRowCount(); }
    public int getColumnCount() { return dataModel.getColumnCount(); }
    public String getColumnName(int col) { return dataModel.getColumnName(col); }
    public Class<?> getColumnClass(int col) { return dataModel.getColumnClass(col); }
    public boolean isCellEditable(int row, int col) { return dataModel.isCellEditable(row, col); }
    public Rectangle getCellRect(int row, int column, boolean includeSpacing) { return new Rectangle(); }
    public void addRowSelectionInterval(int index0, int index1) {}
    public void addColumnSelectionInterval(int index0, int index1) {}
    public void setRowSelectionInterval(int index0, int index1) {}
    public void setColumnSelectionInterval(int index0, int index1) {}
    public void removeRowSelectionInterval(int index0, int index1) {}
    public void removeColumnSelectionInterval(int index0, int index1) {}
    public void scrollRectToVisible(Rectangle aRect) {}
    public boolean editCellAt(int row, int column) { return false; }
    public Component prepareRenderer(javax.swing.table.TableCellRenderer renderer, int row, int column) { return null; }

    @Override public java.awt.Dimension getPreferredScrollableViewportSize() { return getPreferredSize(); }
    @Override public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) { return rowHeight; }
    @Override public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) { return 1; }
    @Override public boolean getScrollableTracksViewportWidth() { return false; }
    @Override public boolean getScrollableTracksViewportHeight() { return false; }
}
