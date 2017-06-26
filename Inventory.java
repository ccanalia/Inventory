/**
 *
 * @author Christopher Canalia-000449835, Western Governors University
 */

package inventory;

import inventory.model.inhousePart;
import inventory.model.part;
import inventory.model.product;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author ccanalia
 */
public class Inventory extends Application {
    
    private Stage primaryStage;
    private ObservableList<part> PartDetails = FXCollections.observableArrayList();
    private ObservableList<product> ProductDetails = FXCollections.observableArrayList();
    
    public Inventory() {
        // Add sample data
        PartDetails.add(new inhousePart("Inhouse", 12345, "Part Name", 12, 1.12, 300, 50));
//        PartDetails.add(new inhousePart("Holy Cow"));
//        PartDetails.add(new inhousePart("Good Doggy"));
//        PartDetails.add(new outsourcePart("Bad Doggy"));
//        PartDetails.add(new outsourcePart("Meawy Meawy"));
//        PartDetails.add(new outsourcePart("Kitty Cat"));
//
//        ProductDetails.add(new product(12345, "Product Name", 12, 1.12, 300, 50, PartDetails.get(0)));
//        ProductDetails.add(new product("Holy group", 2, PartDetails.get(1)));
//        ProductDetails.add(new product("Good group", 3, PartDetails.get(2)));
//        ProductDetails.add(new product("Bad group", 4, PartDetails.get(3)));

    }
    
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    @Override
        public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("screens/Application.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Inventory Management System");
            primaryStage.setMaximized(false);
            primaryStage.setMinHeight(456);
            primaryStage.setMinWidth(847);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
