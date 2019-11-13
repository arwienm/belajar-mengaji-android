package com.arwien.belajarmengaji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class BelajarActivity extends AppCompatActivity {

    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);

        //untuk menghilangkan menu bar di Layar depan (FULL SCREEN)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        pindah = (ImageButton) findViewById(R.id.menu_hijaiyah1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,HijaiyahActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_harokat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,HarokatActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_tanwin);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,TanwinActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });
    }
}
