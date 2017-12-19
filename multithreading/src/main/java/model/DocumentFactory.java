package model;

import java.util.ArrayList;
import java.util.List;

/**
 * DocumentFactory
 * created on 12.12.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class DocumentFactory {
    private static int mathLeft = 10;
    private static int bioLeft = 15;


    public static List<Document> createDocuments(int num) {
        List<Document> res = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            res.add(randomDocument());
        }

        return res;
    }

    private static Document randomDocument() {
        Document doc = new Document();
        if (mathLeft > 0 && (Math.random() < 0.5 || bioLeft <= 0)) {
            doc.setSpeciality("math");
            mathLeft--;
        } else if (bioLeft > 0) {
            doc.setSpeciality("biology");
            bioLeft--;
        } else {
            throw new RuntimeException("No documents left.");
        }
        doc.setName("name");

        return doc;
    }
}
