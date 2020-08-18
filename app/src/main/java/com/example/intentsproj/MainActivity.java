package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NUMBER = "com.example.application.example.EXTRA_NUMBER";
    public static final String EXTRA_NUMBER2 = "com.example.application.example.EXTRA_NUMBER";
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                openActity2();

            }


        });
    }
    public void openActity2(){
        EditText editText1=(EditText) findViewById(R.id.editTextTextPersonName);
        int number1=Integer.parseInt(editText1.getText().toString());
        EditText editText2=(EditText) findViewById(R.id.editTextTextPersonName2);
        int number2=Integer.parseInt(editText2.getText().toString());


        Intent intent=new Intent(this,secondactivity.class);
        intent.putExtra(EXTRA_NUMBER,number1);
        intent.putExtra(EXTRA_NUMBER2,number2);
        startActivity(intent);
    }
}