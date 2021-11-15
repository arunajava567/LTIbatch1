package com.cg.anno;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("currencyConverter")
public class CurrencyConverterImpl implements CurrencyConverter {
	
	@Autowired  // ByName
	private ExchangeServiceImpl exchangeService;// new    //composition , has a relation
	
	
	//ExchangeServiceImpl eservice=new ExchangeServiceImpl();
	
	
	// currencyConverterImpl 
	
	//@PostConstruct   //init 
	void init(){
		System.out.println("in init() - called thru @PostConstruct");
	}
	
	//@PreDestroy  //destroy
	void destroy(){
		System.out.println("in destroy() - called thru @PreDestroy");
	}
	
	/*public CurrencyConverterImpl() {
		System.out.println("CurrencyConverterImpl()");
	}*/
	/*@Autowired
	public CurrencyConverterImpl(ExchangeServiceImpl exchangeService) {
		System.out.println("CurrencyConverterImpl()");
		this.exchangeService = exchangeService;
	}
	*/
	

	/*public ExchangeServiceImpl getExchangeService() {
		System.out.println("getExchangeService()");		
		return exchangeService;
	}

	@Autowired
	public void setExchangeService(ExchangeServiceImpl exchangeService) {
		System.out.println("setExchangeService()");		
		this.exchangeService = exchangeService;
	}*/

	public double dollarsToRupees(double dollars) {
	//	System.out.println("dollarsToRupees()");	
	
		return dollars * exchangeService.getExchangeRate();
	}
};