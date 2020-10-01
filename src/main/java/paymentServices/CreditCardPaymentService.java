package paymentServices;

import paymentDetails.CreditCardMethodDetails;
import transactionInfo.ITransactionInfo;

public interface CreditCardPaymentService {
    ITransactionInfo payWithCreditCard(float amount, CreditCardMethodDetails details);
}
