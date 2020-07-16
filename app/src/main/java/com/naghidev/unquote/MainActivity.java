package com.naghidev.unquote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // access submit Button
        Button submit = findViewById(R.id.invisible);

        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("Submit button clicked");
            }
        });

    }
}
