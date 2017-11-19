package pattern.factoryMethod;

/**
 * ConcreteFactory1
 * created on 19.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class ConcreteFactory1 extends AbstractFactory {
    AbstractProduct factoryMethod() {
        return new ConcreteProduct1();
    }
}
