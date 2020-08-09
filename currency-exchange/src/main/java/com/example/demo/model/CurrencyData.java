package com.example.demo.model;

public class CurrencyData {
	
	
	private String id;
	private String currencyFrom;
	private String currencyTo;
	private int currencyValue;
	private int quantity;
	private int total;
	
	public CurrencyData()
	{
		
	}

	public CurrencyData(String id, String currencyFrom, String currencyTo, int currencyValue, int quantity, int total) {
		this.id = id;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.currencyValue = currencyValue;
		this.quantity = quantity;
		this.total = total;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCurrencyFrom() {
		return currencyFrom;
	}

	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}

	public String getCurrencyTo() {
		return currencyTo;
	}

	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}

	public int getCurrencyValue() {
		return currencyValue;
	}

	public void setCurrencyValue(int currencyValue) {
		this.currencyValue = currencyValue;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "CurrencyData [id=" + id + ", currencyFrom=" + currencyFrom + ", currencyTo=" + currencyTo
				+ ", currencyValue=" + currencyValue + ", quantity=" + quantity + ", total=" + total + "]";
	}
	
	
	
	
}
