package pattern.factoryMethod;

/**
 * Summer
 * created on 27.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class Summer {

    public Summer() {
        Math math = makeMath();

        System.out.println(math.operation(1, 1));
    }

    protected Math makeMath() {
        return new Sum();
    }
}
