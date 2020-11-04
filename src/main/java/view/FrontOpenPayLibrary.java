package view;

import api.FakeOpenPayApi;

public class FrontOpenPayLibrary{
    private FakeOpenPayApi openpay;
    private  String clientId;
    private  String apiKey;

    public FrontOpenPayLibrary(){
        this.openpay = new FakeOpenPayApi();
    }

    public void setId(String cliendID){
        this.clientId = cliendID;
    }

    public void setApiKey(String apiKey){
        this.apiKey = apiKey;
    }

    public String generateSessionId(){
        return openpay.generateSessionId(clientId, apiKey);
    }

    public String generateToken(String ownerName, String cardNumber, int expirationMonth, int expirationYear, int cvc){
        return openpay.generateCreditCardToken(ownerName, cardNumber, expirationMonth, expirationYear, cvc);
    }
}
