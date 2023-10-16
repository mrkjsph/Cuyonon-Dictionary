package com.example.cuyo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class tagphrase2 extends AppCompatActivity {

    private static final String TAG = "tagphrase2";
    private final int [] audioResources = {
            R.raw.komosta_imong_pagkabetang,
            R.raw.mayad_da,
            R.raw.anono_imong_aran,
            R.raw.taga_sadin_kaw,
            R.raw.aintindian_ko,
            R.raw.aintindian_ko,
            R.raw.anono_dato_oliten_mo_patigayon,
            R.raw.solatan_patigayon,
            R.raw.ako_hindi_kalimeh_i_englis,
            R.raw.agalimeg_kaw_i_cuyonon,
            R.raw.een_maite_lamang,
            R.raw.poira_sac_uyonon,
            R.raw.paglimeg_i_cuyunon,
            R.raw.anono_ang_sa_cuyonon,
            R.raw.tagpira_dia,
            R.raw.adin_ang_kasilias,
            R.raw.mabael,
            R.raw.madangmit_imong_pakon_digi
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagphrase2);
        Log.d(TAG, "onCreate:  Started.");
        ListView mListView = (ListView) findViewById(R.id.listView2);

        String[] cuyanoPhrases = {
                "Komosta imong pagkabetang?",
                "Mayad da",
                "Anono imong aran?",
                "Taga sadin kaw?",
                "Aintindian mo?",
                "Aintindian ko",
                "Anono dato? (What was that?) / Oliten mo patigayon",
                "Solatan, patigayon",
                "Ako indi kalimeg i' Inglis?",
                "Agalimeg kaw i' Cuyonon?",
                "E'en, maite lamang",
                "Poira sa Cuyonon, anono pa ang linggoahi nga imong naelaman?",
                "Paglimeg i' Cuyonon",
                "Anono ang ... sa Cuyonon?",
                "Tagpira dia?",
                "Adin ang kasilias?",
                "Maliag kaw agsaot? / Mabaili kita!",
                "Madangmit imong pakon digi?"
        };

        String[] englishPhrases = {
                "How are you?",
                "Reply to 'How are you?'",
                "What's your name?",
                "Where are you from?",
                "Do you understand?",
                "I understand",
                "Please say that again",
                "Please write it down",
                "Do you speak English?",
                "Do you speak Cuyonon?",
                "Yes, a little (reply to 'Do you speak ...?')",
                "Do you speak a language other than Cuyonon?",
                "Speak to me in Cuyonon",
                "How do you say ... in Cuyonon?",
                "How much is this?",
                "Where's the toilet / bathroom?",
                "Would you like to dance with me?",
                "Do you come here often?"
        };

        String[] tagalogPhrases = {
                "Kamusta ka?",
                "Mabuti naman",
                "Ano ang iyong pangalan?",
                "Taga saan ka?",
                "Naiintindihan mo ba?",
                "Naintindihan ko",
                "Pakiulit ang iyong sinabi?",
                "Pakisulat nga ito?",
                "Marunong ka bang magsalita ng Ingles?",
                "Marunong ka bang magsalita ng Cuyunon",
                "Oo, pero hindi gaano",
                "Nagsasalita ka pa ba ng ibang lenggwahe maliban sa Cuyonon.",
                "Kausapin mo ako sa salitang cuyonon",
                "Pano sasabihin ito…. Sa salitang Cuyonon?",
                "Magkano po Nito?",
                "Nasaan ang kasilyas / banyo?",
                "Gusto mo bang makipagsayaw sa akin?",
                "Madalas ka ba rito?"
        };

        ArrayList<phrase> phraseList = new ArrayList<>();
        //iterate sa array and magpplay ang audio if magkakaparehas ng index
        for (int i = 0; i < cuyanoPhrases.length; i++) {
            phraseList.add(new phrase(cuyanoPhrases[i], englishPhrases[i], tagalogPhrases[i], audioResources[i]));
        }
        //OnitemClickListener para sa ListView and to play audio
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