package pattern.factoryMethod;

/**
 * Multiplier
 * created on 27.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class Multiplier extends Summer {
    @Override
    protected Math makeMath() {
        return new Multiply();
    }
}
