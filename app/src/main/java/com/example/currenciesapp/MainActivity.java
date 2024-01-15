package com.example.currenciesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.example.currenciesapp.adapters.CurrenciesAdapter;
import com.example.currenciesapp.models.Currency;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Drawable kwFlag, auFlag, saFlag, jpFlag, usFlag, ptFlag, euFlag, cnFlag, itFlag;

    RecyclerView recyclerView;
    ArrayList<Currency> currencies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFlags();
        addCurrencies();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        CurrenciesAdapter currenciesAdapter = new CurrenciesAdapter(currencies);
        recyclerView.setAdapter(currenciesAdapter);
    }

    private void addCurrencies(){
        currencies.add(new Currency("KWD", "Kuwaiti Dinar", 1, kwFlag));
        currencies.add(new Currency("SAR", "Saudi Arabia Riyal", 12.2, saFlag));
        currencies.add(new Currency("USD", "United States Dollar", 3.25, usFlag));
        currencies.add(new Currency("EUR", "Euro", 2.97, euFlag));
        currencies.add(new Currency("PTE", "Portuguese Escudo", 595.76, ptFlag));
        currencies.add(new Currency("SAR", "Japanese Yen", 474.16, jpFlag));
        currencies.add(new Currency("CNY", "Chinese Yuan", 23.17, cnFlag));
        currencies.add(new Currency("AUD", "Australian Dollar", 4.88, auFlag));
    }

    private void initFlags(){
        kwFlag = ResourcesCompat.getDrawable(getResources(), R.drawable.kw_flag, null);
        saFlag = ResourcesCompat.getDrawable(getResources(), R.drawable.sa_flag, null);
        usFlag = ResourcesCompat.getDrawable(getResources(), R.drawable.us_flag, null);
        euFlag = ResourcesCompat.getDrawable(getResources(), R.drawable.eu_flag, null);
        ptFlag = ResourcesCompat.getDrawable(getResources(), R.drawable.pt_flag, null);
        jpFlag = ResourcesCompat.getDrawable(getResources(), R.drawable.jp_flag, null);
        cnFlag = ResourcesCompat.getDrawable(getResources(), R.drawable.cn_flag, null);
        itFlag = ResourcesCompat.getDrawable(getResources(), R.drawable.it_flag, null);
        auFlag = ResourcesCompat.getDrawable(getResources(), R.drawable.au_flag, null);
    }
}