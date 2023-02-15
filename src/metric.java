import java.util.Scanner;

import static java.lang.System.*;

public class metric {

    public static void main(String[] args) {
        double meters = 0;
        double miles;
        double feet;
        double inches;
        Scanner in = new Scanner(System.in);
        out.println("Enter measurement in meters");
        if (in.hasNextDouble())
        {
            meters = in.nextDouble();
        }
                else
        {
            out.println("Error input correct value");
            System.exit(0);
        }
                miles = meters * 0.000621371192;
                feet = meters * 3.2808399;
                inches = meters * 39.3700787;
        out.println("Your measurement in miles = "+miles);
        out.println("Your measurement in feet = "+feet);
        out.println("Your measurement in inches = "+inches);


    }

}
