    package com.example.nested_layout_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] btn_text= getResources().getStringArray(R.array.strings_tagged_searches);
        Button b1=(Button) findViewById(R.id.btn_1);
        b1.setText(btn_text[0]);
        Button b2=(Button) findViewById(R.id.btn_2);
        b2.setText(btn_text[1]);
        Button b3=(Button) findViewById(R.id.btn_3);
        b3.setText(btn_text[2]);
        Button b4=(Button) findViewById(R.id.btn_4);
        b4.setText(btn_text[3]);
        Button b5=(Button) findViewById(R.id.btn_5);
        b5.setText(btn_text[4]);
        Button b6=(Button) findViewById(R.id.btn_6);
        b6.setText(btn_text[5]);



    }
}
