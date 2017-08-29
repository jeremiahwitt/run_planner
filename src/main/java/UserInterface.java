import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        double race_distance = 0;

        race_distance = getRaceDistance(kb);
    }

    private static double getRaceDistance(Scanner kb) {
        double distance = 0;

        boolean valid = false;
        do {
            try {
                System.out.println("Please enter the race distance (km): ");
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

        return distance;
    }
}

