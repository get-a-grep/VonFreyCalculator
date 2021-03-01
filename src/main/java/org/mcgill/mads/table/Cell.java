package org.mcgill.mads.table;

import javafx.scene.control.CheckBox;

public class Cell {

    private CheckBox x;
    private CheckBox o;

    public Cell (CheckBox x, CheckBox o){
        this.o = o;
        this.x = x;
    }

    public String getXO() {
        if (x.isSelected()) {
            return "X";
        } else if (o.isSelected()) {
            return "O";
        } else {
            return null;
        }
    }

    public CheckBox getX() {
        return x;
    }

    public CheckBox getO() {
        return o;
    }
}
