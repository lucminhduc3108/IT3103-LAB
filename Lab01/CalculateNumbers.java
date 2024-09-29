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
public class CalculateNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner ( System.in);
        double num1 =  Double.parseDouble(sc.next()), 
                num2 = Double.parseDouble(sc.next());
        System.out.println("Sum : " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1*num2));
        System.out.println("Quotient: " + (num1/num2));
    }
}
