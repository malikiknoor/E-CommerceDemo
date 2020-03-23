package com.iknoortech.e_commercedemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.iknoortech.e_commercedemo.R;

public class ResetPasswordActivity extends AppCompatActivity {

    private EditText edtNewPass, edtConPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        edtNewPass = findViewById(R.id.editText8);
        edtConPass = findViewById(R.id.editText9);
    }

    public void finishReset(View view) {
        finish();
    }

    public void validateReset(View view) {
        if (edtNewPass.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter new password", Toast.LENGTH_SHORT).show();
        } else if (!edtNewPass.getText().toString().equals(edtConPass.getText().toString())) {
            Toast.makeText(this, "New Password and Confirm Password should be same", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Password is reset successfully", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(ResetPasswordActivity.this, LoginActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        }
    }
}
