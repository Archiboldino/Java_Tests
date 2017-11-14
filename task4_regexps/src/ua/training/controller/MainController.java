package ua.training.controller;

import ua.training.exceptions.NotUniqueException;
import ua.training.model.Entry;
import ua.training.model.Model;
import ua.training.view.View;

import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * MainController
 * created on 10.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class MainController {
    private static final String MESSAGES_BUNDLE_NAME = "messages";

    private static final String LOGIN_INPUT_KEY = "input.login";
    private static final String NAME_INPUT_KEY = "input.name";
    private static final String COMMENT_INPUT_KEY = "input.comment";
    private static final String WRONG_LOGIN_KEY = "input.wrong.login";
    private static final String WRONG_NAME_KEY = "input.wrong.name";
    private static final String WRONG_COMMENT_KEY = "input.wrong.comment";
    private static final String NOT_UNIQUE_LOGIN_KEY = "input.wrong.notunique.login";

    private static final String REGEX_BUNDLE_NAME = "regex";
    private static final String LOGIN_REGEX_KEY = "regex.login";
    private static final String NAME_REGEX_KEY = "regex.name";
    private static final String COMMENT_REGEX_KEY = "regex.comment";

    private ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME);
    private ResourceBundle regexBundle = ResourceBundle.getBundle(REGEX_BUNDLE_NAME);

    private Model model;
    private View view;
    private UtilityController utilityController;

    public MainController(Model model, View view) {
        this.model = model;
        this.view = view;
        utilityController = new UtilityController(view, new Scanner(System.in));
    }

    /**
     * Process input of name, login and comment.
     * Check them by regexps and add to model.
     */
    public void processInput() {
        String login = inputInformation(LOGIN_INPUT_KEY, LOGIN_REGEX_KEY, WRONG_LOGIN_KEY);

        String name = inputInformation(NAME_INPUT_KEY, NAME_REGEX_KEY, WRONG_NAME_KEY);

        String comment = inputInformation(COMMENT_INPUT_KEY, COMMENT_REGEX_KEY, WRONG_COMMENT_KEY);

        Entry entry = new Entry(name, login, comment);

        tryToAddEntryToModel(entry);

    }

    /**
     * Retrieves necessary information from bundle
     * and passes it to regex check method
     * @param inputMessageKey
     * @param regexpKey
     * @param wrongInputMessageKey
     * @return correct input string
     */
    private String inputInformation(String inputMessageKey, String regexpKey, String wrongInputMessageKey) {
        view.print(bundle.getString(inputMessageKey));

        return utilityController.inputRegexpCheckedString(regexBundle.getString(regexpKey), bundle.getString(wrongInputMessageKey));
    }

    /**
     * Print error message on not unique login and tries again
     * @param entry entry to add
     */
    private void tryToAddEntryToModel(Entry entry) {
        try {
            model.addEntry(entry);
        }
        catch (NotUniqueException e) {
            view.print(String.format(bundle.getString(NOT_UNIQUE_LOGIN_KEY), e.getInput()));
            String login = inputInformation(LOGIN_INPUT_KEY, LOGIN_REGEX_KEY, WRONG_LOGIN_KEY);
            entry.setLogin(login);
            tryToAddEntryToModel(entry);
        }
    }
}
