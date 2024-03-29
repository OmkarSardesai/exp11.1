package com.example.exp111;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.assist.AssistStructure;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    CheckBox c1, c2, c3, c4, c5;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1 = (CheckBox) findViewById(R.id.ch1);
        c2 = (CheckBox) findViewById(R.id.ch2);
        c3 = (CheckBox) findViewById(R.id.ch3);
        c4 = (CheckBox) findViewById(R.id.ch4);
        c5 = (CheckBox) findViewById(R.id.ch5);
        b1 = findViewById(R.id.btn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "selected";

                if (c1.isChecked()) {
                    msg = msg + "MAD";
                }
                if (c2.isChecked()) {
                    msg = msg + "JAVA";
                }
                if (c3.isChecked()) {
                    msg = msg + "HTML";
                }
                if (c4.isChecked()) {
                    msg = msg + "CSS";
                }
                if (c5.isChecked()) {
                    msg = msg + "C++";
                }
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
            }
        });

    }

    public void onCheckboxClicked(View view) {
    }
}