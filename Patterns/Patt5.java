package Patterns;
/*
 *  A
 *  B C
 *  D E F
 *  G H I H
 */

import java.util.Scanner;
public class Patt5 {
    public static void main(String[] args)
    {
        System.out.print("Enter the value for n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print((char)(65+count)+" ");
                count++;
            }
            System.out.println();
        }


    }
}
