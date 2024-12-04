module com.example.assignment2gc200479031 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.assignment2gc200479031 to javafx.fxml, com.google.gson;
    exports com.example.assignment2gc200479031;
}