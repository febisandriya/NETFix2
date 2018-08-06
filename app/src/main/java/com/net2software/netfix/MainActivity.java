package com.net2software.netfix;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.net2software.netfix.utils.BottomNavigationViewHelper;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Context mContex = MainActivity.this;
    private static final int ACTIVITY_NUM = 2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.d(TAG,"oncreate: starting");
            setupBottomNavigationView();

        }

        private void setupBottomNavigationView(){
            Log.d(TAG, "setupBottomNavigationView: setting up ButtonNavigationView");
            BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx)findViewById(R.id.bottom_view_bar);
            BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
            BottomNavigationViewHelper.enableNavigation(mContex,bottomNavigationViewEx);
            Menu menu = bottomNavigationViewEx.getMenu();
            MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
            menuItem.setChecked(true);
        }


    }