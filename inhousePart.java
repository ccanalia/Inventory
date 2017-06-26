/**
 *
 * @author Christopher Canalia-000449835, Western Governors University
 */

package inventory.model;

/**
 *
 * @author ccanalia
 */
public class inhousePart extends part{
    
    private Integer part_machineid;
    
    public inhousePart(String part_type, Integer part_id, String part_name, Integer part_inv, 
            Double part_price, Integer part_max, Integer part_min) {
        super(part_type, part_id, part_name, part_inv, part_price, part_max, part_min);
        this.part_machineid = part_machineid;
    }
    
    Integer getPartMachineID() {
        return part_machineid;
        
    }

    @Override
    public void ShowPart() {
        System.out.println("This is an outsource part");
    }

}