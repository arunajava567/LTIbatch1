package com.cg.anno;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//@ Component -- bean    @ Value   inject value for an atttibute

@Component("exchangeService")  //<bean> 
public class ExchangeServiceImpl // implements ExchangeService 
{
	
	@Value("70.25")//<property name=""    <value >
	public  double exchangeRate;//=44.25;

	public ExchangeServiceImpl(double exchangeRate) {
		super();
		this.exchangeRate = exchangeRate;
	}
	public ExchangeServiceImpl() {
		System.out.println("ExchangeServiceImpl()");
	}
	public double getExchangeRate() {
	//	System.out.println("getExchangeRate()");
		return exchangeRate;
	}
}
