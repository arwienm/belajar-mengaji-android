package com.arwien.belajarmengaji;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btnExit;
    ImageButton pindah;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnExit = (ImageButton) findViewById(R.id.btnExit);

        //untuk menghilangkan menu bar di Layar depan
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mp = MediaPlayer.create(getBaseContext(),R.raw.backsound);
        mp.start();

        final MediaPlayer suaraButton = MediaPlayer.create(this,R.raw.button);

        pindah = (ImageButton) findViewById(R.id.buttonBelajar);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(MainActivity.this,BelajarActivity.class);
                startActivity(intent);
                mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.buttonKuis);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(MainActivity.this,KuisActivity.class);
                startActivity(intent);
                mp.stop();
            }
        });

        //tombol keluar muncul popup konfirmasi

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Keluar");
                builder.setMessage("Apakah anda ingin keluar ?");
                builder.setPositiveButton("Ya, Keluar Sekarang!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });

                builder.setNegativeButton("Tidak sekarang", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
                //moveTaskToBack(true);
            }
        });

    }
}
