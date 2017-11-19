package pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * CompositeGraphic
 * created on 19.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class CompositeGraphic implements Graphic {
    private List<Graphic> childGraphics = new ArrayList<Graphic>();

    public void add(Graphic item) {
        childGraphics.add(item);
    }

    public void remove(Graphic item) {
        childGraphics.remove(item);
    }

    public void draw() {
        for(Graphic item: childGraphics)
            item.draw();
    }
}
