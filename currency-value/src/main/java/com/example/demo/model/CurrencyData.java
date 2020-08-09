package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrencyData {

	@Id
	private String id;
	private String currencyFrom;
	private String currencyTo;
	private int currencyValue;
	
	public CurrencyData(String id, String currencyFrom, String currencyTo, int currencyValue) {
		this.id = id;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.currencyValue = currencyValue;
	}

	public CurrencyData() {
	
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

	@Override
	public String toString() {
		return "CurrencyData [id=" + id + ", currencyFrom=" + currencyFrom + ", currencyTo=" + currencyTo
				+ ", currencyValue=" + currencyValue + "]";
	}
	
	
	
	
	
	
}
