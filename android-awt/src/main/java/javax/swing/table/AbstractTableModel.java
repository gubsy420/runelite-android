package javax.swing.table;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public abstract class AbstractTableModel implements TableModel, Serializable {
    private static final long serialVersionUID = -5798593159423650347L;
    protected final List<TableModelListener> listeners = new ArrayList<>();

    public AbstractTableModel() {}

    @Override public String getColumnName(int column) { return Character.toString((char) ('A' + column)); }
    public int findColumn(String columnName) { return -1; }
    @Override public Class<?> getColumnClass(int columnIndex) { return Object.class; }
    @Override public boolean isCellEditable(int rowIndex, int columnIndex) { return false; }
    @Override public void setValueAt(Object aValue, int rowIndex, int columnIndex) {}

    @Override public void addTableModelListener(TableModelListener l) { if (l != null) listeners.add(l); }
    @Override public void removeTableModelListener(TableModelListener l) { listeners.remove(l); }

    public void fireTableDataChanged() { fire(new TableModelEvent(this)); }
    public void fireTableStructureChanged() { fire(new TableModelEvent(this, TableModelEvent.HEADER_ROW)); }
    public void fireTableRowsInserted(int firstRow, int lastRow) { fire(new TableModelEvent(this, firstRow, lastRow, TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT)); }
    public void fireTableRowsUpdated(int firstRow, int lastRow) { fire(new TableModelEvent(this, firstRow, lastRow)); }
    public void fireTableRowsDeleted(int firstRow, int lastRow) { fire(new TableModelEvent(this, firstRow, lastRow, TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE)); }
    public void fireTableCellUpdated(int row, int column) { fire(new TableModelEvent(this, row, row, column)); }
    public void fireTableChanged(TableModelEvent e) { fire(e); }

    private void fire(TableModelEvent e) {
        for (TableModelListener l : new ArrayList<>(listeners)) l.tableChanged(e);
    }
}
