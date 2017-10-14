package plan_builder;

import race.Race;

/**
 * Created by Jeremiah on 9/9/2017.
 */
public class PlanBuilder {

    public static final int WEEKLY_INCREASE_MODIFIER = 1;
    private static final int TARGET_MILEAGE_MODIFIER = 20;
    private Race raceForPlan;
    private TrainingPlanBase planBase;

    private double targetLongRun;
    private double baseLongRun;
    private double longRunIncrease;
    private double weeklyIncrease;
    private double targetMileage;
    private double baseWeeklyDistance;

    public PlanBuilder(Race race, TrainingPlanBase basePlan) {
        this.raceForPlan = race;
        this.planBase = basePlan;
    }

    public void createPlan() {
        this.targetLongRun = PlanBuilderHelper.getTargetLongRun(raceForPlan);
        this.baseLongRun = PlanBuilderHelper.getBaseLongRun(planBase);

        // Then calc base long run, then calc the weekly increase
        this.longRunIncrease = getLongRunIncrease();
        this.weeklyIncrease = getWeeklyIncrease(longRunIncrease);
        this.targetMileage = getTargetMileage();
        this.baseWeeklyDistance = getBaseWeeklyDistance();

    }

    // TODO comment
    private double getBaseWeeklyDistance() {
        return targetMileage - (weeklyIncrease * planBase.getNumWeeks());
    }

    // TODO comment
    private double getWeeklyIncrease(double longRunIncrease) {
        double weeklyIncrease = longRunIncrease + WEEKLY_INCREASE_MODIFIER;
        // TODO Generate some sort of warning that will get returned if
        // weeklyIncrease > 3
        return weeklyIncrease;
    }

    // TODO comment
    private double getLongRunIncrease() {
        return (targetLongRun - baseLongRun) / planBase.getNumWeeks();
    }

    // TODO comment
    private double getTargetMileage() {
        return raceForPlan.getRaceDistance() + TARGET_MILEAGE_MODIFIER;
    }
}
