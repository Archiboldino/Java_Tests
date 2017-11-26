package pattern.templateMethod;

/**
 * Device
 * created on 27.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public abstract class Device {
    protected abstract void turnOn();

    protected abstract void use();

    protected abstract void turnOff();

    public void operateDevice() {
        turnOn();
        use();
        turnOff();
    }
}
