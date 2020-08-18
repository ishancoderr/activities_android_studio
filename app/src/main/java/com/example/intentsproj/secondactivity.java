package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {
    private Button add;
    private Button mul;
    private Button sub;
    private Button div;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        Intent intent=getIntent();
        add =(Button)findViewById(R.id.button);
        mul=(Button)findViewById(R.id.button3);
        sub=(Button)findViewById(R.id.button2);
        div=(Button)findViewById(R.id.button4);
        result=(TextView)findViewById(R.id.textView3);

        final int num1=intent.getIntExtra(MainActivity.EXTRA_NUMBER,0);
        final int num2=intent.getIntExtra(MainActivity.EXTRA_NUMBER2,0);
        TextView textView1=(TextView) findViewById(R.id.editTextTextPersonName);
        TextView textView2=(TextView) findViewById(R.id.editTextTextPersonName2);
        textView1.setText(num1);
        textView2.setText(num2);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum=num1+num2;
                result.setText(String.valueOf(num1)+"+"+String.valueOf(num2)+"="+String.valueOf(sum));

            }
        });
    }
}