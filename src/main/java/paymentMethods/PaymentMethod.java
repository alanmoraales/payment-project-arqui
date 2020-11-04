package paymentMethods;

import transactionInfo.Transaction;

public interface PaymentMethod {
    Transaction pay();
}
