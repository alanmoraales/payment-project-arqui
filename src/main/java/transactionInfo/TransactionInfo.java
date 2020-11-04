package transactionInfo;

import java.util.Date;

public class TransactionInfo implements ITransactionInfo {
    private String clientName;
    private String transactionId;
    private Date date;
    private String paymentConcept;
    private String paymentMethod;
    private double amount;
    private String transactionStatus;

    public TransactionInfo() {
        this.clientName = null;
        this.transactionId = null;
        this.date = null;
        this.paymentConcept = null;
        this.paymentMethod = null;
        this.amount = -1;
        this.transactionStatus = null;
    }

    @Override
    public void setTransactionStatus(String status) {
        this.transactionStatus = status;
    }

    @Override
    public void setTransactionId(String id) {
        this.transactionId = id;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public void setClientName(String name) {
        this.clientName = name;
    }

    @Override
    public void setPaymentConcept(String concept) {
        this.paymentConcept = concept;
    }

    @Override
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String getTransactionId() {
        return this.transactionId;
    }

    @Override
    public double getAmount() {
        return this.amount;
    }

    @Override
    public Date getDate() {
        return this.date;
    }

    @Override
    public String getClientName() {
        return this.clientName;
    }

    @Override
    public String getPaymentConcept() {
        return this.paymentConcept;
    }

    @Override
    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    @Override
    public String getTransactionStatus() {
        return this.transactionStatus;
    }
}
