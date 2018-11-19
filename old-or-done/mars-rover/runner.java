/**
 * Write a description of class runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class runner
{
    public static void main(String[] args)
    {
        //Creates new scanner thing
        SimpleScanner input = new SimpleScanner();
        //initializes rovers and displays their stats
        Rover r1 = new Rover("Turing");
        System.out.println(r1.toString());
        
        roverGroup group = new roverGroup();
        group.add(r1);
 
        boolean running = true;
        String exitCommand = "quit";
        while (running) {
            // Input name
            System.out.println("Enter the name of the rover to act:");
            System.out.println("Rovers: Turing");
            String name = input.readString();
            
           if (name.equals(exitCommand)) {
            System.out.println("Goodbye.");
            System.exit(1);
            } 
            
            // Select rover with matching name
            Rover actor = group.find(name);
            
            if (actor != null) {
                // If the rover is found
            System.out.println("Enter Command: ");
            System.out.print("Available Commands: move, rotate, refuel, teleport, gohome, status");
            String command = input.readString();
            
            if (command.equals("move")) {
                System.out.print("What x do you wish to move to? ");
                int xD = input.readInt();
                System.out.print("What y do you wish to move to? ");
                int yD = input.readInt();
                /*System.out.print("What direction do you wish to face? ");
                String dD = input.readString();
                int d2 = r1.rDirname(dD);
                */
                System.out.println("Which direction do you wish to face? (0 = N, 1 == E, Etc) ");
                System.out.print("Just so you know, you are currently facing " + 
                actor.getDirectionName() + ". ");
                int d2 = input.readInt();
                actor.moveTo(xD, yD, d2);
            }
            else if (command.equals("rotate")) {
                System.out.print("Which direction?");
                int direction = input.readInt();
                actor.rotateUni(direction);
            }
            else if (command.equals("refuel"))
            {
                System.out.print("How much would you like to refill?");
                int fuel = input.readInt();
                actor.reFuel(fuel);
            }
            else if (command.equals("teleport"))
            {
                System.out.print("Where to? X then Y.");
                int x = input.readInt();
                int y = input.readInt();
                actor.telePort(x, y);
            }
            else if (command.equals("gohome"))
            {
                actor.goHome();
                System.out.print("Your rover is now at 0, 0");
            }
            else if (command.equals("status"))
            {
                actor.toString();
            }
           
            else {
                System.out.println("Error: Command doesn't exist.");
            }
            
            System.out.println(actor);
        
            // just a blank line
            System.out.println();
           }
        }
    }
}
