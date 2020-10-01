package com.example.bab3konversidesain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WelcomeSlideSuperHero extends Fragment {

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.activity_welcome_slide_super_hero, container, false);
        return view;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_welcome_slide_super_hero);
//    }
//    public void clickGetStarted(View view) {
//        Intent i = new Intent(WelcomeSlideSuperHero.this, WelcomeSlideAssign.class);
//        startActivity(i);
//    }
//
//    public void clickLogin(View view) {
//        Intent i = new Intent(WelcomeSlideSuperHero.this, WelcomeBack.class);
//        startActivity(i);
//    }
    }
}