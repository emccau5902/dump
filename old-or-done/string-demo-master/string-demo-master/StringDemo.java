/**
 * This class just demonstrates some basic string functions
 */

public class StringDemo
{
    public static void main(String[] args)
    {
        String pangram = "The quick brown fox jumps over the lazy dog.";
        
        // #1 - Find the length of pangram.
        System.out.println(pangram.length());
        
        // #2 - Print the character with an index of 17.
        System.out.println(pangram.charAt(17));
        
        // #3 - Find the index of the letter 'q'.
        System.out.println(pangram.indexOf('q'));
        
        // #4 - Find the index of the letter 'o'.
        System.out.println(pangram.indexOf('o'));

        // #5 - Find the index of the '?' character.
        System.out.println(pangram.indexOf('?'));

        // #6 - Find the index of the letter 'O'.
        System.out.println(pangram.indexOf('O'));

        // #7 - Find the index of the word 'dog'.
        System.out.println(pangram.indexOf("dog"));
        
        // #8 - Find the lastIndex of the letter 'o'.
        System.out.println(pangram.lastIndexOf('o'));
        
        // #9 - Print just the "quick brown fox" portion of the String.
        System.out.println(pangram.substring(4,19));    
        
        // #10 - Print the portion of the sentence beg  inning at "jumps"
        //       all the way to the end.
        System.out.println(pangram.substring(20));
        
        char one = pangram.charAt(0);
        char two = pangram.charAt(5);
        
        System.out.println(one);
        System.out.println(two);
        
        int three = one + two;
        System.out.println(three);
        
        String four = one + "" + two;
        System.out.println(four);
        
        char letter = 97;
        System.out.println(letter);
        
        String s = "asdf" + 'd';
        System.out.println(s);
        
        String str1 = "abc";
        String str2 = "abc";
        String str3 = "def";
        String str4 = "abcdef";
        String str5 = str1 + str3;
        
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str4 == str5);
        
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str4.equals(str5));
        
        
        String last = "Cooper";
        String first = "Jon";
        String full_first = "Jonathan";
        
        System.out.println(first.compareTo(last));
        System.out.println(last.compareTo(first));
        System.out.println(last.compareTo(last));
        System.out.println(full_first.compareTo(first));
        
    }
}