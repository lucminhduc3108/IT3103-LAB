/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author admin
 */
public class Cart {
    public static final int MAX_DVD_NUMBER = 20;
    private int qtyOrdered;
    private DigitalVideoDisc order[] = new DigitalVideoDisc[MAX_DVD_NUMBER];

    public Cart() {
        qtyOrdered = 0;
    }
    
    public int addDigitalVideoDisc(DigitalVideoDisc dvd) {
        if (qtyOrdered == MAX_DVD_NUMBER) {
            System.out.println("The cart is full.");
            return 0;
        } else {
            order[qtyOrdered] = dvd;
            qtyOrdered ++;
            System.out.println(dvd.getTitle()+ " has been added");
            return 1;
        }
    }
    
    public int removeDigitalVideoDisc(DigitalVideoDisc dvd) {
        if(order[0] ==  null) {
            System.out.println("Your cart is empty!");
            return 0;
        }
        for(int i = 0; i < qtyOrdered;i++) {
            if(order[i].equals(dvd)) {
                for(int j = i;i<qtyOrdered-1;i++) {
                    order[i] = order[i+1];
                }
                order[qtyOrdered-1] = null;
                qtyOrdered--;
                System.out.println("Remove " + '\"'+ dvd.getTitle() + '\"' + " successfully!");
                return 1;
            }
        }
        System.out.println("No DVD match!");
        return 0;
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
        for(int i = 0;i < qtyOrdered; i++) {
                System.out.println(order[i].toString()); 
        }
    }
    
}
