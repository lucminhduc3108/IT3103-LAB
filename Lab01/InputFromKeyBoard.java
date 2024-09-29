/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapcoban;
import java.util.*;
/**
 *
 * @author admin
 */
public class InputFromKeyBoard {
    public static void main(String[] args){
        Scanner sc = new Scanner ( System.in);
        System.out.println("What's your name?");
        String strName = sc.nextLine();
        System.out.println("How old are you?");
        int iAge = sc.nextInt();
        System.out.println("How tall are you(m)");
        double dHeight = sc.nextDouble();
        
        System.out.println("Mrs/Ms. " + strName + ", " + iAge + " Years old. "
                            + "Your height is " + dHeight + ".");
    }
    
}
