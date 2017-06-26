/**
 *
 * @author Christopher Canalia-000449835, Western Governors University
 */

package inventory.screens;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class OutsourcePartController {

    @FXML
    private RadioButton inhouseRadio;

    @FXML
    private ToggleGroup PartGroup;

    @FXML
    private RadioButton outsourceRadio;

    @FXML
    private Button savePart;

    @FXML
    private Button cancelAddPart;

     @FXML
    private TextField part_id;

    @FXML
    private TextField part_name;

    @FXML
    private TextField part_inv;

    @FXML
    private TextField part_cost;

    @FXML
    private TextField part_max;

    @FXML
    private TextField part_min;

    @FXML
    private TextField part_company;
    
    @FXML
    private TextField part_type;

    @FXML
    void cancelAddPart(ActionEvent event) throws IOException {
        Stage stage = (Stage) cancelAddPart.getScene().getWindow();
        stage.close();
    }

    @FXML
    void savePart(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Not Supported");
        alert.setHeaderText("NOT SUPPORTED");
        alert.setContentText("This function is not yet supported");
        alert.showAndWait();
    }

}
