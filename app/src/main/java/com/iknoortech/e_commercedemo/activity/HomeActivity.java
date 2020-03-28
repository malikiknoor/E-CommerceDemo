package com.iknoortech.e_commercedemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.iknoortech.e_commercedemo.R;
import com.iknoortech.e_commercedemo.utils.AppConstant;
import com.iknoortech.e_commercedemo.utils.AppPrefrences;
import com.iknoortech.e_commercedemo.utils.AppUtils;

import java.util.HashMap;
import java.util.Map;

import static com.iknoortech.e_commercedemo.utils.AppPrefrences.clearAllPreferences;
import static com.iknoortech.e_commercedemo.utils.AppPrefrences.getFirebaseToken;
import static com.iknoortech.e_commercedemo.utils.AppPrefrences.getUserId;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void openMainMenu(View view) {
        final PopupMenu menu = new PopupMenu(this, view);
        menu.getMenu().add("Profile");
        menu.getMenu().add("Logout");
        menu.show();

        menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getTitle().equals("Logout")) {
                    clearFirebaseToken(getUserId(HomeActivity.this));
                    AppPrefrences.clearAllPreferences(HomeActivity.this);
                    AppPrefrences.setUserLoggedOut(HomeActivity.this, true);
                    AppUtils.getNewFirebaseToken(HomeActivity.this);
                    Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();
                }
                return false;
            }
        });
    }

    private void clearFirebaseToken(String userId) {
        Map<String, Object> user = new HashMap<>();
        user.put("token", "");
        user.put("isLogin", "No");
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection(AppConstant.USER_TABLE)
                .document(userId)
                .update(user);
    }
}
