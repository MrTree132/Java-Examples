/*SecondsConverter.java
 * Purpose:Asking for seconds then converting into hours,mins and seconds 
 * Author: Eaun Waterson (T00714596)
 * */

import java.util.Scanner;

public class SecondsConverter
{
    public static void main (String[] args)
    {
        //declaring variuables
        int inputSeconds=0;
        int seconds=0;
        int minutes =0;
        int hours = 0;
        
        //setting up the scanner
        Scanner scan = new Scanner(System.in);
        //ask for the amount of sceconds 
        System.out.print("How many seconds: ");
        inputSeconds = scan.nextInt();
        
        //find the emount of hours
        seconds = inputSeconds;
        hours = seconds/3600;
        seconds = seconds%3600;
        
        //find the amount of minutes
        minutes=seconds/60;
        seconds=seconds%60;
        
        //prints out the the hours,mins and seconds and starting secodn
        System.out.println("For the total seconds:"+inputSeconds);
        System.out.print("This equals: "+hours+" hours " + minutes+" minutes "+ seconds+" seconds.");
    }//end of main 
}//end of class
