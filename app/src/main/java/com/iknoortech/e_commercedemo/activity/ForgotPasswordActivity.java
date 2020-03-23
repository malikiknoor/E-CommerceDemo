package com.iknoortech.e_commercedemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.iknoortech.e_commercedemo.R;
import com.iknoortech.e_commercedemo.utils.AppUtils;

import static com.iknoortech.e_commercedemo.utils.AppUtils.openCodeSentDialog;

public class ForgotPasswordActivity extends AppCompatActivity {

    private TextInputEditText edt_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        edt_email = findViewById(R.id.editText6);
    }

    public void finishForgot(View view) {
        finish();
    }

    public void validateForgot(View view) {
        if (edt_email.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter your registered email id", Toast.LENGTH_SHORT).show();
        } else if (!AppUtils.isValidEmail(edt_email)) {
            Toast.makeText(this, "Please enter a valid email id", Toast.LENGTH_SHORT).show();
        } else if (!AppUtils.isInternetAvailable(this)) {
            Toast.makeText(this, "Please check your internet connection", Toast.LENGTH_SHORT).show();
        } else {
            openCodeSentDialog(this, "ForgotPassword");
        }
    }
}
