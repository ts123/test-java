import org.junit.Test;
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
    int input
    String expected

    public FizzBuzzTest(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(FizzBuzz.fizzbuzz(input), is(expected))
    }

    @Parameterized.Parameters
    static data() {
        return [
                [1, "1"],
                [2, "2"],
                [3, "Fizz"],
                [4, "4"],
                [5, "Buzz"],
                [6, "Fizz"],
                [7, "7"],
                [8, "8"],
                [9, "Fizz"],
                [10, "Buzz"],
                [11, "11"],
                [12, "Fizz"],
                [13, "13"],
                [14, "14"],
                [15, "FizzBuzz"],
                [29, "29"],
                [30, "FizzBuzz"],
                [31, "31"],
        ].collect{ it as Object[] }
    }
}
