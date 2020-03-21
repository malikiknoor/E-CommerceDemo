package com.iknoortech.e_commercedemo.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.iknoortech.e_commercedemo.R;
import com.iknoortech.e_commercedemo.connection.ApiInterface;
import com.iknoortech.e_commercedemo.connection.BaseUrl;
import com.iknoortech.e_commercedemo.model.login.LoginPojo;

import org.json.JSONException;
import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.iknoortech.e_commercedemo.utils.AppPrefrences.getFirebaseToken;
import static com.iknoortech.e_commercedemo.utils.AppPrefrences.setUserEmail;
import static com.iknoortech.e_commercedemo.utils.AppPrefrences.setUserId;
import static com.iknoortech.e_commercedemo.utils.AppPrefrences.setUserLoggedOut;
import static com.iknoortech.e_commercedemo.utils.AppPrefrences.setUserName;
import static com.iknoortech.e_commercedemo.utils.AppPrefrences.setUserPhone;
import static com.iknoortech.e_commercedemo.utils.AppUtils.closeProgressDialog;
import static com.iknoortech.e_commercedemo.utils.AppUtils.isInternetAvailable;
import static com.iknoortech.e_commercedemo.utils.AppUtils.isValidEmail;
import static com.iknoortech.e_commercedemo.utils.AppUtils.openDateDialog;
import static com.iknoortech.e_commercedemo.utils.AppUtils.showProgressDialog;

public class SignUpActivity extends AppCompatActivity {

    private AppCompatEditText edt_name, edt_email, edt_phone, edt_password, edt_conPass;
    private ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        edt_email = findViewById(R.id.editText2);
        edt_phone = findViewById(R.id.editText3);
        edt_password = findViewById(R.id.editText4);
        edt_conPass = findViewById(R.id.editText5);
        edt_name = findViewById(R.id.editText7);
        apiInterface = BaseUrl.getRetrofitInstance().create(ApiInterface.class);
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
            JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put("Name", edt_name.getText().toString());
                jsonObject.put("Email", edt_email.getText().toString());
                jsonObject.put("Mobile", edt_phone.getText().toString());
                jsonObject.put("Password", edt_password.getText().toString());
                jsonObject.put("SocialType", "");
                jsonObject.put("SocialID", "");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            registerUser(jsonObject);
        }
    }

    private void registerUser(JSONObject jsonObject) {
        showProgressDialog(this);
        apiInterface.registerUser(jsonObject).enqueue(new Callback<LoginPojo>() {
            @Override
            public void onResponse(Call<LoginPojo> call, Response<LoginPojo> response) {
                closeProgressDialog();
                try {
                    if (response.body() == null) {
                        Toast.makeText(SignUpActivity.this, "Internal Server Error", Toast.LENGTH_SHORT).show();
                    } else {
                        if (response.body().getStatus_code().equals("1")) {
                                loginUser();
                        } else {
                            Toast.makeText(SignUpActivity.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                } catch (Exception e) {
                    Toast.makeText(SignUpActivity.this, "Ooops! Something went wrong, Please try again", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LoginPojo> call, Throwable t) {
                closeProgressDialog();
                Toast.makeText(SignUpActivity.this, "" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loginUser() {
        showProgressDialog(this);
        JSONObject jsonData = new JSONObject();
        try {
            jsonData.put("Email", edt_phone.getText().toString());
            jsonData.put("Password", edt_password.getText().toString());
            jsonData.put("TokenNo", getFirebaseToken(SignUpActivity.this));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        apiInterface.loginUser(jsonData).enqueue(new Callback<LoginPojo>() {
            @Override
            public void onResponse(Call<LoginPojo> call, Response<LoginPojo> response) {
                closeProgressDialog();
                try {
                    if (response.body().getStatus_code().equals("1")) {
                        Toast.makeText(SignUpActivity.this, "You have registered successfully", Toast.LENGTH_SHORT).show();
                        setUserLoggedOut(SignUpActivity.this, false);
                        setUserId(SignUpActivity.this, response.body().getId());
                        setUserName(SignUpActivity.this, response.body().getName());
                        setUserEmail(SignUpActivity.this, response.body().getEmail());
                        setUserPhone(SignUpActivity.this, response.body().getMobile());
                        Intent intent = new Intent(SignUpActivity.this, HomeActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(SignUpActivity.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(SignUpActivity.this, "Ooops! something went wrong, Please try again", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LoginPojo> call, Throwable t) {
                closeProgressDialog();
                Toast.makeText(SignUpActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(!isInternetAvailable(this)){
            Toast.makeText(this, "Please check your internet connection", Toast.LENGTH_SHORT).show();
        }
    }
}
