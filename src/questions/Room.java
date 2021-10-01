package questions;

import java.util.Scanner;

public class Room {
    boolean ac_on,home_theatre,fan_on,light_on;

    public Room(boolean ac_on, boolean home_theatre, boolean fan_on, boolean light_on) {
        this.ac_on = ac_on;
        this.home_theatre = home_theatre;
        this.fan_on = fan_on;
        this.light_on = light_on;

        System.out.println(bill());
    }
    
    public String bill(){
        int pow = 0;
        if (ac_on) pow+=1200;
        if (home_theatre) pow+=600;
        if (fan_on) pow+=400;
        if (light_on) pow+=100;

        if (pow > 2000) return "overload :"+pow;
        return "below 2Kw :"+pow;
    }
}
class Output{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ac_on = false,fan_on =false,light_on = false, home_theatre = false;
        System.out.print("status of AC:");
        String ac = sc.next();
        System.out.print("status of HOME THEATRE:");
        String ht = sc.next();
        System.out.print("status of FAN:");
        String fan = sc.next();
        System.out.print("status of LIGHT:");
        String light = sc.next();
        if (ac.equals("on")||ac.equals("ON")||ac.equals("On")) ac_on = true;
        if (ht.equals("on")||ht.equals("ON")||ht.equals("On")) home_theatre = true;
        if (fan.equals("on")||fan.equals("ON")||fan.equals("On")) fan_on = true;
        if (light.equals("on")||light.equals("ON")||light.equals("On")) light_on = true;
        Room r1 = new Room(ac_on,home_theatre,fan_on,light_on);
    }
}