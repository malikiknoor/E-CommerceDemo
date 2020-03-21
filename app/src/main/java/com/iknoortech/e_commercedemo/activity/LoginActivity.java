package com.iknoortech.e_commercedemo.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
import com.iknoortech.e_commercedemo.connection.ApiInterface;
import com.iknoortech.e_commercedemo.connection.BaseUrl;
import com.iknoortech.e_commercedemo.model.login.LoginPojo;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

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
        showProgressDialog(this);
        JSONObject jsonData = new JSONObject();
        try {
            jsonData.put("Email", edt_email.getText().toString());
            jsonData.put("Password", edt_password.getText().toString());
            jsonData.put("TokenNo", getFirebaseToken(LoginActivity.this));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        ApiInterface apiInterface = BaseUrl.getRetrofitInstance().create(ApiInterface.class);
        apiInterface.loginUser(jsonData).enqueue(new Callback<LoginPojo>() {
            @Override
            public void onResponse(Call<LoginPojo> call, Response<LoginPojo> response) {
                closeProgressDialog();
                try {
                    if (response.body().getStatus_code().equals("1")) {
                        setUserLoggedOut(LoginActivity.this, false);
                        setUserId(LoginActivity.this, response.body().getId());
                        setUserName(LoginActivity.this, response.body().getName());
                        setUserEmail(LoginActivity.this, response.body().getEmail());
                        setUserPhone(LoginActivity.this, response.body().getMobile());
                        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(LoginActivity.this, "" + response.body().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(LoginActivity.this, "Ooops! something went wrong, Please try again", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LoginPojo> call, Throwable t) {
                closeProgressDialog();
                Toast.makeText(LoginActivity.this, "Ooops! something went wrong from server, Please try again", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!isInternetAvailable(this)) {
            Toast.makeText(this, "Please check your internet connection", Toast.LENGTH_SHORT).show();
        }
    }
}
