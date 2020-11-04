package api;

import apiLibrary.Charge;

public interface BackEndMethods {
    Charge createCharge();
    void setCustomerName(String name);
    void setPhoneNumber(String number);
    void setCardId(String cardId);
    void setAmount(double amount);
    void setDescription(String description);
    void setDeviceSessionId(String sessionId);
}
