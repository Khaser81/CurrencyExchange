package com.example.CurrencyExchange;

import org.springframework.stereotype.Service;

@Service
public class MainService {
    public MainService() {
    }

    public CurrencyExchange getCurrencyExchange(CurrencyExchange currencyExchange){
        return currencyExchange;
    }
}
