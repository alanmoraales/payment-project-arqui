package paymentController;

public class PaymentService implements PaymentController {
    @Override
    public void setPaymentMethod(String methodName) {
        System.out.println("switching to: " + methodName);
    }

    @Override
    public void addCreditCardNumber(String cardNumber) {
        System.out.println("adding: " + cardNumber);
    }

    @Override
    public void addCreditCardOwnerName(String ownerName) {
        System.out.println("the owner is: " + ownerName);
    }

    @Override
    public void addCreditCardExpirationMonth(int month) {
        System.out.println("expiration month:" + month);
    }

    @Override
    public void addCreditCardExpirationYear(int year) {
        System.out.println("expiration year: " + year);
    }

    @Override
    public void addCreditCardCVC(int cvc) {
        System.out.println("cvc: " + cvc);
    }

    @Override
    public void addUserPhoneNumber(long phoneNumber) {
        System.out.println("phone number: " + phoneNumber);
    }
}
