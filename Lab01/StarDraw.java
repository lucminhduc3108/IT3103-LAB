package baitapcoban;
import java.util.*;

public class StarDraw {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for ( int i = 0; i < N; i++)
        {
            for ( int j = 0; j < N - i - 1; j++)
            {
                System.out.print(" ");
            }
            for ( int k = 0; k < 2*i+1; k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}