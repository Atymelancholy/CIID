package org.example;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Main {
    static Logger logger = Logger.getLogger("Main");

    public static void main(String[] args) {

        StablePriorityQueue<String> spq = new StablePriorityQueue<>();

        spq.add("A", 1);
        spq.add("B", 2);
        spq.add("C", 1);
        spq.add("D", 2);
        spq.add("E", 1);

        while (!spq.isEmpty()) {
            logger.log(Level.INFO, "{0}", new Object[]{spq.poll()});
        }
    }
}
