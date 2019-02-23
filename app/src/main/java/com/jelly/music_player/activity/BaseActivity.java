package com.jelly.music_player.activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public abstract int setLayout();
    public abstract void initUi();
    public abstract void initData();
    public abstract void initEventListener();
}
