module com.example.zcare {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.zcare to javafx.fxml;
    exports com.example.zcare;
    exports com.example.zcare.Controller;
    opens com.example.zcare.Controller to javafx.fxml;
}