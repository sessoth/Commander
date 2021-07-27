package com.example.commander;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    ListView l;
    String[] lista = new String[] {
            "Bow down to the King", "Isildur", "FLASH AHAAA", "Que Pena", "Deixa Acontecer Naturalmente", "Sileide, Vai ser Fuser ", "Musa do Verao", "Nooooooooo", "U Can't Touch This ", "Are you threatening me master jedi",
            "The Senate will decide your fate", "I AM THE SENATE", "It's treason then", "Its over Anakin", "You underestimate my Power" };


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = findViewById(R.id.list);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,lista);
        l.setAdapter(arr);

        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(
                new AudioAttributes.Builder()
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .build()
        );
        l.setOnItemClickListener((param1AdapterView, param1View, pos, param1Long) -> {
            int sound = 0;
            switch (pos) {
                case 0:
                    sound = R.raw.king;
                    break;
                case 1:
                    sound = R.raw.isildur;
                    break;
                case 2:
                    sound = R.raw.flash;
                    break;
                case 3:
                    sound = R.raw.quepena2;
                    break;
                case 4:
                    sound = R.raw.naturalmente;
                    break;
                case 5:
                    sound = R.raw.vaisefuder;
                    break;
                case 6:
                    sound = R.raw.musa;
                    break;
                case 7:
                    sound = R.raw.darthvader;
                    break;
                case 8:
                    sound = R.raw.canttouchthis;
                    break;
                case 9:
                    sound = R.raw.areutreateningme;
                    break;
                case 10:
                    sound = R.raw.thesenatewilldecideyourfate;
                    break;
                case 11:
                    sound = R.raw.iamthesenate;
                    break;
                case 12:
                    sound = R.raw.itstreason;
                    break;
                case 13:
                    sound = R.raw.itsoveranakin;
                    break;
                case 14:
                    sound = R.raw.youundersestimatemypower;
                    break;
                case 15:
                    sound = R.raw.quepena;
                    break;

            }
            if (sound != 0) {
                Uri uri = Uri.parse("android.resource://com.example.commander/" + sound);
                try {
                    mediaPlayer.reset();
                    mediaPlayer.setDataSource(getApplicationContext(), uri);
                    mediaPlayer.prepare();
                    mediaPlayer.start();

                } catch (IOException e) {
                    e.printStackTrace();
                }




            }
        });
    }
}