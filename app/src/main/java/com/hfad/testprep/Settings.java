package com.hfad.testprep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
            getSupportFragmentManager().beginTransaction().add(R.id.settingsFragmentContainer, new SettingsFragment()).commit();
    }
}
