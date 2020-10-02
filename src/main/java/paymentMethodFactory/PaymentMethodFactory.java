package paymentMethodFactory;

import paymentDetails.PaymentDetails;
import paymentMethods.PaymentMethod;

public interface PaymentMethodFactory {
    public abstract PaymentMethod getInstance(PaymentDetails details);
}

