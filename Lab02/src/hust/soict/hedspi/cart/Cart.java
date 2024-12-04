
package hust.soict.hedspi.aims.cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import java.util.*;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>(); 

    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
 
    public Cart() {
    }
    
    public void addMedia(Media med) {
        if ( itemsOrdered.contains(med))
        {
            System.out.println("Already in the cart!");
        }
        else
        {
            itemsOrdered.add(med);
            System.out.println("Successfully added!");
        }
    }
    
    public void removeMedia(Media med) {
        if ( itemsOrdered.contains(med))
        {
            itemsOrdered.remove(med);
            System.out.println("Successfully removed!");
        }
        else
        {       
            System.out.println("Not on the list!");
        }
    }
    
    public int getNumberDVDs()
    {
        int sum = 0;
        for ( Media x : itemsOrdered)
        {
        if ( x instanceof DigitalVideoDisc)
        {
            sum++;
        }
    }
    return sum;
    }
    
    public float totalCost ()
    {
        float sum = 0;
        for ( Media x : itemsOrdered)
        {
            sum += x.getCost();
        }
        return sum;
    }
    
    public void printCart()
    {
        for ( Media x : itemsOrdered)
        {
            System.out.println(x.toString());
        }
    }
    
} 

