package paymentServices;

import paymentDetails.OxxoMethodDetails;
import transactionInfo.Transaction;

public class OxxoPay implements OxxoPaymentService {
    @Override
    public Transaction payWithOxoo(OxxoMethodDetails details) {
        return new Transaction("oxxo1234", "success");
    }
}
