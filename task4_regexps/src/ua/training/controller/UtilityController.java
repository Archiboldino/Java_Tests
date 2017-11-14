package ua.training.controller;

import ua.training.view.View;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * UtilityController
 * created on 14.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
class UtilityController {
    private View view;
    private Scanner sc;

    UtilityController(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    /**
     * Check string from reader with regex.
     * Output error if it's wrong
     * @param regexp regexp to check with
     * @param wrongInputMessage wrong input message
     * @return correct string from reader
     */
    String inputRegexpCheckedString(String regexp, String wrongInputMessage) {
        String res;
        Matcher m;
        Pattern pattern = Pattern.compile(regexp);

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
