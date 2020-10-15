package paymentController;

public interface PaymentController {
    void setPaymentMethod(String method);
    void addCustomerName(String name);
    void addPhoneNumber(String phoneNumber);
    void addCardToken(String token);
    void addAmount(double amount);
    void addSessionId(String sessionId);
    void addDescription(String description);

    /***
     *
     * @return the transaction status
     */
    String pay();
}
