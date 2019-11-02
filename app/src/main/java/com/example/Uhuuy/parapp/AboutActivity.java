package com.example.Uhuuy.parapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnDialPhone, btnSosmed, btnLokasi;
    String googleMap = "com.google.android.apps.maps";
    Uri gmmIntentUri;
    Intent mapIntent;
    String lokasi_saya = "Indonesia";

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        btnDialPhone = findViewById(R.id.btn_move_hp);
        btnDialPhone.setOnClickListener(this);

        btnSosmed = findViewById(R.id.btn_move_sosmed);
        btnSosmed.setOnClickListener(this);

        btnLokasi = findViewById(R.id.btn_move_address);
        btnLokasi.setOnClickListener(this);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle(getResources().getString(R.string.profil));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_hp:
                String phoneNumber = "089522767180";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;

            case R.id.btn_move_sosmed:
                String url = "https://www.instagram.com/muhamadz_azie" ;
                Intent openSosmedIntent = new Intent(Intent.ACTION_VIEW);
                openSosmedIntent.setData(Uri.parse(url));
                startActivity(openSosmedIntent);
                break;

            case R.id.btn_move_address:
                gmmIntentUri = Uri.parse("google.navigation:q=" + lokasi_saya);
                mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage(googleMap);

                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(AboutActivity.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}