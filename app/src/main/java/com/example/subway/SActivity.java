package com.example.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s);

        Intent intent = getIntent();
        final int order_sum = intent.getExtras().getInt("order_sum");
        Log.v("test_s", String.valueOf(order_sum));
        Button sbt = (Button)findViewById(R.id.sbt);
        sbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), SetActivity.class);
                intent1.putExtra("order_sum", order_sum);
                startActivity(intent1);
            }
        });
    }
}
