package paymentServices;

import paymentDetails.CreditCardMethodDetails;
import paymentDetails.OxxoMethodDetails;
import paymentMethods.PaymentMethod;
import transactionInfo.Transaction;

public class OpenPay implements CreditCardPaymentService {


	@Override
	public Transaction payWithCreditCard(CreditCardMethodDetails details) {
		return null;
	}
}
