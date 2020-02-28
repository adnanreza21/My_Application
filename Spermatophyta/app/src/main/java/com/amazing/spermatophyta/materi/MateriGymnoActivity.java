package com.amazing.spermatophyta.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.amazing.spermatophyta.R;
import com.amazing.spermatophyta.contoh.ContohGymnoActivity;

public class MateriGymnoActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_gymno);
        btnnext = (Button) findViewById(R.id.but1);

        btnnext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {

            case R.id.but1:
                i = new Intent(this, ContohGymnoActivity.class);
                startActivity(i);
                break;
        }
    }
}

