package org.example;
import java.util.logging.Logger;
import java.util.Scanner;

public class Main {
    static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.info("Введите количество человек (N): ");
        int n = scanner.nextInt();
        logger.info("Введите шаг (M): ");
        int m = scanner.nextInt();

        JosephusSolver solver = new JosephusSolver(n, m);

        logger.info("Порядок удаления: " + solver.getEliminationOrder());
        logger.info("Последний оставшийся человек: " + solver.getLastPerson());
    }
}
