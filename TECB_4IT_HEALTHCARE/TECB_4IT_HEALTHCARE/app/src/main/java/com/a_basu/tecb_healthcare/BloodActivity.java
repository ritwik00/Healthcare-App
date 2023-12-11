package com.a_basu.tecb_healthcare;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class BloodActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInatanceState){
        super.onCreate(savedInatanceState);
        setContentView(R.layout.activity_blood);
    }





    public void browser1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nbtc.naco.gov.in/"));
        startActivity(browserIntent);
    }
}


