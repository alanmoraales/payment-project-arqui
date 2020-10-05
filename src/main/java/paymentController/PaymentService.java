package paymentController;

import dao.TransactionInfoDao;
import dao.TransactionInfoMongo;
import paymentDetails.PaymentDetails;
import paymentMethodFactory.CreditCardMethodFactory;
import paymentMethodFactory.OxxoMethodFactory;
import paymentMethodFactory.PaymentMethodFactory;
import paymentMethods.PaymentMethod;
import transactionInfo.ITransactionInfo;
import transactionInfo.TransactionInfo;

import java.util.Date;
import java.util.HashMap;

public class PaymentService implements PaymentController {
    private PaymentMethodFactory paymentMethod;
    private PaymentDetails paymentDetails;
    private HashMap<String, PaymentMethodFactory> paymentMethods;
    private ITransactionInfo transactionInfo;

    public PaymentService(PaymentDetails paymentDetails, PaymentMethodFactory defaultPaymentMethod) {
        this.paymentDetails = paymentDetails;
        this.paymentMethod = defaultPaymentMethod;

        this.paymentMethods = new HashMap<>();
        this.paymentMethods.put("credit-card", new CreditCardMethodFactory());
        this.paymentMethods.put("oxxo", new OxxoMethodFactory());

        this.transactionInfo = new TransactionInfo();
    }

    @Override
    public void setPaymentMethod(String methodName) {
        this.paymentMethod = this.paymentMethods.get(methodName);
        this.transactionInfo.setPaymentMethod(methodName);
    }

    @Override
    public void addCreditCardNumber(String cardNumber) {
        this.paymentDetails.setCreditCardNumber(cardNumber);
    }

    @Override
    public void addCreditCardOwnerName(String ownerName) {
        this.paymentDetails.setCreditCardOwnerName(ownerName);
    }

    @Override
    public void addCreditCardExpirationMonth(int month) {
        this.paymentDetails.setCreditCardExpirationMonth(month);
    }

    @Override
    public void addCreditCardExpirationYear(int year) {
        this.paymentDetails.setCreditCardExpirationYear(year);
    }

    @Override
    public void addCreditCardCVC(int cvc) {
        this.paymentDetails.setCreditCardCVC(String.valueOf(cvc));
    }

    @Override
    public void addUserPhoneNumber(String phoneNumber) {
        this.paymentDetails.setPhoneNumber(phoneNumber);
    }

    @Override
    public void addUserName(String userName) {
        this.paymentDetails.setClientName(userName);
    }

    @Override
    public String pay(double amount) {
        TransactionInfoDao database = new TransactionInfoMongo();
        PaymentMethod paymentMethod = this.paymentMethod.getInstance(this.paymentDetails);

        String transactionId =  paymentMethod.pay(amount);

        this.transactionInfo.setAmount(amount);
        this.transactionInfo.setClientName(this.paymentDetails.getClientName());
        this.transactionInfo.setDate(new Date());
        this.transactionInfo.setPaymentConcept("Publicación de casa");
        this.transactionInfo.setTransactionId(transactionId);
        database.save(this.transactionInfo);

        return transactionId;
    }
}
