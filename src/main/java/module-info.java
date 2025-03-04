module dk.easvae.usermanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easvae.usermanagementsystem to javafx.fxml;
    exports dk.easvae.usermanagementsystem;
}