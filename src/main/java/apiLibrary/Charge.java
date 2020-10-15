package apiLibrary;

public class Charge {
    private String transactionStatus;
    private String transactionId;

    public Charge(String transactionStatus, String transactionId) {
        this.transactionStatus = transactionStatus;
        this.transactionId = transactionId;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public String getTransactionId() {
        return transactionId;
    }
}
