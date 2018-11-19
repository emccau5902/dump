
/**
 * Write a description of class trail_runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class trail_runner
{
    public static void frqRunner()
    {
        trail tester = new trail();
        
        System.out.println(tester.isLevelTrailSegment(7, 10));
        System.out.println(tester.isLevelTrailSegment(7, 13));
        System.out.println(tester.isLevelTrailSegment(0, 7));
        System.out.println(tester.isDifficult());
    }
}
