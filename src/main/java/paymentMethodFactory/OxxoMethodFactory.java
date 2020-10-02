package paymentMethodFactory;

import paymentDetails.OxxoMethodDetails;
import paymentDetails.PaymentDetails;
import paymentMethods.CreditCardMethod;
import paymentMethods.OxxoMethod;
import paymentMethods.PaymentMethod;

public class OxxoMethodFactory implements PaymentMethodFactory{

    @Override
    public PaymentMethod getInstance(PaymentDetails details) {
        return new OxxoMethod((OxxoMethodDetails) details);
    }
}


