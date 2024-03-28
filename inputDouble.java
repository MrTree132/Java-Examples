/*InputDouble ,Takes input as stings then converts them to double.
 * Author:Eaun Waterson(T00714596)
 */

import java.util.Scanner;   //imports 
public class inputDouble
{
     public static void main (String[] args)
     {
         
       double cost= inputDouble("Enter the value ");
    
     
        
        System.out.printf("The cost is %.2f",cost); //prints out the cost and then the double 
     }//end of main
    
    public static double inputDouble(String prompt )
    {
        Scanner scan = new Scanner (System.in); //sets up the scanenr 
        double ret=0.0; //reclars variables 
       
        
        System.out.print(prompt);
        ret=scan.nextDouble();
        return (ret);   //retuns the value of ret
    }//end of method 

}//end of all 
