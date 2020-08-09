package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.example.demo.exception.FeignDecoderException;

import brave.sampler.Sampler;
import feign.Logger;


@SpringBootApplication
@EnableFeignClients("com.example.demo")
@EnableEurekaClient
@EnableCircuitBreaker
public class CurrencyExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeApplication.class, args);
	}
	
	@Bean
	public Sampler defaultSampler()
	{
		return Sampler.ALWAYS_SAMPLE;
	}
	
	@Bean
	Logger.Level feignLoggerLevel()
	{
		return Logger.Level.FULL;
	}
	
	@Bean
	FeignDecoderException getFeignDecoderException()
	{
		return new FeignDecoderException();
	}

}
