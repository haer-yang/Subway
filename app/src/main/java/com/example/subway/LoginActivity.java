package com.example.subway;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText id,pw;
    Button loginbt;
    String Id,Pw;

    View.OnClickListener introbt=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String str01 = id.getText().toString();
            String str02 = pw.getText().toString();

            Intent i = new Intent(getApplicationContext(),MainActivity.class);
            i.putExtra("id",id.getText().toString());
            i.putExtra("pw",pw.getText().toString());
            startActivity(i);
            finish();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        id = (EditText) findViewById(R.id.id);
        pw = (EditText) findViewById(R.id.pw);
        loginbt = (Button) findViewById(R.id.loginbt);
        loginbt.setOnClickListener(introbt);
        loginbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences auto = getSharedPreferences("auto", MODE_PRIVATE);
                String str = auto.getString("str","");
                if(str.equals("")) {
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });


    }
};