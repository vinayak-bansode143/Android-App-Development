package com.example.addition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText Number,Number2;
     TextView text;
     Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.text);
        Number=findViewById(R.id.Number);
        Number2=findViewById(R.id.Number2);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum =Integer.parseInt(Number.getText().toString())+Integer.parseInt(Number2.getText().toString());
                text.setText("The sum is " + sum);
            }
        });

    }
}