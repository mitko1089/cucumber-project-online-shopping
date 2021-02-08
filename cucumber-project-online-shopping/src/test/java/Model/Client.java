package Model;
import java.util.*;

/**
 * 
 */
public class Client {

    private String firstAndLastName;
    private String email;
    private String address;
    private String phone;
    private Set<Order> Orders;
    
    /**
     * Default constructor
     */
    public Client() {
    }

    /**
     * @return
     */
    public String getFirstAndLastName() {
        // TODO implement here
        return firstAndLastName;
    }

    /**
     * @param firstAndLastName 
     * @return
     */
    public void setFirstAndLastName(String firstAndLastName) {
        this.firstAndLastName=firstAndLastName;
    }

    /**
     * @return
     */
    public String getEmail() {
        // TODO implement here
        return email;
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
        this.email=email;
    }

    /**
     * @return
     */
    public String getAddress() {
        // TODO implement here
        return address;
    }

    /**
     * @param adderss 
     * @return
     */
    public void setAddress(String address) {
        this.address=address;
    }

    /**
     * @return
     */
    public String getPhone() {
        // TODO implement here
        return phone;
    }

    /**
     * @param phone 
     * @return
     */
    public void setPhone(String phone) {
        this.phone=phone;
    }

    /**
     * @return
     */
    public Set<Order> getOrders() {
        return Orders;
    }

    /**
     * @param orders 
     * @return
     */
    public void setOrders(Set<Order> orders) {
        this.Orders = orders;
    }

    /**
     * @param order 
     * @return
     */
    public void addOrder(Order order) {
    	if(null == Orders) {
    		this.Orders = new HashSet<>();
    	}
       this.Orders.add(order);
    }

}