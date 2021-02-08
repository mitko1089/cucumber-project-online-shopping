package Model;
import java.util.*;

/**
 * 
 */
public class Order {

    private int number;


    public Order() {
    }
    /**
     * 
     */
    public Client User;

    /**
     * 
     */
    public Set<Item> Item;

    /**
     * 
     */
    public Set<Store> Store;

    /**
     * @return
     */
    public int getNumber() {
        // TODO implement here
        return number;
    }

    /**
     * @param number 
     * @return
     */
    public void setNumber(int number) {
        this.number=number;
    }

}