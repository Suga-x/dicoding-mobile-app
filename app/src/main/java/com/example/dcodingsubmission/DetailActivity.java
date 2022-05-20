package com.example.dcodingsubmission;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_NAMA = "extra_name";
    public static final  String EXTRA_DESC ="extra_desc";
    public static final String EXTRA_IMG ="extra_img";
    private TextView tvnama, tvdesc;
    ImageView imgposter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);
        tvnama =findViewById(R.id.tv_name);
        tvdesc = findViewById(R.id.tv_detail);
        imgposter = findViewById(R.id.img_poster);

        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        String desc = getIntent().getStringExtra(EXTRA_DESC);
        int imgposterfile = getIntent().getIntExtra(EXTRA_IMG,0);

        tvnama.setText(nama);
        tvdesc.setText(desc);
        Glide.with(DetailActivity.this)
                .load(imgposterfile)
                .apply(new RequestOptions().placeholder(R.color.design_default_color_on_primary))
                .into(imgposter);
    }
}
