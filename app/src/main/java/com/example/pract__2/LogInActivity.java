package com.example.pract__2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText editText = (EditText) findViewById(R.id.editTextTextEmailAddress);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        editText.setText(getResources().getString(R.string.testEmail));
        imageView.setImageResource(R.drawable.transparency_demonstration_1);

    }

    public void onLogInBtnClick(View view){
        Intent intent = new Intent(this, MainMenu.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextEmailAddress);
        intent.putExtra("email",editText.getText().toString());
        startActivity(intent);
        Log.d("onLogInBtnClick","clicked");
    }
    public void onRegBtnClick(View view){
        Intent intent = new Intent(this, LinearActivity.class);
        startActivity(intent);
    }
}