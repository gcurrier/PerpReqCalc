module com.perpetuum.perpreqcalc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.perpetuum.perpreqcalc to javafx.fxml;
    exports com.perpetuum.perpreqcalc;
}