package paymentMethods;

import transactionInfo.ITransactionInfo;

public class CreditCardMethod implements PaymentMethod {
    CreditCardMethod details;

    public CreditCardMethod(CreditCardMethod details) {
        this.details = details;
    }

    @Override
    public ITransactionInfo pay(float amount) {
        return null;
    }
}
