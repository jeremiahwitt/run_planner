import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Jeremiah on 9/9/2017.
 */
public class PlanBuilderTest {

    @Test
    public void testTargetDistance5k(){
        Race testRace = TestUtil.getRace();
        double targetRun = PlanBuilderHelper.getTargetLongRun(testRace);
        assertEquals(5, targetRun, 0);
    }
}
