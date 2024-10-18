  /*
  Assignment
  Write a quadratic equation using Java that does the following:
  1. Accept three values a,b & c using the scanner class
  2. Compute the discriminant b^2 - 4ac and check the nature of the roots of the equation.
  3. Compute & print out the two roots X1 & X2 of the equation with relevant comment to 
     describe the roots of the equation
  */

  // Answer begins here

   import java.util.Scanner;
  public class solver{
     public static void main(String[]Strings){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ")
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ")
        double b = input.nextDouble();

        System.out.print("Enter the value of c: ")
        double c = input.nextDouble();

        double d = b * b - 4.0 * a * c;

        if (d>0.0){
           double r1 = (-b+Math.pow(d,0.5))/(2.0*a);
           double r2 = (-b-Math.pow(d,0.5))/(2.0*a);
           System.out.println("The roots are " + r1 + " and " + r2)
        }
        else if (d==0.0){
           double r1 = -b/(2.0 * a);
           System.out.println("The root is " + r1);
        }
        else{
           System.out.println("Roots are not real !")
        }

     }
  }