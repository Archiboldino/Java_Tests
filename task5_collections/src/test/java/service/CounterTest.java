package service;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * CounterTest
 * created on 19.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class CounterTest {
    private Map<Integer, Integer> expected;
    private List<Integer> data;
    private Counter counter = new Counter();

    public CounterTest() {
        data = Arrays.asList(4, 5, 6, 4, 5, 3, 4, 2, 4, 5, 7);

        expected = new HashMap<>();
        expected.put(2, 1);
        expected.put(3, 1);
        expected.put(4, 4);
        expected.put(5, 3);
        expected.put(6, 1);
        expected.put(7, 1);
    }

    @Test
    public void testCountNumberOfThings() throws Exception {
        Map<Integer, Integer> actual = counter.countNumberOfThings(data);

        Assert.assertEquals(expected, actual);
    }

}