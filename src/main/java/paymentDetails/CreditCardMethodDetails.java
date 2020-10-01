package paymentDetails;

public interface CreditCardMethodDetails {
    long getCreditCardNumber();
    String getCreditCardOwnerName();
    String getCreditCardExpirationDate();
    int getCreditCardCVC();
}
