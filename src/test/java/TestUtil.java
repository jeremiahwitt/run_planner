import java.util.Date;

/**
 * Created by Jeremiah on 9/9/2017.
 */
public class TestUtil {
    public static final double TEST_DISTANCE = 5.0;
    public static final long EPOCH_DATE = 721526400;
    public static final Date TEST_DATE = new Date(EPOCH_DATE); //1992-11-12
    public static final String TEST_TIME = "01:01:01";

    static Race getRace() {
        return new Race(TEST_DISTANCE, TEST_DATE, TEST_TIME);
    }
}
