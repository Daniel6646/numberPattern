package numberPattern;

import java.util.Scanner;

public class FloydTriangleExample {


    public static void main(String args[])
    {
       int rows, number = 1, i, j;
       //To get the user's input
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the number of rows for floyd's triangle:");
       //Copying user input into an integer variable named rows
       rows = input.nextInt();
       System.out.println("Floyd's triangle");
       System.out.println("****************");
       for ( i = 1 ; i <= rows ; i++ )
       {
           for ( j = 1 ; j <= i ; j++ )
           {
                System.out.print(number+" ");
                //Incrementing the number value
                number++;
           }
           //For new line
           System.out.println();
       }
   }
	
}
