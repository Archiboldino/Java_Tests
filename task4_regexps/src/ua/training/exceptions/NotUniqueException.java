package ua.training.exceptions;

/**
 * NotUniqueException
 * created on 13.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class NotUniqueException extends Exception {
    private String input;

    public NotUniqueException(String input) {
        super();
        this.input = input;
    }

    public String getInput() {
        return input;
    }
}
