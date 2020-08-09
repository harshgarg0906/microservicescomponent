package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.CurrencyData;
import com.example.demo.repository.CurrencyRepository;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableEurekaClient
public class CurrencyValueApplication {
	
	@Autowired
	CurrencyRepository currencyRepository;

	public static void main(String[] args) {
		SpringApplication.run(CurrencyValueApplication.class, args);
	}
   
	@PostConstruct
	public void init()
	{
		List<CurrencyData> data=new ArrayList<>();
		data.add(new CurrencyData("1","USD","IND",80));
		data.add(new CurrencyData("2", "AUS", "IND", 40));
		currencyRepository.saveAll(data);
	}
	
	@Bean
	public Sampler defaultSampler()
	{
		return Sampler.ALWAYS_SAMPLE;
	}

}
