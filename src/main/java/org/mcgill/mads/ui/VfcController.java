package org.mcgill.mads.ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;
import org.mcgill.mads.exception.GUIErrorMessage;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.mcgill.mads.table.Row;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

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
    private Button loadProfileButton;

    @FXML
    private ChoiceBox profileSelection;

    @FXML
    private Button buttonXf5xo1;

    @FXML
    private Button buttonXf2xo2;
    @FXML
    private Button buttonXf3xo2;
    @FXML
    private Button buttonXf4xo2;
    @FXML
    private Button buttonXf5xo2;
    @FXML
    private Button buttonXf6xo2;
    @FXML
    private Button buttonXf7xo2;
    @FXML
    private Button buttonXf8xo2;
    @FXML
    private Button buttonXf9xo2;

    @FXML
    private Button buttonXf2xo3;
    @FXML
    private Button buttonXf3xo3;
    @FXML
    private Button buttonXf4xo3;
    @FXML
    private Button buttonXf5xo3;
    @FXML
    private Button buttonXf6xo3;
    @FXML
    private Button buttonXf7xo3;
    @FXML
    private Button buttonXf8xo3;
    @FXML
    private Button buttonXf9xo3;

    @FXML
    private Button buttonXf2xo4;
    @FXML
    private Button buttonXf3xo4;
    @FXML
    private Button buttonXf4xo4;
    @FXML
    private Button buttonXf5xo4;
    @FXML
    private Button buttonXf6xo4;
    @FXML
    private Button buttonXf7xo4;
    @FXML
    private Button buttonXf8xo4;
    @FXML
    private Button buttonXf9xo4;

    @FXML
    private Button buttonXf2xo5;
    @FXML
    private Button buttonXf3xo5;
    @FXML
    private Button buttonXf4xo5;
    @FXML
    private Button buttonXf5xo5;
    @FXML
    private Button buttonXf6xo5;
    @FXML
    private Button buttonXf7xo5;
    @FXML
    private Button buttonXf8xo5;
    @FXML
    private Button buttonXf9xo5;

    @FXML
    private Button buttonXf2xo6;
    @FXML
    private Button buttonXf3xo6;
    @FXML
    private Button buttonXf4xo6;
    @FXML
    private Button buttonXf5xo6;
    @FXML
    private Button buttonXf6xo6;
    @FXML
    private Button buttonXf7xo6;
    @FXML
    private Button buttonXf8xo6;
    @FXML
    private Button buttonXf9xo6;

    @FXML
    private Button buttonXf2xo7;
    @FXML
    private Button buttonXf3xo7;
    @FXML
    private Button buttonXf4xo7;
    @FXML
    private Button buttonXf5xo7;
    @FXML
    private Button buttonXf6xo7;
    @FXML
    private Button buttonXf7xo7;
    @FXML
    private Button buttonXf8xo7;
    @FXML
    private Button buttonXf9xo7;

    @FXML
    private Button buttonXf2xo8;
    @FXML
    private Button buttonXf3xo8;
    @FXML
    private Button buttonXf4xo8;
    @FXML
    private Button buttonXf5xo8;
    @FXML
    private Button buttonXf6xo8;
    @FXML
    private Button buttonXf7xo8;
    @FXML
    private Button buttonXf8xo8;
    @FXML
    private Button buttonXf9xo8;

    @FXML
    private Button buttonXf2xo9;
    @FXML
    private Button buttonXf3xo9;
    @FXML
    private Button buttonXf4xo9;
    @FXML
    private Button buttonXf5xo9;
    @FXML
    private Button buttonXf6xo9;
    @FXML
    private Button buttonXf7xo9;
    @FXML
    private Button buttonXf8xo9;
    @FXML
    private Button buttonXf9xo9;

    private File logFile;
    private ArrayList<Row> appTable;
    private ArrayList<String> profiles;

    @FXML
    private void initialize() {
        //Set Profile tab
        setProfileList();
        testerName.setOnAction(x -> save());
        testerInterval.setOnAction(x -> save());
        loadProfileButton.setOnAction(x -> loadProfile());

        xfValue2.setOnAction(x -> save());
        xfValue3.setOnAction(x -> save());
        xfValue4.setOnAction(x -> save());
        xfValue5.setOnAction(x -> save());
        xfValue6.setOnAction(x -> save());
        xfValue7.setOnAction(x -> save());
        xfValue8.setOnAction(x -> save());
        xfValue9.setOnAction(x -> save());

        saveButton.setOnAction(x -> save());

        appTable = makeTable();

        buttonXf5xo1.setOnAction(x -> setButtonState(buttonXf5xo1));
        for (Row row : appTable) {
            for (Button button : row.getButtonList()) {
                button.setOnAction(x -> setButtonState(button));
            }
        }

        //Set Calculator tab
        calculate.setOnAction(x -> calculate());

        //Set Clear button
        clearButton.setOnAction(x -> clear());
    }

    private void setButtonState(Button button) {
        Platform.runLater(() -> {
            if (button.getText() == null || button.getText().isEmpty()) {
                button.setText("X");
            } else if (button.getText() == "X") {
                button.setText("O");
            } else {
                button.setText("");
            }
        });
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

    private void loadProfile() {
        Platform.runLater(() -> {
            if (profileSelection.getValue() == null) {
                GUIErrorMessage.INFO_NOT_GIVEN.display();
            } else {
                String profileLog = profileSelection.getValue() + ".txt";
                File logFile = new File(profileLog);

                try {
                    Scanner reader = new Scanner(logFile);

                    while (reader.hasNextLine()) {
                        String thisLine = reader.nextLine();

                        if (thisLine.startsWith("Tester: ")) {
                            testerName.setText(thisLine.substring(8));
                        } else if (thisLine.startsWith("Interval: ")) {
                            testerInterval.setText(thisLine.substring(10));
                        } else if (thisLine.startsWith("2: ")) {
                            xfValue2.setText(thisLine.substring(3));
                        } else if (thisLine.startsWith("3: ")) {
                            xfValue3.setText(thisLine.substring(3));
                        } else if (thisLine.startsWith("4: ")) {
                            xfValue4.setText(thisLine.substring(3));
                        } else if (thisLine.startsWith("5: ")) {
                            xfValue5.setText(thisLine.substring(3));
                        } else if (thisLine.startsWith("6: ")) {
                            xfValue6.setText(thisLine.substring(3));
                        } else if (thisLine.startsWith("7: ")) {
                            xfValue7.setText(thisLine.substring(3));
                        } else if (thisLine.startsWith("8: ")) {
                            xfValue8.setText(thisLine.substring(3));
                        } else if (thisLine.startsWith("9: ")) {
                            xfValue9.setText(thisLine.substring(3));
                        }
                    }

                } catch (IOException ioe) {
                    GUIErrorMessage.DEFAULT.display();
                }
            }
        });
    }

    private void setProfileList() {
        File startDir = new File(".");

        File[] matchingFiles = startDir.listFiles((dir, name) -> name.endsWith("txt"));

        profiles = new ArrayList<>();
        for (File file : matchingFiles) {
            profiles.add(file.getName().substring(0, file.getName().length() - 4));
        }

        final ObservableList<String> pList = FXCollections.observableArrayList(profiles);
        profileSelection.setItems(pList);
    }

    private void calculate() {
        Platform.runLater(() -> {
            ArrayList<String> xoList = new ArrayList<>();

            if (buttonXf5xo1.getText() != null && !buttonXf5xo1.getText().isEmpty()) {
                xoList.add(buttonXf5xo1.getText());
            } else {
                GUIErrorMessage.NO_INITIAL_XF.display();
                return;
            }

            ArrayList<Row> table = makeTable();
            int curRow = 1;
            for (Row row : table) {
                for (Button button : row.getButtonList()) {
                    if (button.getText() == null || button.getText().isEmpty()) {
                        continue;
                    } else {
                        xoList.add(button.getText());
                        curRow++;
                        break;
                    }
                }
            }

            System.out.println("Current Row is: " + curRow);
            Row lastRow = table.get(curRow - 2);
            int lastXF = 2;
            for (Button button : lastRow.getButtonList()) {
                System.out.println("Checking column: " + lastXF);
                if (button.getText() != null && !button.getText().isEmpty()) {
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

            buttonXf5xo1.setText("");

            ArrayList<Row> table = makeTable();

            for (Row row : table) {
                for (Button button : row.getButtonList()) {
                    button.setText("");
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
                buttonXf2xo2,
                buttonXf3xo2,
                buttonXf4xo2,
                buttonXf5xo2,
                buttonXf6xo2,
                buttonXf7xo2,
                buttonXf8xo2,
                buttonXf9xo2
        );
        Row r3 = new Row(
                buttonXf2xo3,
                buttonXf3xo3,
                buttonXf4xo3,
                buttonXf5xo3,
                buttonXf6xo3,
                buttonXf7xo3,
                buttonXf8xo3,
                buttonXf9xo3
        );
        Row r4 = new Row(
                buttonXf2xo4,
                buttonXf3xo4,
                buttonXf4xo4,
                buttonXf5xo4,
                buttonXf6xo4,
                buttonXf7xo4,
                buttonXf8xo4,
                buttonXf9xo4
        );
        Row r5 = new Row(
                buttonXf2xo5,
                buttonXf3xo5,
                buttonXf4xo5,
                buttonXf5xo5,
                buttonXf6xo5,
                buttonXf7xo5,
                buttonXf8xo5,
                buttonXf9xo5
        );
        Row r6 = new Row(
                buttonXf2xo6,
                buttonXf3xo6,
                buttonXf4xo6,
                buttonXf5xo6,
                buttonXf6xo6,
                buttonXf7xo6,
                buttonXf8xo6,
                buttonXf9xo6
        );
        Row r7 = new Row(
                buttonXf2xo7,
                buttonXf3xo7,
                buttonXf4xo7,
                buttonXf5xo7,
                buttonXf6xo7,
                buttonXf7xo7,
                buttonXf8xo7,
                buttonXf9xo7
        );
        Row r8 = new Row(
                buttonXf2xo8,
                buttonXf3xo8,
                buttonXf4xo8,
                buttonXf5xo8,
                buttonXf6xo8,
                buttonXf7xo8,
                buttonXf8xo8,
                buttonXf9xo8
        );
        Row r9 = new Row(
                buttonXf2xo9,
                buttonXf3xo9,
                buttonXf4xo9,
                buttonXf5xo9,
                buttonXf6xo9,
                buttonXf7xo9,
                buttonXf8xo9,
                buttonXf9xo9
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
