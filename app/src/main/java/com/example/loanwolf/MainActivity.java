package com.example.loanwolf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    private TextView info1;
    private TextView info2;
    private TextView title;
    private Button login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email = findViewById(R.id.etEmail);
        Password = findViewById(R.id.etPassword);
        info1 = findViewById(R.id.info1);
        info2 = findViewById(R.id.info2);
        title = findViewById(R.id.title);
        login = findViewById(R.id.login);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Email.getText().toString(), Password.getText().toString());
            }
        });



    }

    private void validate(String userEmail, String userPassword){
        if (userEmail.equals("gabi-105@hotmail.com") && userPassword.equals("gabi") ){

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }

    }


}
