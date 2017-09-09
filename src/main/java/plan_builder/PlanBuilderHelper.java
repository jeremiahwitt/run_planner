package plan_builder;

import race.Race;

/**
 * Created by Jeremiah on 9/9/2017.
 */
public class PlanBuilderHelper {

    public static double getTargetLongRun(Race race) {
        double distance = 0;
        if (race.getRaceDistance() <= 5 ) {
            return race.getRaceDistance();
        }

        return distance;
    }
}
