package com.example.android.mlkitbaseapis;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class MLKitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
