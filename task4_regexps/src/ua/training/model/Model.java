package ua.training.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Model
 * created on 10.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class Model {
    private List<Entry> entries = new ArrayList<>();

    public void addEntry(Entry entry) {
        entries.add(entry);
    }
}
