//SquareCals: Asks the user for side of a square then gives the area.perimeter of the square
// Author Eaun Waterson (tru714596)

import java.util.Scanner;

public class SquareCalc
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in );
       
       //declaring variables 
       double length  = 0.0; 
       double area = 0.0;
       double perimeter = 0.0;  
        
        //input 
        System.out.print("What is the length of the square:");
        length = scan.nextDouble();
        
        
        //math
        perimeter = 4*length; 
        area = length * length;
        
        //output 
        System.out.print ("With length of " + length + ", ");
        System.out.println ("perimeter: " + perimeter + ", area: " + area);
        
        
    }
}




