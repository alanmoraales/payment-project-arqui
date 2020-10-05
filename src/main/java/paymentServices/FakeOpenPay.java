package paymentServices;

import paymentDetails.CreditCardMethodDetails;
import paymentDetails.OxxoMethodDetails;
import paymentMethods.PaymentMethod;

public class FakeOpenPay implements CreditCardPaymentService, OxxoPaymentService {

	@Override
	public String payWithCreditCard(double amount, CreditCardMethodDetails details) {
	   if(amount>0 && details!=null) {
		   return "100";
		   
	   }
		return "303Fail";
	}

	@Override
	public String payWithOxoo(double amount, OxxoMethodDetails details) {
		   if(amount>0 && details!=null) {
			   return "100";
			   
		   }
			return "303Fail";
	}

	

}
