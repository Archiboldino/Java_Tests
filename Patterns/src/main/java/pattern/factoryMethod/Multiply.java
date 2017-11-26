package pattern.factoryMethod;

/**
 * Multiply
 * created on 27.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class Multiply implements Math {
    @Override
    public int operation(int a, int b) {
        return a * b;
    }
}
