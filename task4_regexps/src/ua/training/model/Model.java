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

    public Model(){
        Entry testEntry = new Entry("name", "login", "comment");

        entries.add(testEntry);
    }

    /**
     * Adds entry to entries list
     * @param entry entry to add
     * @throws NotUniqueException thrown when there is already entry with specified login
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
