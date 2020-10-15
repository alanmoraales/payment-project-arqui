package paymentController;

import dao.TransactionInfoDao;
import dao.TransactionInfoMongo;
import paymentDetails.PaymentDetails;
import paymentMethodFactory.CreditCardMethodFactory;
import paymentMethodFactory.OxxoMethodFactory;
import paymentMethodFactory.PaymentMethodFactory;
import paymentMethods.PaymentMethod;
import transactionInfo.ITransactionInfo;
import transactionInfo.Transaction;
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
    public void addCustomerName(String name) {
        this.paymentDetails.setCustomerName(name);
    }

    @Override
    public void addPhoneNumber(String phoneNumber) {
        this.paymentDetails.setPhoneNumber(phoneNumber);
    }

    @Override
    public void addCardToken(String token) {
        this.paymentDetails.setCardToken(token);
    }

    @Override
    public void addAmount(double amount) {
        this.paymentDetails.setAmount(amount);
    }

    @Override
    public void addSessionId(String sessionId) {
        this.paymentDetails.setSessionId(sessionId);
    }

    @Override
    public void addDescription(String description) {
        this.paymentDetails.setDescription(description);
    }

    @Override
    public String pay() {
        TransactionInfoDao database = new TransactionInfoMongo();
        PaymentMethod paymentMethod = this.paymentMethod.getInstance(this.paymentDetails);

        Transaction transaction =  paymentMethod.pay();

        this.transactionInfo.setAmount(this.paymentDetails.getAmount());
        this.transactionInfo.setClientName(this.paymentDetails.getCustomerName());
        this.transactionInfo.setDate(new Date());
        this.transactionInfo.setPaymentConcept("Publicación de casa");
        this.transactionInfo.setTransactionId(transaction.getId());
        this.transactionInfo.setTransactionStatus(transaction.getStatus());
        database.save(this.transactionInfo);

        return transaction.getStatus();
    }
}
