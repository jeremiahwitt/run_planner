import org.junit.Test;
import race.Race;

import static org.junit.Assert.assertEquals;

public class RaceTest {

    @Test
    public void testGetRaceDistance() {
        Race testRace = TestUtil.getRace();
        assertEquals(TestUtil.TEST_DISTANCE, testRace.getRaceDistance(), 0);
    }

    @Test
    public void testGetRaceDate() {
        Race testRace = TestUtil.getRace();
        assertEquals(TestUtil.EPOCH_DATE, testRace.getRaceDate().getTime());
    }

    @Test
    public void testGetRaceFinishTime() {
        Race testRace = TestUtil.getRace();
        assertEquals(TestUtil.TEST_TIME, testRace.getFinishTime());
    }

}