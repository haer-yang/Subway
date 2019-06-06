package com.example.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class AddmenuActivity extends AppCompatActivity {

    int order_sum;
    CheckBox check_wedgepotato, check_brocolli_soup, check_potato_soup, check_double_choco, check_chocochip, check_oatmil, check_raspberry_cheesecake, check_white_choco, check_chip, check_soda, check_coffe, check_hashbrown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmenu);

        Intent intent = getIntent();
        order_sum = intent.getExtras().getInt("order_sum");
        Log.v("test_addmenu", String.valueOf(order_sum));

        check_wedgepotato = (CheckBox) findViewById(R.id.check_wedgepotato);
        check_brocolli_soup = (CheckBox) findViewById(R.id.check_brocolli_soup);
        check_potato_soup = (CheckBox) findViewById(R.id.check_potato_soup);
        check_double_choco = (CheckBox) findViewById(R.id.check_double_choco);
        check_chocochip = (CheckBox) findViewById(R.id.check_chocochip);
        check_oatmil = (CheckBox) findViewById(R.id.check_oatmil);
        check_raspberry_cheesecake = (CheckBox) findViewById(R.id.check_raspberry_cheesecake);
        check_white_choco = (CheckBox) findViewById(R.id.check_white_choco);
        check_chip = (CheckBox) findViewById(R.id.check_chip);
        check_soda = (CheckBox) findViewById(R.id.check_soda);
        check_coffe = (CheckBox) findViewById(R.id.check_coffe);
        check_hashbrown = (CheckBox) findViewById(R.id.check_hashbrown);



        //버튼
        Button addmenubt = (Button)findViewById(R.id.addmenubt);
        addmenubt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(check_wedgepotato.isChecked() == true)  order_sum += 1500;
                if(check_brocolli_soup.isChecked() == true)  order_sum += 2900;
                if(check_potato_soup.isChecked() == true)  order_sum += 2900;
                if(check_double_choco.isChecked() == true)  order_sum += 1000;
                if(check_chocochip.isChecked() == true)  order_sum += 1000;
                if(check_oatmil.isChecked() == true)  order_sum += 1000;
                if(check_raspberry_cheesecake.isChecked() == true)  order_sum += 1000;
                if(check_white_choco.isChecked() == true)  order_sum += 1000;
                if(check_chip.isChecked() == true)  order_sum += 1000;
                if(check_soda.isChecked() == true)  order_sum += 1500;
                if(check_coffe.isChecked() == true)  order_sum += 1500;
                if(check_hashbrown.isChecked() == true)  order_sum += 1200;


                Intent intent1 = new Intent(getApplicationContext(), ResultActivity.class);
                intent1.putExtra("order_sum", order_sum);
                startActivity(intent1);
            }
        });
    }
}
