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
public class Aims {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a new cart
    Cart anOrder = new Cart();

    //Create new dvd objects and add them to the cart
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
            "Animation", "Roger Allers", 87, 19.95f);
    anOrder.addDigitalVideoDisc(dvd1);

    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
            "Science Fiction", "George Lucas", 87, 24.95f);
    anOrder.addDigitalVideoDisc(dvd2);

    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
            "Animation", 18.99f);
    anOrder.addDigitalVideoDisc(dvd3);

    //print total cost of the items in the cart
    System.out.print("Total Cost is: ");
    System.out.println(anOrder.totalCost());
    //remove testing
    anOrder.getFreeItem();
    anOrder.removeDigitalVideoDisc(dvd3);
    
    }
    
}
