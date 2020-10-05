import paymentController.PaymentController;
import paymentController.PaymentService;
import paymentDetails.FullPaymentDetails;
import paymentMethodFactory.CreditCardMethodFactory;
import view.PayViewController;

public class Main {
    public static void main(String[] args) {
        PaymentController paymentController = new PaymentService(new FullPaymentDetails(), new CreditCardMethodFactory());
        PayViewController viewController = new PayViewController(paymentController);
    }
}
