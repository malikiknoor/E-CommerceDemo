package com.iknoortech.e_commercedemo.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.iknoortech.e_commercedemo.R;
import com.iknoortech.e_commercedemo.utils.AppConstant;

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
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edt_email = findViewById(R.id.editText);
        edt_password = findViewById(R.id.editText1);
        mAuth = FirebaseAuth.getInstance();
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
        } else if (edt_password.getText().toString().length() < 6) {
            Toast.makeText(this, "Password should contains 6 charcters", Toast.LENGTH_SHORT).show();
        } else if (!isInternetAvailable(this)) {
            Toast.makeText(this, "Please check your internet connection", Toast.LENGTH_SHORT).show();
        } else {
            loginUser();
        }
    }

    private void loginUser() {
        showProgressDialog(this);
        mAuth.signInWithEmailAndPassword(edt_email.getText().toString(),
                edt_password.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        closeProgressDialog();
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            FirebaseUser user = mAuth.getCurrentUser();
                            getUserDetails(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(LoginActivity.this, "Authentication failed: " +
                                            task.getException().getMessage(),
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    private void getUserDetails(FirebaseUser user) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        final DocumentReference docRef = db.collection(AppConstant.USER_TABLE)
                .document(user.getUid());
        showProgressDialog(this);
        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                closeProgressDialog();
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    setUserLoggedOut(LoginActivity.this, false);
                    setUserEmail(LoginActivity.this, document.getString("email"));
                    setUserPhone(LoginActivity.this, document.getString("phone"));
                    setUserName(LoginActivity.this, document.getString("name"));
                    setUserId(LoginActivity.this, document.getString("userId"));
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, ""
                            + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
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
