
/**
 * Assignment 2.03 finding the hypotenuse of two triangles. 
 *
 *    
 *
 * @author Anvit Dhamnekar
 */
public class PyTheorem
{
    public static void main(String[ ] args)
    {
        //example of raising a number to the nth power
        double number = 2;
        double nthPower = 15;
        double powValue = Math.pow(number, nthPower);
        System.out.println(number + " to the power of " + nthPower + ": " + powValue);
        System.out.println();

        // example of integers and the pow() method
        
        int n = 2;
        int p = 15;
        int powValue2 = (int)Math.pow(n, p);
        System.out.println(n + " to the power of " + p + ": " + powValue2);
        System.out.println();
        

        //example of finding the square root of a value
        
        double someNumber = 17.5;
        double squareRoot = Math.sqrt(someNumber);
        System.out.println("The square root of " + someNumber + " is: " + squareRoot);
        System.out.println();
        
        //example of finding the absolute value of an integer
        
        int integerNumber = -34;
        int intAbsValue = Math.abs(integerNumber);
        System.out.println("The absolute value of " + integerNumber + " is: " + intAbsValue);
        System.out.println();
        

        //example of finding the absolute value of a double
        
        double decimalNumber = -4.56;
        double decimalAbsValue = Math.abs(decimalNumber);
        System.out.println("The absolute value of " + decimalNumber + " is: " + decimalAbsValue);
        System.out.println();
        

        //example of using the constant PI to calculate a circumference
        //notice that PI is not assigned a value, it has a constant value assigned by the Math class
        
		double myRadius = 3.5;
		double myCircumference = 2 * Math.PI * myRadius;
		System.out.println("The circumference of a circle with radius " + myRadius + " is: " + myCircumference);
        System.out.println();
        

        //example of multiple Math class methods used together
        
        int x1 = 300;
        int x2 = 250;
        double answer = Math.sqrt(Math.pow(Math.abs(x2 - x1),3));
        System.out.println("The result of Math.sqrt(Math.pow(Math.abs(x2 - x1),3)) is: " + answer);
        System.out.println();
        
    }//end of main method
}//end of class
