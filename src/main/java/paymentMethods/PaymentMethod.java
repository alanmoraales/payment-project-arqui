package paymentMethods;

import transactionInfo.ITransactionInfo;

public interface PaymentMethod {
    ITransactionInfo pay(float amount);
}
