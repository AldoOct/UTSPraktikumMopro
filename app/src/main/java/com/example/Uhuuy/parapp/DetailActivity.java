package com.example.Uhuuy.parapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    private static final String TAG = "DetailActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");
        if(getIntent().hasExtra("nama tempat") && getIntent().hasExtra("detail"))
        {
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            int photo = getIntent().getIntExtra("photo", 0);
            String namaTempat = getIntent().getStringExtra("nama tempat");
            String detail = getIntent().getStringExtra("detail");

            setImage(photo, namaTempat, detail);
        }
    }

    private void setImage(int photo, String namaTempat, String detail){
        Log.d(TAG, "setImage: setting to image and name to widgets.");

        TextView nameImage = findViewById(R.id.image_name);
        nameImage.setText(namaTempat);

        TextView nameDetail = findViewById(R.id.image_detail);
        nameDetail.setText(detail);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(photo)
                .into(image);
    }
}
