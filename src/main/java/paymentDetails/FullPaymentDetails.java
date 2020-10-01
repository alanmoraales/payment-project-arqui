package paymentDetails;

import paymentMethodFactory.PaymentMethodFactory;
import paymentMethods.PaymentMethod;

public class FullPaymentDetails implements CreditCardMethodDetails, OxxoMethodDetails, PaymentDetails {
    @Override
    public long getCreditCardNumber() {
        return 0;
    }

    @Override
    public String getCreditCardOwnerName() {
        return null;
    }

    @Override
    public String getCreditCardExpirationDate() {
        return null;
    }

    @Override
    public int getCreditCardCVC() {
        return 0;
    }

    @Override
    public long getPhoneNumber() {
        return 0;
    }

    @Override
    public void setCreditCardNumber(long creditCardNumber) {

    }

    @Override
    public void setCreditCardOwnerName(String creditCardOwnerName) {

    }

    @Override
    public void setCreditCardExpirationDate(String expirationDate) {

    }

    @Override
    public void setCreditCardCVC(int creditCardCVC) {

    }

    @Override
    public void setPhoneNumber(long phoneNumber) {

    }
}
