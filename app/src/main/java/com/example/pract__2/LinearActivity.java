package com.example.pract__2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LinearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, LogInActivity.class);
        setContentView(R.layout.activity_linear);
        Button button = (Button) findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
                Log.d("onRegBtnClick","clicked");
            }
        });
    }



}