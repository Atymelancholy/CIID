package org.example;

import java.util.logging.Logger;
import java.util.*;

public class Main {
    static final Logger logger = Logger.getLogger("Main");

    private static final Random RANDOM = new Random();

    public static List<Transaction> generateTransactions(int n) {
        String[] types = {"Purchase", "Transfer", "Payment"};
        String[] statuses = {"Successful", "Rejected"};
        List<Transaction> transactions = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = i + 1;
            double amount = 10 + (1_000_000 - 10) * RANDOM.nextDouble();
            String type = types[RANDOM.nextInt(types.length)];
            String status = statuses[RANDOM.nextInt(statuses.length)];
            transactions.add(new Transaction(id, amount, type, status));
        }
        return transactions;
    }


    public static void shellSort(List<Transaction> list) {
        int n = list.size();
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Transaction temp = list.get(i);
                int j;
                for (j = i; j >= gap && list.get(j - gap).compareTo(temp) > 0; j -= gap) {
                    list.set(j, list.get(j - gap));
                }
                list.set(j, temp);
            }
        }
    }

    public static void mergeSort(List<Transaction> list) {
        if (list.size() < 2) return;
        int mid = list.size() / 2;
        List<Transaction> left = new ArrayList<>(list.subList(0, mid));
        List<Transaction> right = new ArrayList<>(list.subList(mid, list.size()));

        mergeSort(left);
        mergeSort(right);
        merge(list, left, right);
    }

    private static void merge(List<Transaction> list, List<Transaction> left, List<Transaction> right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) <= 0) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }
        while (i < left.size()) list.set(k++, left.get(i++));
        while (j < right.size()) list.set(k++, right.get(j++));
    }

    public static void quickSort(List<Transaction> list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }

    private static int partition(List<Transaction> list, int low, int high) {
        Transaction pivot = list.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (list.get(j).compareTo(pivot) <= 0) {
                i++;
                Collections.swap(list, i, j);
            }
        }
        Collections.swap(list, i + 1, high);
        return i + 1;
    }

    public static void heapSort(List<Transaction> list) {
        int n = list.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            Collections.swap(list, 0, i);
            heapify(list, i, 0);
        }
    }

    private static void heapify(List<Transaction> list, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && list.get(left).compareTo(list.get(largest)) > 0) largest = left;
        if (right < n && list.get(right).compareTo(list.get(largest)) > 0) largest = right;

        if (largest != i) {
            Collections.swap(list, i, largest);
            heapify(list, n, largest);
        }
    }

    private static final String TOOK_MESSAGE = " took ";

    public static void testSortingPerformance(int n) {
        List<Transaction> transactions = generateTransactions(n);

        List<Transaction> shellList = new ArrayList<>(transactions);
        long start = System.nanoTime();
        shellSort(shellList);
        long end = System.nanoTime();
        logger.info("Shell Sort for N=" + n + TOOK_MESSAGE + (end - start) / 1_000_000 + " ms");

        List<Transaction> mergeList = new ArrayList<>(transactions);
        start = System.nanoTime();
        mergeSort(mergeList);
        end = System.nanoTime();
        logger.info("Merge Sort for N=" + n + TOOK_MESSAGE + (end - start) / 1_000_000 + " ms");

        List<Transaction> quickList = new ArrayList<>(transactions);
        start = System.nanoTime();
        quickSort(quickList, 0, quickList.size() - 1);
        end = System.nanoTime();
        logger.info("Quick Sort for N=" + n + TOOK_MESSAGE + (end - start) / 1_000_000 + " ms");

        List<Transaction> heapList = new ArrayList<>(transactions);
        start = System.nanoTime();
        heapSort(heapList);
        end = System.nanoTime();

        logger.info("Heap Sort for N=" + n + TOOK_MESSAGE + (end - start) / 1_000_000 + " ms");
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000, 1000000};
        for (int n : sizes) {
            testSortingPerformance(n);
            logger.info("-------------------------");
        }
    }
}
