/* FunnyName.java. 
 * Purpose: ask the user for a name and make it lower,uppercase and replace some of the vowls with special characters
Author Euan Waterson(T00714596)
*/
import java.util.Scanner;

public class FunnyName
{
    public static void main (String[] args)
    {
    //Setting up the variables
    String name ="";
    String lowerName = "";
    String upperName = "";
    String replaceName = "";
    
    //promting the user for thier name
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name? ");
    name = scan.nextLine();
    
    //Changing the string
    lowerName=name.toLowerCase();
    upperName= lowerName.toUpperCase();
    replaceName =upperName.replace('E','#');
    replaceName=replaceName.replace('A','@');
    replaceName=replaceName.replace('I','%');
     
     
     //printing out the new names
    System.out.println("Name fun: "+lowerName+" and "+upperName+" and " + replaceName);
    
    
    }//end of main 
}//end of class
