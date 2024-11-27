package hust.soict.hedspi.aims.cart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import java.util.*;

public class Cart {
    public static final int MAX_DVD_NUMBER = 20;
    private int qtyOrdered;
    private DigitalVideoDisc order[] = new DigitalVideoDisc[MAX_DVD_NUMBER];

    public Cart() {
        qtyOrdered = 0;
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
        if (qtyOrdered == MAX_DVD_NUMBER) {
            System.out.println("The cart is full.");
            return;
        } else {
            order[qtyOrdered] = dvd;
            qtyOrdered ++;
            System.out.println(dvd.getTitle()+ " has been added");
            return;
        }
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for ( DigitalVideoDisc dvd : dvdList)
        {
                if (qtyOrdered == MAX_DVD_NUMBER) {
                System.out.println("The cart is full.");
                return;
            } else {
                order[qtyOrdered] = dvd;
                qtyOrdered ++;
                System.out.println(dvd.getTitle()+ " has been added");
            }
        }
        return;
    }
    
        public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
            if (qtyOrdered + 2 <= MAX_DVD_NUMBER) {
                order[qtyOrdered] = dvd1;
                qtyOrdered ++;
                System.out.println(dvd1.getTitle()+ " has been added");
                
                order[qtyOrdered] = dvd2;
                qtyOrdered ++;
                System.out.println(dvd2.getTitle()+ " has been added");
            } else if (qtyOrdered + 1 <= MAX_DVD_NUMBER) {
                order[qtyOrdered] = dvd1;
                qtyOrdered ++;
                System.out.println(dvd1.getTitle()+ " has been added");
            }
            else
            {
                System.out.println("The cart is full.");
            }
    }
    
    
    
    
    
    public void removeDigitalVideoDisc(DigitalVideoDisc dvd) {
        if(order[0] ==  null) {
            System.out.println("Your cart is empty!");
            return;
        }
        for(int i = 0; i < qtyOrdered;i++) {
            if(order[i].equals(dvd)) {
                for(int j = i;i<qtyOrdered-1;i++) {
                    order[i] = order[i+1];
                }
                order[qtyOrdered-1] = null;
                qtyOrdered--;
                System.out.println("Remove " + '\"'+ dvd.getTitle() + '\"' + " successfully!");
                return;
            }
        }
        System.out.println("No DVD match!");
        return;
    }
    
    
    public void getFreeItem ()
    {
        Random rand = new Random();
        int x = rand.nextInt(qtyOrdered);
        System.out.println(order[x].toString());
    }
    
    public float totalCost()
    {
        float cost = 0;
        for(int i = 0;i < qtyOrdered; i++) {
            cost += order[i].getCost();
        }
        return cost;
    }
    
      public void searchByTitle(String title) {
        for(int i = 0;i < qtyOrdered; i++) {
            if(order[i].getTitle().equals(title)) {
                System.out.println(order[i].toString());
                return;
            }
        }
        System.out.println("No match found !");
    }
    
    public void searchByCategory(String category) {
        for(int i = 0;i < qtyOrdered; i++) {
            if(order[i].getCategory().equals(category)) {
                System.out.println(order[i].toString());
                return;
            }
        }
        System.out.println("No match found !");
    }
    
    public void searchByPrice(float price) {
        for(int i = 0;i < qtyOrdered; i++) {
            if(order[i].getCost() == price ) {
                System.out.println(order[i].toString());
                return;
            }
        }
        System.out.println("No match found !");
    }

    public void printOrder()
    {
        System.out.println("***********************CART***********************\nOrdered Items");
        for(int i = 0;i < qtyOrdered; i++) {
                System.out.println(i+"."+order[i].toString()); 
        }
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("***************************************************");
    }
    
    public boolean isMatch (String title)
    {
         for(int i = 0;i < qtyOrdered; i++) {
                if ( title.compareToIgnoreCase(order[i].getTitle()) == 1) return true;
        }
        return false;
    }
    
    
    
}
