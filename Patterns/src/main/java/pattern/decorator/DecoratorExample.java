package pattern.decorator;

/**
 * DecoratorExample
 * created on 27.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class DecoratorExample {
    public static void example() {
        Operator operator = new ConcreteOperator();
        
        Decorator decorator = new ConcreteDecorator(operator);
        Decorator doubleDecorator = new ConcreteDecorator(decorator);

        doubleDecorator.operation();
    }
}
