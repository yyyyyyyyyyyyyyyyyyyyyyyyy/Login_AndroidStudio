package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button button;
    EditText login;
    String loginspr = "X_xcieslaczekx_X";
    EditText password;
    String passwordspr = "skupicsie";
    TextView zly;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        login = findViewById(R.id.editTextText2);
        password = findViewById(R.id.editTextTextPassword);
        zly = findViewById(R.id.textView2);


        button.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {


                if (password.getText().toString().equals(passwordspr) && login.getText().toString().equals(loginspr)) {


                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("login", login.getText().toString());
                    MainActivity.this.startActivity(intent);

                } else {


                    zly.setText("zły login lub hasło");

                }


            }


        });

    }
}
