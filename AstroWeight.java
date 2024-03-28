
/*
Title: AstroWeight.java
Purpose: Ask the user for a weght then tell them what the weight is on a different planent.
Author: Eaun Waterson (T00714596)  
*/

import java.util.Scanner;


public class AstroWeight
{
public static void main (String[] args)
     {
          //Declaring variables 
    double W = 0.0;
    double moonW = 0.166,MercuryW =0.378,VenusW=0.907,MarsW=0.377,JuipterW=2.364;
    double SaturnW=0.916, UranusW=0.889 , NeptuneW=1.125, PlutoW=0.067,KryptonW=1.520,VulcanW=1.314 , TatoonineW=0.770;
   
   
   //Setting up the scan asking the user for input and storing it in W. 
    Scanner scan = new Scanner(System.in);
    System.out.print("Weight:");
    W = scan.nextDouble();
    
    
    
    //Converting the weight to the planet weight 
    moonW=moonW*W;                      
    MercuryW=MercuryW*W;                
    VenusW=VenusW*W;
    MarsW=MarsW*W;
    JuipterW=JuipterW*W;
    SaturnW=SaturnW*W;
    UranusW=UranusW*W;
    NeptuneW=NeptuneW*W;
    PlutoW=PlutoW*W;
    KryptonW=KryptonW*W;
    VulcanW=VulcanW*W;
    TatoonineW=TatoonineW*W;
    
    //Printing out each of the gravity with the respective name of the planet 
     System.out.printf("\nMoon:%.3f",moonW);
     System.out.printf("\nMercyr:%.3f",MercuryW);
     System.out.printf("\nVenus:%.3f",VenusW);
     System.out.printf("\nHuipter:%.3f",JuipterW);
     System.out.printf("\nSaturn:%.3f",SaturnW);
     System.out.printf("\nUranus:%.3f",UranusW);
     System.out.printf("\nNeptune:%.3f",NeptuneW);
     System.out.printf("\nPluto:%.3f",PlutoW);
     System.out.printf("\nKrypton:%.3f",KryptonW);
     System.out.printf("\nVulcan:%.3f",VulcanW);
     System.out.printf("\nTatoonie:%.3f",TatoonineW);
    
     }//end of main 
}//end of class
