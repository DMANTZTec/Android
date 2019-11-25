package com.example.login;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText username, password;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.e1);
        password= (EditText) findViewById(R.id.e2);
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);
    }
    public void onClick(View v){
        String uname = username.getText().toString();
        String pass = password.getText().toString();
        Toast.makeText(this,uname + pass, Toast.LENGTH_LONG).show();
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("userName",uname);
        startActivity(i);




    /* public void  btn_click(View v)
     {
        username = (EditText) findViewById(R.id.e1);
        password= (EditText) findViewById(R.id.e2);
        String uname = username.getText().toString();
        String pass = password.getText().toString();
        Toast.makeText(this,uname + pass, Toast.LENGTH_LONG).show();*/





     }
}
