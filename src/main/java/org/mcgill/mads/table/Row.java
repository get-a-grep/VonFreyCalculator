package org.mcgill.mads.table;

import java.util.ArrayList;

public class Row {
    private ArrayList<Cell> cellList;

    public Row (Cell cell1, Cell cell2, Cell cell3, Cell cell4, Cell cell5, Cell cell6, Cell cell7, Cell cell8) {
        cellList = new ArrayList<>();
        cellList.add(cell1);
        cellList.add(cell2);
        cellList.add(cell3);
        cellList.add(cell4);
        cellList.add(cell5);
        cellList.add(cell6);
        cellList.add(cell7);
        cellList.add(cell8);
    }

    public ArrayList<Cell> getCellList() {
        return cellList;
    }
}
