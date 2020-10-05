package paymentDetails;

import java.util.Date;

public class FullPaymentDetails implements CreditCardMethodDetails, OxxoMethodDetails, PaymentDetails {

    private String creaditcardNumber;
    private String craditCardOwnerName;
    private Date creditcardExpirationDate = new Date(1900,0,1);
    private String creditCardCVC;
    private String clientName = "oxxo";
    private String phoneNumber;

    @Override
    public String getCreditCardNumber() {
        return creaditcardNumber;
    }

    @Override
    public String getCreditCardOwnerName() {
        return craditCardOwnerName;
    }

    @Override
    public int getCreditCardExpirationMonth() {
        return creditcardExpirationDate.getMonth();
    }

    @Override
    public int getCreditCardExpirationYear() {
        return creditcardExpirationDate.getYear();
    }

    @Override
    public String getCreditCardCVC() {
        return creditCardCVC;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setCreditCardNumber(String creditCardNumber) {
        this.creaditcardNumber = creditCardNumber;
    }

    @Override
    public void setCreditCardOwnerName(String creditCardOwnerName) {
        this.craditCardOwnerName = creditCardOwnerName;
    }

    @Override
    public void setCreditCardExpirationMonth(int month) {
        this.creditcardExpirationDate.setMonth(month);
    }

    @Override
    public void setCreditCardExpirationYear(int year) {
        this.creditcardExpirationDate.setYear(year);
    }

    @Override
    public void setCreditCardCVC(String creditCardCVC) {
        this.creditCardCVC = creditCardCVC;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getClientName() {
        return this.clientName;
    }

    @Override
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
