package com.iknoortech.e_commercedemo.activity.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import com.iknoortech.e_commercedemo.R;
import com.iknoortech.e_commercedemo.activity.MainActivity;
import com.iknoortech.e_commercedemo.utils.AppPrefrences;

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
                    AppPrefrences.clearAllPreferences(HomeActivity.this);
                    AppPrefrences.setUserLoggedOut(HomeActivity.this, true);
                    Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();
                }
                return false;
            }
        });
    }
}
