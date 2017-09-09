import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CLInterface {
    public static void main(String[] args) throws ParseException {
        Scanner kb = new Scanner(System.in);
        double race_distance = 0;
        String date_string;
        String race_time;
        int num_weeks;

        race_distance = getRaceDistance(kb);
        date_string = getRaceDate(kb);
        race_time = getRaceTime(kb);

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date race_date = format.parse(date_string);

        Race desired_race = new Race(race_distance, race_date, race_time);

        System.out.printf("You will be running %.2f km\n", desired_race.getRaceDistance());
        System.out.printf("You will be racing on %s\n", desired_race.getRaceDate());
        System.out.printf("You will try to finish your race in %s\n", desired_race.getFinishTime());

        num_weeks = getNumWeeks(kb);

        System.out.printf("You will be training for %d weeks\n", num_weeks);
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

    /**
     * Returns a String, indicating the date of the user's race.
     * The string is in the format YYYY-MM-DD
     * @param kb - Scanner, used to get input from the user
     * @return String, which is the date of the race
     */
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

    /**
     * Returns whether or not a String is in the format YYYY-MM-DD.
     * Verifies also that the month and days are valid (although it doesn't check that the day # actually exists for
     * the month.
     * @param date_string - String to be checked
     * @return boolean - true if in the format YYYY-MM-DD, false otherwise
     */
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

    /**
     * Returns from the user the time that they want to finish their race in.
     * The time returned is a String in the format HH:MM:SS
     * @param kb - Scanner which will get input from the user
     * @return String, representing a time (HH:MM:SS)
     */
    private static String getRaceTime(Scanner kb) {
        String race_time;
        boolean valid = false;

        do {
            System.out.println("\nPlease enter the time you would like to finish the race (HH:MM:SS): ");
            race_time = kb.nextLine();

            valid = isRaceTimeValid(race_time);
        } while (!valid) ;

        return race_time;

    }

    /**
     * Checks if a String is in the format HH:MM:SS.
     * Also verifies that the min and sec are between 00 and 59
     * @param race_time - String to be checked
     * @return boolean, true if race_time is valid, false otherwise
     */
    private static boolean isRaceTimeValid(String race_time) {
        return race_time.matches("\\d{2}:[0-5][0-9]:[0-5][0-9]");
    }

    /**
     * Gets from the user the number of weeks that they want to train for
     * @param kb - Scanner, which will be used to get input from the user
     * @return int, which is the number of weeks to train for
     */
    private static int getNumWeeks(Scanner kb) {
        boolean valid = false;
        int numWeeks = 0;
        do {
            try {
                System.out.println("\nPlease enter how many weeks you would like to train for: ");
                numWeeks = kb.nextInt();

                if(numWeeks > 0) {
                    valid = true;
                } else {
                    System.out.println("Please enter a number greater than 0");
                }
            } catch (InputMismatchException e) {
                System.err.println("You entered an invalid number: " + e.getMessage());
                kb.nextLine();
            }
        } while (!valid);

        return numWeeks;
    }
}



