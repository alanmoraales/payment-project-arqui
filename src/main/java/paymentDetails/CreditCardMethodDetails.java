package paymentDetails;

public interface CreditCardMethodDetails {
    long getCreditCardNumber();
    String getCreditCardOwnerName();
    int getCreditCardExpirationMonth();
    int getCreditCardExpirationYear();
    int getCreditCardCVC();
}
