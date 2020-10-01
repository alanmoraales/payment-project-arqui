package paymentMethodFactory;

import paymentDetails.PaymentDetails;
import paymentMethods.PaymentMethod;

public class CreditCardMethodFactory implements PaymentMethodFactory {
    @Override
    public PaymentMethod getInstance(PaymentDetails details) {
        return null;
    }
}
