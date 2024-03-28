/*VisualPhrase. Outputs a string in two different ways.
 * Author: Eaun Waterson: T00714596
*/

import java.util.Scanner;

public class VisualPhrase
{

public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);// declaring stuff and set up
        String phrase =" ";
        
        System.out.print("Enter a phrase: ");   //asking for phrase to use 
        phrase=scan.nextLine();
        
       
       
       
        for(int n=0; n<phrase.length(); n++)  // the for loop for the diagonal  
        {
            System.out.print(" ".repeat(n));    //Print out the space 
            System.out.println(phrase.charAt(n));   //pritns out the character 
            
        }
     
        System.out.println("");
     
        for(int i=0; i<phrase.length(); i+=2)
        {
            System.out.print(phrase.charAt(i)+" ");
            
        }
        System.out.println("");
      for(int i=1; i<phrase.length(); i+=2)
        {
            System.out.print(" "+phrase.charAt(i));
            
        }
     
     
        
    }
    
}
