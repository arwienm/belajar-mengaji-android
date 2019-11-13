package com.arwien.belajarmengaji;

import androidx.appcompat.app.AppCompatActivity;

import android.media.ImageWriter;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HijaiyahActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah);

        TampilGambar = (ImageView)findViewById(R.id.tampil_hijaiyah);
        show = (ImageView) findViewById(R.id.tampil_hijaiyah);
        show = (ImageButton) findViewById(R.id.alif);
        show = (ImageButton) findViewById(R.id.baa);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setVisibility(View.VISIBLE);
            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setVisibility(View.INVISIBLE);
            }
        });
    }
}
