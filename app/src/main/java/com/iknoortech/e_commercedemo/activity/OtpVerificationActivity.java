package com.iknoortech.e_commercedemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.iknoortech.e_commercedemo.R;
import com.iknoortech.e_commercedemo.utils.AppUtils;

import static com.iknoortech.e_commercedemo.utils.AppUtils.isInternetAvailable;
import static com.iknoortech.e_commercedemo.utils.AppUtils.openNumberKeyboard;

public class OtpVerificationActivity extends AppCompatActivity {

    private EditText edt_otp_one, edt_otp_two, edt_otp_three, edt_otp_four;
    private TextView tv_timer;
    private OtpTimer otpTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);

        edt_otp_one = findViewById(R.id.edt_otp_one);
        edt_otp_two = findViewById(R.id.edt_otp_two);
        edt_otp_three = findViewById(R.id.edt_otp_three);
        edt_otp_four = findViewById(R.id.edt_otp_four);
        tv_timer = findViewById(R.id.textView20);

        edt_otp_one.addTextChangedListener(new GenericTextWatcher(edt_otp_one));
        edt_otp_two.addTextChangedListener(new GenericTextWatcher(edt_otp_two));
        edt_otp_three.addTextChangedListener(new GenericTextWatcher(edt_otp_three));
        edt_otp_four.addTextChangedListener(new GenericTextWatcher(edt_otp_four));
        startTimer();
        tv_timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTimer();
            }
        });

        openNumberKeyboard(edt_otp_one, this);
    }

    private void startTimer() {
        tv_timer.setTextColor(Color.parseColor("#000000"));
        tv_timer.setClickable(false);
        tv_timer.setEnabled(false);
        otpTimer = new OtpTimer(120000, 1000);
        otpTimer.start();
    }

    private void stopTimer() {
        if (otpTimer != null) {
            otpTimer.cancel();
        }
    }

    public void verifyOtp(View view) {
        if (isInternetAvailable(this)) {
            if (edt_otp_one.getText().toString().isEmpty() || edt_otp_two.getText().toString().isEmpty() ||
                    edt_otp_three.getText().toString().isEmpty() || edt_otp_four.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter valid OTP", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = null;
                intent = new Intent(this, ResetPasswordActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        } else {
            Toast.makeText(this, "Please check your internet connection", Toast.LENGTH_SHORT).show();
        }
    }

    public void optBackButton(View view) {
        onBackPressed();
    }

    class OtpTimer extends CountDownTimer {
        public OtpTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long l) {
            tv_timer.setText(getDisplayValue(l));
        }

        @Override
        public void onFinish() {
            tv_timer.setClickable(true);
            tv_timer.setEnabled(true);
            tv_timer.setText("Resend a new code.");
            tv_timer.setTextColor(Color.parseColor("#fe9353"));
        }
    }

    @SuppressLint("NewApi")
    public String getDisplayValue(long millis) {
        String minutes = String.valueOf((millis / 1000) / 60);
        String seconds = String.valueOf((int) ((millis / 1000) % 60));
        if (minutes.length() == 1) {
            minutes = "0" + minutes;
        }

        if (seconds.length() == 1) {
            seconds = "0" + seconds;
        }
        return minutes + " : " + seconds;
    }

    public class GenericTextWatcher implements TextWatcher {
        private View view;

        private GenericTextWatcher(View view) {
            this.view = view;
        }

        @Override
        public void afterTextChanged(Editable editable) {
            // TODO Auto-generated method stub
            String text = editable.toString();
            switch (view.getId()) {
                case R.id.edt_otp_one:
                    if (text.length() == 1) {
                        edt_otp_two.requestFocus();
                    }
                    break;
                case R.id.edt_otp_two:
                    if (text.length() == 1) {
                        edt_otp_three.requestFocus();
                    } else if (text.length() == 0) {
                        edt_otp_one.requestFocus();
                    }
                    break;
                case R.id.edt_otp_three:
                    if (text.length() == 1) {
                        edt_otp_four.requestFocus();
                    } else if (text.length() == 0) {
                        edt_otp_two.requestFocus();
                    }
                    break;
                case R.id.edt_otp_four:
                    if (text.length() == 0) {
                        edt_otp_three.requestFocus();
                    }
                    break;
            }
        }

        @Override
        public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
            // TODO Auto-generated method stub
        }

        @Override
        public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
        }
    }

    @Override
    protected void onDestroy() {
        stopTimer();
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!isInternetAvailable(this)) {
            Toast.makeText(this, "Please check your internet connection", Toast.LENGTH_SHORT).show();
        }
    }
}
