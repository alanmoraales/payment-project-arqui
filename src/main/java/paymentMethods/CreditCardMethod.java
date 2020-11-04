package paymentMethods;

import paymentDetails.CreditCardMethodDetails;
import paymentServices.CreditCardPaymentService;
import paymentServices.OpenPay;
import transactionInfo.Transaction;

public class CreditCardMethod implements PaymentMethod {
    private CreditCardMethodDetails details;
    private CreditCardPaymentService paymentService;

    public CreditCardMethod(CreditCardMethodDetails details) {
        this.details = details;
        this.paymentService = new OpenPay();
    }

    @Override
    public Transaction pay() {
        return paymentService.payWithCreditCard(details);
    }
}
