package api;

import apiLibrary.Charge;
import config.OpenPayConfig;

public class FakeOpenPayApi implements BackEndMethods, FrontEndMethods {
    private String customerName;
    private String phoneNumber;
    private String cardId;
    private double amount;
    private String description;
    private String deviceSessionId;
    private TokenGenerator generator = new TokenGenerator();

    @Override
    public String generateSessionId(String clientId, String apiKey) {
        String id = "FakeSesionID";
        return id;
    }

    @Override
    public String generateCreditCardToken(String ownerName, String cardNumber, int expirationMonth, int expirationYear, int cvc) {
        return generator.generete(ownerName,cardNumber,expirationMonth,expirationYear,cvc);
    }

    @Override
    public Charge createCharge() {
        return null;
    }

    @Override
    public void setCustomerName(String name) {
        this.customerName = name;
    }

    @Override
    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }

    @Override
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setDeviceSessionId(String sessionId) {
        this.deviceSessionId = sessionId;
    }
}
