package paymentServices;

import paymentDetails.OxxoMethodDetails;
import transactionInfo.ITransactionInfo;

public interface OxxoPaymentService {
    ITransactionInfo payWithOxoo(float amount, OxxoMethodDetails details);
}
