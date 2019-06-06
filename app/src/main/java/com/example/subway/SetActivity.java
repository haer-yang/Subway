package com.example.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class SetActivity extends AppCompatActivity {

    int order_sum;
    RadioGroup setGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        Intent intent = getIntent();
        order_sum = intent.getExtras().getInt("order_sum");

        setGroup = (RadioGroup)findViewById(R.id.setGroup);

        Button setbt = (Button)findViewById(R.id.setbt);
        setbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedId = setGroup.getCheckedRadioButtonId();
                switch (selectedId) {
                    case R.id.cookie:
                        order_sum += 1900;
                        break;
                    case R.id.chip:
                        order_sum += 1900;
                        break;
                    case R.id.potatoe:
                        order_sum += 2400;
                        break;
                    case R.id.wcookie:
                        order_sum += 1900;
                        break;
                    case R.id.wchip:
                        order_sum += 1900;
                        break;
                    case R.id.wpotatoe:
                        order_sum += 2400;
                        break;
                }


                Intent intent1 = new Intent(getApplicationContext(), AddmenuActivity.class);
                intent1.putExtra("order_sum", order_sum);
                startActivity(intent1);
            }
        });
    }
}
