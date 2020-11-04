package paymentDetails;

public interface PaymentDetails {
    void setCustomerName(String customerName);
    void setPhoneNumber(String phoneNumber);
    void setCardToken(String cardToken);
    void setAmount(double amount);
    void setSessionId(String sessionId);
    void setDescription(String description);
    String getCustomerName();
    double getAmount();
    String getDescription();
}
