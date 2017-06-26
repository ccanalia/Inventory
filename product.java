/**
 *
 * @author Christopher Canalia-000449835, Western Governors University
 */

package inventory.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;



/**
 *
 * @author ccanalia
 */
public class product {
    protected IntegerProperty product_id;
    protected StringProperty product_name;
    protected IntegerProperty product_inv;
    protected DoubleProperty product_price;
    protected IntegerProperty product_max; 
    protected IntegerProperty product_min;
    
    private final ObservableList<part> PartDetails = FXCollections.observableArrayList();
    
    public product() {
        this.product_id = new SimpleIntegerProperty(0);
        this.product_name = new SimpleStringProperty("");
        this.product_inv = new SimpleIntegerProperty(0);
        this.product_price = new SimpleDoubleProperty(0.00);
        this.product_max = new SimpleIntegerProperty(0);
        this.product_min = new SimpleIntegerProperty(0);
    }
    
    public product(int product_id, String product_name, int product_inv, double product_price, 
            int product_max, int product_min, int part_id, part get) {
        this.product_id = new SimpleIntegerProperty(product_id);
        this.product_name = new SimpleStringProperty(product_name);
        this.product_inv = new SimpleIntegerProperty(product_inv);
        this.product_price = new SimpleDoubleProperty(product_price);
        this.product_max = new SimpleIntegerProperty(product_max);
        this.product_min = new SimpleIntegerProperty(product_min);
    }
            
    public void setProductName(String product_name) {
        this.product_name =  new SimpleStringProperty(product_name);
    }
    
    public void setProductInv(Integer product_inv) {
        this.product_inv =  new SimpleIntegerProperty(product_inv);
    }
    
    public void setProductPrice(Double product_price) {
        this.product_price =  new SimpleDoubleProperty(product_price);
    }
    
    public void setProductMax(Integer product_max) {
        this.product_max =  new SimpleIntegerProperty(product_max);
    }
    
    public void setProductMin(Integer product_min) {
        this.product_min =  new SimpleIntegerProperty(product_min);
    }

    public String getProductName() {
        return product_name.get();
    }
    
    public Integer getProductInv() {
        return product_inv.get();
    }
    
    public Double getProductPrice() {
        return product_price.get();
    }
    
    public Integer getProductMax() {
        return product_max.get();
    }

    public Integer getProductMin() {
        return product_min.get();
    }

    public StringProperty nameProperty() {
            return product_name;
        } 

    public SimpleIntegerProperty sizeProperty() {
            return new SimpleIntegerProperty(PartDetails.size());   
        } 

    public ObservableList <part> getpart() {
        return PartDetails;
    }

    public void addPart(part part) {
        PartDetails.add(part);
    }

}
