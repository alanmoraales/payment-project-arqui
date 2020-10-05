package paymentMethods;

import paymentDetails.CreditCardMethodDetails;
import paymentServices.CreditCardPaymentService;
import paymentServices.FakeOpenPay;

public class CreditCardMethod implements PaymentMethod {
    private CreditCardMethodDetails details;
    private CreditCardPaymentService paymentService;

    public CreditCardMethod(CreditCardMethodDetails details) {
        this.details = details;
        this.paymentService = new FakeOpenPay();
    }

    @Override
    public String pay(double amount) {
        return paymentService.payWithCreditCard(amount, details);
    }
}
