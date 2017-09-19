package plan_builder;

import race.Race;

/**
 * Created by Jeremiah on 9/9/2017.
 */
public class PlanBuilderHelper {

    /**
     * Returns the target long-run for a given Race.
     * If the race is 5km or less, then the distance of the race is returned.
     * Otherwise, the following formula is used: 13.55*ln(race_distance) - 17.85
     *
     * @param race - Race that the plan should be built for
     * @return double, based on this rules indicated above
     */
    public static double getTargetLongRun(Race race) {
        double longRunDistance;
        if (race.getRaceDistance() <= 5 ) {
            return race.getRaceDistance();
        } else {
            longRunDistance = (13.55 * Math.log(race.getRaceDistance())) - 17.85;
        }

        return longRunDistance;
    }

    /**
     * Returns the base long run for the training plan. This is 0.75 times what the user is comfortable with.
     *
     * @param basePlan - base data for the training plan
     * @return - double, based on the rules indicated above
     */
    public static double getBaseLongRun(TrainingPlanBase basePlan) {
        return basePlan.getComfortableLongRun() * 0.75;
    }
}
