package paymentController;

public interface PaymentController {
    void setPaymentMethod(String methodName);
    void addCreditCardNumber(String cardNumber);
    void addCreditCardOwnerName(String ownerName);
    void addCreditCardExpirationMonth(int month);
    void addCreditCardExpirationYear(int year);
    void addCreditCardCVC(int cvc);
    void addUserPhoneNumber(long phoneNumber);
}