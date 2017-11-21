package pattern.bridge;

/**
 * ConsoleDrawer
 * created on 22.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class ConsoleDrawer implements Drawer{
    public void draw() {
        System.out.println("in console.");
    }
}
