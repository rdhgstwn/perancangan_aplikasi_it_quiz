package com.example.itquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class DashboardActivity extends AppCompatActivity {

    RadioGroup
            radiogr1,radiogr2,radiogr3,radiogr4,radiogr5,radiogr6,radiogr7,radiogr8,radiogr9,radiogr10,
            radiogr11,radiogr12,radiogr13,radiogr14,radiogr15,radiogr16,radiogr17,radiogr18,radiogr19,radiogr20;

    private Button proses;

    private RadioButton
            value_no1,value_no2,value_no3,value_no4,value_no5,value_no6,value_no7,value_no8,value_no9,value_no10,
            value_no11,value_no12,value_no13,value_no14,value_no15,value_no16,value_no17,value_no18,value_no19,value_no20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        radiogr1 = findViewById(R.id.radiogroup1);
        radiogr2 = findViewById(R.id.radiogroup2);
        radiogr3 = findViewById(R.id.radiogroup3);
        radiogr4 = findViewById(R.id.radiogroup4);
        radiogr5 = findViewById(R.id.radiogroup5);
        radiogr6 = findViewById(R.id.radiogroup6);
        radiogr7 = findViewById(R.id.radiogroup7);
        radiogr8 = findViewById(R.id.radiogroup8);
        radiogr9 = findViewById(R.id.radiogroup9);
        radiogr10 = findViewById(R.id.radiogroup10);
        radiogr11 = findViewById(R.id.radiogroup11);
        radiogr12 = findViewById(R.id.radiogroup12);
        radiogr13 = findViewById(R.id.radiogroup13);
        radiogr14 = findViewById(R.id.radiogroup14);
        radiogr15 = findViewById(R.id.radiogroup15);
        radiogr16 = findViewById(R.id.radiogroup16);
        radiogr17 = findViewById(R.id.radiogroup17);
        radiogr18 = findViewById(R.id.radiogroup18);
        radiogr19 = findViewById(R.id.radiogroup19);
        radiogr20 = findViewById(R.id.radiogroup20);

        proses = findViewById(R.id.button_proses);
        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int pointa = radiogr1.getCheckedRadioButtonId();
                value_no1 = (RadioButton) findViewById(pointa);

                int pointb = radiogr2.getCheckedRadioButtonId();
                value_no2 = (RadioButton) findViewById(pointb);

                int pointc = radiogr3.getCheckedRadioButtonId();
                value_no3 = (RadioButton) findViewById(pointc);

                int pointd = radiogr4.getCheckedRadioButtonId();
                value_no4 = (RadioButton) findViewById(pointd);

                int pointe = radiogr5.getCheckedRadioButtonId();
                value_no5 = (RadioButton) findViewById(pointe);

                int pointf = radiogr6.getCheckedRadioButtonId();
                value_no6 = (RadioButton) findViewById(pointf);

                int pointg = radiogr7.getCheckedRadioButtonId();
                value_no7 = (RadioButton) findViewById(pointg);

                int pointh = radiogr8.getCheckedRadioButtonId();
                value_no8 = (RadioButton) findViewById(pointh);

                int pointi = radiogr9.getCheckedRadioButtonId();
                value_no9 = (RadioButton) findViewById(pointi);

                int pointj = radiogr10.getCheckedRadioButtonId();
                value_no10 = (RadioButton) findViewById(pointj);

                int pointk = radiogr11.getCheckedRadioButtonId();
                value_no11 = (RadioButton) findViewById(pointk);

                int pointl = radiogr12.getCheckedRadioButtonId();
                value_no12 = (RadioButton) findViewById(pointl);

                int pointm = radiogr13.getCheckedRadioButtonId();
                value_no13 = (RadioButton) findViewById(pointm);

                int pointn = radiogr14.getCheckedRadioButtonId();
                value_no14 = (RadioButton) findViewById(pointn);

                int pointo = radiogr15.getCheckedRadioButtonId();
                value_no15 = (RadioButton) findViewById(pointo);

                int pointp = radiogr16.getCheckedRadioButtonId();
                value_no16 = (RadioButton) findViewById(pointp);

                int pointq = radiogr17.getCheckedRadioButtonId();
                value_no17 = (RadioButton) findViewById(pointq);

                int pointr = radiogr18.getCheckedRadioButtonId();
                value_no18 = (RadioButton) findViewById(pointr);

                int points = radiogr19.getCheckedRadioButtonId();
                value_no19 = (RadioButton) findViewById(points);

                int pointt = radiogr20.getCheckedRadioButtonId();
                value_no20 = (RadioButton) findViewById(pointt);

                int nilai = 0;

                // variabel untuk menampung nilai

                if(value_no1.getText().toString().toLowerCase().equals("prinsip kerja komputer")){
                    nilai = nilai + 5;
                }
                if(value_no2.getText().toString().toLowerCase().equals("monitor")){
                    nilai = nilai + 5;
                }
                if(value_no3.getText().toString().toLowerCase().equals("microsoft word")){
                    nilai = nilai + 5;
                }
                if(value_no4.getText().toString().toLowerCase().equals("larry page")){
                    nilai = nilai + 5;
                }
                if(value_no5.getText().toString().toLowerCase().equals("charles babage")){
                    nilai = nilai + 5;
                }
                if(value_no6.getText().toString().toLowerCase().equals("php")){
                    nilai = nilai + 5;
                }
                if(value_no7.getText().toString().toLowerCase().equals("control panel")){
                    nilai = nilai + 5;
                }
                if(value_no8.getText().toString().toLowerCase().equals("hypertext preprocessor")){
                    nilai = nilai + 5;
                }
                if(value_no9.getText().toString().toLowerCase().equals("hardisk")){
                    nilai = nilai + 5;
                }
                if(value_no10.getText().toString().toLowerCase().equals("menampilkan data")){
                    nilai = nilai + 5;
                }
                if(value_no11.getText().toString().toLowerCase().equals("request time out")){
                    nilai = nilai + 5;
                }
                if(value_no12.getText().toString().toLowerCase().equals("topologi")){
                    nilai = nilai + 5;
                }
                if(value_no13.getText().toString().toLowerCase().equals("fortran")){
                    nilai = nilai + 5;
                }
                if(value_no14.getText().toString().toLowerCase().equals("ipconfig")){
                    nilai = nilai + 5;
                }
                if(value_no15.getText().toString().toLowerCase().equals("multitasting")){
                    nilai = nilai + 5;
                }
                if(value_no16.getText().toString().toLowerCase().equals("multiuser")){
                    nilai = nilai + 5;
                }
                if(value_no17.getText().toString().toLowerCase().equals("samba")){
                    nilai = nilai + 5;
                }
                if(value_no18.getText().toString().toLowerCase().equals("sqiud")){
                    nilai = nilai + 5;
                }
                if(value_no19.getText().toString().toLowerCase().equals("collision")){
                    nilai = nilai + 5;
                }
                if(value_no20.getText().toString().toLowerCase().equals("graphical user interface")){
                    nilai = nilai + 5;
                }

                Intent i = new Intent(DashboardActivity.this, ResultActivity.class);
                i.putExtra("nilai",nilai);
                startActivity(i);
                finish();

            }
        });
    }
}