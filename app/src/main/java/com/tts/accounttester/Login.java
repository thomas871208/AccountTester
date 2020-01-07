package com.tts.accounttester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    String account;
    String password;
    EditText edaccount;
    EditText edpassword;
    String checkA;
    String checkP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent intent = getIntent();
        account = intent.getStringExtra("account");
        password = intent.getStringExtra("password");
        edaccount = findViewById(R.id.edaccount);
        edpassword = findViewById(R.id.edpassword);

    }
    public void fast(View view){

        edaccount.setText(account);
        edpassword.setText(password);
        Log.d("hahaha", account);
        Log.d("hahaha", password);

    }
    public void check(){
        checkA = edaccount.getText().toString();
        checkP = edpassword.getText().toString();
        if(checkA.equals(account)  && checkP.equals(password)) {
        Intent intent2 = new Intent(Login.this, Welcome.class);
        startActivity(intent2);
        Log.d("hahaha", "hihi");
         }
          else {

         }
    }
    public  void login(View view){

        check();

    }
}
