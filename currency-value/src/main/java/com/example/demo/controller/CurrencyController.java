package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CurrencyData;
import com.example.demo.repository.CurrencyRepository;

@RestController
public class CurrencyController {

	@Autowired
	CurrencyRepository currencyRepository;
	
	@GetMapping("/data")
	public List<CurrencyData> getData()
	{
		List<CurrencyData> data=currencyRepository.findAll();
		return data;
	}
	
	@GetMapping("/from/{from}/to/{to}")
	public CurrencyData getData(@PathVariable String from,@PathVariable String to)
	{
		CurrencyData data=currencyRepository.findByCurrencyFromAndCurrencyTo(from,to);
		System.out.println("Data"+data);
		return data;
	}
}
