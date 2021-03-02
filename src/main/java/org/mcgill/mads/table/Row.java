package org.mcgill.mads.table;

import javafx.scene.control.Button;

import java.util.ArrayList;

public class Row {
    private ArrayList<Button> buttonList;

    public Row (Button button1, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8) {
        buttonList = new ArrayList<>();
        buttonList.add(button1);
        buttonList.add(button2);
        buttonList.add(button3);
        buttonList.add(button4);
        buttonList.add(button5);
        buttonList.add(button6);
        buttonList.add(button7);
        buttonList.add(button8);
    }

    public ArrayList<Button> getButtonList() {
        return buttonList;
    }
}
