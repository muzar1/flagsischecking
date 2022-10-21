package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView country;
    Button israel;
    Button england;
    Button france;
    Button germany;
    ImageView flag;
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        israel = (Button) findViewById(R.id.israel);
        england = (Button) findViewById(R.id.england);
        france = (Button) findViewById(R.id.france);
        germany = (Button) findViewById(R.id.germany);

        country = (TextView) findViewById(R.id.country);

        flag = (ImageView) findViewById(R.id.flag);

        description = (TextView) findViewById(R.id.description);

        israel.setOnClickListener(this::onClick);
        england.setOnClickListener(this::onClick);
        france.setOnClickListener(this::onClick);
        germany.setOnClickListener(this::onClick);
    }
    public void onClick(View v)
    {
        if(v==israel)
        {
            country.setText("Israel");
            flag.setImageResource(R.drawable.israelflag);
            description.setText("Israel, officially the State of Israel is a country in Western Asia.");
        }
        else if(v==england)
        {
            country.setText("England");
            flag.setImageResource(R.drawable.ukflag);
            description.setText("England is a country that is part of the United Kingdom. It shares land borders with Wales to its west and Scotland to its north.");
        }
        else if(v==france)
        {
            country.setText("France");
            flag.setImageResource(R.drawable.flagfrance);
            description.setText("France, officially the French Republic, is a transcontinental country spanning Western Europe and overseas regions and territories in the Americas and the Atlantic, Pacific and Indian Oceans.");
        }
        else if(v==germany)
        {
            country.setText("Germany");
            flag.setImageResource(R.drawable.germanyflag);
            description.setText("Germany, officially the Federal Republic of Germany, is a country in Central Europe. It is the second-most populous country in Europe after Russia, and the most populous member state of the European Union. ");
        }
    }
}