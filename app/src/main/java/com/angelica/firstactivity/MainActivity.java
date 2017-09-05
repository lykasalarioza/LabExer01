package com.angelica.firstactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText q1;
    EditText q2;
    EditText sw;
    EditText lab;
    EditText maj;
    Button btn;
    double ra;
    String eval;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1 = (EditText) findViewById(R.id.edt1);
        q2 = (EditText) findViewById(R.id.edt2);
        sw = (EditText) findViewById(R.id.edt3);
        lab = (EditText) findViewById(R.id.edt4);
        maj = (EditText) findViewById(R.id.edt5);
    }
    public void callSecondAct (View view) {

        Double q1_score = Double.parseDouble(q1.getText().toString());
        Double q2_score = Double.parseDouble(q2.getText().toString());
        Double sw_score = Double.parseDouble(sw.getText().toString());
        Double lab_ex = Double.parseDouble(lab.getText().toString());
        Double maj_ex = Double.parseDouble(maj.getText().toString());

        ra = (q1_score * .1) + (q2_score * .1) + (sw_score * .1) + (lab_ex * .4) + (maj_ex * .3);

        if(ra<60){
            eval="Failed";
        }else if (ra<=65){
            eval="3.00";
        }
        else if (ra<=70){
            eval="2.75";
        }
        else if (ra<=75){
            eval="2.50";
        }
        else if (ra<=80){
            eval="2.25";
        }
        else if (ra<=85){
            eval="2.00";
        }
        else if (ra<=90){
            eval="1.75";
        }else if (ra<=92){
            eval="1.5";
        }
        else if (ra<=94){
            eval="1.25";
        }
        else if (ra<=100){
            eval="1.00";
        }
        String rave = String.valueOf(ra);

        Intent intent1 = new Intent(this, SecondAct.class);
        intent1.putExtra("raw", rave);
        intent1.putExtra("eval", eval);

startActivity(intent1);

    }

}
