package pattern.flyweight;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * FlyweightFactory
 * created on 22.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class FlyweightFactory {
    private Map<Integer, Flyweight> flyweights = new HashMap();

    public Flyweight getFlyweight(int data) {
        Flyweight flyweight = new ConcreteFlyweight(data);
        if(flyweights.containsKey(flyweight.hashCode()))
            return flyweights.get(flyweight.hashCode());
        else
            return flyweights.put(flyweight.hashCode(), flyweight);
    }
}
