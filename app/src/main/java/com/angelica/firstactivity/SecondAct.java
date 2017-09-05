package com.angelica.firstactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondAct extends AppCompatActivity {

    TextView r_ave;
    TextView f_ave;
    Button bck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        r_ave = (TextView) findViewById(R.id.RtngAve);
        f_ave = (TextView) findViewById(R.id.FinAve);
        bck = (Button) findViewById(R.id.Return);

        String raw = getIntent().getExtras().getString("raw");
        String eval = getIntent().getExtras().getString("eval");
        r_ave.setText(raw);
        f_ave.setText(eval);


    }
    public void goBackToMain(View view){
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }

}
