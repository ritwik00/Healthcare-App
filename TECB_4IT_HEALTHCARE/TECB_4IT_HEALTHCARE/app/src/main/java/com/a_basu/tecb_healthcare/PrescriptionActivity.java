package com.a_basu.tecb_healthcare;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PrescriptionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInatanceState){
        super.onCreate(savedInatanceState);
        setContentView(R.layout.activity_prescription);
    }
    public void browser3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.apollo247.com/specialties"));
        startActivity(browserIntent);
    }
}



