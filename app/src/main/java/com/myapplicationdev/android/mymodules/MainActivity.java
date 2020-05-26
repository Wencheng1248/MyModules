package com.myapplicationdev.android.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 =findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);


        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,GetIntentModulesInfo.class);
                intent1.putExtra("module1", "Module Code: C346" + "\n" + "Module Name: Android Programming" + "\n"
                        + "Academic Year: 2020" + "\n" + "Semester: 1" + "\n" + "Module Credit: 4" + "\n" + "Venue: W66M");
                startActivity(intent1);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,GetIntentModulesInfo.class);
                intent2.putExtra("module2", "Module Code: C349" + "\n" + "Module Name: iPad Programming" + "\n"
                        + "Academic Year: 2019" + "\n" + "Semester: 1" + "\n" + "Module Credit: 8" + "\n" + "Venue: W63E");
                startActivity(intent2);
            }
        });
    }
}
