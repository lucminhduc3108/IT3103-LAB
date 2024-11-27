package hust.soict.hedspi.aims;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.cart.Cart;
import java.util.*;

public class Aims {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a new cart
    Cart anOrder = new Cart();

    //Create new dvd objects and add them to the cart
   /* DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
            "Animation", "Roger Allers", 87, 19.95f);
    anOrder.addDigitalVideoDisc(dvd1);

    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
            "Science Fiction", "George Lucas", 87, 24.95f);
    anOrder.addDigitalVideoDisc(dvd2);

    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
            "Animation", 18.99f);
    anOrder.addDigitalVideoDisc(dvd3);*/
    
    //Test addDigitalVideoDisc by array
    DigitalVideoDisc[] dvdList = new DigitalVideoDisc[19];
    for ( int i = 0; i < 19; i++)
    {
        dvdList[i] = new DigitalVideoDisc(Integer.toString(i),
            "Animation", "Roger Allers", 87, 19.95f);
    }
    anOrder.addDigitalVideoDisc(dvdList); 
    
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
            "Animation", "Roger Allers", 87, 19.95f);
    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
            "Science Fiction", "George Lucas", 87, 24.95f);
    anOrder.addDigitalVideoDisc(dvd1, dvd2); 
    anOrder.printOrder();
    
    }
    
}
