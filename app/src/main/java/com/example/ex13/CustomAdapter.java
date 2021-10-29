package com.example.ex13;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String countries[];
    String capitals[];
    int flags[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] countries,String[] capitals, int[] flags) {
        this.context = context;
        this.countries = countries;
        this.capitals = capitals;
        this.flags = flags;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.listblock, null);
        TextView country = (TextView) view.findViewById(R.id.countryTextView);
        TextView capital = (TextView) view.findViewById(R.id.CapitalTextView);
        ImageView flag = (ImageView) view.findViewById(R.id.iV);
        country.setText(countries[i]);
        capital.setText(capitals[i]);
        flag.setImageResource(flags[i]);
        return view;
    }
}
