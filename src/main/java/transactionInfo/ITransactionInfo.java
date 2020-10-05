package transactionInfo;

import java.util.Date;

public interface ITransactionInfo {
    void setTransactionId(String id);
    void setAmount(double amount);
    void setDate(Date date);
    void setClientName(String name);
    void setPaymentConcept(String concept);
    void setPaymentMethod(String paymentMethod);
    String getTransactionId();
    double getAmount();
    Date getDate();
    String getClientName();
    String getPaymentConcept();
    String getPaymentMethod();
}
