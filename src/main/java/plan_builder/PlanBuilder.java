package plan_builder;

import race.Race;

/**
 * Created by Jeremiah on 9/9/2017.
 */
public class PlanBuilder {

    public void createPlan(Race race, TrainingPlanBase basePlan) {
        double targetLongRun = PlanBuilderHelper.getTargetLongRun(race);
        double baseLongRun = PlanBuilderHelper.getBaseLongRun(basePlan);
        // Then calc base long run, then calc the weekly increase

    }
}
