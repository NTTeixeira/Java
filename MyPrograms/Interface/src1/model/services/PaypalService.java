package model.services;

public class PaypalService implements OnlinePaymentService{

	private static final double FEE_PAYMENT = 0.02;
	private static final double INTEREST = 0.01;
	
	@Override
	public Double paymentFee(Double amount) {	
		return amount *= FEE_PAYMENT;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		return amount * INTEREST * months;
	}

}
