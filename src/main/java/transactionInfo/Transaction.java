package transactionInfo;

public class Transaction {
    private String id;
    private String status;

    public Transaction(String id, String status) {
        this.id = id;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
}
