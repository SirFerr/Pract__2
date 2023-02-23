package com.example.pract__2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class LogInActivity extends AppCompatActivity {
    EditText editText = (EditText) findViewById(R.id.editTextTextEmailAddress);
    ImageView imageView = (ImageView) findViewById(R.id.imageView);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        editText.setText(R.string.testEmail);
        imageView.setImageResource(R.drawable.transparency_demonstration_1);
        setContentView(R.layout.activity_login);
    }

    public void onLogInBtnClick(View view){
        Intent intent = new Intent(this, MainMenu.class);
        intent.putExtra("email",editText.getText().toString());
        startActivity(intent);
        Log.d("onLogInBtnClick","clicked");
    }
    public void onRegBtnClick(View view){
        Intent intent = new Intent(this, LinearActivity.class);
        startActivity(intent);
    }
}