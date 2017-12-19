package model;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * DocumentQueu
 * created on 12.12.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class DocumentQueue {
    private static final int MIN_QUEUE_SIZE = 2;
    private static final int ADDED_NUM = 3;

    private final Queue<Document> documents = new ArrayDeque<>();

    public DocumentQueue() {
    }

    public Document retrieveDoc() {
        if (documents.size() < MIN_QUEUE_SIZE) {
            synchronized (documents) {
                if (documents.size() < MIN_QUEUE_SIZE) {
                    try {
                        documents.addAll(DocumentFactory.createDocuments(ADDED_NUM));
                    }
                    catch (RuntimeException e) {
                        System.exit(0);
                    }
                }
            }
        }
        synchronized (documents) {
            return documents.remove();
        }
    }
}
