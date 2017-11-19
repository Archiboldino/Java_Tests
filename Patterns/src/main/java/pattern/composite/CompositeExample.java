package pattern.composite;

import javafx.scene.control.cell.ComboBoxTableCell;

/**
 * CompositeExample
 * created on 19.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class CompositeExample {
    public static void example() {
        CompositeGraphic compositeGraphic = new CompositeGraphic();
        compositeGraphic.add(new Circle());
        compositeGraphic.add(new Ellipse());

        compositeGraphic.draw();
    }
}
