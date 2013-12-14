import java.util.Calendar;
import java.util.TimeZone;

import mockit.NonStrictExpectations;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GreeterTest {
    @Test
    public void こんばんは000000() {
        testGreet(0, 00, 00, "こんばんは");
    }

    @Test
    public void こんばんは045959() {
        testGreet(4, 59, 59, "こんばんは");
    }

    @Test
    public void おはよう050000() {
        testGreet(5, 00, 00, "おはよう");
    }

    @Test
    public void おはよう115959() {
        testGreet(11, 59, 59, "おはよう");
    }

    @Test
    public void こんにちは120000() {
        testGreet(12, 00, 00, "こんにちは");
    }

    @Test
    public void こんにちは175959() {
        testGreet(17, 59, 59, "こんにちは");
    }

    @Test
    public void こんばんは180000() {
        testGreet(18, 00, 00, "こんばんは");
    }

    @Test
    public void こんばんは235959() {
        testGreet(23, 59, 59, "こんばんは");
    }

    @Test
    public void こんばんは999999() {
        testGreet(99, 99, 99, "こんばんは");
    }

    private void testGreet(int h, int m, int s, String expect) {
        Greeter g = new Greeter();
        final Calendar cal = Calendar.getInstance();
        cal.set(2000, 1, 1, h, m, s);
        new NonStrictExpectations(Calendar.class) {{
            Calendar.getInstance(TimeZone.getDefault()); result = cal;
        }};
        assertThat(g.greet(), is(expect));
    }
}
