module mx.edu.utez.vista {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.vista to javafx.fxml;
    exports mx.edu.utez.vista;
}