package model;

/**
 * Retriever
 * created on 12.12.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class Retriever implements Runnable{

    private String lookingFor;
    private DocumentQueue queue;

    public Retriever(String lookingFor, DocumentQueue queue) {
        this.lookingFor = lookingFor;
        this.queue = queue;
    }

    @Override
    public void run() {
        Document doc = queue.retrieveDoc();
        System.out.println(lookingFor + " retrieved " + doc.getSpeciality() + " ref: " + doc);
        while(!doc.getSpeciality().equals(lookingFor)) {
            try {
                doc = queue.retrieveDoc();
                System.out.println(lookingFor + " retrieved " + doc.getSpeciality() + " ref: " + doc);
                Thread.sleep(100L);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
