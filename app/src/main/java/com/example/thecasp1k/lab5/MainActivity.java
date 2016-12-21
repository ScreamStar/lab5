package com.example.thecasp1k.lab5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.thecasp1k.lab5.R.id.text;

public class MainActivity extends AppCompatActivity {
    public TextView text1;
    public Button button1;
    public EditText edit1;
    public Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText) findViewById(R.id.editText);
        text1 = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(obr);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(clc);
    }
    OnClickListener obr = new OnClickListener() {
        public void onClick(View v) {
            String fio = edit1.getText().toString();
            text1.setText(" ");
            if(fio.isEmpty()) {
                text1.setText("Введите имя!");
            }
            else {
                text1.setText("Привет," + fio + "!");
            }
        }
    };

    OnClickListener clc = new OnClickListener(){
        public void onClick(View c) {
            edit1.setText(null);
            text1.setText("Введите имя!");
        }
    };
}
