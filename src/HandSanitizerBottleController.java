import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HandSanitizerBottleController implements Initializable {

    @FXML
    private TextField priceTextField;

    @FXML
    private DatePicker expiryDatePicker;

    @FXML
    private ComboBox<String> brandComboBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        brandComboBox.getItems().addAll("Utsav's Magic Elixer","Lindsay Speed Cleaner","Michaels Lucky Guesses");
    }


    public void createButtonPushed()
    {
        System.out.printf("The Expiry Date is: %s ", expiryDatePicker.getValue());
        System.out.printf("The TextField said: '%s'%n", priceTextField.getText());
        System.out.printf("The ComboBox said: '%s'%n", brandComboBox.getValue());
    }


}
