package Patterns;

/*
 *        
      *****
    ***** 
   *****  
  *****   
 ***** 

 */
import java.util.Scanner;
public class Patt11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for n:");
        int n = sc.nextInt();
        int m = n-1;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=n-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++)
            {
                System.out.print("*");
            }
            for(int l = 0; l<m-i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
