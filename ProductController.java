/**
 *
 * @author Christopher Canalia-000449835, Western Governors University
 */

package inventory.screens;

import inventory.model.part;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ProductController {

    @FXML
    private Button saveProduct;

    @FXML
    private Button cancelProduct;

    @FXML
    private TextField product_id;

    @FXML
    private TextField product_name;

    @FXML
    private TextField product_inv;

    @FXML
    private TextField product_cost;

    @FXML
    private TextField product_max;

    @FXML
    private TextField product_min;

    @FXML
    private TableView<part> partTable;

    @FXML
    private TableColumn<part, Integer> part_id;

    @FXML
    private TableColumn<part, String> part_name;

    @FXML
    private TableColumn<part, Integer> part_inv;

    @FXML
    private TableColumn<part, Double> part_cost;

    @FXML
    private Button productAddButton;

    @FXML
    private TableView<part> addedPartTable;

    @FXML
    private TableColumn<part, Integer> added_part_id;

    @FXML
    private TableColumn<part, String> added_part_name;

    @FXML
    private TableColumn<part, Integer> added_part_inv;

    @FXML
    private TableColumn<part, Double> added_part_cost;

    @FXML
    private Button productDeleteButton;

    @FXML
    private Button productSearchButton;

    @FXML
    void cancelProduct(ActionEvent event) {
        Stage stage = (Stage) cancelProduct.getScene().getWindow();
        stage.close();
        
    }

    @FXML
    void saveProduct(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Not Supported");
        alert.setHeaderText("NOT SUPPORTED");
        alert.setContentText("This function is not yet supported");
        alert.showAndWait();
    }
    
    
    
    
    
    
    

   

}
