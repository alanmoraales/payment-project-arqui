package paymentMethods;

public interface PaymentMethod {
    /**
     *
     * @return the transaction id
     */
    String pay(double amount);
}
