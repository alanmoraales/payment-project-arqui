package paymentServices;

import paymentDetails.OxxoMethodDetails;
import transactionInfo.Transaction;

public interface OxxoPaymentService {
    /**
     * @return the transaction id
     */
    Transaction payWithOxoo(OxxoMethodDetails details);
}
