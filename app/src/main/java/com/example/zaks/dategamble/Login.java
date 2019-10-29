package com.example.zaks.dategamble;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by ZAKS on 30/10/2019.
 */

public class Login extends AppCompatActivity {
    private Button loginButton;
    private TextView signUp;
    private TextView debugText;
    private EditText emailInput, passwordInput;

    private String userEmail,password;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        onStart();
    }

    protected void onStart() {
        super.onStart();
        debugText = findViewById(R.id.textView4);
        emailInput = findViewById(R.id.email_input);
        passwordInput = findViewById(R.id.password_input);

        loginButton = findViewById(R.id.buttonLogin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                userEmail = emailInput.getText().toString();
                password =  passwordInput.getText().toString();
                debugText.setText("got: "+ userEmail + " " + password);
            }
        });

        signUp = findViewById(R.id.textSignUpLink);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                debugText.setText("sign up text Clicked");
            }
        });
    }
}
