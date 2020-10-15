package api;

public interface FrontEndMethods {
    public String generateSessionId(String clientId, String apiKey);
    public String generateCreditCardToken(
            String ownerName,
            String cardNumber,
            int expirationMonth,
            int expirationYear,
            int cvc);
}
