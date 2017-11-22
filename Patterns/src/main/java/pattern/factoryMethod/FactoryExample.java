package pattern.factoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * FactoryExample
 * created on 19.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class FactoryExample {
    public static void example() {
        AbstractFactory[] factories = {new ConcreteFactory1(), new ConcreteFactory2()};
        List<AbstractProduct> productList = new ArrayList<AbstractProduct>();

        for (AbstractFactory factory : factories) {
            productList.add(factory.factoryMethod());
        }

        for (AbstractProduct product : productList) {
            System.out.println(product.getClass() + " was created.");
        }
    }
}
