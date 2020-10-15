package apiLibrary;

import api.BackEndMethods;
import api.FakeOpenPayApi;

public class BackOpenPayLibrary {
    private BackEndMethods openPay;
    private String merchantId;
    private String privateKey;

    public BackOpenPayLibrary(String merchantId, String privateKey) {
        this.merchantId = merchantId;
        this.privateKey = privateKey;
        this.openPay = new FakeOpenPayApi();
    }

    public Charge createCharge(CreateCardChargeParams params) {
        openPay.setAmount(params.getAmount());
        openPay.setCardId(params.getCardId());
        openPay.setCustomerName(params.getCustomer().getName());
        openPay.setDescription(params.getDescription());
        openPay.setPhoneNumber(params.getCustomer().getPhoneNumber());
        openPay.setDeviceSessionId(params.getDeviceSessionId());
        return openPay.createCharge();
    }
}
