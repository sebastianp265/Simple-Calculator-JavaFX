module org.pw {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.calcproject to javafx.fxml;
    exports edu.calcproject;
}