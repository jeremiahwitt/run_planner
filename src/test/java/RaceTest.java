import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class RaceTest {

    private final double TEST_DISTANCE = 5.2;
    private final long EPOCH_DATE = 721526400;
    private final Date TEST_DATE = new Date(EPOCH_DATE); //1992-11-12
    private final String TEST_TIME = "01:01:01";

    @Test
    public void testGetRaceDistance() {
        Race testRace = getRace();
        assertEquals(testRace.getRaceDistance(), TEST_DISTANCE, 0);
    }

    @Test
    public void testGetRaceDate() {
        Race testRace = getRace();
        assertEquals(testRace.getRaceDate().getTime(), EPOCH_DATE);
    }

    @Test
    public void testGetRaceFinishTime() {
        Race testRace = getRace();
        assertEquals(testRace.getFinishTime(), TEST_TIME);
    }

    private Race getRace() {
        return new Race(TEST_DISTANCE, TEST_DATE, TEST_TIME);
    }
}