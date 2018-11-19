/**
 * This program says a lil' bit about me.
 * 
 * @author Ethan
 * @version August 20th, 2018
 */

public class introduction
{
    public static void main(String[] args)
    
    {
        /*Notes.
         * double slash is one line comment, akin to #
         * multi line comments, think ''' ''', its slash asterisk, and slash asterisk to end.
         * System.out.println id assume prints in the bluej project
         * String "___" initializes a string
         * int name number makes a number variable
         * id assume u can use if not but iunno rn
         * true/false must be lowercase
         */
        
        
        
        // 
        System.out.println("I was born in Greenville, SC");
        System.out.println("I plan on going to Greenville Tech.");
        System.out.println("Woo");
        System.out.println("I do not have any kids");
        System.out.println("I like psychological horror, sleep, and video games.");
        
        // create varibales and storing values in them
        String name = "Ethan";
        int birthYear = 2001;
        int currentYear = 2018;
       
        //Prints how old i am
        System.out.println("currentYear - birthYear");
        System.out.println(currentYear - birthYear);
        
        // arithmetic
        int age = currentYear - birthYear;
        
        //concatenate(link) literal strings with variables
        System.out.println("My name is " + name + ", and I am " + age + " years old.");
        
        /* age is only right if bday is already occured. we will now fix this.
         */
        
        //change val to false if you have not had your birthday this year, yet.
        boolean hadBirthday = true;
        
        // conditionall, subtract one from age if bday has not occured.
        if (hadBirthday == false) {
            age -= 1;
        };
        
        //this output should always be right
        System.out.println("My name is " + name + ", and I'm " + age + " years old.");
    }
}