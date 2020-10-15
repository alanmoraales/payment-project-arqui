package paymentServices;

import apiLibrary.BackOpenPayLibrary;
import apiLibrary.Charge;
import apiLibrary.CreateCardChargeParams;
import apiLibrary.Customer;
import config.OpenPayConfig;
import paymentDetails.CreditCardMethodDetails;
import paymentDetails.OxxoMethodDetails;
import paymentMethods.PaymentMethod;
import transactionInfo.Transaction;

public class OpenPay implements CreditCardPaymentService {
	private BackOpenPayLibrary openPay;

	public OpenPay() {
		this.openPay = new BackOpenPayLibrary(OpenPayConfig.MERCHANT_ID, OpenPayConfig.PRIVATE_KEY);
	}

	@Override
	public Transaction payWithCreditCard(CreditCardMethodDetails details) {
		Customer customer = new Customer();
		customer.setName(details.getCustomerName());
		customer.setPhoneNumber(details.getPhoneNumber());

		CreateCardChargeParams chargeParams = new CreateCardChargeParams();
		chargeParams.setAmount(details.getAmount());
		chargeParams.setCardId(details.getCardToken());
		chargeParams.setDescription(details.getDescription());
		chargeParams.setDeviceSessionId(details.getSessionId());
		chargeParams.setCustomer(customer);

		Charge chargeInfo = openPay.createCharge(chargeParams);

		return new Transaction(chargeInfo.getTransactionId(), chargeInfo.getTransactionStatus());
	}
}
