
/**
 * Write a description of class rover here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rover
{
    // instance variables
    private int x; 
    private int y;
    private int dir;
    private boolean isAlive;
    private int nRg;
    private int numPics;
    private String name;
    private int memory;
    private int fuelCapacity;
    private int homeX = 0;
    private int homeY = 0;
    private int homeD = 0;
    


    public Rover(String name)
    {
        // initialise instance variables
        this.x = 0;
        this.y = 0;
        this.dir = 0;
        this.isAlive = true;
        this.nRg = 50;
        this.numPics = 0;
        this.name = name;
        this.memory = 5;
        this.fuelCapacity = 50;
    }
    
    public Rover(String name, int x, int y, int dir)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.homeX = x;
        this.homeY = y;
        this.homeD = dir;
        
        this.isAlive = true;
        this.nRg = 50;
        this.numPics = 0;
        this.name = name;
        this.memory = 5;
        this.fuelCapacity = 50;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void rotateUni(int spacesVar)
    {
        int nRgReq = 1;
        if (nRg >= nRgReq)
        {
            if (spacesVar > 0)
            {
                spacesVar %= 4;
                dir += spacesVar;
            }
            if (spacesVar < 0)
            {
                spacesVar = Math.abs(spacesVar);
                spacesVar %= 4;
                spacesVar *= -1;
                dir -= spacesVar;
            }
            getDirectionName();
        }
        else
        {
            System.out.println(name + " has no energy left, it must refuel.");
        }
        
    }
    
    public void reFuel(int k)
    {
        if (k + nRg > fuelCapacity)
        {
            k = (fuelCapacity - nRg);
        }
        nRg += k;
        
    }
 
    public String getDirectionName()
    {
         String dirName = "";
         if (dir == 0)
         {
             dirName = "North";
         }
         else if (dir == 1)
         {
             dirName = "East";
         }
         else if (dir == 2)
         {
             dirName = "South";
         }
         else if (dir == 3)
         {
             dirName = "West";
         }
         
         return dirName; 
    }
    
    public void moveTo(int moveX, int moveY, int endingD)
    {
        dir = endingD;
        rotateUni(endingD);
        if (x != moveX)
        {
            move(moveX, 0);
        }
        
        if (y != moveY)
        {
            move(0, moveY);
        };
        
    }

    public void telePort(int x, int y)
    {
        this.x = x;
        this.y = y;
        System.out.println("Poof! " + name + " has been teleported!");
    }
    
    public void goHome()
    {
        moveTo(homeX, homeY, homeD);
    }
    
    public void move(int mX, int mY)
    {
        int nRgReq = 2;
        
        if (nRg > nRgReq)
        {
            nRg -= nRgReq;
            if (mX > 0)
            {
                x += mX;  
            }
            if (mY > 0)
            {
                y += mY;
            }
        }
        else
        {
            System.out.println(name + " has no energy left, it must refuel.");
        }
    }
    
    public void takePic()
    {
        if (numPics < memory)
        {
            numPics += 1;
            System.out.println(name + " took a picture at [" +
            x + ", " + y + "], facing " + getDirectionName() + ".");
        }
        else{
            System.out.println("Your memory is full. Cannot take more pics.");
        }
    }
    public void transmitPics()
    {
        numPics = 0;
        System.out.println("The pics have been sent back to Earth. Now, go take more.");
    }

    public String toString()
    {
       return name + "'s Stats[Energy = " + nRg + ", XYD = " + x + ", " + y + ", " 
       + getDirectionName() + ", Pictures Taken = " + numPics + "]";
    }
}