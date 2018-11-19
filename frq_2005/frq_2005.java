
/**
 * Calculates GPA.
 *
 * @author Ethan M
 * @version 1
 */
public class frq_2005
{
    // instance variables - replace the example below with your own
    //private int[] scores = {20, 50, 50, 53, 80};
    //private int[] scores = {20, 80};
    //private int[] scores = {50, 50, 20, 80, 53};
    private int[] scores = {20, 50, 50, 80};
    /**
     * returns the average of the values in scores whose subscripts are 
     * between first and last, inclusive.
     */
    private double average(int first, int last)
    {
        double avg = 0;
        int avgLen = (last - first);
        for (int i = first; i < last; i ++)
        {
            avg += scores[i];
        }
        return avg /= avgLen;
    }
    /**
     * returns true if each successive value in scores is greater than or equal
     * to the previous value; otherwise, returns false
     */
    private boolean hasImproved()
    {
        for (int i = 1; i < scores.length; i ++)
        {
            if (!(scores[i] >= scores[i - 1]))
            {
                return false;
            }
        }
        return true;
    }
    /**
     * if the values in scores have improved, returns the average of the 
     * elements in scores with indexes greater than or equal to 
     * scores.length / 2; otherwise, returns the average of all the 
     * values in scores
     */
    public double finalAverage()
    {
        if (hasImproved())
        {
            return average(scores.length / 2, scores.length);
        }
        return average(0, scores.length);
    }
}
