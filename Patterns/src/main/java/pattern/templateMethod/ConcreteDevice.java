package pattern.templateMethod;

/**
 * ConcreteDevice
 * created on 27.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class ConcreteDevice extends Device {
    @Override
    protected void turnOn() {
        System.out.println("Turning on.");
    }

    @Override
    protected void use() {
        System.out.println("Using");
    }

    @Override
    protected void turnOff() {
        System.out.println("Turning off.");
    }
}
