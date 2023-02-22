package com.example.pract__2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, RelativeActivity.class);
        setContentView(R.layout.activity_main_menu);
        Bundle arguments = getIntent().getExtras();
        TextView textView =(TextView) findViewById(R.id.emailName);
        textView.setText(arguments.getString("email"));
        Button button = (Button) findViewById(R.id.addApartmentBtn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });

    }

}