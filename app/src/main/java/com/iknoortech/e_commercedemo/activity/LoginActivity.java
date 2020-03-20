package com.iknoortech.e_commercedemo.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.iknoortech.e_commercedemo.R;

import java.util.Objects;

import static com.iknoortech.e_commercedemo.utils.AppUtils.isInternetAvailable;
import static com.iknoortech.e_commercedemo.utils.AppUtils.isValidEmail;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText edt_email, edt_password;
    private static final String TAG = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edt_email = findViewById(R.id.editText);
        edt_password = findViewById(R.id.editText1);

    }

    public void goToForgot(View view) {
        startActivity(new Intent(this, ForgotPasswordActivity.class));
    }

    public void goToRegister(View view) {
        startActivity(new Intent(this, SignUpActivity.class));
    }

    public void facebookLogin(View view) {
        Toast.makeText(this, "Facebook Account Not Configured", Toast.LENGTH_SHORT).show();
    }

    public void finishLogin(View view) {
        finish();
    }

    public void validateLogin(View view) {
        if (edt_email.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter your email id", Toast.LENGTH_SHORT).show();
        } else if (!isValidEmail(edt_email)) {
            Toast.makeText(this, "Please enter a valid email id", Toast.LENGTH_SHORT).show();
        } else if (edt_password.getText().toString().isEmpty()) {
            Toast.makeText(this, "Pelase enter your password", Toast.LENGTH_SHORT).show();
        } else if (edt_password.getText().toString().length() > 6) {
            Toast.makeText(this, "Password should contains 6 charcters", Toast.LENGTH_SHORT).show();
        } else if (!isInternetAvailable(this)) {
            Toast.makeText(this, "Please check your internet connection", Toast.LENGTH_SHORT).show();
        } else {
            loginUser();
        }
    }

    private void loginUser() {

    }

    @Override
    protected void onResume() {
        super.onResume();
        if(!isInternetAvailable(this)){
            Toast.makeText(this, "Please check your internet connection", Toast.LENGTH_SHORT).show();
        }
    }
}
