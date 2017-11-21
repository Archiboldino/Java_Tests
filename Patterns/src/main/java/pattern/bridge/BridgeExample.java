package pattern.bridge;

import sun.security.provider.SHA;

/**
 * BridgeExample
 * created on 22.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class BridgeExample {
    public static void example() {
        Drawer drawer = new ConsoleDrawer();
        Shape circle = new Circle(drawer, 0, 0, 2);

        circle.draw();
    }
}
