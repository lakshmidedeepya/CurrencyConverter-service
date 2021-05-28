package com.sai.currency.config;

import java.util.HashMap;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Configuration
@ConfigurationProperties(prefix="currencydata")
@Data
@Component
public class CurrencyConverterMap {
	public HashMap<String, Double> currencymap=new HashMap<String, Double>();
}
