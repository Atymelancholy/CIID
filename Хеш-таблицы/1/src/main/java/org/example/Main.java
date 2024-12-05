package org.example;

public class Main {
    public static void main(String[] args) {
        LinearProbingHashST<String, Integer> st = new LinearProbingHashST<>(9);
        st.put("A", 1);
        st.put("B", 2);
        st.put("C", 3);
        st.put("D", 4);
        st.put("E", 5);
        st.put("F", 6);
        st.put("G", 7);
        st.put("Aa", 8);
        st.put("BB", 9);

        System.out.println("Средняя стоимость попадания: " + st.averageCostOfHit());
    }
}
