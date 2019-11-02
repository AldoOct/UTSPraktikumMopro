package com.example.Uhuuy.parapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTravel;
    private ArrayList<Food> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTravel = findViewById(R.id.rv_travel);
        rvTravel.setHasFixedSize(true);

        list.addAll(FoodData.getListData());
        showRecyclerList();


    }

    private void showRecyclerList(){
        rvTravel.setLayoutManager(new LinearLayoutManager(this));
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(list);
        rvTravel.setAdapter(listFoodAdapter);

        listFoodAdapter.setOnItemClickCallback(new ListFoodAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Food data) {
                showSelectedTravel(data);
            }
        });
    }

    private void showSelectedTravel(Food makanan){
        Toast.makeText(this, "Kamu memilih " + makanan.getName(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent (MainActivity.this, DetailActivity.class);
        intent.putExtra("photo", makanan.getPhoto());
        intent.putExtra("nama tempat", makanan.getName());
        intent.putExtra("detail", makanan.getDetail());
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        if (selectedMode == R.id.action_profile) {
            Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(moveIntent);
        }else if(selectedMode == R.id.option_1){
            setAppLocale("in");
        }else if(selectedMode == R.id.option_2){
            setAppLocale("en");
        }else if(selectedMode == R.id.option_3){
            setAppLocale("ja");
        }else if(selectedMode == R.id.option_4){
            setAppLocale("fr");
        }
    }

    private  void setAppLocale(String localeCode){
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1){
            conf.setLocale(new Locale(localeCode.toLowerCase()));
        }else{
            conf.locale = new Locale(localeCode.toLowerCase());
        }
        res.updateConfiguration(conf, dm);
    }
}