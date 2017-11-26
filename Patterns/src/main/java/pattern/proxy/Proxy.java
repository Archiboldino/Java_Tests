package pattern.proxy;

/**
 * Proxy
 * created on 27.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class Proxy implements Operator {
    private ConcreteOperator operator;

    @Override
    public void operate() {
        if(operator == null)
            operator = new ConcreteOperator();

        operator.operate();
    }
}
