module com.perpetuum.perpreqcalc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.perpetuum.perpreqcalc to javafx.fxml;
    exports com.perpetuum.perpreqcalc;
}