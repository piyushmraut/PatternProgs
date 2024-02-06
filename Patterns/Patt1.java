package Patterns;
/*
 * In these program we will be printing the following pattern
 * for n
 *  ****
 *  ****
 *  ****
 *  ****
 */

 import java.util.*;
public class Patt1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for n:");
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
