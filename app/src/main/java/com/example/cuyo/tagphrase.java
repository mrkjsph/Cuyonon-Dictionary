package com.example.cuyo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class tagphrase extends AppCompatActivity {

    private static final String TAG = "tagphrase";
    private final int[] audioResources = {
            R.raw.malipayeng_pagabot,
            R.raw.komosta,
            R.raw.bago_kita_reman_agbagatan,
            R.raw.ako_si,
            R.raw.ako_taga,
            R.raw.alilipay_ako_nga_akilala_ta_kaw,
            R.raw.mayad_nga_tiprano,
            R.raw.mayad_nga_apon,
            R.raw.mayad_nga_gabi,
            R.raw.mayad_nga_sirem,
            R.raw.adios_amblig,
            R.raw.soirtiean_kara_andan,
            R.raw.mayad_nga_adlaw_kanimo,
            R.raw.amos_makaen_kita,
            R.raw.maambeg_nga_pagbiahi,
            R.raw.e_en,
            R.raw.beken,
            R.raw.saben,
            R.raw.ilam,
            R.raw.paglimeg_lamang_i_maloay,
            R.raw.abaga,
            R.raw.pasinsia,
            R.raw.patigayon,
            R.raw.matarem,
            R.raw.ara_anoman,
            R.raw.ang_lalaki_nga_dia_ang_magabayad_i_ang_tanan,
            R.raw.ang_babai_nga_dia_ang_magabayad_i_ang_tanan,
            R.raw.naidlaw_ako_kanimo,
            R.raw.ingegegman_takaw,
            R.raw.magpaayad_kaw,
            R.raw.amblig,
            R.raw.pagalin_digi,
            R.raw.pabayai_ako,
            R.raw.malipayeng_paskoa,
            R.raw.maambeng_nga_bagong_dagon,
            R.raw.malipayeng_adlaw_i_ang_pagkabanaw_ni_cristo,
            R.raw.malipayeng_pagtamiaw,
            R.raw.ang_saka_linggoahi_beken_pa,
            R.raw.malipayeng_kinabata,
            R.raw.malipayeng_adlaw_i_ang_pagkabanaw_ni_cristo,
            R.raw.tawan_kaw_andan_iang_ginoong_dios_imalabeg_nga_kaboi
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagphrase);
        Log.d(TAG, "onCreate:  Started.");
        ListView mListView = (ListView) findViewById(R.id.listView);

        String[] cuyanoPhrases = {
                "Malipayeng pagabot!",
                "Komosta?",
                "Bago kita reman agbagatan",
                "Ako si ...",
                "Ako taga ...",
                "Alilipay ako nga akilala ta kaw",
                "Mayad nga timprano",
                "Mayad nga apon",
                "Mayad nga gabi",
                "Mayad nga sirem",
                "Adios Amblig",
                "Soirtien ka ra andan!",
                "Mayad nga adlaw kanimo!",
                "Amos! Makaen kita!",
                "Maambeng nga pagbiahi!",
                "E'en",
                "Beken",
                "Saben",
                "Ilam",
                "Paglimeg lamang i' maloay, patigayon",
                "Ikskios anay / Maagi ako anay / Tabi lamang",
                "Pasinsia! / Patawad!",
                "Patigayon",
                "Salamat / Matamang Salamat",
                "Ara sapayan / Ara anoman",
                "Ang lalaki nga dia ang magabayad i' ang tanan",
                "Ang babai nga dia ang magabayad i' ang tanan",
                "Naidlaw ako kanimo",
                "Inggegegman ta kaw / Ingmamal ta kaw",
                "Magpaayad kaw",
                "Amblig",
                "Pagalin digi! / Pagalin sa akeng atobangan!",
                "Pabayai ako!",
                "Malipayeng Paskoa!",
                "Maambeng nga Bagong Dagon!",
                "Malipayeng adlaw i' ang pagkabanaw ni Cristo!",
                "Malipayeng pagtamiaw!",
                "Ang saka linggoahi beken pa enged bastanti",
                "Malipayeng kinabata!",
                "Malipayeng adlaw imong kinatao!",
                "Tawan kaw andan i' ang Ginoong Dios i' malabeg nga kaboi"
        };

        String[] englishPhrases = {
                "Welcome",
                "Hello (General greeting)",
                "Long-time no see",
                "My name is ...",
                "I'm from ...",
                "Pleased to meet you",
                "Good morning",
                "Good afternoon",
                "Good evening",
                "Good night",
                "Goodbye",
                "Good luck!",
                "Have a nice day",
                "Bon appetite / Have a nice meal",
                "Bon voyage / Have a good journey",
                "Yes",
                "No",
                "Maybe",
                "I don't know",
                "Please speak more slowly",
                "Excuse me",
                "Sorry",
                "Please",
                "Thank you",
                "Reply to thank you, You’re welcome",
                "This gentleman will pay for everything",
                "This lady will pay for everything",
                "I miss you",
                "I love you",
                "Get well soon",
                "Take care!",
                "Go away!",
                "Leave me alone!",
                "Christmas greetings",
                "New Year greetings",
                "Easter greetings",
                "Congratulations!",
                "One language is never enough",
                "Birthday greetings",
                "Happy / Joyful / Merry Wishes on your Birthday",
                "May God bless you with many more birthdays to come"
        };

        String[] tagalogPhrases = {
                "Maligayang Pagbati",
                "Hi",
                "Matagal ng hindi kita nakikita",
                "Ako si ...",
                "Ako ay taga…",
                "Kinagagalak kitang makilala",
                "Magandang Umaga",
                "Magandang Tanghali",
                "Magandang Gabi",
                "Magandang Gabi",
                "Paalam",
                "Galingan mo!",
                "Magandang Araw",
                "Kumain ka ng Marami!",
                "Magiingat ka sa iyong paglalakabay.",
                "Oo",
                "Hindi",
                "Siguro",
                "Hindi ko Alam",
                "Pakibagalan ang iyong pagsasalita",
                "Pasensya na po",
                "Paumanhin",
                "Pakiusap",
                "Salamat",
                "Walang anuman",
                "Ang lalaking ito ang magbabayad sa lahat.",
                "Ang babaeng ito ang magbabayad sa lahat.",
                "Namiss Kita",
                "Mahal kita",
                "Pagaling ka",
                "Ingat!",
                "Lumayo ka!",
                "Hayaan mo ko mag isa!",
                "Maligayang Pasko",
                "Manigong bagong Taon",
                "Pasko ng Pagkabuhay",
                "Binabati kita!",
                "Ang isang lenggwahe ay hindi sapat.",
                "Maligayang kaarawan",
                "Maligayang pagbati sa iyong kaarawan",
                "Gabayan ka ng panginoon sa iyong mga susunod na kaarawan"
        };

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

        phraseListAdapter adapter = new phraseListAdapter(this,R.layout.activity_taglist, phraseList);
        mListView.setAdapter(adapter);
    }
    private void playAudio(int audioResourceId) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, audioResourceId);
        if (mediaPlayer != null) {
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.release();
                    Log.d(TAG, "playAudio: Audio playback completed.");
                }
            });
        } else {
            Log.e(TAG, "Failed to create MediaPlayer for audio resource ID: " + audioResourceId);
        }
    }

}