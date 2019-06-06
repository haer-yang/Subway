package com.example.subway;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;


public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        final int order_sum = intent.getExtras().getInt("order_sum");
        Log.v("test_result", String.valueOf(order_sum));

        TextView totalValue = (TextView) findViewById(R.id.totalValue);
        totalValue.setText(String.valueOf(order_sum));

        Button result_btn =(Button)findViewById(R.id.result_btn);
        result_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), ByeActivity.class);
                startActivity(intent2);
            }
        });


    }
}
