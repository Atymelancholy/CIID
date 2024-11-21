package org.example;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class Main {
    static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Введите первую версию (пример, 115.1.1): ");
        String version1Input = scanner.nextLine();

        logger.info("Введите вторую версию (пример, 115.10.1): ");
        String version2Input = scanner.nextLine();

        try {
            Version version1 = new Version(version1Input);
            Version version2 = new Version(version2Input);

            int comparisonResult = version1.compareTo(version2);

            if (comparisonResult < 0) {
                logger.log(Level.INFO, "{0} меньше, чем {1}", new Object[]{version1, version2});
            } else if (comparisonResult > 0) {
                logger.log(Level.INFO, "{0} больше, чем {1}", new Object[]{version1, version2});
            } else {
                logger.log(Level.INFO, "{0} равно {1}", new Object[]{version1, version2});
            }
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, "Ошибка: {0}", e.getMessage());
        }
        scanner.close();
    }
}
