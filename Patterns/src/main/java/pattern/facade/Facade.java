package pattern.facade;

import java.util.HashMap;

/**
 * Facade
 * created on 19.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class Facade {
    private Power power;
    private HardDrive hardDrive;
    private Screen screen;

    public Facade() {
        power = new Power();
        hardDrive = new HardDrive();
        screen = new Screen();
    }

    public void showImage() {
        power.turnOn();
        hardDrive.read();
        screen.showImage();
    }
}

class Power {
    public void turnOn() {
    }

    public void turnOff() {
    }
}

class HardDrive {
    public void read() {
    }

    public void write() {
    }
}

class Screen {
    public void showImage() {
    }
}
