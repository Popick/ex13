package com.example.ex13;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity<textView> extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Medina[] countries = new Medina[8];
    String names[] = {"Choose:","Israel","USA","Germany","France","Japan","Russia","Italy","England"};
    String capitals[] = {"","Jerusalem","Washington","Berlin","Paris","Tokyo","Moscow","Rome","London"};
    int[] imgid={android.R.drawable.ic_menu_search,R.drawable.is,R.drawable.us,R.drawable.ge,R.drawable.fr,R.drawable.ja,R.drawable.ru,R.drawable.it,R.drawable.en};
    Spinner spin;

    TextView name,cap,anthem,size,lan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countries[0] = new Medina("Israel", "Jerusalem", "The Tikva", "9,217,000", "Hebrew,English,Arabic");
        countries[1] = new Medina("United States", "Washington, DC", "The Star-Spangled Banner", "329,500,000", "English");
        countries[2] = new Medina("Germany", "Berlin", "Deutschlandlied", "83,240,000", "German");
        countries[3] = new Medina("France", "Paris",  "La Marseillaise", "67,390,000", "French");
        countries[4] = new Medina("Japan", "Tokyo",  "Kimi Ga Yo", "125,800,000", "Japanse");
        countries[5] = new Medina("Russia", "Moscow",  "State Anthem of the Russian Federation", "144,100,000", "Russian");
        countries[6] = new Medina("Italy", "Rome",  "Il Canto degli Italiani", "59,550,000", "Italian");
        countries[7] = new Medina("England", "London",  "God Save the Queen", "55,980,000", "English");

        spin = (Spinner) findViewById(R.id.spinner);

        CustomAdapter customadp = new CustomAdapter(getApplicationContext(),
                names,capitals, imgid);
        spin.setAdapter(customadp);

        spin.setOnItemSelectedListener(this);

        name = (TextView) findViewById(R.id.name);
        cap=(TextView) findViewById(R.id.cap);
        anthem =(TextView) findViewById(R.id.anthem);
        size = (TextView) findViewById(R.id.size);
        lan = (TextView) findViewById(R.id.lan);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position!=0){
            name.setText("Name:\n"+countries[position-1].getName());
            cap.setText("Capital:\n"+countries[position-1].getCapital());
            anthem.setText("Anthem:\n"+countries[position-1].getAnthem());
            size.setText("Population:\n"+countries[position-1].getPopulation());
            lan.setText("Language:\n"+countries[position-1].getLanguage());
        }
        else{
            name.setText("");
            lan.setText("");
            cap.setText("");
            anthem.setText("");
            size.setText("");
            lan.setText("");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {


    }
}