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
public class SolveEquation {
    public static void main(String[] args){
        Scanner sc = new Scanner ( System.in);
        System.out.println("Enter the type of equation: ");
        int N = sc.nextInt();
        switch (N)
        {
            case 1: //linear
            {
                System.out.println("Linear equation: ");
                double a =  Double.parseDouble(sc.next()), 
                b = Double.parseDouble(sc.next());
                while ( a == 0)
                {
                    System.out.println("PLease enter again!");
                    a =  Double.parseDouble(sc.next());
                }
                System.out.println("x = " + (-b/a));
                break;
            }
            case 2: //fisrt-degree 
            {
                System.out.println("Fisrt-degree  equation: ");
                double  a11 =  Double.parseDouble(sc.next()), 
                        a12 = Double.parseDouble(sc.next()),
                        b1 = Double.parseDouble(sc.next()),
                        a21 = Double.parseDouble(sc.next()),
                        a22 = Double.parseDouble(sc.next()),
                        b2 = Double.parseDouble(sc.next());
                double D = a11*a22 - a21*a12, D1 = b1*a22 - b2*a12, D2 = a11*b2 - a21*b1;
                if ( D != 0 )
                {
                    System.out.println("x1 = " + D1/D + " x2 = " + D2/D);
                }
                else if ( D == D1 && D == D1 && D1 == D2)
                {
                    System.out.println("Infinite solutions");
                }
                else System.out.println("There is no solution for this equation");
                break;
            }            
            case 3: // second-degree 
            {
                System.out.println("Second-degree  equation: ");
                double  a =  Double.parseDouble(sc.next()), 
                        b = Double.parseDouble(sc.next()),
                        c = Double.parseDouble(sc.next());
                while ( a == 0)
                {
                    System.out.println("PLease enter again!");
                    a =  Double.parseDouble(sc.next());
                }
                double delta = b*b - 4*a*c;
                if ( delta < 0 )
                {
                    System.out.println("There is no solution for this equation");
                }
                else if ( delta == 0)
                {
                    System.out.println("x = " + -b/(2*a));
                }
                else
                {
                    System.out.println("x1 = " + (-b + Math.sqrt(delta))/(2*a) + " x2 = "+"x = " + (-b - Math.sqrt(delta))/(2*a));
                }
                break;
            }
            default:
            {
                System.out.println("Inappropriate!!");
            }
        }
               
        
    }
}

