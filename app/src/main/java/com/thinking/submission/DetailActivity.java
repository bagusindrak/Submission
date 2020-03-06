package com.thinking.submission;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class DetailActivity extends AppCompatActivity {

    ImageView img;
    TextView namaKelas, detail;

    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_IMAGE = "extra_image";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
            getSupportActionBar().setTitle(getIntent().getStringExtra(EXTRA_NAMA));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        img = findViewById(R.id.imageView);
        namaKelas = findViewById(R.id.tvNama);
        detail = findViewById(R.id.tvDetail);

        Glide.with(getApplicationContext())
                .load(getIntent().getIntExtra(EXTRA_IMAGE, 0))
                .into(img);

        namaKelas.setText(getIntent().getStringExtra(EXTRA_NAMA));
        detail.setText(getIntent().getStringExtra(EXTRA_DETAIL));
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();}
        return super.onOptionsItemSelected(item);
    }
}
