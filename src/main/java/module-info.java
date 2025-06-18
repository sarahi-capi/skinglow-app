module com.example.skinglow {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires java.desktop;
    requires junit;

    opens com.example.skinglow to javafx.fxml;
    exports com.example.skinglow;
}