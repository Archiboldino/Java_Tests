package pattern.bridge;

/**
 * Shape
 * created on 22.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public abstract class Shape {
    protected Drawer drawer;

    public Shape(Drawer drawer) {
        this.drawer = drawer;
    }

    public abstract void draw();
}
