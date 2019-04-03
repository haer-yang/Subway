package com.example.subway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.content.SharedPreferences;

public class LoginActivity extends AppCompatActivity {

    EditText id;
    EditText pwd;
    Button login;

    View.OnClickListener login =new View.OnClickListener(){
        @Override
        public void onClick(View v){

            String str01 = id.getText().toString();
            String str02 = pwd.getText().toString();

            SharedPreferences sp = getSharedPreferences("name", MODE_PRIVATE);
            SharedPreferences.Editor edit = sp.edit();
            edit.putString("id",str01);
            edit.putString("pwd",str02);
            edit.commit();

            Intent i = new Intent(getApplicationContext(),MainActivity.class);
            i.putExtra("id",id.getText().toString());
            i.putExtra("pw",pwd.getText().toString());
            startActivity(i);
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}

