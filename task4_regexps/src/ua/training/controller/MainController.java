package ua.training.controller;

import ua.training.exceptions.NotUniqueException;
import ua.training.model.Entry;
import ua.training.model.Model;
import ua.training.view.View;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public MainController(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Process input of name, login and comment.
     * Check them by regexps and add to model.
     */
    public void processInput() {

        Scanner sc = new Scanner(System.in);

        try {
            view.print(bundle.getString(LOGIN_INPUT_KEY));
            Pattern loginPattern = Pattern.compile(regexBundle.getString(LOGIN_REGEX_KEY));
            String login = inputRegexpCheckedString(sc, loginPattern, bundle.getString(WRONG_LOGIN_KEY));

            view.print(bundle.getString(NAME_INPUT_KEY));
            Pattern namePattern = Pattern.compile(regexBundle.getString(NAME_REGEX_KEY));
            String name = inputRegexpCheckedString(sc, namePattern, bundle.getString(WRONG_NAME_KEY));

            view.print(bundle.getString(COMMENT_INPUT_KEY));
            Pattern commentPattern = Pattern.compile(regexBundle.getString(COMMENT_REGEX_KEY));
            String comment = inputRegexpCheckedString(sc, commentPattern, bundle.getString(WRONG_COMMENT_KEY));

            Entry entry = new Entry(name, login, comment);

        } catch (IOException e) {
            e.printStackTrace();
            view.print(e.getMessage());
        }
    }

    /**
     * Check string from reader with regex.
     * Output error if it's wrong
     * @param sc scanner to get input
     * @param pattern pattern to check with
     * @param wrongInputMessage wrong input message
     * @return correct string from reader
     * @throws IOException
     */
    private String inputRegexpCheckedString(Scanner sc, Pattern pattern, String wrongInputMessage)
            throws IOException {
        String res;
        Matcher m;

        res = sc.nextLine();
        m = pattern.matcher(res);

        while (!m.matches()) {
            view.print(wrongInputMessage);
            res = sc.nextLine();
            m = pattern.matcher(res);
        }

        return res;
    }
}
