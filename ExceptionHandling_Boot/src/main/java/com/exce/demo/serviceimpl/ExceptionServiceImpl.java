package com.exce.demo.serviceimpl;

import org.springframework.stereotype.Service;

import com.exce.demo.servicei.ExceptionService;
@Service
public class ExceptionServiceImpl implements ExceptionService
{

	@Override
	public float divide(int no1, int no2) {
		
		return no1/no2;
	}

}
