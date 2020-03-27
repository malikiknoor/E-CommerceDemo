package com.iknoortech.e_commercedemo.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.iknoortech.e_commercedemo.R;
import com.iknoortech.e_commercedemo.utils.AppConstant;

import java.util.HashMap;
import java.util.Map;

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
    private FirebaseFirestore db;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        edt_email = findViewById(R.id.editText2);
        edt_phone = findViewById(R.id.editText3);
        edt_password = findViewById(R.id.editText4);
        edt_conPass = findViewById(R.id.editText5);
        edt_name = findViewById(R.id.editText7);

        db = FirebaseFirestore.getInstance();
        mAuth = FirebaseAuth.getInstance();
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
            registerUserWithFirebase();
        }
    }

    private void registerUserWithFirebase() {
        showProgressDialog(SignUpActivity.this);
        mAuth.createUserWithEmailAndPassword(edt_email.getText().toString(), edt_password.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        closeProgressDialog();
                        if (task.isSuccessful()) {
                            FirebaseUser user = mAuth.getCurrentUser();
                            registerUser(user);
                        } else {
                            Toast.makeText(SignUpActivity.this, "" + task.getException().getMessage(),
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    private void registerUser(final FirebaseUser fUser) {
        showProgressDialog(SignUpActivity.this);
        Map<String, Object> user = new HashMap<>();
        user.put("userId", fUser.getUid());
        user.put("name", edt_name.getText().toString());
        user.put("image", "");
        user.put("password", edt_password.getText().toString());
        user.put("email", edt_email.getText().toString());
        user.put("phone", edt_phone.getText().toString());
        user.put("token", getFirebaseToken(this));
        user.put("registrationDate", System.currentTimeMillis());

        db.collection(AppConstant.USER_TABLE)
                .document(fUser.getUid())
                .set(user)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        closeProgressDialog();
                        Toast.makeText(SignUpActivity.this, "You have registered successfully", Toast.LENGTH_SHORT).show();
                        setUserLoggedOut(SignUpActivity.this, false);
                        setUserEmail(SignUpActivity.this, edt_email.getText().toString());
                        setUserPhone(SignUpActivity.this, edt_phone.getText().toString());
                        setUserName(SignUpActivity.this, edt_name.getText().toString());
                        setUserId(SignUpActivity.this, fUser.getUid());
                        Intent intent = new Intent(SignUpActivity.this, HomeActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        closeProgressDialog();
                        Toast.makeText(SignUpActivity.this, ""
                                + e.getMessage(), Toast.LENGTH_SHORT).show();
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
