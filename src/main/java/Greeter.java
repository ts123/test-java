import java.util.Calendar;
import java.util.TimeZone;

public class Greeter {
    public String greet() {
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
        int h = cal.get(Calendar.HOUR_OF_DAY);
        if (5 <= h && h < 12) {
            return "おはよう";
        }
        else if (12 <= h && h < 18) {
            return "こんにちは";
        }
        else if (18 <= h || h < 5) {
            return "こんばんは";
        }
        return null;
    }
}
