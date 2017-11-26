package pattern.proxy;

/**
 * ConcreteOperator
 * created on 27.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class ConcreteOperator implements Operator {
    @Override
    public void operate() {
        System.out.println("Operating");
    }
}
