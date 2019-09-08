package com.example.midterm07590686;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        Intent intent = getIntent();
        String username = intent.getStringExtra("user");

        if(username.equals("aaa")){
            Toast.makeText(ProfileActivity.this,R.string.welcome+" "+"Wittawin Kultummayotin",Toast.LENGTH_SHORT).show();
            TextView setGoes = findViewById(R.id.textviewGoes);
            TextView setName = findViewById(R.id.textViewName);
            TextView setLives = findViewById(R.id.textviewLives);
            TextView setFrom = findViewById(R.id.textviewFrom);
            setName.setText(R.string.wittawin_kultummayotin);
            setGoes.setText(R.string.rajabopit);
            setLives.setText(R.string.bangkok);
            setGoes.setText(R.string.bangkok);

        }
        else{
            Toast.makeText(ProfileActivity.this,R.string.welcome+" "+"Promlert Lovichit",Toast.LENGTH_SHORT).show();
            TextView setGoes = findViewById(R.id.textviewGoes);
            TextView setName = findViewById(R.id.textViewName);
            TextView setLives = findViewById(R.id.textviewLives);
            TextView setFrom = findViewById(R.id.textviewFrom);
            setName.setText("Promlert Lovichit");
            setGoes.setText("สวนกุหลาบวิทยาลัย");
            setLives.setText(R.string.bangkok);
            setFrom.setText(R.string.bangkok);

        }
        //getIntent().getExtras();

    }
}
