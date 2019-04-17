package com.example.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class BranchActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);

        Spinner sp =(Spinner)findViewById(R.id.sp);
        ArrayAdapter spAdapter = ArrayAdapter.createFromResource(this,R.array.branch, android.R.layout.simple_spinner_dropdown_item );
        sp.setAdapter(spAdapter);


        Button next = (Button)findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), MenucActivity.class);
                startActivity(intent1);
            }
        });

    }


}
