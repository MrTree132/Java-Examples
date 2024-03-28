/* Average of Two: Where the program gets the average of two ints what the user inputs
 * Author: Eaun Waterson (Tru714596)
 * */

import java.util.Scanner;   //IMports the scanner class

public class AverageThree
{
    public static void main (String[] args)
    {
        //The set up 
        Scanner scan = new Scanner (System.in); 
        
        double vaL1 = 0, vaL2 = 0, vaL3= 0;  //declaring the variables
        double average =0.0;
        
        
        //Interaction
        
        System.out.println("Enter three number (Wtih a space in-between)  "); //promt for numbers
        vaL1 = scan.nextDouble();  //Storing the first variable
        vaL2 = scan.nextDouble();  //Storing the second variable
        vaL3 = scan.nextDouble();  //Storing the third variable
        
        //Math
        average = vaL1 + vaL2 +vaL3;  //adding the threevariables
        average = average/3;    //Dividing the Sum by 2 
        
        //feed back the resulut 
        
         System.out.println ("The average of"); //Giving back the information
        System.out.println ("\t" + vaL1);
        System.out.println ("and");
        System.out.println ("\t" + vaL2);
        System.out.println("and ");
        System.out.println("\t"+ vaL3);
        System.out.println ("\nis \t" + average)
    }//end of pbulic static void main
}//end of public class 
