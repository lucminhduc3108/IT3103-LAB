

package hust.soict.hedspi.aims.store;
import hust.soict.hedspi.aims.media.Media;
import java.util.*;
public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public Store() {
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    } 
    
    public Media searchMedia(String title)
    {
        for ( Media x : itemsInStore)
        {
            if ( x.getTitle().compareTo(title)==0)
            {
                return x;
            }
        }
        return null;
    }

    public void addMedia(Media med) {
        if ( itemsInStore.contains(med))
        {
            System.out.println("Already in the store!");
        }
        else
        {
            itemsInStore.add(med);
            System.out.println("Successfully added!");
        }
    }
    
    public void removeMedia(Media med) {
        if ( itemsInStore.contains(med))
        {
            itemsInStore.remove(med);
            System.out.println("Successfully removed!");
        }
        else
        {       
            System.out.println("Not in the store!");
        }
    }
}

