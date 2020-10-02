package paymentMethods;

import paymentDetails.OxxoMethodDetails;

public class OxxoMethod implements PaymentMethod {
    private OxxoMethodDetails details;

    public OxxoMethod(OxxoMethodDetails details) {
        this.details = details;
    }

    @Override
    public String pay(float amount) {
        return null;
    }
}
