package paymentDetails;

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
    public int getCreditCardExpirationMonth() {
        return 0;
    }

    @Override
    public int getCreditCardExpirationYear() {
        return 0;
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
    public void setCreditCardExpirationMonth(int month) {

    }

    @Override
    public void setCreditCardExpirationYear(int year) {

    }

    @Override
    public void setCreditCardCVC(int creditCardCVC) {

    }

    @Override
    public void setPhoneNumber(long phoneNumber) {

    }
}
