package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.feign.CurrencyExchangeServiceProxy;
import com.example.demo.model.CurrencyData;

import feign.FeignException;

@RestController
public class CurrencyExchangeController {
	
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CurrencyExchangeServiceProxy currencyExchangeServiceProxy;
	
	@GetMapping("/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyData getData(@PathVariable String from,@PathVariable String to,@PathVariable int quantity)
	{
		CurrencyData data=null;
		int total=0;
		
			data = currencyExchangeServiceProxy.getData(from, to);
			
		
		System.out.println("Data"+data);
		if(data!=null)
		{
			total=data.getCurrencyValue()*quantity;
			return new CurrencyData(data.getId(),data.getCurrencyFrom(),data.getCurrencyTo(),data.getCurrencyValue(),quantity,total);
		}else
		{
			return new CurrencyData("","","",0,0,0);
		}
		
	}

}
