package paymentMethodFactory;

import paymentDetails.PaymentDetails;
import paymentMethods.PaymentMethod;

public interface PaymentMethodFactory {
    PaymentMethod getInstance(PaymentDetails details);
}
