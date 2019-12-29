
package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        language = findViewById(R.id.language);
        language.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

            if(v.getId()==R.id.language){
                Intent intent = new Intent (Settings.ACTION_LOCALE_SETTINGS);
                startActivity(intent);
            }
    }
}
