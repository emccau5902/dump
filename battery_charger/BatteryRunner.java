
/**
 * Write a description of class BatteryRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BatteryRunner
{
    public static void BatteryRunner()
    {
        // initialise instance variables
        BatteryCharger tester = new BatteryCharger();
        
        System.out.println("getChargingCost Tests");
        System.out.println(tester.getChargingCost(12, 1));
        System.out.println(tester.getChargingCost(0, 2));
        System.out.println(tester.getChargingCost(24, 1));
        System.out.println(tester.getChargingCost(23, 1));
        System.out.println(tester.getChargingCost(22, 7));
        System.out.println(tester.getChargingCost(22, 30));
        
        System.out.println();
        
        System.out.println("getChargeStartTime Tests");
        System.out.println(tester.getChargeStartTime(1));
        System.out.println(tester.getChargeStartTime(2));
        System.out.println(tester.getChargeStartTime(7));
        System.out.println(tester.getChargeStartTime(30));
        System.out.println(tester.getChargeStartTime(3));
    }
}
