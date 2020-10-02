package transactionInfo;

import java.util.Date;

public interface ITransactionInfo {
    void setTransactionId(String id);
    void setAmount(float amount);
    void setDate(Date date);
    void setClientName(String name);
    void setPaymentConcept(String concept);
    String getTransactionId();
    float getAmount();
    Date getDate();
    String getClientName();
    String getPaymentConcept();
}
