package Model;
import java.util.*;

/**
 * 
 */
public class Store {

    private String name;
    private String Address;
    
    public Store() {
    }

    /**
     * 
     */
    public Set<Item> Item;

    /**
     * 
     */
    public Set<Order> Order;

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        this.name=name;
    }

    /**
     * @return
     */
    public String getAddress() {
        // TODO implement here
        return Address;
    }

    /**
     * @param address 
     * @return
     */
    public void setAddress(String address) {
        this.Address=address;
    }

}