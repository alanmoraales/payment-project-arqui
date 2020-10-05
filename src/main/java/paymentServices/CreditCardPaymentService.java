package paymentServices;

import paymentDetails.CreditCardMethodDetails;

public interface CreditCardPaymentService {
    /**
     * @return the transaction id
     */
    String payWithCreditCard(double amount, CreditCardMethodDetails details);
}
