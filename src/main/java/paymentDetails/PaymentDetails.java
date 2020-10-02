package paymentDetails;

public interface PaymentDetails {
    void setCreditCardNumber(long creditCardNumber);
    void setCreditCardOwnerName(String creditCardOwnerName);
    void setCreditCardExpirationMonth(int month);
    void setCreditCardExpirationYear(int year);
    void setCreditCardCVC(int creditCardCVC);
    void setPhoneNumber(long phoneNumber);
}
