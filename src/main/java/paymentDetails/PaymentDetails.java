package paymentDetails;

public interface PaymentDetails {
    void setCreditCardNumber(long creditCardNumber);
    void setCreditCardOwnerName(String creditCardOwnerName);
    void setCreditCardExpirationDate(String expirationDate);
    void setCreditCardCVC(int creditCardCVC);
    void setPhoneNumber(long phoneNumber);
}
