package com.example.caps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = (Button) findViewById(R.id.start);
        Button login = (Button) findViewById(R.id.login);


        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent auth = new Intent(MainActivity.this, AuthActivity.class);
                MainActivity.this.startActivity(auth);
            }
        });

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent login = new Intent(MainActivity.this, LoginActivity.class);
                MainActivity.this.startActivity(login);
            }
        });
        
    }
}