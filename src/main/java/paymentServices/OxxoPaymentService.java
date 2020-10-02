package paymentServices;

import paymentDetails.OxxoMethodDetails;

public interface OxxoPaymentService {
    /**
     * @return the transaction id
     */
    String payWithOxoo(float amount, OxxoMethodDetails details);
}
