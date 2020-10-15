package view;

import api.FakeOpenPayApi;
import api.FrontEndMethods;
import config.OpenPayConfig;

public class FrontOpenPayLibrary{
    private String fakeSessionId;
    private FakeOpenPayApi openpay;
    private  String Clientid;
    private  String apiKey;

    public FrontOpenPayLibrary(){
        this.openpay = new FakeOpenPayApi();
    }

    public void setId(String cliendID){
        this.Clientid = cliendID;
    }

    public void setApiKey(String apiKey){
        this.apiKey = apiKey;
    }

    public String generateSessionId(){
        fakeSessionId = openpay.generateSessionId(Clientid, apiKey);
        return fakeSessionId;
    }

    public String generateCraditToken(String ownerName, String cardNumber, int expirationMonth, int expirationYear, int cvc){
        return openpay.generateCreditCardToken(ownerName, cardNumber, expirationMonth, expirationYear, cvc);
    }
}
