package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CurrencyData;


public interface CurrencyRepository extends JpaRepository<CurrencyData, String> {

	public CurrencyData findByCurrencyFromAndCurrencyTo(String from,String to);
}
