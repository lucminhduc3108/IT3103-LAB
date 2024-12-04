package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.store.Store;
import java.util.*;

public class Aims {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store str = new Store();
        Cart crt = new Cart();
        showMenu(str, crt);
    }
    
    
    
    public static void showMenu(Store str, Cart crt)
    {
        while (true)
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("AIMS: "); 
        System.out.println("--------------------------------"); 
        System.out.println("1. View store"); 
        System.out.println("2. Update store"); 
        System.out.println("3. See current cart"); 
        System.out.println("0. Exit"); 
        System.out.println("--------------------------------"); 
        System.out.println("Please choose a number: 0-1-2-3"); 
        
        int x = sc.nextInt();
        switch(x)
        {
            case 1:
            {
                //view store
                storeMenu(str, crt);
            }
            case 2:
            {
                //update store
                System.out.println("Options: ");
                System.out.println("--------------------------------");
                System.out.println("1. Add media"); 
                System.out.println("2. Delete media"); 
                System.out.println("--------------------------------");
                System.out.println("Please choose a number: 0-1-2");
                int option = sc.nextInt();
        switch (option) {
            case 1: {
                System.out.println("1. DigitalVdieoDisc"); 
                System.out.println("2. CompactDisc"); 
                System.out.println("3. Book"); 
                int option2 = sc.nextInt();
                System.out.print("Enter id: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter title: ");
                String title = sc.nextLine();
                System.out.print("Enter category: ");
                String category = sc.nextLine();
                System.out.print("Enter cost: ");
                float cost = sc.nextFloat();
                sc.nextLine();
                switch (option2) {
                    case 1:
                    {
                        System.out.print("Enter director's name: ");
                        String director = sc.nextLine();
                        System.out.print("Enter dvd's length: ");
                        int length = sc.nextInt();
                        sc.nextLine();
                        str.addMedia(new DigitalVideoDisc(id,title,category,cost,length,director));
                    }
                    case 3: {
                        System.out.print("Enter author's name (Enter nothing to skip): ");
                        StringBuilder author = new StringBuilder(sc.nextLine());
                        ArrayList<String> authors = new ArrayList<String>();
                        while (!authors.isEmpty()) {
                            authors.add(author.toString());
                            System.out.print("Enter author's name (Enter nothing to skip): ");

                        }
                        str.addMedia(new Book(id,title,category,cost,authors));
                    }
                    case 2: {
                        System.out.print("Enter artist's name: ");
                        StringBuffer artist = new StringBuffer(sc.nextLine());
                        System.out.print("Enter number of track: ");
                        int nbTrack = sc.nextInt();sc.nextLine();
                        ArrayList<Track> tracks = new ArrayList<Track>();
                        StringBuilder name = new StringBuilder();
                        for(int i = 0;i< nbTrack;i++) {
                            System.out.print("Enter Track[" + i + "]'s name: ");
                            name.replace(0,name.length(),sc.nextLine());
                            System.out.print("Enter Track[" + i + "]'s length: ");
                            int length = sc.nextInt();
                            tracks.add(new Track(name.toString(), length));
                            sc.nextLine();

                        }
                        str.addMedia(new CompactDisc(id,title,category,cost,artist.toString(),tracks));
                    }
                }
            }
            case 2: {
                System.out.println("Enter item's title: ");
                sc.nextLine();
                String title = sc.nextLine();
                Iterator<Media> iter = str.getItemsInStore().iterator();
                while (iter.hasNext()) {
                    Media item = iter.next();
                    if(item.getTitle().equals(title)) {
                        iter.remove();
                        System.out.println(item.getClass().getSimpleName() + " " + item.getTitle() + "'ve been deleted from the store !");
                    }
                }
            }
            case 3:
            {
                // see current cart
                crt.printCart();
                cartMenu(str, crt);
            }
            case 0:
            {
                return;
            }   
        }    
            }
        }
        }
        
    }
        public static void storeMenu(Store str, Cart crt)
    {
        while(true)
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
        int option = sc.nextInt();
        sc.nextLine();
        if ( option == 1)
            {
                System.out.println("Enter the title: ");
                String mediaTitle = sc.nextLine();
                Media med = str.searchMedia(mediaTitle);
                if ( med == null)
                {
                    System.out.println(mediaTitle+" not in the store!");
                }
                else
                {
                    med.toString();
                    mediaDetailsMenu(str, crt, med);
                }
            }
        else if ( option == 2)
            {
                System.out.println("Enter the title: ");
                String mediaTitle = sc.nextLine();
                Media med = str.searchMedia(mediaTitle);
                if ( med == null)
                {
                    System.out.println(mediaTitle+" is not valid!");
                }
                else
                {
                    crt.addMedia(med);
                    if ( med instanceof DigitalVideoDisc)
                    System.out.println(crt.getNumberDVDs());
                }
            }
        else if ( option == 3)
            {
                System.out.println("Enter the title: ");
                String mediaTitle = sc.nextLine();
                Media med = str.searchMedia(mediaTitle);
                if ( med == null)
                {
                    System.out.println(mediaTitle+" is not valid!");
                }
                else
                {
                    if ( med instanceof DigitalVideoDisc)
                    {
                        ((DigitalVideoDisc) med).play();
                    }
                    if ( med instanceof CompactDisc)
                    {
                        ((CompactDisc) med).play();
                    }              
                }
            }
        else if ( option == 4)
            {
                crt.printCart();
                cartMenu(str, crt);
            }
        else if ( option == 5)
            {
                return;
            }   
                
        }
    }
    
    public static void mediaDetailsMenu(Store store, Cart crt, Media med) { 
        while(true)
        {
        System.out.println("Options: "); 
        System.out.println("--------------------------------"); 
        System.out.println("1. Add to cart"); 
        System.out.println("2. Play"); 
        System.out.println("0. Back"); 
        System.out.println("--------------------------------"); 
        System.out.println("Please choose a number: 0-1-2"); 
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if ( option == 1)
                {
                    crt.addMedia(med);
                    System.out.println(med.getTitle()+" has been added to cart!");                    
                }
        else if ( option == 2)
                {
                    if ( med instanceof DigitalVideoDisc)
                    {
                        ((DigitalVideoDisc) med).play();
                    }
                    if ( med instanceof CompactDisc)
                    {
                        ((CompactDisc) med).play();
                    }              
                }
        else if ( option == 0)
                {
                    return;
                }   
        }     
    } 
    
    public static void cartMenu(Store str, Cart crt) { 
        while(true)
        {
        System.out.println("Options: "); 
        System.out.println("--------------------------------"); 
        System.out.println("1. Filter medias in cart"); 
        System.out.println("2. Sort medias in cart"); 
        System.out.println("3. Remove media from cart"); 
        System.out.println("4. Play a media"); 
        System.out.println("5. Place order"); 
        System.out.println("0. Back"); 
        System.out.println("--------------------------------"); 
        System.out.println("Please choose a number: 0-1-2-3-4-5"); 
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if ( option == 3)
            {
                System.out.println("Enter the title: ");
                String mediaTitle = sc.nextLine();
                Media med = str.searchMedia(mediaTitle);
                if ( crt.getItemsOrdered().contains(med))
                {
                    crt.removeMedia(med);
                    System.out.println(mediaTitle+" has been removed from cart!");
                }
                else
                {
                    System.out.println(mediaTitle+" not in the cart!");
                }
            }
        else if ( option == 4)
            {
                System.out.println("Enter the title: ");
                String mediaTitle = sc.nextLine();
                Media med = str.searchMedia(mediaTitle);
                if ( crt.getItemsOrdered().contains(med))
                {
                    if ( med instanceof DigitalVideoDisc)
                    {
                        ((DigitalVideoDisc) med).play();
                    }
                    if ( med instanceof CompactDisc)
                    {
                        ((CompactDisc) med).play();
                    }  
                }
            }
        else if ( option == 5)
            {
                System.out.println("Order has been placed!");
                crt.getItemsOrdered().removeAll(crt.getItemsOrdered());
            }
        else if ( option == 0)
            {
                return;
            }        
        }
    } 
    
    
}
