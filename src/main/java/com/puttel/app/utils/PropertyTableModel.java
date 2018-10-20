package com.puttel.app.utils;

import javafx.util.Pair;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class PropertyTableModel extends AbstractTableModel {
    String [] columns = {"Property", "Value"};
    List<Pair<String, String>> data;
    public PropertyTableModel(){

    }
    public int getRowCount() {
        return data.size();
    }
    public int getColumnCount() {
        return columns.length;
    }
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pair<String, String> entry = data.get(rowIndex);
        return columnIndex == 0 ? entry.getKey() : entry.getValue();
    }
}
