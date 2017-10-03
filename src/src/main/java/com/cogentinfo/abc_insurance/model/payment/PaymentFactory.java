package com.cogentinfo.abc_insurance.model.payment;

public class PaymentFactory {
    public Payment getPayment(String paymentType)
    {
        Payment payment=null;
        switch (paymentType)
        {
            case "Online":
                payment= new OnlinePayment();
                break;
            case "Check":
                payment=  new CheckPayment();
                break;
            case "Cash":
                payment=  new CashPayment();
                break;
        }
        return payment;
    }
}
