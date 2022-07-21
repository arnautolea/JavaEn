package old_java;

import java.util.Scanner;

public class chapter {

    public static void main(String[] args) {

        int count = 1;
        int time;
        int ttime = 0;
        double cost;
        double total = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("Parking hours for customer %s (-1 to stop): ", count);
        time = input.nextInt();
        while (time != -1) {
            if (time < -1) {
                --count; //invalid time make ignore to customer
            }
            if (time > 24) {
                ttime += 24;
            }
            if (time >= 0 && time < 25) {
                ttime +=time;
            }
            cost = calculateCharges(time);
            System.out.printf("Parking charge: %.2f$", cost);
            ++count;

            System.out.printf("%nParking hours for customer %s (-1 to stop): ", count);
            time = input.nextInt();
            total +=cost;
        }
        input.close();
        System.out.println("\ntotal custormers today: " + (count-1));
        System.out.println("total time spend on parking for all cars: " + ttime);
        System.out.println("total garage charges: " + total + "$");
    }

    public static double calculateCharges (int time) {

        double cost = 0.0;
        if (time >= 0 && time < 25) {
            if (time <= 3)
                cost = 2.0;
            else if (time > 3 && time <= 18)
                cost = (time - 3) * 0.5 + 2.0;
            else if (time > 18 && time <=24)
                cost = 10.0;
        }//calculate cost if input time is less than 24 hours and more or equal to 0

        else if (time > 24){
            System.out.println("car parks for longer than 24 hours at a time ");
            cost = 10.0;
            int extratime = 0;
            extratime = time - 24;
            System.out.println("extra time for next day " + extratime + " hour(s)");
        }
        else System.out.println("invalid time");
        return cost;
    }//end method calculateCharges
}//end class