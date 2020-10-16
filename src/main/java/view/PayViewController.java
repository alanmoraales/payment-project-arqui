package view;

import config.OpenPayConfig;
import paymentController.PaymentController;

public class PayViewController {

    private PaymentController controller;
    private PayView view;
    private String sessionId;
    private FrontOpenPayLibrary openpay;
    private String token;

    private final String merchantId = "fakeMerchantId";
    private final String publicOpenpaykey = "fakePublicKey";

    public PayViewController(PaymentController controller) {
        view = new PayView(this);
        this.controller = controller;
        this.openpay = new FrontOpenPayLibrary();
        openpay.setId(this.merchantId);
        openpay.setApiKey(this.publicOpenpaykey);
        this.sessionId = openpay.generateSessionId();
        addSessionId();
        view.setVisible(true);
    }

    public void addSessionId(){
        controller.addSessionId(sessionId);
    }
    public void addCardToken(String ownerName, String cardNumber, int expirationMonth, int expirationYear, int cvc) {
        token = openpay.generateToken(ownerName,cardNumber,expirationMonth,expirationYear,cvc);
        controller.addCardToken(token);
    }
    public void addConstumerName(String name){
        controller.addCustomerName(name);
    }
    public void addPhoneNumber(String phoneNunmer){
        controller.addPhoneNumber(phoneNunmer);
    }
    public void addAmount(double amount){
        controller.addAmount(amount);
    }
    public void addDescription(String description){
        controller.addDescription(description);
    }
    public void setMethod(String method){
        controller.setPaymentMethod(method);
    }
    public void pay(){
        controller.pay();
    }
}
