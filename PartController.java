/**
 *
 * @author Christopher Canalia-000449835, Western Governors University
 */

package inventory.screens;

import inventory.Inventory;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ccanalia
 */
public class PartController {
    
    Stage stage;
    Parent root;
    Stage dialogStage;
    Inventory inventory;
        

    @FXML
    private RadioButton inhouseRadio;

    @FXML
    private ToggleGroup PartGroup;

    @FXML
    private RadioButton outsourceRadio;

    @FXML
    private Button cancelAddPart;
    
    @FXML
    void inhouseRadio(ActionEvent event) throws IOException {
        
        ((Stage)(((RadioButton)event.getSource()).getScene().getWindow())).close();
        
        stage = new Stage();
        root = FXMLLoader.load(getClass().getResource("InhousePart.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Add Inhouse Part");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(inhouseRadio.getScene().getWindow());
        stage.show();
    }
    
    @FXML
    void outsourceRadio(ActionEvent event) throws IOException {
        
        ((Stage)(((RadioButton)event.getSource()).getScene().getWindow())).close();
        
        stage = new Stage();
        root = FXMLLoader.load(getClass().getResource("OutsourcePart.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Add Outsource Part");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(outsourceRadio.getScene().getWindow());
        stage.show();
    }
    
    @FXML
    void cancelAddPart(ActionEvent event) throws IOException {
        Stage stage = (Stage) cancelAddPart.getScene().getWindow();
        stage.close();
    }
    
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
    
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

}
