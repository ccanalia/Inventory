/**
 *
 * @author Christopher Canalia-000449835, Western Governors University
 */

package inventory.screens;

import inventory.model.part;
import inventory.model.product;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ApplicationController {
    
    private ObservableList<part> PartData = FXCollections.observableArrayList();
    private ObservableList<product> ProductData = FXCollections.observableArrayList();
    
    public ObservableList<part> getPartData() {
        return PartData;
    }

    public ObservableList<product> getProductData() {
        return ProductData;
    }
    
    Stage stage;
    Parent root;

    @FXML
    private TableColumn<part, Integer> part_id;

    @FXML
    private TableColumn<part, String> part_name;

    @FXML
    private TableColumn<part, Integer> part_inv;

    @FXML
    private TableColumn<part, Double> part_cost;

    @FXML
    private Button PartSearchButton;

    @FXML
    private TextField PartSearchText;

    @FXML
    public Button addPart;

    @FXML
    private Button ModifyPartButton;

    @FXML
    private Button DeletePartButton;

    @FXML
    private TableColumn<product, Integer> product_id;

    @FXML
    private TableColumn<product, String> product_name;

    @FXML
    private TableColumn<product, Integer> product_inv;

    @FXML
    private TableColumn<product, Double> product_price;

    @FXML
    private Button ProductSearchButton;

    @FXML
    private TextField ProductSearchText;

    @FXML
    public Button addProduct;

    @FXML
    private Button ModifyProductButton;

    @FXML
    private Button DeleteProductButton;

    @FXML
    private Button ExitApplication;

    @FXML
    void SearchPart(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Not Supported");
        alert.setHeaderText("NOT SUPPORTED");
        alert.setContentText("This function is not yet supported");
        alert.showAndWait();
    }
    
    @FXML
    void SearchProduct(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Not Supported");
        alert.setHeaderText("NOT SUPPORTED");
        alert.setContentText("This function is not yet supported");
        alert.showAndWait();
    }
    
    @FXML
    public void addPart(ActionEvent event) throws IOException {
        
        stage = new Stage();
        root = FXMLLoader.load(getClass().getResource("Part.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Add Part");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(addPart.getScene().getWindow());
        stage.showAndWait();
    }
    
    @FXML
    void ModifyPart(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Not Supported");
        alert.setHeaderText("NOT SUPPORTED");
        alert.setContentText("This function is not yet supported");
        alert.showAndWait();
    }
    
    @FXML
    void DeletePart(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Not Supported");
        alert.setHeaderText("NOT SUPPORTED");
        alert.setContentText("This function is not yet supported");
        alert.showAndWait();
    }
    
    @FXML
    public void addProduct(ActionEvent event) throws IOException {
        
        stage = new Stage();
        root = FXMLLoader.load(getClass().getResource("Product.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Add Product");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(addProduct.getScene().getWindow());
        stage.showAndWait();
    }
    
    @FXML
    void ModifyProduct(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Not Supported");
        alert.setHeaderText("NOT SUPPORTED");
        alert.setContentText("This function is not yet supported");
        alert.showAndWait();
    }
    
    @FXML
    void DeleteProduct(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Not Supported");
        alert.setHeaderText("NOT SUPPORTED");
        alert.setContentText("This function is not yet supported");
        alert.showAndWait();
    }
    
    @FXML
    private void ExitApplication(ActionEvent event) throws Exception {
        System.exit(0);
    }

}

