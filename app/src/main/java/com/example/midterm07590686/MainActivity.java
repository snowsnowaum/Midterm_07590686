package com.example.midterm07590686;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.midterm07590686.Model.Auth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.loginButt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userEditText = findViewById(R.id.editUser);
                EditText passwordEditText = findViewById(R.id.editPass);
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                Auth auth =new Auth(userEditText.getText().toString(),passwordEditText.getText().toString());
                if(auth.checkU1()){
                    intent.putExtra("user", "aaa");
                    startActivity(intent);
                    finish();
                }
                else if(auth.checkU2()){
                    intent.putExtra("user", "bbb");
                    startActivity(intent);
                    finish();
                }
                else{
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this );
                    dialog.setTitle(R.string.invalid);
                    dialog.setMessage(R.string.invalid);
                    // button have 3 type : setPositive, setNegative ,setNeutral
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            // code that run when user fail to login
                            //todo:

                        }
                    });
                    dialog.show();
                }
            }
        });
    }
}
