package com.thinking.submission;

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

    String title = "Kelas Dicoding";
    private RecyclerView rvKelas;
    private ArrayList<Kelas> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvKelas = (RecyclerView) findViewById(R.id.rv_kelas);
        rvKelas.setHasFixedSize(true);

        list.addAll(KelasData.getListData());
        showRecyclerList();


    }

    private void showRecyclerList() {
        rvKelas.setLayoutManager(new LinearLayoutManager(this));
        ListKelasAdapter listHeroAdapter = new ListKelasAdapter(list);
        rvKelas.setAdapter(listHeroAdapter);

        listHeroAdapter.setOnItemClickCallback(new ListKelasAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Kelas data) {
                showSelectedHero(data);
            }
        });
    }

    private void showSelectedHero(Kelas kelas) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_NAMA, kelas.getName());
        intent.putExtra(DetailActivity.EXTRA_DETAIL, kelas.getDetail());
        intent.putExtra(DetailActivity.EXTRA_IMAGE, kelas.getPhoto());
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        startActivity(new Intent(MainActivity.this, AboutActivity.class));
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
