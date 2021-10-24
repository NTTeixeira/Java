package model.services;

import java.util.Date;

public class PaymentMethod {
	
	private Integer creditCardNumber;
	private Date cardExpirationDate;
	private Integer cardCode;

	public PaymentMethod() {
	}

	public PaymentMethod(Integer creditCardNumber, Date cardExpirationDate, Integer cardCode) {
		this.creditCardNumber = creditCardNumber;
		this.cardExpirationDate = cardExpirationDate;
		this.cardCode = cardCode;
	}

	public Integer getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(Integer creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public Date getCardExpirationDate() {
		return cardExpirationDate;
	}

	public void setCardExpirationDate(Date cardExpirationDate) {
		this.cardExpirationDate = cardExpirationDate;
	}

	public Integer getCardCode() {
		return cardCode;
	}

	public void setCardCode(Integer cardCode) {
		this.cardCode = cardCode;
	}
	
	
	
	
	
	
	
}
