package org.example;

import java.util.Objects;

public class Transaction implements Comparable<Transaction> {
    private final int id;
    private final double amount;
    private final String type;
    private final String status;

    public Transaction(int id, double amount, String type, String status) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public int compareTo(Transaction other) {
        return Double.compare(this.amount, other.amount);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Transaction that = (Transaction) obj;
        return Double.compare(that.amount, amount) == 0 && id == that.id && Objects.equals(type, that.type) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, type, status);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
