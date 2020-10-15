package paymentMethods;

import paymentDetails.OxxoMethodDetails;
import paymentServices.OxxoPay;
import paymentServices.OxxoPaymentService;
import transactionInfo.Transaction;

public class OxxoMethod implements PaymentMethod {
    private OxxoMethodDetails details;
    private OxxoPaymentService paymentService;

    public OxxoMethod(OxxoMethodDetails details) {
        this.details = details;
        this.paymentService = new OxxoPay();
    }

    @Override
    public Transaction pay() {
        return paymentService.payWithOxoo(details);
    }
}
