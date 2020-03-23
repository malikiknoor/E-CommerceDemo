package com.iknoortech.e_commercedemo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.iknoortech.e_commercedemo.R;

import org.json.JSONException;
import org.json.JSONObject;

import static com.iknoortech.e_commercedemo.utils.AppPrefrences.getFirebaseToken;
import static com.iknoortech.e_commercedemo.utils.AppPrefrences.setUserEmail;
import static com.iknoortech.e_commercedemo.utils.AppPrefrences.setUserId;
import static com.iknoortech.e_commercedemo.utils.AppPrefrences.setUserLoggedOut;
import static com.iknoortech.e_commercedemo.utils.AppPrefrences.setUserName;
import static com.iknoortech.e_commercedemo.utils.AppPrefrences.setUserPhone;
import static com.iknoortech.e_commercedemo.utils.AppUtils.closeProgressDialog;
import static com.iknoortech.e_commercedemo.utils.AppUtils.isInternetAvailable;
import static com.iknoortech.e_commercedemo.utils.AppUtils.isValidEmail;
import static com.iknoortech.e_commercedemo.utils.AppUtils.showProgressDialog;

public class SignUpActivity extends AppCompatActivity {

    private AppCompatEditText edt_name, edt_email, edt_phone, edt_password, edt_conPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        edt_email = findViewById(R.id.editText2);
        edt_phone = findViewById(R.id.editText3);
        edt_password = findViewById(R.id.editText4);
        edt_conPass = findViewById(R.id.editText5);
        edt_name = findViewById(R.id.editText7);
    }

    public void goToLogin(View view) {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

    public void finishRegister(View view) {
        finish();
    }

    public void validateRegister(View view) {
        if (edt_name.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show();
        } else if (edt_email.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter your email id", Toast.LENGTH_SHORT).show();
        } else if (!isValidEmail(edt_email)) {
            Toast.makeText(this, "Please enter a valid email id", Toast.LENGTH_SHORT).show();
        } else if (edt_phone.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter your mobile number", Toast.LENGTH_SHORT).show();
        } else if (edt_phone.getText().toString().length() < 10) {
            Toast.makeText(this, "Please enter a valid mobile number", Toast.LENGTH_SHORT).show();
        } else if (edt_password.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show();
        } else if (edt_password.getText().toString().length() > 6) {
            Toast.makeText(this, "Password should contains 6 charcters", Toast.LENGTH_SHORT).show();
        } else if (!edt_password.getText().toString().equals(edt_conPass.getText().toString())) {
            Toast.makeText(this, "Password and Confirm password should be same", Toast.LENGTH_SHORT).show();
        } else if (!isInternetAvailable(this)) {
            Toast.makeText(this, "Please check your internet connection", Toast.LENGTH_SHORT).show();
        } else {
            registerUser();
        }
    }

    private void registerUser() {
        Toast.makeText(SignUpActivity.this, "You have registered successfully", Toast.LENGTH_SHORT).show();
        setUserLoggedOut(SignUpActivity.this, false);
        Intent intent = new Intent(SignUpActivity.this, HomeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!isInternetAvailable(this)) {
            Toast.makeText(this, "Please check your internet connection", Toast.LENGTH_SHORT).show();
        }
    }
}
