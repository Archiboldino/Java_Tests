package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Counter
 * created on 19.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class Counter {
    /**
     * Counts objects in list
     * @param items list which contains objects
     * @param <T> type of objects in list
     * @return map with objects and number of occurrences
     */
    public <T> Map<T, Integer> countNumberOfThings(List<T> items) {
        Map<T, Integer> res = new HashMap<>();

        for (T item : items) {
            Integer value = res.getOrDefault(item, 0);
            res.put(item, value + 1);
        }

        return res;
    }
}
