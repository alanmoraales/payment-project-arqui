package paymentMethods;

import paymentDetails.OxxoMethodDetails;
import paymentServices.FakeOpenPay;
import paymentServices.OxxoPaymentService;

public class OxxoMethod implements PaymentMethod {
    private OxxoMethodDetails details;
    private OxxoPaymentService paymentService;

    public OxxoMethod(OxxoMethodDetails details) {
        this.details = details;
        this.paymentService = new FakeOpenPay();
    }

    @Override
    public String pay(double amount) {
        return paymentService.payWithOxoo(amount, details);
    }
}
