package com.myapplicationdev.android.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GetIntentModulesInfo extends AppCompatActivity {
TextView tvInfo ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_intent_modules_info);
        tvInfo = findViewById(R.id.textView);
        Intent intentInfo = getIntent();
        String module1 = intentInfo.getStringExtra("module1");
        String module2= intentInfo.getStringExtra("module2");
        tvInfo.setText(module1);
        tvInfo.setText(module2);

    }
}
