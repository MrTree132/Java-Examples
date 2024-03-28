

public class FloatMax
{
public static void main (String[] args)
{
 double valA = 0;
 double valB = 0;

 valA = Double.MIN_VALUE; // store the smallest floating-point value
 valB = valA + 1.0; // add 1 to that value

 System.out.println ( valA );
 System.out.println ( valB );

}

}
