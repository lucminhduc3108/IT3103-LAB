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
public class DaysInMonths {
    public static void main(String[] args){
	Scanner sc = new Scanner ( System.in);
        String monthInput = sc.next();
        int yearInput = sc.nextInt();
        while (yearInput < 0)
        {
            System.out.println("Please enter again !! ");
            yearInput = sc.nextInt();
        }
        if (  monthInput.contains("Feb") || monthInput.equals("2"))
        {
            if ( (yearInput%4 == 0 && yearInput %100 != 0) || yearInput%400 == 0 )
            {
                System.out.println("29");
            }
            else System.out.println("28");
        }
        else if ( monthInput.contains("Jan") || monthInput.contains("Mar") || monthInput.contains("May") || monthInput.contains("July") 
                || monthInput.contains("Aug") || monthInput.contains("Oct") || monthInput.contains("Dec") 
                || monthInput.equals("1") || monthInput.equals("3") || monthInput.equals("5")|| monthInput.equals("7")|| monthInput.equals("8")|| monthInput.equals("10")|| monthInput.equals("12"))
        {
            System.out.println("31");
        }
        else System.out.println("30");
    }
}
