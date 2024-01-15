package com.example.currenciesapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.currenciesapp.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import com.example.currenciesapp.models.Currency;

public class CurrenciesAdapter extends RecyclerView.Adapter<CurrenciesAdapter.CurrencyViewHolder> {

    ArrayList<Currency> currenciesList;

    public CurrenciesAdapter(ArrayList<Currency> currenciesList){
        this.currenciesList = currenciesList;
    }

    @NonNull
    @Override
    public CurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.currency_item,
                parent,
                false
        );
        return new CurrencyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyViewHolder holder, int position) {
        holder.currencyNameTextView.setText(currenciesList.get(position).getCurrencyName());
        holder.currencyRateTextView.setText(String.valueOf(currenciesList.get(position).getCurrencyRate()));
        holder.currencyCodeTextView.setText(currenciesList.get(position).getCurrencyCode());
        holder.frameLayout.setBackground(currenciesList.get(position).getFlag());
    }

    @Override
    public int getItemCount() {
        return currenciesList.size();
    }

    static class CurrencyViewHolder extends RecyclerView.ViewHolder{
        TextView currencyNameTextView, currencyCodeTextView, currencyRateTextView;
        FrameLayout frameLayout;

        public CurrencyViewHolder(@NonNull View itemView) {
            super(itemView);
            currencyNameTextView = itemView.findViewById(R.id.currencyNameTextView);
            currencyCodeTextView = itemView.findViewById(R.id.currencyCodeTextView);
            currencyRateTextView = itemView.findViewById(R.id.currencyRateTextView);
            frameLayout = itemView.findViewById(R.id.frameLayout);
        }
    }
}
