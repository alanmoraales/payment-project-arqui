package paymentMethodFactory;

import paymentDetails.CreditCardMethodDetails;
import paymentDetails.OxxoMethodDetails;
import paymentDetails.PaymentDetails;
import paymentMethods.CreditCardMethod;
import paymentMethods.PaymentMethod;

public class CreditCardMethodFactory implements PaymentMethodFactory{

    @Override
    public PaymentMethod getInstance(PaymentDetails details){
        return new CreditCardMethod((CreditCardMethod) details);
    }
}
