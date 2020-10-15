package api;

import apiLibrary.Charge;

public class FakeOpenPayApi implements BackEndMethods {
    private String customerName;
    private String phoneNumber;
    private String cardId;
    private double amount;
    private String description;
    private String deviceSessionId;

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
