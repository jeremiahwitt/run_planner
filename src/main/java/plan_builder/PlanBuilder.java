package plan_builder;

import race.Race;

/**
 * Created by Jeremiah on 9/9/2017.
 */
public class PlanBuilder {

    private Race raceForPlan;
    private TrainingPlanBase planBase;

    private double targetLongRun;
    private double baseLongRun;

    public PlanBuilder(Race race, TrainingPlanBase basePlan) {
        this.raceForPlan = race;
        this.planBase = basePlan;
    }

    public void createPlan() {
        targetLongRun = PlanBuilderHelper.getTargetLongRun(raceForPlan);
        baseLongRun = PlanBuilderHelper.getBaseLongRun(planBase);

        // Then calc base long run, then calc the weekly increase
        double longRunIncrease = getLongRunIncrease();

    }

    private double getLongRunIncrease() {
        return (targetLongRun - baseLongRun) / planBase.getNumWeeks();
    }
}
