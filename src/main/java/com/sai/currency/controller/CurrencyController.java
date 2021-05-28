package com.sai.currency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sai.currency.model.CurrencyConvertRequest;
import com.sai.currency.service.CurrencyService;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

@Autowired
CurrencyService cs;

@PostMapping("/convert")
public double convertCurrency(@RequestBody CurrencyConvertRequest ccr) {
	return cs.convertCurrency(ccr);
}

}
