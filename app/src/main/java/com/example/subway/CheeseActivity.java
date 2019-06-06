package com.example.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class CheeseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheese);

        Intent intent = getIntent();
        final int order_sum = intent.getExtras().getInt("order_sum");
        Log.v("test_cheese", String.valueOf(order_sum));

        Button cheesebt = (Button)findViewById(R.id.cheesebt);
        cheesebt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), VActivity.class);
                intent.putExtra("order_sum", order_sum);
                startActivity(intent);
            }
        });
    }
}
