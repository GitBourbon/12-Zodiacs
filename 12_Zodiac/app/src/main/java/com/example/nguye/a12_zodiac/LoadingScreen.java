package com.example.nguye.a12_zodiac;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class LoadingScreen extends AppCompatActivity implements View.OnClickListener {
    private TextView txtLoadingScreen;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); // make full screen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);
        initComponent();
        setListener();
    }

    public void initComponent() {
        txtLoadingScreen = findViewById(R.id.txt_loading_screen);
    }

    public void setListener() {
        txtLoadingScreen.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
