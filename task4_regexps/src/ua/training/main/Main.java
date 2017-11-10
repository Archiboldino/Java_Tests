package ua.training.main;

import ua.training.controller.MainController;
import ua.training.model.Model;
import ua.training.view.View;

/**
 * Main
 * created on 08.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        MainController controller = new MainController(model, view);

        controller.processInput();
    }
}
