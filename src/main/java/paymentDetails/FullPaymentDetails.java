package paymentDetails;

import java.util.Date;

public class FullPaymentDetails implements CreditCardMethodDetails, OxxoMethodDetails, PaymentDetails {

    private String customerName;
    private String phoneNumber;
    private String cardToken;
    private double amount;
    private String sessionId;
    private String description;


    @Override
    public String getCustomerName() {
        return this.customerName;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getCardToken() {
        return this.cardToken;
    }

    @Override
    public double getAmount() {
        return this.amount;
    }

    @Override
    public String getSessionId() {
        return this.sessionId;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}
