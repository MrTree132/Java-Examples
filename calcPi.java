/*PiCalc-Calculate pi
 * Author: Eaun Waterson(t00714596)
*/

public class calcPi
{
     public static void main (String[] args)
     {
          
          calcPi(4);       //call the method 
     
     }//end  main
     
     
     
     
     public static void calcPi(int itterations)
     {
          double sumI=0.0;  //declars the initional SUM
          double sumF=0.0;  //Delcares the final SUM
    
               
          
          for (double  k =0;k<=itterations; k++)    //stat the for loop 
          {
                double T1=(1/Math.pow(16,k)); //delcaring each term as it's own variable 
                double T2=4.00/(8*k+1);
                double T3=2.00/(8*k+4);
                double T4=1.00/(8*k+5);
                double T5=1.00/(8*k+6);
               
             sumI=T1*(T2-T3-T4-T5); //doing the math 
             sumF=sumF+sumI;    // adding it to the SUM final 
          }
          
          System.out.print(sumF);   //printing the final value 
     }//end calcPi
}//end class
