package com.example.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyinfoActivity extends AppCompatActivity {

    TextView idview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myinfo);

        Button infoclose = (Button)findViewById(R.id.infoclose);
        infoclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        String receiveStr = intent.getExtras().getString("loginid");// 전달한 값을 받을 때
        idview = (TextView)findViewById(R.id.idview);
        idview.setText(receiveStr);
    }

}