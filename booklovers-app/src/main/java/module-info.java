module com.booklovers.bookloversapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.booklovers.bookloversapp to javafx.fxml;
    exports com.booklovers.bookloversapp;
}