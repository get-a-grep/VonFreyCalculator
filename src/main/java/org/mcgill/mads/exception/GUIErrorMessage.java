package org.mcgill.mads.exception;

import javafx.scene.control.Alert;

public class GUIErrorMessage {

    public static GUIErrorMessage PROP_NOT_FOUND
            = new GUIErrorMessage("Error: No properties", "No properties file found", "Application is " +
            "having trouble accessing property file.");
    public static GUIErrorMessage INFO_NOT_GIVEN
            = new GUIErrorMessage("Error: Not enough Info", "Please fill out the required fields", "A " +
            "profile field is missing, please check your data and try again.");
    public static GUIErrorMessage NO_INITIAL_XF
            = new GUIErrorMessage("Error: No initial XF", "XF value not defined for first row.",
            "Please select a value for the first row and try again.");
    public static GUIErrorMessage CANT_WRITE_OUT
            = new GUIErrorMessage("Error: Can't write to log file", "There was a problem writing in the log file.",
            "Try allowing the program access and try again.");

    public static GUIErrorMessage NO_LOG_FILE = new GUIErrorMessage("Info: No Log File", "Result given without logging",
            "If you'd like to add this result to your log, just click 'Save' in the profile.");
    public static GUIErrorMessage DEFAULT = new GUIErrorMessage("Error", "", "An unknown error occurred");

    private final String title;
    private final String header;
    private final String content;

    GUIErrorMessage(String title, String header, String content) {
        this.content = content;
        this.header = header;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getHeader() {
        return this.header;
    }

    public String getContent() {
        return this.content;
    }

    public void display() {
        final Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(this.getTitle());
        alert.setHeaderText(this.getHeader());
        alert.setContentText(this.getContent());
        alert.showAndWait();
    }

    public void displayInfo() {
        final Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(this.getTitle());
        alert.setHeaderText(this.getHeader());
        alert.setContentText(this.getContent());
        alert.showAndWait();
    }
}
