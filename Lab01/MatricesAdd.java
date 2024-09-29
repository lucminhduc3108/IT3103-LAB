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
public class MatricesAdd {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Length and Width: ");
        int N = sc.nextInt(), M = sc.nextInt();
        System.out.println("First Matrix: ");
        int [][] arr1 = new int[N][M];
        for ( int i = 0; i < N; i++)
        {
            for ( int j = 0; j < M; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Second Matrix: ");
        int [][] arr2 = new int[N][M];
        for ( int i = 0; i < N; i++)
        {
            for ( int j = 0; j < M; j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Sum of two Matrices: ");
        for ( int i = 0; i < N; i++)
        {
            for ( int j = 0; j < M; j++)
            {
                System.out.print(arr1[i][j]+ arr2[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
