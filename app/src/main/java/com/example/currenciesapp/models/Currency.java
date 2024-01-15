package com.example.currenciesapp.models;

import android.graphics.drawable.Drawable;

public class Currency {
    private String currencyCode, currencyName;
    private double currencyRate;
    private Drawable flag;

    public Currency(String currencyCode, String currencyName, double currencyRate, Drawable flag){
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.currencyRate = currencyRate;
        this.flag = flag;
    }
    public double getCurrencyRate() {
        return currencyRate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public Drawable getFlag(){
        return flag;
    }
}
