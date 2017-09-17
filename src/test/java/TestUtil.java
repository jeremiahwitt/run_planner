import race.Race;

import java.util.Date;

/**
 * Created by Jeremiah on 9/9/2017.
 */
public class TestUtil {
    public static final double TEST_5K_DISTANCE = 5.0;
    public static final double TEST_55k_DISTANCE = 5.5;
    public static final double TEST_10k_DISTANCE = 10;
    public static final double TEST_20k_DISTANCE = 20;

    public static final long EPOCH_DATE = 721526400;
    public static final Date TEST_DATE = new Date(EPOCH_DATE); //1992-11-12
    public static final String TEST_TIME = "01:01:01";

    static Race get5kRace() {
        return new Race(TEST_5K_DISTANCE, TEST_DATE, TEST_TIME);
    }

    public static Race get55kRace() {
        return new Race(TEST_55k_DISTANCE, TEST_DATE, TEST_TIME);
    }

    public static Race get10kRace() {
        return new Race(TEST_10k_DISTANCE, TEST_DATE, TEST_TIME);
    }

    public static Race get20kRace() {
        return new Race(TEST_20k_DISTANCE, TEST_DATE, TEST_TIME);
    }
}
