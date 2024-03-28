/*Shopping Receipt. Reading the text file then finding the total,subtotal and tax. Also finding the max.
 * Author: Eaun Waterson: T00714596
*/

import java.io.*;
import java.util.*;
 import java.time.LocalDate; 


public class ShoppingReceipt
{

public static void main(String[] args) throws IOException
 {
        
     
      int i =0;     //declaring variables
      int x=0;
      int Q=0;
      int a =0;     //WE LOVE COUNTERS
      int Max=0;
      int E=0;
      double max=0.0;
      double subTotal=0.0;
      double total=0.0;
      double tax=0.0;
      double val1 =0.0;
     char c='a';
     String strPhrase="";
     String intPhrase="";
     
     String[] name;         //arrays with no size yet
    double[] price; 
     
       
       PrintWriter outputFile = new PrintWriter("OutPut.txt");  //writting to the new document 
       
       
     outputFile.println("\t Java SuperStore");          //Sends to file 
     outputFile.println("\t"+new Date());               //
    
      Scanner scanFile = new Scanner( new File ("Purchases.txt") );       //reading the file to get data from
      Scanner scanCount = new Scanner( new File ("Purchases.txt") );       //reading file to count how long it is
      
      
      
      
   while(scanCount.hasNextLine())               //seeing how long the file is 
    {
        scanCount.nextLine();
        x++;    //WE LOVE COUNTERS 
      }
      a=x-1;    
    
    
    price=new double[a];            //declaring two arrays todo stuff with
    name=new String[a];             //Has size
      
      
      
      
      while(scanFile.hasNext())         //reading line 1 at a time
      {
      String data = scanFile.nextLine();    
   
      
      
      //String 
      
      
        while(c != ' ')     //reading the line 1 char at a time till a space to the the name of iteam bought
        {
           
            c=data.charAt(i);
            i++;                //incrementWE LOVE COUNTERS 
            strPhrase= strPhrase+c;     //catation to get the string 
            
        }
        outputFile.print(strPhrase);        //sends it to the file 
        name[Q]=strPhrase;  
       strPhrase="";            //Resets the string phrase 
       
       
       
       
       
       
       
       //numbers
       
       while(i != data.length())            //Continuing from where the string left off getting the int.
       {
           c=data.charAt(i);
           i++;                 //WE LOVE COUNTERS 
           
           intPhrase=intPhrase+c;
           
       }
            
            
            
            
       
       val1=Double.parseDouble(intPhrase);       //turning the string into a double
       val1=val1/100.0;                           //transfering from cents to dollar 
      subTotal=val1+subTotal;                            //turning it into $ ammount
       outputFile.println(val1);
      
      
      
      price[Q]=val1;            //filling the array with values 
      
      
      
      Q++;          //incrementing the array posistion so both arrays will be synced 
            //WE LOVE COUNTERS 
        i=0;        //resets the tracker in the line 
        intPhrase="";   //resets the phrase 
     
      }//end of while loop 
      
      
      
      
        outputFile.printf("Sub total %6.2f\n",subTotal);        //printing SUB-Total to other doc 
        tax=subTotal*0.14;                                      //Tax calculation
        outputFile.printf("Tax %.2f\n",tax);                    //Prints The tax on the other doc
        total=tax+subTotal;                                     //calculating total
        outputFile.printf("Total %.2f\n",total);                //prinintg total

     
     
       
  
  
  for(int w=0;w<a;w++)                      //finds max value of the price and saves it's possition as E 
  {         //WE LOVE COUNTERS 
      if(max<price[w] )
      {
      max=price[w];
      E=w;
        }
  }
  
  
  outputFile.println("The Most expensice\n" +name[E]+price[E]); //print the the array at posistion E 
  
  
   scanFile.close();            //closes stuff 
        outputFile.close();
  
    }
    
}
