
/**
 * Write a description of class VariablesAndArithmetic here.
 * 
 * @author (your name) 
 * @version August 23, 2018
 */

public class VariablesAndArithmetic
{
    public static void main(String[] args)
	{
		int x = 27;
		int y = 7;
		
		int sum  = x + y;
		int diff = x - y;
		int prod = x * y;
		int quot = x / y;
		int mod  = x % y;
		
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(prod);
		System.out.println(quot);
		System.out.println(mod); // what is going on here? change values of x & y until you figure it out.
		
		double base1  = 28.7;
		double base2  = 34.3;
		double height = 12.9;
		
		double area = (base1 + base2) * height / 2.0;
		System.out.println(area);
		
		int a = 5;
		double b = 13.1;
		
		// which of these lines works? why?
		// int sum2 = a + b;
		double sum2 = a  + b;
		
		System.out.println(sum2);
		
		// why doesn't the expression below correctly determine the area of a triange with h=4.3 and b=7.5?
		double area2 = 1 / 2 * 4.3 * 7.5;
		System.out.println(area2);
		
		// think of at least two ways to correctly evaluate area. test them here.
		double area3 = 1.0 / 2.0 * 4.3 *7.5;
		System.out.println(area3);
		
		double area4 = 4.3 * 7.5 / 2;
		System.out.println(area4);

		
		// built-in constants from the Math class
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		// built-in functions from the Math class
		System.out.println(Math.sqrt(5));
		System.out.println(Math.abs(-4));
		System.out.println(Math.sin(0.5)); // in radians! 
	}
}
