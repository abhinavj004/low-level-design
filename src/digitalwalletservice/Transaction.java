package digitalwalletservice;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private final String id;
    private final Account from;
    private final Account to;
    private final BigDecimal amount;
    private final Currency currency; // Assuming Currency is an enum or class
    private final LocalDateTime timestamp;

    public Transaction(String id, Account from, Account to, BigDecimal amount, Currency currency) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.currency = currency;
        this.timestamp = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public Account getFrom() {
        return from;
    }

    public Account getTo() {
        return to;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public TransactionStatus getStatus() {
        return null; // Placeholder
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
