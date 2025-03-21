package com.exce.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exce.demo.servicei.ExceptionService;

@RestController
public class ExceptionController {
	
	@Autowired ExceptionService exceptionService;
	@GetMapping("/divide/{no1}/{no2}")
	public ResponseEntity<Float> onDivid(@PathVariable int no1,@PathVariable int no2)
	{
		float result=exceptionService.divide(no1,no2);
		return new ResponseEntity<Float>(result,HttpStatus.OK);
	}
	@ExceptionHandler(value = ArithmeticException.class)
	public ResponseEntity<String> onArithmeticException(ArithmeticException aert)
	{
		return new ResponseEntity<String>(aert.getMessage(),HttpStatus.BAD_REQUEST);
	}

}
