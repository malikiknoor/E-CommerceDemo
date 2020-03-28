package com.iknoortech.e_commercedemo.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.iknoortech.e_commercedemo.R;
import com.iknoortech.e_commercedemo.activity.OtpVerificationActivity;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.iknoortech.e_commercedemo.utils.AppPrefrences.setFirebaseToken;

public class AppUtils {

    private static Dialog builder;

    public static void openDateDialog(Activity activity, final TextView textView, boolean isOpenCurrentDate) {
        int yy = 1990, mm = 0, dd = 1;

        if (isOpenCurrentDate) {
            final Calendar calendar = Calendar.getInstance();
            yy = calendar.get(Calendar.YEAR);
            mm = calendar.get(Calendar.MONTH);
            dd = calendar.get(Calendar.DAY_OF_MONTH);
        }
        DatePickerDialog datePicker = new DatePickerDialog(activity, R.style.DatePickerTheme,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        textView.setText("");
                        String month = String.valueOf(monthOfYear + 1);
                        String day = String.valueOf(dayOfMonth);
                        if (month.length() == 1) {
                            month = "0" + month;
                        }

                        if (day.length() == 1) {
                            day = "0" + day;
                        }

                        String date = day + "-" + month + "-" + year;
                        textView.setText(date);
                    }
                }, yy, mm, dd);
        datePicker.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePicker.show();
    }

    public static boolean isValidEmail(EditText argEditText) {

        try {
            Pattern pattern = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            Matcher matcher = pattern.matcher(argEditText.getText());
            return matcher.matches();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isInternetAvailable(Context context) {
        ConnectivityManager mManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo mNetworkInfo = mManager.getActiveNetworkInfo();
        return (mNetworkInfo != null) && (mNetworkInfo.isConnected());
    }

    public static void getNewFirebaseToken(final Context context) {
        FirebaseInstanceId.getInstance().getInstanceId()
                .addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
                    @Override
                    public void onComplete(@NonNull Task<InstanceIdResult> task) {
                        if (task.isSuccessful()) {
                            setFirebaseToken(context, task.getResult().getToken());
                        } else {
                            getNewFirebaseToken(context);
                        }
                    }
                });
    }

    public static void showProgressDialog(Activity activity) {
        builder = new Dialog(activity);
        builder.setContentView(R.layout.wait_dialog);
        builder.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        builder.setCancelable(false);
        builder.show();
    }

    public static void closeProgressDialog() {
        if (builder != null) {
            builder.dismiss();
        }
    }

    public static void openNumberKeyboard(EditText editText, Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput((editText), InputMethodManager.SHOW_IMPLICIT);
    }

    public static void openCodeSentDialog(final Activity activity, final String screen) {
        final Dialog dialog = new Dialog(activity);
        dialog.setCanceledOnTouchOutside(false);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.setContentView(R.layout.dialog_code_sent);

        Button btn_done = dialog.findViewById(R.id.btn_dialogDone);
        TextView tv_heading = dialog.findViewById(R.id.textView18);
        TextView tv_small = dialog.findViewById(R.id.textView19);

        if (screen.equalsIgnoreCase("MobileVerify")) {
            tv_heading.setText(R.string.mobile_verify_popup_text1);
            tv_small.setText(R.string.mobile_verify_popup_text2);
        } else {
            tv_heading.setText(R.string.forgot_password_popup_text1);
            tv_small.setText(R.string.forgot_password_popup_text2);
        }

        btn_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                activity.finish();
            }
        });

        dialog.show();
    }
}
