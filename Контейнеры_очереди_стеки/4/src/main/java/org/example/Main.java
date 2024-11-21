package org.example;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Main {
    static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        TwoStacksInDeque stacks = new TwoStacksInDeque();

        stacks.pushA(1);
        stacks.pushA(2);
        logger.log(Level.INFO,"Pop A: {0}", new Object[] {stacks.popA()});
        logger.log(Level.INFO,"Pop A: {0}", new Object[]{stacks.popA()});

        stacks.pushB(3);
        stacks.pushB(4);
        logger.log(Level.INFO,"Pop B: {0}", new Object[]{stacks.popB()});
        logger.log(Level.INFO,"Pop B: {0}", new Object[]{stacks.popB()});
    }
}