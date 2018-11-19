/**
 * Complete each loop problem and test in main.
 * 
 * @author  Ethan
 * @version Yes
 */

public class ForLoopPractice 
{
    // Return the sum of all ints in the range a to b inclusive.
    public static int sum(int a, int b) {
        int sum = 0;
        
        for (a = a; a < b; a += 1)
        {
            sum += a;
        }
        
        return sum;
        
    }

    
    // Return the sum of all even ints in the range a to b inclusive.
    public static int sumRange(int a, int b) {
        int sum = 0;
        if (a % 2 != 0)
        {
            a -= 1;
        }
        
        for (a = a; a < b; a += 2)
        {
            sum += a;
        }
        
        return sum;
    }

    
    // Return the sum of all ints in the range 1 to n that are evenly divisible by both a and b.
    public static int sumAndDiv(int n, int a, int b) {
        int sum = 0;
        for (int v = 1; v < n; v += 1)
        {
            
            if ((v % a == 0) && (v % b == 0))
            {
                sum += v;
            }
            //sum += 0;
        }
        
        return sum;
    }
    
    
    // Return the sum of all ints in the range 1 to n that are evenly divisible by a or b.
    public static int sumOrDiv(int n, int a, int b) {
        int sum = 0;
        for (int v = 1; v < n; v += 1)
        {
            
            if ((v % a == 0) || (v % b == 0))
            {
                sum += v;
            }
            //sum += 0;
        }
        
        return sum;
    }

    
    // Return the sum of all ints in the range 1 to n that are evenly divisible by a or b but not both.
    public static int sumXOrDiv(int n, int a, int b) {
        int sum = 0;
        for (int v = 1; v < n; v += 1)
        {
            
            if ((v % a == 0) || (v % b == 0))
            {
                if ((v % a == 0) && (v % b == 0))
                {
                    sum += 0;
                }
                else {
                    sum += v;
                }
            }
            //sum += 0;
        }
        
        return sum;
    }

    
    // Return the sum of the first n perfect squares.
    public static int sumSquares(int n) {
        //ax2 + bx + c; if b2 = 4ac
        int sum = 0;
        for (int j = 1; j <= n; j +=1)
        {
            j *= j;
            sum += j;
            Math.sqrt(j);
        }
        return sum;
    }
    

    
    // Return true if an int n contains the digit d, and false otherwise.
    public static boolean hasDigit(int n, int d) {
        /*if (String.valueOf(x).contains("0"))
        boolean vAr = false;
        for (int i = 0; i <= n; i += 1)
        {  
            if (String.valueOf(n).contains(String.valueOf(d)))
            {
                vAr = true;
            }
        }
        return vAr;
        */
        
        if (String.valueOf(n).contains(String.valueOf(d)))
         {
            return true;
         }
        return false;
        
    }

    
    // Return the sum of digits in an int.
    public static int sumDigits(int n) {
        int numPlace = 0;
        String sum = "";
        for (int var = 0; var < String.valueOf(n).length(); var ++)
        {
            //sum += sum.length(numPlace, numPlace += 1);
        }
        return Integer.parseInt(sum);
    }

    /*
    // Return the sum of all odd digits in an int.
    public static int sumOddDigits(int n) {
        
    }

    /*
    // Return true if the number of even digits in an int is greater than the number of odd digits
    public static boolean moreEvens(int n) {

    }
    */

    // Return String str with the characters in reverse order. 
    public static String reverse(String str) {
        String rev = "";
        
        for (int i=0; i<str.length(); i++)
            rev = str.charAt(i) + rev;
        
        return rev;
    }
    
    /*
    // Return the sum of the unicode values of the characters in str.
    public static int unicodeSum(String str) {

    }
    */

    // Return true if str is a palindrome. All input will contain only lowercase letters.
    public static boolean easyPalindrome(String str) {
        int mid = str.length()/2;
        for (int i=0; i<mid; i++)
            if (str.charAt(i) != str.charAt(str.length()-1-i))
                return false;
        
        return true;    
    }

    /*
    // Return String str with all non-capital letters removed.
    public static String noCaps(String str) {

    }


    // Return String str with all capital letters turned to lowercase and lowercase to capital. Any other characters should remain unchanged.
    public static String capSwap(String str)
    {

    }
    */

    // Return true if str is a palindrome with respect to letters only. 
    public static boolean hardPalindrome(String str) {
        String stripped = "";
        str = str.toLowerCase();
        
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            
            if (c>=97 && c<=122)
                stripped += c;
        }
        
        return easyPalindrome(stripped);
    }

    /*
    // Return the factorial of n.
    public static int factorial(int n) {

    }
    
    
    // Return the nth term in the Fibonacci sequence beginning with {0, 1, 1, 2, ...}
    public static int nthFib(int n) {

    }
    */

    public static void main(String[] args)
    {
        System.out.println( sum(5,10) );
        System.out.println( reverse("hello") );
        System.out.println( easyPalindrome("hello") );
        System.out.println( easyPalindrome("racecar") );
        System.out.println( easyPalindrome("Madam, I'm adam.") );
        System.out.println( hardPalindrome("Madam, I'm adam.") );
    }
}