
/**
 *
 * @author (Ethan McCauley)
 * @version (yes)
 */
public class BatteryCharger
{
    /**
     * timeArray has 24 entires representing the charging cost for hours 0
     * through 23.
     */
    int[] timeArray = {50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 
            200, 40, 240, 220, 220, 200, 200, 180, 180, 140, 100, 80, 60};
    /**Determines the total cost to charge the battery starting at the beginning of startHour.
     * @param startHour the hour at which the charge period begins.
     *      Precondition: 0 <= startHour <= 23
     * @param chargeTime the number of hours the battery needs to be charged
     *      Precondition: chargeTime > 0
     * @return the total cost to charge the battery
     */
    public int getChargingCost(int startHour, int chargeTime)
    {
        int chargeCost = 0;
        
        
        for (int v = 0; v < chargeTime; v ++)
        {            
            chargeCost += timeArray[(startHour + v) % 24];

        }
            
        return chargeCost;
    }
    /**Determines start time to charge the battery at the lowest cost for the given charge time.
     * @param chargeTime the number of hours the battery needs to be charged 
     *      Precondition: chargeTime > 0
     * @return an optimal start time, wuth 0 <= returned value <= 23
     */
    public int getChargeStartTime(int chargeTime)
    {
        int startTime = 0;
        for (int v = 1; v < 24; v ++)
        {
            if (getChargingCost(v, chargeTime) < getChargingCost(startTime, 
            chargeTime));
            {
                startTime = v;
            }
        }
        return startTime;
    }
    
    
}
