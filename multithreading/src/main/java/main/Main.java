package main;

import model.DocumentQueue;
import model.Retriever;

/**
 * Main
 * created on 12.12.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        DocumentQueue queue = new DocumentQueue();
        Retriever bio = new Retriever("biology", queue);
        Retriever math = new Retriever("math", queue);

        Thread thread1 = new Thread(bio);
        Thread thread2 = new Thread(math);

        thread1.start();
        thread2.start();
    }
}
