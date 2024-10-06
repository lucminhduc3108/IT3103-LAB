
import java.util.*;

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
