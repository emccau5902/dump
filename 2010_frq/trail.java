
/**
 * 
 *
 * @author Ethan
 * @version 1
 */
public class trail
{
    // instance variables - replace the example below with your own
    private int[] markers = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 
        90, 100};

    /**
     * 
     */
    public boolean isLevelTrailSegment(int start, int end)
    {
        for (int i = start; i < end - 1; i ++)
        {
            if ((markers[i] - markers[i + 1] < 10 &&
                markers[i] - markers[i + 1] > -10))
            {
                return true;
            }
        }
        return false;
    }

    public boolean isDifficult()
    {
        int difficultCount = 0;
        
        for (int i = 0; i < markers.length - 1; i ++)
        {
            if ((Math.abs(markers[i] - markers[i + 1]) % 30 >= 0))
            {
                difficultCount += 1;
            }
        }
        if (difficultCount >= 3)
        {
            return true;
        }
        return false;
    }
}
