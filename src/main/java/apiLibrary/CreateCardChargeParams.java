package apiLibrary;

public class CreateCardChargeParams {
    private String cardId;
    private double amount;
    private String description;
    private String deviceSessionId;
    private Customer customer;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeviceSessionId() {
        return deviceSessionId;
    }

    public void setDeviceSessionId(String deviceSessionId) {
        this.deviceSessionId = deviceSessionId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
