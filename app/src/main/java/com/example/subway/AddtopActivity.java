package com.example.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class AddtopActivity extends AppCompatActivity {

    int order_sum;
    CheckBox omelet, bacon, eggmayo, meat, doublecheese, avocado, pepperoni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtop);

        Intent intent = getIntent();
        order_sum = intent.getExtras().getInt("order_sum");

        omelet = (CheckBox) findViewById(R.id.omelet);
        bacon = (CheckBox) findViewById(R.id.bacon);
        eggmayo = (CheckBox) findViewById(R.id.eggmayo);
        meat = (CheckBox) findViewById(R.id.meat);
        doublecheese = (CheckBox) findViewById(R.id.doublecheese);
        avocado = (CheckBox) findViewById(R.id.avocado);
        pepperoni = (CheckBox) findViewById(R.id.pepperoni);

        Button addtopbt = (Button)findViewById(R.id.addtopbt);
        addtopbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(omelet.isChecked() == true)  order_sum += 1100;
                if(bacon.isChecked() == true)  order_sum += 900;
                if(eggmayo.isChecked() == true)  order_sum += 1500;
                if(meat.isChecked() == true)  order_sum += 1500;
                if(doublecheese.isChecked() == true)  order_sum += 800;
                if(avocado.isChecked() == true)  order_sum += 1100;
                if(pepperoni.isChecked() == true)  order_sum += 800;

                Intent intent = new Intent(getApplicationContext(), CheeseActivity.class);
                intent.putExtra("order_sum", order_sum);
                startActivity(intent);
            }
        });
    }
}
