package com.example.subway;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mainevent = (Button)this.findViewById(R.id.mainevent);
        mainevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://subway.co.kr/eventList"));
                startActivity(intent1);
            }
        });

        Button mainorder = (Button)findViewById(R.id.mainorder);
        mainorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), BranchActivity.class);
                startActivity(intent2);
            }
        });

        Button howtoeat = (Button)this.findViewById(R.id.howtoeat);
        howtoeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse("http://subway.co.kr/utilizationSubway"));
                startActivity(intent3);
            }
        });


    }
}