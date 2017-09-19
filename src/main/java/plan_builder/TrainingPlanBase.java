package plan_builder;

/**
 * Created by Jeremiah on 9/17/2017.
 */
public class TrainingPlanBase {

    private double comfortableLongRun; /** The longest distance the user is comfortable running 1/week */
    private int numWeeks; /** Number of weeks the training will go on for */

    public TrainingPlanBase(double comfortableLongRun, int numWeeks) {
        this.comfortableLongRun = comfortableLongRun;
        this.numWeeks = numWeeks;
    }

    public double getComfortableLongRun() {
        return comfortableLongRun;
    }

    public int getNumWeeks() {
        return numWeeks;
    }
}
