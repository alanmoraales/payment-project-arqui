package paymentDetails;

public interface CreditCardMethodDetails {
    String getCustomerName();
    String getPhoneNumber();
    String getCardToken();
    double getAmount();
    String getSessionId();
    String getDescription();

}
