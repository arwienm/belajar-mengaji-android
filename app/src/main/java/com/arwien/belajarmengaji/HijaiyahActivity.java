package com.arwien.belajarmengaji;

import androidx.appcompat.app.AppCompatActivity;

import android.media.ImageWriter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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
        show = (ImageButton) findViewById(R.id.ba);

        final Animation animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);

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

        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.alif); //memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.ba);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.ta);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.sa);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.jim);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.ha);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.dal);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.dzal);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.ro);
        final MediaPlayer SuaraDza = MediaPlayer.create(this, R.raw.dza);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.sin);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.syin);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.shad);
        final MediaPlayer SuaraDod = MediaPlayer.create(this, R.raw.dod);
        final MediaPlayer SuaraDho = MediaPlayer.create(this, R.raw.dho);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.ain);
        final MediaPlayer SuaraGin = MediaPlayer.create(this, R.raw.gin);
        final MediaPlayer SuaraFa = MediaPlayer.create(this, R.raw.fa);
        final MediaPlayer SuaraKof = MediaPlayer.create(this, R.raw.kof);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.kaf);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.lam);
        final MediaPlayer SuaraMin = MediaPlayer.create(this, R.raw.min);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.nun);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.wawu);
        final MediaPlayer SuaraHaa = MediaPlayer.create(this, R.raw.haa);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.ya);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.alif); //fariable button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.ba);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.ta);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.tsa);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.ja);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.ha);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.kha);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.da);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.dza);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.ro);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.za);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.sin);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.syin);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.sod);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.dho);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.tho);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.dod);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.ain);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.ghain);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.fa);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.kof);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.ka);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.lam);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.min);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.nun);
        ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.vau);
        ImageButton ButtonSuara27 = (ImageButton) this.findViewById(R.id.haa);
        ImageButton ButtonSuara28 = (ImageButton) this.findViewById(R.id.ya);


        /*Menghidupkan suara*/

        ButtonSuara.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method sub
                TampilGambar.setImageResource(R.drawable.pop_alif);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method sub
                TampilGambar.setImageResource(R.drawable.pop_ba);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method sub
                TampilGambar.setImageResource(R.drawable.pop_ta);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method sub
                TampilGambar.setImageResource(R.drawable.pop_tsa);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method sub
                TampilGambar.setImageResource(R.drawable.pop_ja);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method sub
                TampilGambar.setImageResource(R.drawable.pop_ta);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method sub
                TampilGambar.setImageResource(R.drawable.pop_ta);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method sub
                TampilGambar.setImageResource(R.drawable.pop_ta);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method sub
                TampilGambar.setImageResource(R.drawable.pop_ta);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });        ButtonSuara.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method sub
                TampilGambar.setImageResource(R.drawable.pop_ta);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method sub
                TampilGambar.setImageResource(R.drawable.pop_ta);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method sub
                TampilGambar.setImageResource(R.drawable.pop_ta);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method sub
                TampilGambar.setImageResource(R.drawable.pop_ta);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method sub
                TampilGambar.setImageResource(R.drawable.pop_ta);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });        ButtonSuara.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method sub
                TampilGambar.setImageResource(R.drawable.pop_ta);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method sub
                TampilGambar.setImageResource(R.drawable.pop_ta);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method sub
                TampilGambar.setImageResource(R.drawable.pop_ta);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });






    }
}
