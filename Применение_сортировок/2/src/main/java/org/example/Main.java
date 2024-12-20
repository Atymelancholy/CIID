package org.example;

import java.time.LocalTime;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество заданий:");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Task> tasks = collectTasks(scanner, n);

        if (tasks.isEmpty()) {
            System.out.println("Нет заданий для обработки.");
            return;
        }

        analyzeAndPrintIntervals(tasks);
        scanner.close();
    }

    private static List<Task> collectTasks(Scanner scanner, int n) {
        List<Task> tasks = new ArrayList<>();
        System.out.println("Введите моменты начала и завершения каждого задания (например, 13:25 15:45):");

        while (tasks.size() < n) {
            String input = scanner.nextLine();
            String[] times = input.split(" ");

            boolean isValid = times.length == 2;
            LocalTime start = null;
            LocalTime end = null;

            if (isValid) {
                try {
                    start = LocalTime.parse(times[0]);
                    end = LocalTime.parse(times[1]);

                    if (start.isAfter(end)) {
                        System.out.println("Ошибка: время начала не может быть позже времени завершения.");
                        isValid = false;
                    }
                } catch (Exception e) {
                    System.out.println("Ошибка: неверный формат времени. Введите время в формате HH:mm.");
                    isValid = false;
                }
            } else {
                System.out.println("Ошибка: неверный формат времени. Введите время в формате HH:mm.");
            }

            if (isValid) {
                tasks.add(new Task(start, end));
            }
        }

        return tasks;
    }

    private static void analyzeAndPrintIntervals(List<Task> tasks) {
        Collections.sort(tasks);

        Duration maxWorkInterval = Duration.ZERO;
        Duration maxIdleInterval = Duration.ZERO;

        Task previousTask = tasks.get(0);
        LocalTime currentStart = previousTask.start;
        LocalTime currentEnd = previousTask.end;

        for (Task task : tasks) {
            if (!task.equals(previousTask)) {
                if (!task.start.isAfter(currentEnd)) {
                    currentEnd = currentEnd.isAfter(task.end) ? currentEnd : task.end;
                } else {
                    maxWorkInterval = getMaxInterval(maxWorkInterval, Duration.between(currentStart, currentEnd));
                    maxIdleInterval = getMaxInterval(maxIdleInterval, Duration.between(currentEnd, task.start));

                    currentStart = task.start;
                    currentEnd = task.end;
                }
            }
            previousTask = task;
        }

        maxWorkInterval = getMaxInterval(maxWorkInterval, Duration.between(currentStart, currentEnd));
        printIntervals(maxWorkInterval, maxIdleInterval);
    }


    private static Duration getMaxInterval(Duration currentMax, Duration newInterval) {
        return currentMax.compareTo(newInterval) < 0 ? newInterval : currentMax;
    }

    private static void printIntervals(Duration maxWorkInterval, Duration maxIdleInterval) {
        System.out.println("Интервал работы (максимальный): " + formatDuration(maxWorkInterval));
        System.out.println("Интервал простоя: " + formatDuration(maxIdleInterval));
    }

    private static String formatDuration(Duration duration) {
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        return String.format("%02d:%02d", hours, minutes);
    }

    static class Task implements Comparable<Task> {
        LocalTime start;
        LocalTime end;

        Task(LocalTime start, LocalTime end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Task other) {
            int startComparison = this.start.compareTo(other.start);
            if (startComparison != 0) {
                return startComparison;
            }
            return this.end.compareTo(other.end);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Task other = (Task) obj;
            return this.start.equals(other.start) && this.end.equals(other.end);
        }

        @Override
        public int hashCode() {
            return 31 * start.hashCode() + end.hashCode();
        }
    }
}
