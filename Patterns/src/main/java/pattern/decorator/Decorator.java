package pattern.decorator;

/**
 * Decorator
 * created on 27.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public abstract class Decorator implements Operator{
    Operator operator;

    public Decorator(Operator operator) {
        this.operator = operator;
    }

    @Override
    public void operation(){
        operator.operation();
    }
}
