package com.arwien.belajarmengaji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class TanwinActivity extends AppCompatActivity {

    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanwin);

        //untuk menghilangkan menu bar di Layar depan (FULL SCREEN)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pindah = (ImageButton) findViewById(R.id.tanwin_fathah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //suaraButton.start();
                Intent intent = new Intent(TanwinActivity.this,TanwinFathahActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.tanwin_kasroh);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //suaraButton.start();
                Intent intent = new Intent(TanwinActivity.this,TanwinKasrohActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.tanwin_dhomah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //suaraButton.start();
                Intent intent = new Intent(TanwinActivity.this,TanwinDhomahActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });
    }
}
