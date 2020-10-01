package com.example.bab3konversidesain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Welcome_Fragment extends AppCompatActivity {

    View view;
    ImageView btnwelcome1,btnwelcome2,btnwelcome3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        btnwelcome1 = (ImageView) findViewById(R.id.btnwelcome1);
        btnwelcome2 = (ImageView) findViewById(R.id.btnwelcome2);
        btnwelcome3 = (ImageView) findViewById(R.id.btnwelcome3);

        btnwelcome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new WelcomeSlideCalendar());
            }
        });

        btnwelcome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new WelcomeSlideAssign());
            }
        });
        btnwelcome3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new WelcomeSlideSuperHero());
            }
        });
    }

    private void loadFragment (androidx.fragment.app.Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout, fragment);
        fragmentTransaction.commit();
    }

//
    public void clickLogin(View view) {
        Intent i = new Intent(Welcome_Fragment.this, WelcomeBack.class);
        startActivity(i);
    }
}
