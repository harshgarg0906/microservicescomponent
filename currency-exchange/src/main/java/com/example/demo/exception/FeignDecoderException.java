package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignDecoderException implements ErrorDecoder {

	@Override
	public Exception decode(String methodKey, Response response) {
		// TODO Auto-generated method stub
		switch(response.status())
		{
			case 400:{
				break;
			}
			case 404:{
				if(methodKey.contains("getData")) {
					return new ResponseStatusException(HttpStatus.valueOf(response.status()), "Fuck the rest i am the best");
				}
			}
			default:
			{
				return new Exception(response.reason());
			}
		}
		return null;
	}

}
