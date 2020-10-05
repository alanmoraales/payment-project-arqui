package view;

import paymentController.PaymentController;

public class PayViewController {

    private PaymentController controller;
    private PayView view;

    public PayViewController(PaymentController controller) {
        view = new PayView(this);
        view.setVisible(true);
        this.controller = controller;
    }
    public void setMethod(String method){
        controller.setPaymentMethod(method);
    }
    public void creaditCardNumer(String number){
        controller.addCreditCardNumber(number);
    }
    public void ownerName(String name){controller.addUserName(name);}
    public void month(int month){
        controller.addCreditCardExpirationMonth(month);
    }
    public void year(int year){
        controller.addCreditCardExpirationYear(year);
    }
    public void cvc(int cvc){
        controller.addCreditCardCVC(cvc);
    }
    public void phoneNumber(String phoneNumber){
        controller.addUserPhoneNumber(phoneNumber);
    }
    public void pay(double amount){
        controller.pay(amount);
    }
}
