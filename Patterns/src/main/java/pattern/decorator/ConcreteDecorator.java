package pattern.decorator;

/**
 * ConcreteDecorator
 * created on 27.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Operator operator) {
        super(operator);
    }

    @Override
    public void operation(){
        System.out.print("Decorated ");
        super.operation();
    }
}
