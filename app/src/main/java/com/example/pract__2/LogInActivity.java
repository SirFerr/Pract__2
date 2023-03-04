package com.example.pract__2;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class LogInActivity extends AppCompatActivity {
    ActivityResultLauncher<Intent> mStartForResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText editText = (EditText) findViewById(R.id.editTextTextEmailAddress);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        editText.setText(getResources().getString(R.string.testEmail));
        imageView.setImageResource(R.drawable.transparency_demonstration_1);
        mStartForResult = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    Intent data = result.getData();
//                    Log.d("result",data.getStringExtra("emailResult"));
                    editText.setText("test2");
                }
        );
    }

    public void onLogInBtnClick(View view){
        Intent intent = new Intent(this, MainMenu.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextEmailAddress);
        intent.putExtra("email",editText.getText().toString());
        mStartForResult.launch(intent);
        Log.d("onLogInBtnClick","clicked");
    }
    public void onRegBtnClick(View view){
        Intent intent = new Intent(this, LinearActivity.class);
        startActivity(intent);
    }
}