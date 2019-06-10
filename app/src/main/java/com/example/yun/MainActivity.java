package com.example.yun;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.yun.Fragment.News;
import com.example.yun.Fragment.Services;
import com.example.yun.Fragment.User;

public class MainActivity extends AppCompatActivity {

    private TextView TV_poi;
    private TextView TV_user;
    private TextView TV_deal;

    private News fragment_news;
    private Services fragment_services;
    private User fragment_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }


        //实例化Fragment
        fragment_news = new News();
        fragment_user = new User();
        fragment_services = new Services();




        getSupportFragmentManager().beginTransaction().add(R.id.Fl_main,fragment_news).commitAllowingStateLoss();



        TV_deal = findViewById(R.id.txt_deal);
        TV_deal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                getSupportFragmentManager().beginTransaction().replace(R.id.Fl_main, fragment_news).commitAllowingStateLoss();
            }
        });


        TV_poi = findViewById(R.id.txt_poi);
        TV_poi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,FriendActivity.class);
//
                getSupportFragmentManager().beginTransaction().replace(R.id.Fl_main, fragment_services).commitAllowingStateLoss();
            }
        });

        TV_user = findViewById(R.id.txt_user);
        TV_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,UserActivity.class);
//                startActivity(intent);

                getSupportFragmentManager().beginTransaction().replace(R.id.Fl_main, fragment_user).commitAllowingStateLoss();
            }
        });

    }

}
