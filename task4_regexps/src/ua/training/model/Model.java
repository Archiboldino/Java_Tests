package ua.training.model;

import ua.training.exceptions.NotUniqueException;

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

    /**
     * Add entry to entry list
     * @param entry entry to add
     */
    public void addEntry(Entry entry) throws NotUniqueException{
        for (Entry item : entries) {
            if (item.getLogin().equals(entry.getLogin())){
                throw new NotUniqueException(entry.getLogin());
            }
        }

        entries.add(entry);
    }
}
