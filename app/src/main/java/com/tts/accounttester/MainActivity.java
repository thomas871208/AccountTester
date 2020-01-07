package com.tts.accounttester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edaccount;
    EditText edpassword;
    EditText edname;
    String account;
    String password;
    String name;
    SharedPreferences pres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edaccount = findViewById(R.id.edaccount);
        edpassword = findViewById(R.id.edpassword);
        edname = findViewById(R.id.edname);

    }
    public void ok (View view) {
        account = edaccount.getText().toString();
        password = edpassword.getText().toString();
        name = edname.getText().toString();
        pres = getSharedPreferences("example", MODE_PRIVATE);
        pres.edit()
                .putString("account", account)
                .putString("password", password)
                .putString("name", name)
                .commit();
        Intent intent = new Intent(MainActivity.this, Login.class);
        intent.putExtra("account",account);
        intent.putExtra("password",password);
        startActivity(intent);
    }
}
