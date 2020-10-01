package com.example.bab3konversidesain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class WelcomeSlideCalendar extends Fragment {

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.activity_welcome_slide_calendar, container, false);
        return view;

//    public void clickGetStarted(View view) {
//        Intent i = new Intent(WelcomeSlideCalendar.this, WelcomeSlideSuperHero.class);
//        startActivity(i);
//    }
//
//    public void clickLogin(View view) {
//        Intent i = new Intent(WelcomeSlideCalendar.this, WelcomeBack.class);
//        startActivity(i);
//    }
    }}