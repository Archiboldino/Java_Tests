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
    public static List<Document> createDocuments(int num) {
        List<Document> res = new ArrayList<>();
        for(int i = 0; i < num; i++) {
            res.add(randomDocument());
        }

        return res;
    }

    private static Document randomDocument() {
        Document doc = new Document();
        if(Math.random() < 0.1) {
            doc.setSpeciality("math");
        }
        else if (Math.random() < 0.2) {
            doc.setSpeciality("biology");
        }
        else {
            doc.setSpeciality("anotherOne");
        }
        doc.setName("name");

        return doc;
    }
}
