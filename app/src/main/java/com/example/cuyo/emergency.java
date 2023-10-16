package com.example.cuyo;

import static com.example.cuyo.R.id.textView2;
import static com.example.cuyo.R.id.textView3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class emergency extends AppCompatActivity {

    private static final String TAG = "tagphrase";

    private final int[] audioResources = {
            R.raw.pabayai_ako,
            R.raw.tabang,
            R.raw.sonog,
            R.raw.pagtadeng,
            R.raw.pagtawag_ipolis
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = findViewById(R.id.listView3);

        // Create the phrases
        String[] cuyanoPhrases = {
                "Pabayai ako!",
                "Tabang!",
                "Sonog!",
                "Pagtadeng!",
                "Pagtawag i' polis!"
        };
        String[] englishPhrases = {
                "Leave me alone",
                "Help",
                "Fire",
                "Stop",
                "Call the police!"
        };
        String[] tagalogPhrases = {
                "Layuan mo ako!",
                "Tulong",
                "Sunog!",
                "Tumigil!, Itigil!",
                "Tumawag ng pulis!"
        };


        // Add the phrases to an ArrayList
        ArrayList<phrase> phraseList = new ArrayList<>();
        for (int i = 0; i < cuyanoPhrases.length; i++) {
            phraseList.add(new phrase(cuyanoPhrases[i], englishPhrases[i], tagalogPhrases[i], audioResources[i]));
        }

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int audioResourceId = audioResources[position];
                playAudio(audioResourceId);
            }
        });

        phraseListAdapter adapter = new phraseListAdapter(this, R.layout.activity_taglist, phraseList);
        mListView.setAdapter(adapter);
    }

    private void playAudio(int audioResourceId) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, audioResourceId);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
    }
}
