package Model;
import java.util.*;

/**
 * 
 */
public class Category {

    private String name;
  
    public Category() {
    }

    /**
     * 
     */
    public Set<Category> children;

    /**
     * 
     */
    public Category parent;

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

}