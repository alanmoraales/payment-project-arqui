package paymentServices;

import paymentDetails.CreditCardMethodDetails;
import transactionInfo.Transaction;

public interface CreditCardPaymentService {
    /**
     * @return the transaction id
     */
    Transaction payWithCreditCard(CreditCardMethodDetails details);
}
