module com.example.projkhjthreadfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projkhjthreadfx to javafx.fxml;
    exports com.example.projkhjthreadfx;
}