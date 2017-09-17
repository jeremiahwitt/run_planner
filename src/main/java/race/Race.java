package race;
import java.util.Date;

/**
 * A race. Race represents the abstract concept of the race that the user wants to complete. It stores information about
 * the user's goals regarding the race (ie distance, desired finish time, etc). This information can be used in
 * order to generate a TrainingPlan for the race.Race.
 */
public class Race {

    private double race_distance;
    private Date race_date;
    private String finish_time;

    /**
     * Parameterized constructor - sets all fields of the race.
     * @param race_distance double, distance of the race (in km)
     * @param race_date Date, date of the race
     * @param finish_time String, desired finish time of the race (HH:MM:SS)
     */
    public Race(double race_distance, Date race_date, String finish_time) {
        this.race_distance = race_distance;
        this.race_date = race_date;
        this.finish_time = finish_time;
    }

    public double getRaceDistance() {
        return race_distance;
    }

    public Date getRaceDate() {
        return race_date;
    }

    public String getFinishTime() {
        return finish_time;
    }
}