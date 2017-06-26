/**
 *
 * @author Christopher Canalia-000449835, Western Governors University
 */

package inventory.model;

/**
 *
 * @author ccanalia
 */
public abstract class part {
    
    private String part_type;
    private Integer part_id;
    private String part_name;
    private Integer part_inv;
    private Double part_price;
    private Integer part_max; 
    private Integer part_min;

   
    part(String part_type, Integer part_id, String part_name, Integer part_inv, 
            Double part_price, Integer part_max, Integer part_min) {
        
        this.part_type = part_type;
        this.part_id = part_id;
        this.part_name = part_name;
        this.part_inv = part_inv;
        this.part_price = part_price;
        this.part_max = part_max;
        this.part_min = part_min;
            
    }
   
    String getPartType() {
       return part_type;
    }
   
    Integer getPartId() {
        return part_id;
    }

    String getPartName() {
       return part_name;
    } 

    Integer getPartInv() {
       return part_inv;
    }

    Double getPartPrice() {
       return part_price;
    }

    Integer getPartMax() {
       return part_max;
    }

    Integer getPartMin() {
       return part_min;
    } 
    
    public String partTypeProperty() {
        return part_type;
    }
    
    public Integer partIdProperty() {
        return part_id;
    }
    
    public String partNameProperty() {
        return part_name;
    }
    
    public Integer partInvProperty() {
        return part_inv;
    }
            
    public Double partPriceProperty() {
        return part_price;
    }
            
    public Integer partMaxProperty() {
        return part_max;
    }
            
    public Integer partMinProperty() {
        return part_min;
    }
   
    public void setPartType(String part_type) {
       this.part_type = part_type;
    }
   
    public void setPartId(Integer part_id) {
       this.part_id = part_id;
    }

    public void setPartName(String part_name) {
       this.part_name = part_name;
    } 

    public void setPartInv(Integer part_inv) {
       this.part_inv = part_inv;
    }
   
    public void setPartPrice(Double part_price) {
       this.part_price = part_price;
    }  
   
    public void setPartMax(Integer part_max) {
       this.part_max = part_max;
    }  

    public void setPartMin(Integer part_min) {
       this.part_min = part_min;
    } 

    public abstract void ShowPart(); {
        System.out.println("This is the part");
    }
   
 
}

