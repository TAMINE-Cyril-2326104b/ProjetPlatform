module com.example.platformgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.platformgame to javafx.fxml;
    exports com.example.platformgame;
}