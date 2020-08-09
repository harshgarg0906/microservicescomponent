package com.example.demo.feign;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.CurrencyData;

@FeignClient(name="zuul-api-gateway",fallback=CurrencyFallBack.class)
@RibbonClient(name="currency-value")
public interface CurrencyExchangeServiceProxy {
	@GetMapping("/value/from/{from}/to/{to}")
	public CurrencyData getData(@PathVariable("from") String from,@PathVariable("to") String to);
}

@Component
class CurrencyFallBack implements CurrencyExchangeServiceProxy{

	@Override
	public CurrencyData getData(String from, String to) {
		// TODO Auto-generated method stub
		return new CurrencyData();
	}
	
}