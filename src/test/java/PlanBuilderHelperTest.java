import org.junit.Test;
import plan_builder.PlanBuilderHelper;
import plan_builder.TrainingPlanBase;
import race.Race;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jeremiah on 9/9/2017.
 */
public class PlanBuilderHelperTest {

    @Test
    public void testTargetDistance5k(){
        Race testRace = TestUtil.get5kRace();
        double targetRun = PlanBuilderHelper.getTargetLongRun(testRace);
        assertEquals(5, targetRun, 0);
    }

    @Test
    public void testTargetDistance55k(){
        Race testRace = TestUtil.get55kRace();
        double targetRun = PlanBuilderHelper.getTargetLongRun(testRace);
        assertEquals(5.25, targetRun, 1);
    }

    @Test
    public void testTargetDistance10k(){
        Race testRace = TestUtil.get10kRace();
        double targetRun = PlanBuilderHelper.getTargetLongRun(testRace);
        assertEquals(13.35, targetRun, 1);
    }

    @Test
    public void testTargetDistance20k(){
        Race testRace = TestUtil.get20kRace();
        double targetRun = PlanBuilderHelper.getTargetLongRun(testRace);
        assertEquals(22.74, targetRun, 1);
    }

    @Test
    public void testBaseLongRun5k(){
        TrainingPlanBase base = TestUtil.get5kBase();
        double expectedBaseRun = PlanBuilderHelper.getBaseLongRun(base);
        double expectedValue = 5 * 0.75;
        assertEquals(expectedValue, expectedBaseRun, 0);
    }

    @Test
    public void testBaseLongRun10k(){
        TrainingPlanBase base = TestUtil.get10kBase();
        double expectedBaseRun = PlanBuilderHelper.getBaseLongRun(base);
        double expectedValue = 10 * 0.75;
        assertEquals(expectedValue, expectedBaseRun, 0);
    }

    @Test
    public void testBaseLongRun20k(){
        TrainingPlanBase base = TestUtil.get20kBase();
        double expectedBaseRun = PlanBuilderHelper.getBaseLongRun(base);
        double expectedValue = 20 * 0.75;
        assertEquals(expectedValue, expectedBaseRun, 0);
    }
}

