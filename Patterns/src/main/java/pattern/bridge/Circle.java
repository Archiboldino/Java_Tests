package pattern.bridge;

/**
 * Circle
 * created on 22.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class Circle extends Shape {
    private int x;
    private int y;
    private int r;

    public Circle(Drawer drawer, int x, int y, int r) {
        super(drawer);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void draw() {
        System.out.print(String.format("Drawing circle (%d, %d, %d)", x, y, r));
        drawer.draw(x, y, r);
    }
}
