package paymentServices;

import paymentDetails.CreditCardMethodDetails;

public interface CreditCardPaymentService {
    /**
     * @return the transaction id
     */
    String payWithCreditCard(float amount, CreditCardMethodDetails details);
}
