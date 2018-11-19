/**
 * Write a description of class Frq here.
 *
 * @Ethan
 */
public class Frq
{
    public static boolean oddRight(int n)
    {
        //2461357 true
        //24981357 false
        boolean outPut = false;
        int aVar = n /= 10;
        int bVar = n;
        for (int v = 0; v < String.valueOf(n).length(); v ++)
        {
            if (bVar % 2 != 0 && aVar % 2 == 0)
            {
                outPut = true;
            }
            else{
                bVar /= 10;
                aVar /= 10;
            }
        }
        return outPut;
    }
    public static double calc_GPA(String grades)
    {
        //"ABCDBFC" = 2.14
        double uGPA = 28;
        
        for (int v = 1; v < grades.length(); v++)
        {
            //
        }
        return uGPA / grades.length();
    }
    public static void main(String[] args)
    {
        //
    }
}
