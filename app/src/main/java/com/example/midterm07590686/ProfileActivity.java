package com.example.midterm07590686;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        /*Intent intent = getIntent();
        String username = intent.getStringExtra("user");
        if(username.equals("aaa")){
            Toast.makeText(ProfileActivity.this,R.string.welcome+" "+username,Toast.LENGTH_SHORT).show();
            //findViewById(R.id.textviewGoes).set;
        }
        //getIntent().getExtras();
        */
    }
}
