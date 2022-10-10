package gradletest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator calc;

    @BeforeEach
    public void beforeEach(){
        calc = new SumCalculator();
    }

    @Test
    public void testThatSumMethodWorksOk() {
        Map<Integer, Integer> testCases = new HashMap<>();
        testCases.put(1, 1);
        testCases.put(3, 6);

        testCases.forEach((actual, expected) ->
                Assertions.assertEquals(
                        expected,
                        calc.sum(actual)))
                ;
    }

    @Test
    public void testThatExceptionsInSumMethodWorksOk() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calc.sum(0));
    }
}