package com.example.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MenucActivity extends AppCompatActivity {

    RadioGroup Jrdgroup;
    RadioButton Jrd_bmt, Jrd_eggmayo, Jrd_meatball, Jrd_blt, Jrd_tuna, Jrd_ham,
            Jrd_turkey,Jrd_vegi,Jrd_rostbeef,Jrd_rostchicken,Jrd_rotichicken,Jrd_subwayclub,Jrd_shrimp,
            Jrd_shrimpavo,Jrd_pulledpork,Jrd_steakcheese,Jrd_turkyBaconAvo,Jrd_ChickenBaconRanch,
            Jrd_SubwayMelt,Jrd_TurkeyBacon,Jrd_SpicyItalian,Jrd_ChickenTeruy;





    Button Jbtn;
    ImageView Jimg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuc);

        Jrdgroup=(RadioGroup)findViewById(R.id.rdgroup);
       Jrd_bmt=(RadioButton) findViewById(R.id.rd_bmt);
        Jrd_eggmayo=(RadioButton) findViewById(R.id.rd_eggmayo);
        Jrd_meatball=(RadioButton) findViewById(R.id.rd_meatball);
        Jrd_blt=(RadioButton) findViewById(R.id.rd_blt);
        Jrd_tuna=(RadioButton) findViewById(R.id.rd_tuna);
        Jrd_ham=(RadioButton) findViewById(R.id.rd_ham);
        Jrd_turkey=(RadioButton) findViewById(R.id.rd_turkey);
        Jrd_vegi=(RadioButton) findViewById(R.id.rd_vegi);
        Jrd_rostbeef=(RadioButton) findViewById(R.id.rd_rostbeef);
        Jrd_rostchicken=(RadioButton) findViewById(R.id.rd_rostchicken);
        Jrd_rotichicken=(RadioButton) findViewById(R.id.rd_rotichicken);
        Jrd_subwayclub=(RadioButton) findViewById(R.id.rd_subwayclub);
        Jrd_shrimp=(RadioButton) findViewById(R.id.rd_shrimp);
        Jrd_shrimpavo=(RadioButton) findViewById(R.id.rd_shrimpavo);
        Jrd_pulledpork=(RadioButton) findViewById(R.id.rd_pulledpork);
        Jrd_steakcheese=(RadioButton) findViewById(R.id.rd_steakcheese);
        Jrd_turkyBaconAvo=(RadioButton) findViewById(R.id.rd_turkyBaconAvo);
        Jrd_ChickenBaconRanch=(RadioButton) findViewById(R.id.rd_ChickenBaconRanch);
        Jrd_SubwayMelt=(RadioButton) findViewById(R.id.rd_SubwayMelt);
        Jrd_TurkeyBacon=(RadioButton) findViewById(R.id.rd_TurkeyBacon);
        Jrd_SpicyItalian=(RadioButton) findViewById(R.id.rd_SpicyItalian);
        Jrd_ChickenTeruy=(RadioButton) findViewById(R.id.rd_ChickenTeruy);







        //이미지 바꾸기 버튼이랑 바뀔 이미지
        Jbtn = (Button)findViewById(R.id.btn);
        Jimg=(ImageView)findViewById(R.id.img_blt);

        Jbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (Jrdgroup.getCheckedRadioButtonId()){
                    case R.id.rd_bmt:
                        Jimg.setImageResource(R.drawable.italianblt);
                        break;
                    case R.id.rd_blt:
                        Jimg.setImageResource(R.drawable.blt);
                        break;
                    case R.id.rd_eggmayo:
                        Jimg.setImageResource(R.drawable.eggmayo);
                        break;
                    case R.id.rd_tuna:
                        Jimg.setImageResource(R.drawable.tuna);
                        break;
                    case R.id.rd_ham:
                        Jimg.setImageResource(R.drawable.ham);
                        break;
                    case R.id.rd_meatball:
                        Jimg.setImageResource(R.drawable.meatball);
                        break;
                    case R.id.rd_turkey:
                        Jimg.setImageResource(R.drawable.turkey);
                        break;

                    case R.id.rd_rostbeef:
                        Jimg.setImageResource(R.drawable.roastedbeef);
                        break;

                    case R.id.rd_rostchicken:
                        Jimg.setImageResource(R.drawable.roastedchicken);
                        break;

                    case R.id.rd_rotichicken:
                        Jimg.setImageResource(R.drawable.rotisseriechicken);
                        break;

                    case R.id.rd_vegi:
                        Jimg.setImageResource(R.drawable.veggie);
                        break;

                    case R.id.rd_subwayclub:
                        Jimg.setImageResource(R.drawable.subwayclub);
                        break;
                    case R.id.rd_shrimp:
                        Jimg.setImageResource(R.drawable.shrimp);
                        break;
                    case R.id.rd_shrimpavo:
                        Jimg.setImageResource(R.drawable.shrimpavocado);
                        break;
                    case R.id.rd_pulledpork:
                        Jimg.setImageResource(R.drawable.pulledpork);
                        break;
                    case R.id.rd_steakcheese:
                        Jimg.setImageResource(R.drawable.steakcheese);
                        break;
                    case R.id.rd_turkyBaconAvo:
                        Jimg.setImageResource(R.drawable.turkeybaconavocado);
                        break;
                    case R.id.rd_ChickenBaconRanch:
                        Jimg.setImageResource(R.drawable.chickenbaconranch);
                        break;

                    case R.id.rd_SubwayMelt:
                        Jimg.setImageResource(R.drawable.subwaymalt);
                        break;

                    case R.id.rd_TurkeyBacon:
                        Jimg.setImageResource(R.drawable.turkeybacon);
                        break;

                    case R.id.rd_SpicyItalian:
                        Jimg.setImageResource(R.drawable.spicyitalian);
                        break;

                    case R.id.rd_ChickenTeruy:
                        Jimg.setImageResource(R.drawable.chickenteriyaki);
                        break;

                }
            }
        });
//555








        //다음버튼으로 넘어가기
        Button classicbt = (Button)findViewById(R.id.classicbt);
        classicbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = Jrdgroup.getCheckedRadioButtonId();
                int order_sum = 0;
                switch (selectedId) {
                    case R.id.rd_blt:
                        order_sum = order_sum + 5100;
                        break;
                    case R.id.rd_eggmayo:
                        order_sum = order_sum + 4300;
                        break;
                    case R.id.rd_ham:
                        order_sum = order_sum + 4700;
                        break;
                    case R.id.rd_meatball:
                        order_sum = order_sum + 5100;
                        break;
                    case R.id.rd_bmt:
                        order_sum = order_sum + 5100;
                        break;
                    case R.id.rd_tuna:
                        order_sum = order_sum + 5100;
                        break;
                    case R.id.rd_rotichicken:
                        order_sum = order_sum + 5100;
                        break;
                    case R.id.rd_vegi:
                        order_sum = order_sum + 5100;
                        break;
                    case R.id.rd_rostchicken:
                        order_sum = order_sum + 5100;
                        break;
                    case R.id.rd_rostbeef:
                        order_sum = order_sum + 5100;
                        break;
                    case R.id.rd_subwayclub:
                        order_sum = order_sum + 5100;
                        break;
                    case R.id.rd_turkey:
                        order_sum = order_sum + 5100;
                        break;
                    case R.id.rd_shrimp:
                        order_sum = order_sum + 6300;
                        break;
                    case R.id.rd_shrimpavo:
                        order_sum = order_sum + 6300;
                        break;
                    case R.id.rd_pulledpork:
                        order_sum = order_sum + 6300;
                        break;
                    case R.id.rd_steakcheese:
                        order_sum = order_sum + 5100;
                        break;
                    case R.id.rd_turkyBaconAvo:
                        order_sum = order_sum + 5100;
                        break;
                    case R.id.rd_ChickenBaconRanch:
                        order_sum = order_sum + 5100;
                        break;
                    case R.id.rd_SubwayMelt:
                        order_sum = order_sum + 5100;
                        break;
                    case R.id.rd_TurkeyBacon:
                        order_sum = order_sum + 5100;
                        break;
                    case R.id.rd_SpicyItalian:
                        order_sum = order_sum + 5100;
                        break;
                    case R.id.rd_ChickenTeruy:
                        order_sum = order_sum + 5100;
                        break;


                }
                Log.v("test_menuc", String.valueOf(order_sum));
                Intent intent = new Intent(getApplicationContext(), BActivity.class);
                intent.putExtra("order_sum", order_sum);
                startActivity(intent);
            }
        });
    }
}
