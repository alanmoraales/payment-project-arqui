package paymentController;

import paymentDetails.PaymentDetails;
import paymentMethodFactory.CreditCardMethodFactory;
import paymentMethodFactory.OxxoMethodFactory;
import paymentMethodFactory.PaymentMethodFactory;
import paymentMethods.PaymentMethod;

import java.util.HashMap;

public class PaymentService implements PaymentController {
    private PaymentMethodFactory paymentMethod;
    private PaymentDetails paymentDetails;
    private HashMap<String, PaymentMethodFactory> paymentMethods;

    public PaymentService(PaymentDetails paymentDetails, PaymentMethodFactory defaultPaymentMethod) {
        this.paymentDetails = paymentDetails;
        this.paymentMethod = defaultPaymentMethod;

        this.paymentMethods.put("credit-card", new CreditCardMethodFactory());
        this.paymentMethods.put("oxxo", new OxxoMethodFactory());
    }

    @Override
    public void setPaymentMethod(String methodName) {
        this.paymentMethod = this.paymentMethods.get(methodName);
    }

    @Override
    public void addCreditCardNumber(String cardNumber) {
        this.paymentDetails.setCreditCardNumber(cardNumber);
    }

    @Override
    public void addCreditCardOwnerName(String ownerName) {
        this.paymentDetails.setCreditCardOwnerName(ownerName);
    }

    @Override
    public void addCreditCardExpirationMonth(int month) {
        this.paymentDetails.setCreditCardExpirationMonth(month);
    }

    @Override
    public void addCreditCardExpirationYear(int year) {
        this.paymentDetails.setCreditCardExpirationYear(year);
    }

    @Override
    public void addCreditCardCVC(int cvc) {
        this.paymentDetails.setCreditCardCVC(String.valueOf(cvc));
    }

    @Override
    public void addUserPhoneNumber(long phoneNumber) {
        this.paymentDetails.setPhoneNumber(phoneNumber);
    }

    @Override
    public String pay(double amount) {
        PaymentMethod paymentMethod = this.paymentMethod.getInstance(this.paymentDetails);
        return paymentMethod.pay(amount);
    }
}
