package com.vtt.apps.model;

public class PaymentDetails {
	private String mode ;
	private String amount ;
	private String paidTo ;
	private String chequeNo ;
	private String bankName ;
	
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getPaidTo() {
		return paidTo;
	}
	public void setPaidTo(String paidTo) {
		this.paidTo = paidTo;
	}
	public String getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	@Override
	public String toString() {
		return "PaymentDetails [mode=" + mode + ", amount=" + amount + ", paidTo=" + paidTo + ", chequeNo=" + chequeNo
				+ ", bankName=" + bankName + "]";
	}

}
