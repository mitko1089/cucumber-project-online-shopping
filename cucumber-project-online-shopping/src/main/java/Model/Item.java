package Model;
import java.util.*;

/**
 * 
 */
public class Item {


    private String name;
    private float price;
    private String size;
    private int count;
 
    public Item() {
    }

    /**
     * 
     */
    public Set<Order> Orders;

    /**
     * 
     */
    public Category Category;

    /**
     * 
     */
    public Set<Store> Store;

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
    public float getPrice() {
        // TODO implement here
        return price;
    }

    /**
     * @param price 
     * @return
     */
    public void setPrice(float price) {
        this.price=price;
    }

    /**
     * @return
     */
    public String getSize() {
        // TODO implement here
        return size;
    }

    /**
     * @param size 
     * @return
     */
    public void setSize(String size) {
        this.size=size;
    }

    /**
     * @return
     */
    public int getCount() {
        // TODO implement here
        return count;
    }

    /**
     * @param count 
     * @return
     */
    public void setCount(int count) {
        this.count=count;
    }

}