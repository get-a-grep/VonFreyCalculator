package org.mcgill.mads.ui;

import org.mcgill.mads.exception.GUIErrorMessage;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.mcgill.mads.table.Cell;
import org.mcgill.mads.table.Row;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

public class VfcController {

    @FXML
    private TextField testerName;

    @FXML
    private TextField testerInterval;

    @FXML
    private TextField xfValue2;

    @FXML
    private TextField xfValue3;

    @FXML
    private TextField xfValue4;

    @FXML
    private TextField xfValue5;

    @FXML
    private TextField xfValue6;

    @FXML
    private TextField xfValue7;

    @FXML
    private TextField xfValue8;

    @FXML
    private TextField xfValue9;

    @FXML
    private Button saveButton;

    @FXML
    private TextArea endingXF;

    @FXML
    private TextArea xoSeries;

    @FXML
    private TextArea answer;

    @FXML
    private Button calculate;

    @FXML
    private Button clearButton;

    @FXML
    private CheckBox xo1xf5X;
    @FXML
    private CheckBox xo1xf5O;

    @FXML
    private CheckBox xo2xf2X;
    @FXML
    private CheckBox xo2xf2O;
    @FXML
    private CheckBox xo2xf3X;
    @FXML
    private CheckBox xo2xf3O;
    @FXML
    private CheckBox xo2xf4X;
    @FXML
    private CheckBox xo2xf4O;
    @FXML
    private CheckBox xo2xf5X;
    @FXML
    private CheckBox xo2xf5O;
    @FXML
    private CheckBox xo2xf6X;
    @FXML
    private CheckBox xo2xf6O;
    @FXML
    private CheckBox xo2xf7X;
    @FXML
    private CheckBox xo2xf7O;
    @FXML
    private CheckBox xo2xf8X;
    @FXML
    private CheckBox xo2xf8O;
    @FXML
    private CheckBox xo2xf9X;
    @FXML
    private CheckBox xo2xf9O;

    @FXML
    private CheckBox xo3xf2X;
    @FXML
    private CheckBox xo3xf2O;
    @FXML
    private CheckBox xo3xf3X;
    @FXML
    private CheckBox xo3xf3O;
    @FXML
    private CheckBox xo3xf4X;
    @FXML
    private CheckBox xo3xf4O;
    @FXML
    private CheckBox xo3xf5X;
    @FXML
    private CheckBox xo3xf5O;
    @FXML
    private CheckBox xo3xf6X;
    @FXML
    private CheckBox xo3xf6O;
    @FXML
    private CheckBox xo3xf7X;
    @FXML
    private CheckBox xo3xf7O;
    @FXML
    private CheckBox xo3xf8X;
    @FXML
    private CheckBox xo3xf8O;
    @FXML
    private CheckBox xo3xf9X;
    @FXML
    private CheckBox xo3xf9O;

    @FXML
    private CheckBox xo4xf2X;
    @FXML
    private CheckBox xo4xf2O;
    @FXML
    private CheckBox xo4xf3X;
    @FXML
    private CheckBox xo4xf3O;
    @FXML
    private CheckBox xo4xf4X;
    @FXML
    private CheckBox xo4xf4O;
    @FXML
    private CheckBox xo4xf5X;
    @FXML
    private CheckBox xo4xf5O;
    @FXML
    private CheckBox xo4xf6X;
    @FXML
    private CheckBox xo4xf6O;
    @FXML
    private CheckBox xo4xf7X;
    @FXML
    private CheckBox xo4xf7O;
    @FXML
    private CheckBox xo4xf8X;
    @FXML
    private CheckBox xo4xf8O;
    @FXML
    private CheckBox xo4xf9X;
    @FXML
    private CheckBox xo4xf9O;

    @FXML
    private CheckBox xo5xf2X;
    @FXML
    private CheckBox xo5xf2O;
    @FXML
    private CheckBox xo5xf3X;
    @FXML
    private CheckBox xo5xf3O;
    @FXML
    private CheckBox xo5xf4X;
    @FXML
    private CheckBox xo5xf4O;
    @FXML
    private CheckBox xo5xf5X;
    @FXML
    private CheckBox xo5xf5O;
    @FXML
    private CheckBox xo5xf6X;
    @FXML
    private CheckBox xo5xf6O;
    @FXML
    private CheckBox xo5xf7X;
    @FXML
    private CheckBox xo5xf7O;
    @FXML
    private CheckBox xo5xf8X;
    @FXML
    private CheckBox xo5xf8O;
    @FXML
    private CheckBox xo5xf9X;
    @FXML
    private CheckBox xo5xf9O;

    @FXML
    private CheckBox xo6xf2X;
    @FXML
    private CheckBox xo6xf2O;
    @FXML
    private CheckBox xo6xf3X;
    @FXML
    private CheckBox xo6xf3O;
    @FXML
    private CheckBox xo6xf4X;
    @FXML
    private CheckBox xo6xf4O;
    @FXML
    private CheckBox xo6xf5X;
    @FXML
    private CheckBox xo6xf5O;
    @FXML
    private CheckBox xo6xf6X;
    @FXML
    private CheckBox xo6xf6O;
    @FXML
    private CheckBox xo6xf7X;
    @FXML
    private CheckBox xo6xf7O;
    @FXML
    private CheckBox xo6xf8X;
    @FXML
    private CheckBox xo6xf8O;
    @FXML
    private CheckBox xo6xf9X;
    @FXML
    private CheckBox xo6xf9O;

    @FXML
    private CheckBox xo7xf2X;
    @FXML
    private CheckBox xo7xf2O;
    @FXML
    private CheckBox xo7xf3X;
    @FXML
    private CheckBox xo7xf3O;
    @FXML
    private CheckBox xo7xf4X;
    @FXML
    private CheckBox xo7xf4O;
    @FXML
    private CheckBox xo7xf5X;
    @FXML
    private CheckBox xo7xf5O;
    @FXML
    private CheckBox xo7xf6X;
    @FXML
    private CheckBox xo7xf6O;
    @FXML
    private CheckBox xo7xf7X;
    @FXML
    private CheckBox xo7xf7O;
    @FXML
    private CheckBox xo7xf8X;
    @FXML
    private CheckBox xo7xf8O;
    @FXML
    private CheckBox xo7xf9X;
    @FXML
    private CheckBox xo7xf9O;

    @FXML
    private CheckBox xo8xf2X;
    @FXML
    private CheckBox xo8xf2O;
    @FXML
    private CheckBox xo8xf3X;
    @FXML
    private CheckBox xo8xf3O;
    @FXML
    private CheckBox xo8xf4X;
    @FXML
    private CheckBox xo8xf4O;
    @FXML
    private CheckBox xo8xf5X;
    @FXML
    private CheckBox xo8xf5O;
    @FXML
    private CheckBox xo8xf6X;
    @FXML
    private CheckBox xo8xf6O;
    @FXML
    private CheckBox xo8xf7X;
    @FXML
    private CheckBox xo8xf7O;
    @FXML
    private CheckBox xo8xf8X;
    @FXML
    private CheckBox xo8xf8O;
    @FXML
    private CheckBox xo8xf9X;
    @FXML
    private CheckBox xo8xf9O;

    @FXML
    private CheckBox xo9xf2X;
    @FXML
    private CheckBox xo9xf2O;
    @FXML
    private CheckBox xo9xf3X;
    @FXML
    private CheckBox xo9xf3O;
    @FXML
    private CheckBox xo9xf4X;
    @FXML
    private CheckBox xo9xf4O;
    @FXML
    private CheckBox xo9xf5X;
    @FXML
    private CheckBox xo9xf5O;
    @FXML
    private CheckBox xo9xf6X;
    @FXML
    private CheckBox xo9xf6O;
    @FXML
    private CheckBox xo9xf7X;
    @FXML
    private CheckBox xo9xf7O;
    @FXML
    private CheckBox xo9xf8X;
    @FXML
    private CheckBox xo9xf8O;
    @FXML
    private CheckBox xo9xf9X;
    @FXML
    private CheckBox xo9xf9O;

    private File logFile;

    @FXML
    private void initialize() {
        //Set Profile tab
        testerName.setOnAction(x -> save());
        testerInterval.setOnAction(x -> save());

        xfValue2.setOnAction(x -> save());
        xfValue3.setOnAction(x -> save());
        xfValue4.setOnAction(x -> save());
        xfValue5.setOnAction(x -> save());
        xfValue6.setOnAction(x -> save());
        xfValue7.setOnAction(x -> save());
        xfValue8.setOnAction(x -> save());
        xfValue9.setOnAction(x -> save());

        saveButton.setOnAction(x -> save());

        //Set Calculator tab
        calculate.setOnAction(x -> calculate());

        //Set Clear button
        clearButton.setOnAction(x -> clear());
    }

    private void save() {
        Platform.runLater(() -> {
            Date date = new Date();
            SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
            String curDate = dFormat.format(date);

            if (!checkProfileParams()) {
               return;
            }

            try {
                //Create file or access existing file
                String saveName = testerName.getText() + "_" + curDate + ".txt";
                logFile = new File(saveName);
                if (logFile.createNewFile()) {
                    System.out.println("New File Created: " + saveName);
                    System.out.println("Initializing log file...");
                    FileWriter writer = new FileWriter(logFile);
                    writer.write("Tester: " + testerName.getText() + "\n");
                    writer.write("Date: " + curDate + "\n");
                    writer.write("Interval: " + testerInterval.getText() + "\n\n");
                    writer.write("XF Values:\n");
                    writer.write("2: " + xfValue2.getText() + "\n");
                    writer.write("3: " + xfValue3.getText() + "\n");
                    writer.write("4: " + xfValue4.getText() + "\n");
                    writer.write("5: " + xfValue5.getText() + "\n");
                    writer.write("6: " + xfValue6.getText() + "\n");
                    writer.write("7: " + xfValue7.getText() + "\n");
                    writer.write("8: " + xfValue8.getText() + "\n");
                    writer.write("9: " + xfValue9.getText() + "\n\n");
                    writer.write("Log format is as follows: Tester Name [Date-Time] XO Series,XF Interval,Answer\n");
                    writer.write("=================================\nStarting Log...\n");
                    writer.close();
                    System.out.println("Log created.");
                } else {
                    System.out.println(saveName + " already exists.");
                }

            } catch (NullPointerException npe) {
                GUIErrorMessage.INFO_NOT_GIVEN.display();
            } catch (IOException ioe) {
                GUIErrorMessage.CANT_WRITE_OUT.display();
            }
        });
    }

    private void calculate() {
        Platform.runLater(() -> {
            ArrayList<String> xoList = new ArrayList<>();

            if (xo1xf5O.isSelected()) {
                xoList.add("O");
            } else  if (xo1xf5X.isSelected()){
                xoList.add("X");
            } else {
                GUIErrorMessage.NO_INITIAL_XF.display();
                return;
            }

            ArrayList<Row> table = makeTable();
            int curRow = 1;
            for (Row row : table) {
                for (Cell cell : row.getCellList()) {
                    if (cell.getXO() == null) {
                        continue;
                    } else {
                        xoList.add(cell.getXO());
                        curRow++;
                        break;
                    }
                }
            }

            System.out.println("Current Row is: " + curRow);
            Row lastRow = table.get(curRow - 2);
            int lastXF = 2;
            for (Cell cell : lastRow.getCellList()) {
                System.out.println("Checking column: " + lastXF);
                if (cell.getXO() != null) {
                    System.out.println("Last XF: " + lastXF);
                    break;
                }
                lastXF++;
            }

            if (!checkProfileParams()) {
                return;
            }

            try {
                String xfValue;
                switch (lastXF) {
                    case 2: xfValue = xfValue2.getText();
                        break;
                    case 3: xfValue = xfValue3.getText();
                        break;
                    case 4: xfValue = xfValue4.getText();
                        break;
                    case 5: xfValue = xfValue5.getText();
                        break;
                    case 6: xfValue = xfValue6.getText();
                        break;
                    case 7: xfValue = xfValue7.getText();
                        break;
                    case 8: xfValue = xfValue8.getText();
                        break;
                    case 9: xfValue = xfValue9.getText();
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + curRow);
                }

                endingXF.setText(xfValue);

                String xos = "";
                for (String xo : xoList) {
                    xos = xos + xo;
                }
                if (xos.length() > 6) {
                    xos = xos.substring(xos.length()-6);
                }
                xoSeries.setText(xos);

                String propsVal = findStatInProps(xos);
                if (propsVal == null) {
                    return;
                }

                double xfFloatVal = Double.parseDouble(xfValue);
                double interval = Double.parseDouble(testerInterval.getText());
                double statFromTable = Double.parseDouble(propsVal);
                double p50 = xfFloatVal + (interval * statFromTable);
                double calcAnswer = Math.pow(10, p50)/10000;


                answer.setText(String.valueOf(calcAnswer));

                if (logFile == null) {
                    GUIErrorMessage.NO_LOG_FILE.displayInfo();
                    return;
                }
                System.out.println("Logging result...");
                Date date = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                FileWriter logWriter = new FileWriter(logFile, true);
                logWriter.write(testerName.getText() + " [" + formatter.format(date) + "] " + xos + "," + xfValue + ","
                        + answer.getText() + "\n");
                logWriter.close();
                System.out.println("Result logged.");
            } catch (IllegalStateException ise) {
                GUIErrorMessage.DEFAULT.display();
            } catch (IOException ioe) {
                GUIErrorMessage.CANT_WRITE_OUT.display();
            }

        });
    }

    private void clear() {
        Platform.runLater(() -> {
            endingXF.clear();
            xoSeries.clear();
            answer.clear();

            xo1xf5O.setSelected(false);
            xo1xf5X.setSelected(false);

            ArrayList<Row> table = makeTable();

            for (Row row : table) {
                for (Cell cell : row.getCellList()) {
                    cell.getX().setSelected(false);
                    cell.getO().setSelected(false);
                }
            }
        });
    }

    private boolean checkProfileParams() {
        try {
            if (testerName.getText().isEmpty() || testerInterval.getText().isEmpty() || xfValue2.getText().isEmpty() ||
            xfValue3.getText().isEmpty() || xfValue4.getText().isEmpty() || xfValue5.getText().isEmpty() ||
            xfValue6.getText().isEmpty() || xfValue7.getText().isEmpty() || xfValue8.getText().isEmpty() ||
            xfValue9.getText().isEmpty()) {
                GUIErrorMessage.INFO_NOT_GIVEN.display();
                return false;
            } else {
                return true;
            }
        } catch (NullPointerException npe) {
            GUIErrorMessage.INFO_NOT_GIVEN.display();
            return false;
        }
    }

    private String findStatInProps(String xoVal) {
        Properties properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("application.properties"));
        } catch (IOException ioe) {
            GUIErrorMessage.PROP_NOT_FOUND.display();
            return null;
        }
        return properties.getProperty(xoVal);
    }

    private ArrayList<Row> makeTable() {
        ArrayList<Row> table = new ArrayList<>();
        Row r2 = new Row(
                new Cell(xo2xf2X, xo2xf2O),
                new Cell(xo2xf3X, xo2xf3O),
                new Cell(xo2xf4X, xo2xf4O),
                new Cell(xo2xf5X, xo2xf5O),
                new Cell(xo2xf6X, xo2xf6O),
                new Cell(xo2xf7X, xo2xf7O),
                new Cell(xo2xf8X, xo2xf8O),
                new Cell(xo2xf9X, xo2xf9O)
        );
        Row r3 = new Row(
                new Cell(xo3xf2X, xo3xf2O),
                new Cell(xo3xf3X, xo3xf3O),
                new Cell(xo3xf4X, xo3xf4O),
                new Cell(xo3xf5X, xo3xf5O),
                new Cell(xo3xf6X, xo3xf6O),
                new Cell(xo3xf7X, xo3xf7O),
                new Cell(xo3xf8X, xo3xf8O),
                new Cell(xo3xf9X, xo3xf9O)
        );
        Row r4 = new Row(
                new Cell(xo4xf2X, xo4xf2O),
                new Cell(xo4xf3X, xo4xf3O),
                new Cell(xo4xf4X, xo4xf4O),
                new Cell(xo4xf5X, xo4xf5O),
                new Cell(xo4xf6X, xo4xf6O),
                new Cell(xo4xf7X, xo4xf7O),
                new Cell(xo4xf8X, xo4xf8O),
                new Cell(xo4xf9X, xo4xf9O)
        );
        Row r5 = new Row(
                new Cell(xo5xf2X, xo5xf2O),
                new Cell(xo5xf3X, xo5xf3O),
                new Cell(xo5xf4X, xo5xf4O),
                new Cell(xo5xf5X, xo5xf5O),
                new Cell(xo5xf6X, xo5xf6O),
                new Cell(xo5xf7X, xo5xf7O),
                new Cell(xo5xf8X, xo5xf8O),
                new Cell(xo5xf9X, xo5xf9O)
        );
        Row r6 = new Row(
                new Cell(xo6xf2X, xo6xf2O),
                new Cell(xo6xf3X, xo6xf3O),
                new Cell(xo6xf4X, xo6xf4O),
                new Cell(xo6xf5X, xo6xf5O),
                new Cell(xo6xf6X, xo6xf6O),
                new Cell(xo6xf7X, xo6xf7O),
                new Cell(xo6xf8X, xo6xf8O),
                new Cell(xo6xf9X, xo6xf9O)
        );
        Row r7 = new Row(
                new Cell(xo7xf2X, xo7xf2O),
                new Cell(xo7xf3X, xo7xf3O),
                new Cell(xo7xf4X, xo7xf4O),
                new Cell(xo7xf5X, xo7xf5O),
                new Cell(xo7xf6X, xo7xf6O),
                new Cell(xo7xf7X, xo7xf7O),
                new Cell(xo7xf8X, xo7xf8O),
                new Cell(xo7xf9X, xo7xf9O)
        );
        Row r8 = new Row(
                new Cell(xo8xf2X, xo8xf2O),
                new Cell(xo8xf3X, xo8xf3O),
                new Cell(xo8xf4X, xo8xf4O),
                new Cell(xo8xf5X, xo8xf5O),
                new Cell(xo8xf6X, xo8xf6O),
                new Cell(xo8xf7X, xo8xf7O),
                new Cell(xo8xf8X, xo8xf8O),
                new Cell(xo8xf9X, xo8xf9O)
        );
        Row r9 = new Row(
                new Cell(xo9xf2X, xo9xf2O),
                new Cell(xo9xf3X, xo9xf3O),
                new Cell(xo9xf4X, xo9xf4O),
                new Cell(xo9xf5X, xo9xf5O),
                new Cell(xo9xf6X, xo9xf6O),
                new Cell(xo9xf7X, xo9xf7O),
                new Cell(xo9xf8X, xo9xf8O),
                new Cell(xo9xf9X, xo9xf9O)
        );

        table.add(r2);
        table.add(r3);
        table.add(r4);
        table.add(r5);
        table.add(r6);
        table.add(r7);
        table.add(r8);
        table.add(r9);

        return table;
    }
}
