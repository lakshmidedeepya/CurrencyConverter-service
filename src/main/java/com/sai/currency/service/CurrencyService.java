package com.sai.currency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.currency.config.CurrencyConverterMap;
import com.sai.currency.model.CurrencyConvertRequest;
@Service
public class CurrencyService {
@Autowired
public CurrencyConverterMap cmap;

	public double convertCurrency(CurrencyConvertRequest ccr) {
		// TODO Auto-generated method stub
		String countrycode=ccr.countryCode;
		double amt=ccr.amount;
		/*
		 * if(countrycode.equalsIgnoreCase("+1")) return amt*70;//dollar conversion else
		 * if(countrycode.equalsIgnoreCase("+44")) return amt*88;//pounds conversion
		 * else if(countrycode.equalsIgnoreCase("+91")) return amt;//ruppee else return
		 * 0.000;
		 */
		cmap.currencymap.forEach((k,v)->System.out.println(k+""+v));
		
		double test=cmap.currencymap.get(countrycode);
		System.out.println("dfjsd"+test);
		if(!cmap.currencymap.get(countrycode).equals(null)) return cmap.currencymap.get(countrycode)*amt;
		else return 0.000;
		
			
	}

}
