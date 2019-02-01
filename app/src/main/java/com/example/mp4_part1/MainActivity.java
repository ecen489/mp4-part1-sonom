package com.example.mp4_part1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText plain_text_input = (EditText) findViewById(R.id.plain_text_input);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (plain_text_input.getText().toString() != null){
                    Toast.makeText(getApplicationContext(), plain_text_input.getText().toString(),Toast.LENGTH_LONG).show();
                    textView2.setText(plain_text_input.getText().toString());
                    plain_text_input.getText().clear();
                }
            }

        });
    }
}
