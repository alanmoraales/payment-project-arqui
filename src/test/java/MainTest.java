import paymentController.PaymentController;
import paymentController.PaymentService;
import paymentDetails.FullPaymentDetails;
import paymentMethodFactory.CreditCardMethodFactory;
import view.PayView;
import view.PayViewController;

public class MainTest {
    public static void main(String[] args) {
        PaymentController paymentController = new PaymentService(new FullPaymentDetails(), new CreditCardMethodFactory());
        PayViewController viewController = new PayViewController(paymentController);
        PayView view = new PayView(viewController);

        //view.setVisible(true);
    }
}
