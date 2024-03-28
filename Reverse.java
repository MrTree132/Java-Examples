/*Reverse. Input a word and gives back the reverse 
*Author:Eaun Waterson(T00714596) 
*/
public class Reverse
{
     public static void main(String[] args)
     {
          Revers("Chocolate cake ");//sends the word to the method 
     
     }
     public static void Revers(String n )//start the method 
     {
          
          for(int x= n.length()-1;x>=0;x--) //start the for loop
          {
               
            
	               System.out.print(n.charAt(x)); //prints the word letter by letter
                    
          }
     }

}
