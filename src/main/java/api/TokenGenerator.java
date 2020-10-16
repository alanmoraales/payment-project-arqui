package api;

import java.util.Random;

public class TokenGenerator {

    public String generete(String ownerName, String cardNumber, int expirationMonth, int expirationYear, int cvc){
        Random random = new Random();
        String token = Integer.toString(random.nextInt(100));
        token += ownerName.charAt(1);
        token += ownerName.charAt(2);
        token += cardNumber.charAt(1);
        token += cardNumber.charAt(2);
        token += Integer.toString(expirationMonth+expirationYear*cvc);
        return token;
    }
}
