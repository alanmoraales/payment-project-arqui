package paymentMethods;

public class CreditCardMethod implements PaymentMethod {
    private CreditCardMethod details;

    public CreditCardMethod(CreditCardMethod details) {
        this.details = details;
    }

    @Override
    public String pay(float amount) {
        return null;
    }
}
