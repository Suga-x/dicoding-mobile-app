package com.example.dcodingsubmission;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvBand;
    private ArrayList<Band> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBand = findViewById(R.id.rv_band);
        rvBand.setHasFixedSize(true);

        list.addAll(BandData.getListData());
        showRecycleList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile_user,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        if (selectedMode == R.id.Profile) {
            showProfile();
        }
    }
    private void showProfile(){
        Intent profile = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(profile);
    }
    private void showRecycleList(){
        rvBand.setLayoutManager(new LinearLayoutManager(this));
        ListBandAdapter listBandAdapter = new ListBandAdapter(list);
        rvBand.setAdapter(listBandAdapter);

        listBandAdapter.setOnItemClickCallback( new ListBandAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Band data) {
                showSelectedBand(data);
            }
        });
    }
    private void showSelectedBand(Band band){
        Intent sendData = new Intent(MainActivity.this , DetailActivity.class);
        sendData.putExtra(DetailActivity.EXTRA_NAMA, band.getNamaBand());
        sendData.putExtra(DetailActivity.EXTRA_DESC, band.getDescBand());
        sendData.putExtra(DetailActivity.EXTRA_IMG, band.getFotoPoster());
        startActivity(sendData);
    }
}