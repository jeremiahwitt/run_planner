import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CLInterface {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        double race_distance = 0;
        String race_date;

        race_distance = getRaceDistance(kb);
        System.out.printf("You will be running %.2f km\n", race_distance);

        race_date = getRaceDate(kb);
        System.out.printf("You will be racing on %s\n", race_date);
    }

    /**
     * Retrieve the distance of the race from the user, in km
     * Only returns a value greater than 0
     * @param kb Scanner which will get values from the user
     * @return double, representing the distance of the race (in km)
     */
    private static double getRaceDistance(Scanner kb) {
        double distance = 0;

        boolean valid = false;
        do {
            try {
                System.out.println("\nPlease enter the race distance (km): ");
                distance = kb.nextDouble();

                if(distance > 0) {
                    valid = true;
                } else {
                    System.out.println("Please enter a distance greater than 0");
                }
            } catch (InputMismatchException e) {
                System.err.println("You entered an invalid number: " + e.getMessage());
                kb.nextLine();
            }

        } while (!valid);
        kb.nextLine();

        return distance;
    }

    private static String getRaceDate(Scanner kb) {
        String date_string;
        boolean valid = false;

        do {
            System.out.println("\nPlease enter the date of the race in the format YYYY-MM-DD: ");
            date_string = kb.nextLine();

            valid = isDateStringValid(date_string);
        } while (!valid);

        return date_string;
    }

    private static boolean isDateStringValid(String date_string) {

        String[] dates;
        String year;
        String month;
        String day;
        try {
            dates = date_string.split("-");
            year = dates[0];
            month = dates[1];
            day = dates[2];
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }


        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date testDate = format.parse(date_string);
        } catch (ParseException e) {
            return false;
        }

        // If the month is not from 0 to 12, return false
        if(!month.matches("\\d{2}") || Integer.parseInt(month) > 12) {
            return false;
        }

        // If the month is not from 0 to 31, return false
        if(!day.matches("\\d{2}") || Integer.parseInt(day) > 31) {
            return false;
        }

        return true;
    }
}

