package paymentDetails;

public interface PaymentDetails {
    void setCreditCardNumber(long creditCardNumber);
    void setCreditCardOwnerName(String creditCardOwnerName);

    /**
     *
     * @param month card expiration month in the same format as the card
     *              (i.e, if a card expiration date is 4/25, then you'll pass a 4)
     */
    void setCreditCardExpirationMonth(int month);

    /**
     *
     * @param year card expiration year in the same format as the card
     *      *              (i.e, if a card expiration date is 4/25, then you'll pass a 25)
     */
    void setCreditCardExpirationYear(int year);
    void setCreditCardCVC(int creditCardCVC);
    void setPhoneNumber(long phoneNumber);
}
