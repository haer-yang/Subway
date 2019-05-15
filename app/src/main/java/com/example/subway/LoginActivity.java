package com.example.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button loginbt;
    EditText loginid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginbt = (Button) findViewById(R.id.loginbt);
        loginid = (EditText) findViewById(R.id.loginid);

        loginbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,MyinfoActivity.class);
                intent.putExtra("loginid", loginid.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}

