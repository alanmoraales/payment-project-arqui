package paymentMethods;

import paymentDetails.OxxoMethodDetails;
import transactionInfo.ITransactionInfo;

public class OxxoMethod implements PaymentMethod {
    OxxoMethodDetails details;

    public OxxoMethod(OxxoMethodDetails details) {
        this.details = details;
    }

    @Override
    public ITransactionInfo pay(float amount) {
        return null;
    }
}
