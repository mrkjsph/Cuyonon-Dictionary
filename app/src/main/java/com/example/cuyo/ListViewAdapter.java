package com.example.cuyo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    //variables
    Context mContext;
    LayoutInflater inflater;
    List<Model> modelList;
    ArrayList<Model> arrayList;

    //constructor


    public ListViewAdapter(Context context, List<Model> modelList) {

        this.mContext = context;
        this.modelList = modelList;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<>();
        this.arrayList.addAll(modelList);

    }

    public static class ViewHolder{
        TextView mTitleTv;
    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int i) {
        return modelList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int postition, View view, ViewGroup parent) {
        ViewHolder holder;

        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row, null);

            holder.mTitleTv = view.findViewById(R.id.wordCuyo);

            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }

        holder.mTitleTv.setText(modelList.get(postition).getTitle());

        view.setOnClickListener(view1 -> {
            String selectedWord = modelList.get(postition).getTitle();

            if (selectedWord.equals("Abaga")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Abaga");
                intent.putExtra("contentTv", "Abaga");
                intent.putExtra("contentTv1", "Shoulder");
                intent.putExtra("contentTv2", "A species of banana native to the Philippines. A natural leaf fiber that comes from a relative of the banana tree family native to the Philippines that grows throughout tropical regions");
                intent.putExtra("contentTv3", "Balikat");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Abaka")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Abaka");
                intent.putExtra("contentTv", "Abaka");
                intent.putExtra("contentTv1", "Back");
                intent.putExtra("contentTv2", "The rear part of a person's body.");
                intent.putExtra("contentTv3", "Likod");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Abo")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Abo");
                intent.putExtra("contentTv", "Abo");
                intent.putExtra("contentTv1", "Dust");
                intent.putExtra("contentTv2", "Fine, dry particles of earth or other matter that can be carried in the air.");
                intent.putExtra("contentTv3", "Alikabok");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Adal")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Adal");
                intent.putExtra("contentTv", "Adal");
                intent.putExtra("contentTv1", "Heel");
                intent.putExtra("contentTv2", "The back part of the human foot below the ankle.");
                intent.putExtra("contentTv3", "Siklot");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Adin Sadin")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Adin Sadin");
                intent.putExtra("contentTv", "Adin Sadin");
                intent.putExtra("contentTv1", "Heel");
                intent.putExtra("contentTv2", "The back part of the human foot below the ankle.");
                intent.putExtra("contentTv3", "Siklot");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Adlaw")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Adlaw");
                intent.putExtra("contentTv", "Adlaw");
                intent.putExtra("contentTv1", "Day");
                intent.putExtra("contentTv2", "The time between sunrise and sunset when it is light outside.");
                intent.putExtra("contentTv3", "Adlaw");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Adlik")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Adlik");
                intent.putExtra("contentTv", "Adlik");
                intent.putExtra("contentTv1", "Night");
                intent.putExtra("contentTv2", "The time between sunset and sunrise when it is dark outside.");
                intent.putExtra("contentTv3", "Adlik");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Alibangbang")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Alibangbang");
                intent.putExtra("contentTv", "Alibangbang");
                intent.putExtra("contentTv1", "Butterfly");
                intent.putExtra("contentTv2", "A beautiful insect with colorful wings.");
                intent.putExtra("contentTv3", "Alibangbang");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Alima")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Alima");
                intent.putExtra("contentTv", "Alima");
                intent.putExtra("contentTv1", "Five");
                intent.putExtra("contentTv2", "The number 5.");
                intent.putExtra("contentTv3", "Alima");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Alo")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Alo");
                intent.putExtra("contentTv", "Alo");
                intent.putExtra("contentTv1", "Come");
                intent.putExtra("contentTv2", "To move toward the speaker or toward a specified place.");
                intent.putExtra("contentTv3", "Alo");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Ambe")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Ambe");
                intent.putExtra("contentTv", "Ambe");
                intent.putExtra("contentTv1", "Mango");
                intent.putExtra("contentTv2", "A sweet and juicy tropical fruit.");
                intent.putExtra("contentTv3", "Ambe");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Amimirek")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Amimirek");
                intent.putExtra("contentTv", "Amimirek");
                intent.putExtra("contentTv1", "Turtle");
                intent.putExtra("contentTv2", "A reptile with a bony shell.");
                intent.putExtra("contentTv3", "Amimirek");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Amo")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Amo");
                intent.putExtra("contentTv", "Amo");
                intent.putExtra("contentTv1", "I");
                intent.putExtra("contentTv2", "A pronoun used to refer to oneself.");
                intent.putExtra("contentTv3", "Amo");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Anay")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Anay");
                intent.putExtra("contentTv", "Anay");
                intent.putExtra("contentTv1", "Child");
                intent.putExtra("contentTv2", "A young human being.");
                intent.putExtra("contentTv3", "Anay");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Anem")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Anem");
                intent.putExtra("contentTv", "Anem");
                intent.putExtra("contentTv1", "Six");
                intent.putExtra("contentTv2", "The number 6.");
                intent.putExtra("contentTv3", "Anem");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Angin")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Angin");
                intent.putExtra("contentTv", "Angin");
                intent.putExtra("contentTv1", "Wind");
                intent.putExtra("contentTv2", "Air in natural motion, especially when it blows.");
                intent.putExtra("contentTv3", "Angin");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Anino")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Anino");
                intent.putExtra("contentTv", "Anino");
                intent.putExtra("contentTv1", "Shadow");
                intent.putExtra("contentTv2", "A dark shape caused by the blocking of light.");
                intent.putExtra("contentTv3", "Anino");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Anono")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Anono");
                intent.putExtra("contentTv", "Anono");
                intent.putExtra("contentTv1", "Turtle");
                intent.putExtra("contentTv2", "A reptile with a bony shell.");
                intent.putExtra("contentTv3", "Anono");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Apat")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Apat");
                intent.putExtra("contentTv", "Apat");
                intent.putExtra("contentTv1", "Four");
                intent.putExtra("contentTv2", "The number 4.");
                intent.putExtra("contentTv3", "Apat");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Apog")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Apog");
                intent.putExtra("contentTv", "Apog");
                intent.putExtra("contentTv1", "Fire");
                intent.putExtra("contentTv2", "The phenomenon of combustion, producing heat and light.");
                intent.putExtra("contentTv3", "Apog");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Apok")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Apok");
                intent.putExtra("contentTv", "Apok");
                intent.putExtra("contentTv1", "Smoke");
                intent.putExtra("contentTv2", "A visible suspension of carbon or other particles in the air.");
                intent.putExtra("contentTv3", "Apok");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Apon")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Apon");
                intent.putExtra("contentTv", "Apon");
                intent.putExtra("contentTv1", "Afternoon");
                intent.putExtra("contentTv2", "The time between noon and evening.");
                intent.putExtra("contentTv3", "Apon");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Ara")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Ara");
                intent.putExtra("contentTv", "Ara");
                intent.putExtra("contentTv1", "Morning");
                intent.putExtra("contentTv2", "The time between sunrise and noon.");
                intent.putExtra("contentTv3", "Ara");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Aran")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Aran");
                intent.putExtra("contentTv", "Aran");
                intent.putExtra("contentTv1", "Noon");
                intent.putExtra("contentTv2", "The time when the sun is highest in the sky.");
                intent.putExtra("contentTv3", "Aran");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Aroman")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Aroman");
                intent.putExtra("contentTv", "Aroman");
                intent.putExtra("contentTv1", "Love");
                intent.putExtra("contentTv2", "A deep feeling of affection and attachment.");
                intent.putExtra("contentTv3", "Aroman");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Asawa")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Asawa");
                intent.putExtra("contentTv", "Asawa");
                intent.putExtra("contentTv1", "Spouse");
                intent.putExtra("contentTv2", "A partner in marriage or a committed relationship.");
                intent.putExtra("contentTv3", "Asawa");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Asin")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Asin");
                intent.putExtra("contentTv", "Asin");
                intent.putExtra("contentTv1", "Salt");
                intent.putExtra("contentTv2", "A white crystalline substance used to season and preserve food.");
                intent.putExtra("contentTv3", "Asin");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Aso")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Aso");
                intent.putExtra("contentTv", "Aso");
                intent.putExtra("contentTv1", "Dog");
                intent.putExtra("contentTv2", "A domesticated carnivorous mammal.");
                intent.putExtra("contentTv3", "Aso");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Atay")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Atay");
                intent.putExtra("contentTv", "Atay");
                intent.putExtra("contentTv1", "Liver");
                intent.putExtra("contentTv2", "A vital organ in the body responsible for various functions.");
                intent.putExtra("contentTv3", "Atay");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Atep")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Atep");
                intent.putExtra("contentTv", "Atep");
                intent.putExtra("contentTv1", "Duck");
                intent.putExtra("contentTv2", "A waterfowl bird with a flat bill.");
                intent.putExtra("contentTv3", "Atep");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Awid")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Awid");
                intent.putExtra("contentTv", "Awid");
                intent.putExtra("contentTv1", "Bird");
                intent.putExtra("contentTv2", "A warm-blooded vertebrate with feathers and beaks.");
                intent.putExtra("contentTv3", "Awid");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Ayam")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Ayam");
                intent.putExtra("contentTv", "Ayam");
                intent.putExtra("contentTv1", "Chicken");
                intent.putExtra("contentTv2", "A domestic fowl used for meat and eggs.");
                intent.putExtra("contentTv3", "Ayam");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Baag")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Baag");
                intent.putExtra("contentTv", "Baag");
                intent.putExtra("contentTv1", "Forest");
                intent.putExtra("contentTv2", "A large area covered chiefly with trees and undergrowth.");
                intent.putExtra("contentTv3", "Baag");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Baba")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Baba");
                intent.putExtra("contentTv", "Baba");
                intent.putExtra("contentTv1", "Chin");
                intent.putExtra("contentTv2", "The lower extremity of the face beneath the mouth.");
                intent.putExtra("contentTv3", "Baba");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Babai")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Babai");
                intent.putExtra("contentTv", "Babai");
                intent.putExtra("contentTv1", "Woman");
                intent.putExtra("contentTv2", "An adult human female.");
                intent.putExtra("contentTv3", "Babai");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Baboy")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Baboy");
                intent.putExtra("contentTv", "Baboy");
                intent.putExtra("contentTv1", "Pig");
                intent.putExtra("contentTv2", "A domesticated hoofed mammal.");
                intent.putExtra("contentTv3", "Baboy");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Baga")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Baga");
                intent.putExtra("contentTv", "Baga");
                intent.putExtra("contentTv1", "Fire");
                intent.putExtra("contentTv2", "The phenomenon of combustion, producing heat and light.");
                intent.putExtra("contentTv3", "Baga");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bago")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bago");
                intent.putExtra("contentTv", "Bago");
                intent.putExtra("contentTv1", "New");
                intent.putExtra("contentTv2", "Not existing before; made, introduced, or discovered recently.");
                intent.putExtra("contentTv3", "Bago");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bakal")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bakal");
                intent.putExtra("contentTv", "Bakal");
                intent.putExtra("contentTv1", "Iron");
                intent.putExtra("contentTv2", "A strong, hard magnetic metal.");
                intent.putExtra("contentTv3", "Bakal");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Balangaw")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Balangaw");
                intent.putExtra("contentTv", "Balangaw");
                intent.putExtra("contentTv1", "Rainbow");
                intent.putExtra("contentTv2", "A meteorological phenomenon.");
                intent.putExtra("contentTv3", "Balangaw");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Balay")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Balay");
                intent.putExtra("contentTv", "Balay");
                intent.putExtra("contentTv1", "House");
                intent.putExtra("contentTv2", "A building for human habitation.");
                intent.putExtra("contentTv3", "Balay");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Balikawang")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Balikawang");
                intent.putExtra("contentTv", "Balikawang");
                intent.putExtra("contentTv1", "Window");
                intent.putExtra("contentTv2", "An opening in the wall of a building.");
                intent.putExtra("contentTv3", "Balikawang");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Balongbabai")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Balongbabai");
                intent.putExtra("contentTv", "Balongbabai");
                intent.putExtra("contentTv1", "Well");
                intent.putExtra("contentTv2", "A deep hole in the ground from which water is drawn.");
                intent.putExtra("contentTv3", "Balongbabai");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Banga")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Banga");
                intent.putExtra("contentTv", "Banga");
                intent.putExtra("contentTv1", "Pot");
                intent.putExtra("contentTv2", "A container for cooking or storing food.");
                intent.putExtra("contentTv3", "Banga");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Banig")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Banig");
                intent.putExtra("contentTv", "Banig");
                intent.putExtra("contentTv1", "Mat");
                intent.putExtra("contentTv2", "A piece of fabric used as a floor covering.");
                intent.putExtra("contentTv3", "Banig");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Banios")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Banios");
                intent.putExtra("contentTv", "Banios");
                intent.putExtra("contentTv1", "Bath");
                intent.putExtra("contentTv2", "The act of washing the body.");
                intent.putExtra("contentTv3", "Banios");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Baras")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Baras");
                intent.putExtra("contentTv", "Baras");
                intent.putExtra("contentTv1", "Sand");
                intent.putExtra("contentTv2", "Loose granular material found on beaches and deserts.");
                intent.putExtra("contentTv3", "Baras");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Barita")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Barita");
                intent.putExtra("contentTv", "Barita");
                intent.putExtra("contentTv1", "News");
                intent.putExtra("contentTv2", "Information about current events.");
                intent.putExtra("contentTv3", "Barita");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Baroto")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Baroto");
                intent.putExtra("contentTv", "Baroto");
                intent.putExtra("contentTv1", "Boat");
                intent.putExtra("contentTv2", "A watercraft for travel on water.");
                intent.putExtra("contentTv3", "Baroto");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Basa")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Basa");
                intent.putExtra("contentTv", "Basa");
                intent.putExtra("contentTv1", "Wet");
                intent.putExtra("contentTv2", "Covered or saturated with liquid.");
                intent.putExtra("contentTv3", "Basa");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bata")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bata");
                intent.putExtra("contentTv", "Bata");
                intent.putExtra("contentTv1", "Child");
                intent.putExtra("contentTv2", "A young human being.");
                intent.putExtra("contentTv3", "Bata");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Batis")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Batis");
                intent.putExtra("contentTv", "Batis");
                intent.putExtra("contentTv1", "Stream");
                intent.putExtra("contentTv2", "A small, narrow river or brook.");
                intent.putExtra("contentTv3", "Batis");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bato")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bato");
                intent.putExtra("contentTv", "Bato");
                intent.putExtra("contentTv1", "Stone");
                intent.putExtra("contentTv2", "A hard, solid mineral material.");
                intent.putExtra("contentTv3", "Bato");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Baybay")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Baybay");
                intent.putExtra("contentTv", "Baybay");
                intent.putExtra("contentTv1", "Shore");
                intent.putExtra("contentTv2", "The land along the edge of a sea, lake, or other large body of water.");
                intent.putExtra("contentTv3", "Baybayin");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bayo")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bayo");
                intent.putExtra("contentTv", "Bayo");
                intent.putExtra("contentTv1", "Pound");
                intent.putExtra("contentTv2", "any of various units of mass and weight.");
                intent.putExtra("contentTv3", "Magbayo");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bedbed")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bedbed");
                intent.putExtra("contentTv", "Bedbed");
                intent.putExtra("contentTv1", "Sew");
                intent.putExtra("contentTv2", "join, fasten, or repair (something) by making stitches with a needle and thread or a sewing machine.");
                intent.putExtra("contentTv3", "Tahi");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Begat")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Begat");
                intent.putExtra("contentTv", "Begat");
                intent.putExtra("contentTv1", "Heavy");
                intent.putExtra("contentTv2", "of great weight; difficult to lift or move.");
                intent.putExtra("contentTv3", "Mabigat");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Begsay")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Begsay");
                intent.putExtra("contentTv", "Begsay");
                intent.putExtra("contentTv1", "Paddle");
                intent.putExtra("contentTv2", "a usually wooden implement that has a long handle and a broad flattened blade and that is used to propel and steer a small craft");
                intent.putExtra("contentTv3", "Sagwan");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bengel")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bengel");
                intent.putExtra("contentTv", "Bengel");
                intent.putExtra("contentTv1", "Deaf");
                intent.putExtra("contentTv2", "lacking the power of hearing, or having impaired hearing.");
                intent.putExtra("contentTv3", "Bingi");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Beteng")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Beteng");
                intent.putExtra("contentTv", "Beteng");
                intent.putExtra("contentTv1", "Pull");
                intent.putExtra("contentTv2", "exert force on (someone or something) so as to cause movement toward oneself.");
                intent.putExtra("contentTv3", "Hila");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bilalaybirat")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bilalaybirat");
                intent.putExtra("contentTv", "Bilalaybirat");
                intent.putExtra("contentTv1", "Vagina");
                intent.putExtra("contentTv2", "the muscular tube leading from the external genitals to the cervix of the uterus in women and most female mammals.");
                intent.putExtra("contentTv3", "Puke");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Birdi")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Birdi");
                intent.putExtra("contentTv", "Birdi");
                intent.putExtra("contentTv1", "Green");
                intent.putExtra("contentTv2", "if the color between blue and yellow in the spectrum; colored like grass or emeralds.");
                intent.putExtra("contentTv3", "Berde");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Biring")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Biring");
                intent.putExtra("contentTv", "Biring");
                intent.putExtra("contentTv1", "Turn");
                intent.putExtra("contentTv2", "move in a circular direction wholly or partly around an axis or point.");
                intent.putExtra("contentTv3", "Balik");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bisaralimeg")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bisaralimeg");
                intent.putExtra("contentTv", "Bisaralimeg");
                intent.putExtra("contentTv1", "Word/Language");
                intent.putExtra("contentTv2", "more than 7,100 languages are spoken in the world today. Each and every one of them make the world a diverse and beautiful place");
                intent.putExtra("contentTv3", "Salita");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Biton")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Biton");
                intent.putExtra("contentTv", "Biton");
                intent.putExtra("contentTv1", "Star");
                intent.putExtra("contentTv2", "a natural luminous body visible in the sky especially at night");
                intent.putExtra("contentTv3", "Bituin");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Boatybanig")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Boat y banig");
                intent.putExtra("contentTv", "Boat y banig");
                intent.putExtra("contentTv1", "Weave Mat");
                intent.putExtra("contentTv2", "Mat weaving is commonly done by using the hand. The process of mat weaving starts with identification and harvest of pliable materials like reed, oak, hickory and willow.");
                intent.putExtra("contentTv3", "Paghabi ng banig");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Boaya")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Boaya");
                intent.putExtra("contentTv", "Boaya");
                intent.putExtra("contentTv1", "Crocodile");
                intent.putExtra("contentTv2", "Crocodiles or true crocodiles are large semiaquatic reptiles that live throughout the tropics in Africa, Asia, the Americas and Australia.");
                intent.putExtra("contentTv3", "Buwaya");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bokid")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bokid");
                intent.putExtra("contentTv", "Bokid");
                intent.putExtra("contentTv1", "Mountain");
                intent.putExtra("contentTv2", "a large natural elevation of the earth's surface rising abruptly from the surrounding level; a large steep hill.");
                intent.putExtra("contentTv3", "Bundok");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bolan")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bolan");
                intent.putExtra("contentTv", "Bolan");
                intent.putExtra("contentTv1", "Moon");
                intent.putExtra("contentTv2", "the natural satellite of the earth, visible (chiefly at night) by reflected light from the sun.");
                intent.putExtra("contentTv3", "Buwan");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Boli")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Boli");
                intent.putExtra("contentTv", "Boli");
                intent.putExtra("contentTv1", "Anus");
                intent.putExtra("contentTv2", "The opening of the rectum to the outside of the body.");
                intent.putExtra("contentTv3", "Puwit/ Pwet");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bolong")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bolong");
                intent.putExtra("contentTv", "Bolong");
                intent.putExtra("contentTv1", "Medicine");
                intent.putExtra("contentTv2", "the science or practice of the diagnosis, treatment, and prevention of disease (in technical use often taken to exclude surgery).");
                intent.putExtra("contentTv3", "Gamot");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bonak")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bonak");
                intent.putExtra("contentTv", "Bonak");
                intent.putExtra("contentTv1", "Cotton");
                intent.putExtra("contentTv2", "Cotton is known for its versatility, performance and natural comfort. Cotton's strength and absorbency makes it an ideal fabric to make clothes and homewares, and industrial products like tarpaulins, tents, hotel sheets, army uniforms, and even astronauts' clothing choices when inside a space shuttle.");
                intent.putExtra("contentTv3", "Bulak");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bonga")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bonga");
                intent.putExtra("contentTv", "Bonga");
                intent.putExtra("contentTv1", "Fruit");
                intent.putExtra("contentTv2", "the sweet and fleshy product of a tree or other plant that contains seed and can be eaten as food.");
                intent.putExtra("contentTv3", "Prutas");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bono")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bono");
                intent.putExtra("contentTv", "Bono");
                intent.putExtra("contentTv1", "Stab");
                intent.putExtra("contentTv2", "(of a person) thrust a knife or other pointed weapon into (someone) so as to wound or kill.");
                intent.putExtra("contentTv3", "saksak");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Book")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Book");
                intent.putExtra("contentTv", "Book");
                intent.putExtra("contentTv1", "Hair");
                intent.putExtra("contentTv2", "any of the fine threadlike strands growing from the skin of humans, mammals, and some other animals.");
                intent.putExtra("contentTv3", "Buhok");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bool")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bool");
                intent.putExtra("contentTv", "Bool");
                intent.putExtra("contentTv1", "Heel");
                intent.putExtra("contentTv2", "the back part of the human foot below the ankle.");
                intent.putExtra("contentTv3", "Takong");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Boray")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Boray");
                intent.putExtra("contentTv", "Boray");
                intent.putExtra("contentTv1", "Blind");
                intent.putExtra("contentTv2", "Having less than ¹/₁₀ of normal vision in the more efficient eye when refractive defects are fully corrected by lenses. ");
                intent.putExtra("contentTv3", "Bulag");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Boslososo")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Boslo/Soso");
                intent.putExtra("contentTv", "Boslo/Soso");
                intent.putExtra("contentTv1", "Penis");
                intent.putExtra("contentTv2", "the male genital organ of higher vertebrates, carrying the duct for the transfer of sperm during copulation. In humans and most other mammals, it consists largely of erectile tissue and serves also for the elimination of urine.");
                intent.putExtra("contentTv3", "Titi");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bosog")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bosog");
                intent.putExtra("contentTv", "Bosog");
                intent.putExtra("contentTv1", "Full");
                intent.putExtra("contentTv2", "containing or holding as much or as many as possible; having no empty space.");
                intent.putExtra("contentTv3", "Busog");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Botig")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Botig");
                intent.putExtra("contentTv", "Botig");
                intent.putExtra("contentTv1", "Lie");
                intent.putExtra("contentTv2", "to make an untrue statement with intent to deceive.");
                intent.putExtra("contentTv3", "Sinungaling");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Boyo")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Boyo");
                intent.putExtra("contentTv", "Boyo");
                intent.putExtra("contentTv1", "Betel Leaf");
                intent.putExtra("contentTv2", "The betel, Piper betle, is a species of flowering plant in the pepper family Piperaceae, native to Southeast Asia. It is an evergreen, dioecious vine, with glossy heart-shaped leaves and white catkins. ");
                intent.putExtra("contentTv3", "Dahon ng Betel");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bugtitinae")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bugtitinae");
                intent.putExtra("contentTv", "Bugtitinae");
                intent.putExtra("contentTv1", "Sibling");
                intent.putExtra("contentTv2", "each of two or more children or offspring having one or both parents in common; a brother or sister.");
                intent.putExtra("contentTv3", "Kapatid");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Bunga")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Bunga");
                intent.putExtra("contentTv", "Bunga");
                intent.putExtra("contentTv1", "Aroca nut");
                intent.putExtra("contentTv2", "Betel Nuts in the Philippines, In the Philippines, betel leaf and areca nut chewing used to be a very widespread cultural custom. In Tagalog, betel nut-chewing is colloquially known as buyo, bunga, hitso, or nga nga (which means “to chew”). In Ilocano, it is known as bua, maman or mama");
                intent.putExtra("contentTv3", "Aroca nut");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Dadi")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Dadi");
                intent.putExtra("contentTv", "Dadi");
                intent.putExtra("contentTv1", "Today");
                intent.putExtra("contentTv2", "on or in the course of this present day");
                intent.putExtra("contentTv3", "Ngayon");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Dadi_ren")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Dadi ren");
                intent.putExtra("contentTv", "Dadi ren");
                intent.putExtra("contentTv1", "Now");
                intent.putExtra("contentTv2", "at the present time or moment.");
                intent.putExtra("contentTv3", "Ngayon");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Dagat")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Dagat");
                intent.putExtra("contentTv", "Dagat");
                intent.putExtra("contentTv1", "Sea");
                intent.putExtra("contentTv2", "the expanse of salt water that covers most of the earths surface and surrounds its landmasses.");
                intent.putExtra("contentTv3", "Dagat");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Dai")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Dai");
                intent.putExtra("contentTv", "Dai");
                intent.putExtra("contentTv1", "Forehead");
                intent.putExtra("contentTv2", "the part of the face above the eyebrows.");
                intent.putExtra("contentTv3", "Noo");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Dalanbanasbanas")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Dalan/Banas-Banas");
                intent.putExtra("contentTv", "Dalan/Banas-Banas");
                intent.putExtra("contentTv1", "Trail");
                intent.putExtra("contentTv2", "a mark or a series of signs or objects left behind by the passage of someone or something.");
                intent.putExtra("contentTv3", "Tugaygayan");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Damang")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Damang");
                intent.putExtra("contentTv", "Damang");
                intent.putExtra("contentTv1", "Spider");
                intent.putExtra("contentTv2", "an eight-legged predatory arachnid with an unsegmented body consisting of a fused head and thorax and a rounded abdomen. Spiders have fangs that inject venom into their prey, and most kinds spin webs in which to capture insects.");
                intent.putExtra("contentTv3", "Gagamba");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Daon")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Daon");
                intent.putExtra("contentTv", "Daon");
                intent.putExtra("contentTv1", "Leaf");
                intent.putExtra("contentTv2", "a flattened structure of a higher plant, typically green and blade -like, that is attached to a stem directly or via a stalk. Leaves are the main organs of photosynthesis and transpiration.");
                intent.putExtra("contentTv3", "Dahon");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Dapaw")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Dapaw");
                intent.putExtra("contentTv", "Dapaw");
                intent.putExtra("contentTv1", "Lice (chicken)");
                intent.putExtra("contentTv2", "either of two small wingless parasitic insects that live on the skin of mammals and birds.");
                intent.putExtra("contentTv3", "Tugaygayan");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Darwa")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Darwa");
                intent.putExtra("contentTv", "Darwa");
                intent.putExtra("contentTv1", "Two");
                intent.putExtra("contentTv2", "equivalent to the sum of one and one; one less than three");
                intent.putExtra("contentTv3", "Dalawa");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Darwampulo")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Darwampulo");
                intent.putExtra("contentTv", "Darwampulo");
                intent.putExtra("contentTv1", "Twenty");
                intent.putExtra("contentTv2", "the number equivalent to the product of two and ten; ten less than thirty; 20.");
                intent.putExtra("contentTv3", "Dalawangpu");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Degan")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Degan");
                intent.putExtra("contentTv", "Degan");
                intent.putExtra("contentTv1", "Chest");
                intent.putExtra("contentTv2", "the front surface of a person's or animal's body between the neck and the abdomen.");
                intent.putExtra("contentTv3", "Dibdib");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Digos")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Digos");
                intent.putExtra("contentTv", "Digos");
                intent.putExtra("contentTv1", "Bathe");
                intent.putExtra("contentTv2", "Used to refer to a large container/tub used to wash oneself or it is the act of cleaning oneself with soap and water.");
                intent.putExtra("contentTv3", "Pagligo");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Dila")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Dila");
                intent.putExtra("contentTv", "Dila");
                intent.putExtra("contentTv1", "Tongue");
                intent.putExtra("contentTv2", "the fleshy muscular organ in the mouth of a mammal, used for tasting, licking, swallowing, and (in humans) articulating speech.");
                intent.putExtra("contentTv3", "Dila");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Dingding")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Dingding");
                intent.putExtra("contentTv", "Dingding");
                intent.putExtra("contentTv1", "Dingding");
                intent.putExtra("contentTv2", "a continuous vertical brick or stone structure that encloses or divides an area of land");
                intent.putExtra("contentTv3", "Wall");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Dogo")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Dogo");
                intent.putExtra("contentTv", "Dogo");
                intent.putExtra("contentTv1", "Blood");
                intent.putExtra("contentTv2", "Blood is a specialized body fluid");
                intent.putExtra("contentTv3", "Dugo");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Doro")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Doro");
                intent.putExtra("contentTv", "Dogo");
                intent.putExtra("contentTv1", "May");
                intent.putExtra("contentTv2", "he fifth month of the year, in the northern hemisphere usually considered the last month of spring.");
                intent.putExtra("contentTv3", "Mayo (month)");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Elat")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Elat");
                intent.putExtra("contentTv", "Elat");
                intent.putExtra("contentTv1", "Wait");
                intent.putExtra("contentTv2", "stay where one is or delay action until a particular time or until something else happens.");
                intent.putExtra("contentTv3", "Hintay");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Eseb")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Eseb");
                intent.putExtra("contentTv", "Eseb");
                intent.putExtra("contentTv1", "Swim");
                intent.putExtra("contentTv2", "propel the body through water by using the limbs, or (in the case of a fish or other aquatic animal) by using fins, tail, or other bodily movement.");
                intent.putExtra("contentTv3", "Langoy");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Eya")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Eya");
                intent.putExtra("contentTv", "Eya");
                intent.putExtra("contentTv1", "Ashamed");
                intent.putExtra("contentTv2", "Embarrassed or guilty because of one's actions, characteristics, or associations");
                intent.putExtra("contentTv3", "Nakakahiya");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Eyep")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Eyep");
                intent.putExtra("contentTv", "Eyep");
                intent.putExtra("contentTv1", "Blow");
                intent.putExtra("contentTv2", "an instance of air moving with speed or force");
                intent.putExtra("contentTv3", "Ihip");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Gabi")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Gabi");
                intent.putExtra("contentTv", "Gabi");
                intent.putExtra("contentTv1", "Night");
                intent.putExtra("contentTv2", "the period of darkness in each twenty-four hours; the time from sunset to sunrise.");
                intent.putExtra("contentTv3", "Gabi");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Gakitbalsa")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Gakit, Balsa");
                intent.putExtra("contentTv", "Gakit, Balsa");
                intent.putExtra("contentTv1", "Raft");
                intent.putExtra("contentTv2", "a flat buoyant structure of timber or other materials fastened together, used as a boat or floating platform.");
                intent.putExtra("contentTv3", "Balsa");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Galem")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Galem");
                intent.putExtra("contentTv", "Galem");
                intent.putExtra("contentTv1", "Raincloud");
                intent.putExtra("contentTv2", "a cloud or a mass of clouds that yields rain");
                intent.putExtra("contentTv3", "Dilim ng Ulap");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Gamot")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Gamot");
                intent.putExtra("contentTv", "Gamot");
                intent.putExtra("contentTv1", "Root");
                intent.putExtra("contentTv2", "the part of a plant which attaches it to the ground or to a support, typically underground, conveying water and nourishment to the rest of the plant via numerous branches and fibers.");
                intent.putExtra("contentTv3", "Ugat");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Gatos")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Gatos");
                intent.putExtra("contentTv", "Gatos");
                intent.putExtra("contentTv1", "Hundred");
                intent.putExtra("contentTv2", "the number equivalent to the product of ten and ten; ten more than ninety; 100");
                intent.putExtra("contentTv3", "Isang daan");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Geretgeret")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Geret-geret");
                intent.putExtra("contentTv", "Geret-geret");
                intent.putExtra("contentTv1", "Cut");
                intent.putExtra("contentTv2", "make an opening, incision, or wound in (something) with a sharp-edged tool or object.");
                intent.putExtra("contentTv3", "Gayat");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Getem")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Getem");
                intent.putExtra("contentTv", "Getem");
                intent.putExtra("contentTv1", "Hunger");
                intent.putExtra("contentTv2", "a feeling of discomfort or weakness caused by lack of food, coupled with the desire to eat.");
                intent.putExtra("contentTv3", "Gutom");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Gorang")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Gorang");
                intent.putExtra("contentTv", "Gorang");
                intent.putExtra("contentTv1", "Sit");
                intent.putExtra("contentTv2", "adopt or be in a position in which one's weight is supported by one's buttocks rather than one's feet and one's back is upright.");
                intent.putExtra("contentTv3", "Upo");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Gosok")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Gosok");
                intent.putExtra("contentTv", "Gosok");
                intent.putExtra("contentTv1", "Rib");
                intent.putExtra("contentTv2", "each of a series of slender curved bones articulated in pairs to the spine (twelve pairs in humans), protecting the thoracic cavity and its organs.");
                intent.putExtra("contentTv3", "Tadyang");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Iba")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Iba");
                intent.putExtra("contentTv", "Iba");
                intent.putExtra("contentTv1", "Other");
                intent.putExtra("contentTv2", "denoting a person or thing that is different or distinct from one already mentioned or known about.");
                intent.putExtra("contentTv3", "Iba");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Idalem")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Idalem");
                intent.putExtra("contentTv", "Idalem");
                intent.putExtra("contentTv1", "Under");
                intent.putExtra("contentTv2", "extending or directly below.");
                intent.putExtra("contentTv3", "Ilalim");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Idalembalay")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Idalem' balay");
                intent.putExtra("contentTv", "Idalem' balay");
                intent.putExtra("contentTv1", "Space under house");
                intent.putExtra("contentTv2", "A crawl space is a narrow gap between the underside of a house and the ground that provides enough elevation for a person to crawl around");
                intent.putExtra("contentTv3", "Ilalim ng Bahay");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Ikog")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Ikog");
                intent.putExtra("contentTv", "Ikog");
                intent.putExtra("contentTv1", "Tail");
                intent.putExtra("contentTv2", "the hindmost part of an animal, especially when prolonged beyond the rest of the body, such as the flexible extension of the backbone in a vertebrate, the feathers at the hind end of a bird, or a terminal appendage in an insect.\n");
                intent.putExtra("contentTv3", "Buntot");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Inem")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Inem");
                intent.putExtra("contentTv", "Inem");
                intent.putExtra("contentTv1", "Drink");
                intent.putExtra("contentTv2", "take (a liquid) into the mouth and swallow.");
                intent.putExtra("contentTv3", "Inom");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Ipen")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Ipen");
                intent.putExtra("contentTv", "Ipen");
                intent.putExtra("contentTv1", "Teeth");
                intent.putExtra("contentTv2", "each of a set of hard, bony enamel-coated structures in the jaws of most vertebrates, used for biting and chewing.");
                intent.putExtra("contentTv3", "Ngipin");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Irinemen")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Irinemen");
                intent.putExtra("contentTv", "Irinemen");
                intent.putExtra("contentTv1", "Wine rice");
                intent.putExtra("contentTv2", "ake is the national and traditional drink of Japan and is one of the most popular traditional nondistilled alcoholic drinks in the world\n");
                intent.putExtra("contentTv3", "Alak");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Irong")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Irong");
                intent.putExtra("contentTv", "Irong");
                intent.putExtra("contentTv1", "Nose");
                intent.putExtra("contentTv2", "the part projecting above the mouth on the face of a person or animal, containing the nostrils and used for breathing and smelling");
                intent.putExtra("contentTv3", "Ilong");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Isda")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Isda");
                intent.putExtra("contentTv", "Isda");
                intent.putExtra("contentTv1", "Eel");
                intent.putExtra("contentTv2", "Eels are teleost fish. They have long and narrow bodies like snakes. Adult eels can be as short as 10 cm or as long as 3 m. It depends on their species.");
                intent.putExtra("contentTv3", "Igat");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Istoria")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Istoria");
                intent.putExtra("contentTv", "Istoria");
                intent.putExtra("contentTv1", "Story");
                intent.putExtra("contentTv2", "an account of imaginary or real people and events told for entertainment.");
                intent.putExtra("contentTv3", "Istorya");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Itlog")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Itlog");
                intent.putExtra("contentTv", "Itlog");
                intent.putExtra("contentTv1", "Egg");
                intent.putExtra("contentTv2", "a hard-shelled reproductive body produced by a bird and especially by domestic poultry.");
                intent.putExtra("contentTv3", "Itlog");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Itsura")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Itsura");
                intent.putExtra("contentTv", "Itsura");
                intent.putExtra("contentTv1", "Face");
                intent.putExtra("contentTv2", "he front part of a person's head from the forehead to the chin, or the corresponding part in an animal.");
                intent.putExtra("contentTv3", "Mukha");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kabati")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kabati");
                intent.putExtra("contentTv", "Kabati");
                intent.putExtra("contentTv1", "Hear");
                intent.putExtra("contentTv2", "perceive with the ear the sound made by (someone or something).");
                intent.putExtra("contentTv3", "Dinig");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kadlaw")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kadlaw");
                intent.putExtra("contentTv", "Kadlaw");
                intent.putExtra("contentTv1", "Laugh");
                intent.putExtra("contentTv2", "make the spontaneous sounds and movements of the face and body that are the instinctive expressions of lively amusement and sometimes also of contempt or derision.");
                intent.putExtra("contentTv3", "Pagtawa");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kaen")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kaen");
                intent.putExtra("contentTv", "Kaen");
                intent.putExtra("contentTv1", "Eat");
                intent.putExtra("contentTv2", "put (food) into the mouth and chew and swallow it.");
                intent.putExtra("contentTv3", "Kain");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("kagat")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "kagat");
                intent.putExtra("contentTv", "kagat");
                intent.putExtra("contentTv1", "Bite");
                intent.putExtra("contentTv2", "to bite or have the habit of biting something");
                intent.putExtra("contentTv3", "kagat");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kaimamot")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kaimamot");
                intent.putExtra("contentTv", "Kaimamot");
                intent.putExtra("contentTv1", "Toe");
                intent.putExtra("contentTv2", "any of the five digits at the end of the human foot.");
                intent.putExtra("contentTv3", "Daliri sa Paa");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kalatkabli")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kalat/Kabli");
                intent.putExtra("contentTv", "Kalat/Kabli");
                intent.putExtra("contentTv1", "Rope");
                intent.putExtra("contentTv2", "a length of strong cord made by twisting together strands of natural fibers such as hemp or artificial fibers such as polypropylene");
                intent.putExtra("contentTv3", "Lubid");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kalayo")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kalayo");
                intent.putExtra("contentTv", "Kalayo");
                intent.putExtra("contentTv1", "Fire");
                intent.putExtra("contentTv2", "combustion or burning, in which substance combine chemically with oxygen from the air and typically give out bright light, heat, and smoke.\n");
                intent.putExtra("contentTv3", "Sunog/Apoy");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kalilies")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kalilies");
                intent.putExtra("contentTv", "Kalilies");
                intent.putExtra("contentTv1", "Trousers");
                intent.putExtra("contentTv2", "an outer garment covering the body from the waist to the ankles, with a separate part for each leg.");
                intent.putExtra("contentTv3", "Pantalon");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kalkag")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kalkag");
                intent.putExtra("contentTv", "Kalkag");
                intent.putExtra("contentTv1", "Dry (Rice in sun)");
                intent.putExtra("contentTv2", "Sun drying is a traditional drying method for reducing the moisture content of paddy by spreading the grains under the sun.");
                intent.putExtra("contentTv3", "Pagtutuyo ng Bigas sa araw");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("kalot")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "kalot");
                intent.putExtra("contentTv", "kalot");
                intent.putExtra("contentTv1", "Scratch");
                intent.putExtra("contentTv2", "score or mark the surface of (something) with a sharp or pointed object");
                intent.putExtra("contentTv3", "Kamot");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kamote")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kamote");
                intent.putExtra("contentTv", "Kamote");
                intent.putExtra("contentTv1", "Sweet Potato");
                intent.putExtra("contentTv2", "a large root of a tropical plant that has orange skin and orange flesh, that is eaten as a vegetable, and that tastes sweet");
                intent.putExtra("contentTv3", "Kamote");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kano")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kano");
                intent.putExtra("contentTv", "Kano");
                intent.putExtra("contentTv1", "When");
                intent.putExtra("contentTv2", "at what time.");
                intent.putExtra("contentTv3", "Kailan");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kaoy")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kaoy");
                intent.putExtra("contentTv", "Kaoy");
                intent.putExtra("contentTv1", "Tree");
                intent.putExtra("contentTv2", "a woody perennial plant, typically having a single stem or trunk growing to a considerable height and bearing lateral branches at some distance from the ground.");
                intent.putExtra("contentTv3", "Puno");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("karabaw")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "karabaw");
                intent.putExtra("contentTv", "karabaw");
                intent.putExtra("contentTv1", "carabao");
                intent.putExtra("contentTv2", "The carabao is a domestic swamp-type waterbuffalo native to the Philippines.");
                intent.putExtra("contentTv3", "Kalabaw");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Karawat")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Karawat");
                intent.putExtra("contentTv", "Karawat");
                intent.putExtra("contentTv1", "Play");
                intent.putExtra("contentTv2", "engage in activity for enjoyment and recreation rather than a serious or practical purpose.");
                intent.putExtra("contentTv3", "Laro");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kardiro")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kardiro");
                intent.putExtra("contentTv", "Kardiro");
                intent.putExtra("contentTv1", "cooking pot");
                intent.putExtra("contentTv2", "Pots are used for simmering or boiling liquids that completely cover ingredients to cook from all sides");
                intent.putExtra("contentTv3", "Kaldero");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kasaplan")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kasaplan");
                intent.putExtra("contentTv", "Kasaplan");
                intent.putExtra("contentTv1", "West");
                intent.putExtra("contentTv2", "the direction toward the point of the horizon where the sun sets at the equinoxes, on the left-hand side of a person facing north, or the part of the horizon lying in this direction.\n");
                intent.putExtra("contentTv3", "Kanluran");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Katorog")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Katorog");
                intent.putExtra("contentTv", "Katorog");
                intent.putExtra("contentTv1", "Sleep");
                intent.putExtra("contentTv2", "a condition of body and mind that typically recurs for several hours every night, in which the eyes are closed, the postural muscles relaxed");
                intent.putExtra("contentTv3", "Tulog");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("kaybanmadu")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "kaybanmadu");
                intent.putExtra("contentTv", "kaybanmadu");
                intent.putExtra("contentTv1", "Companion");
                intent.putExtra("contentTv2", "a person or animal with whom one spends a lot of time or with whom one travels. one that accompanies another");
                intent.putExtra("contentTv3", "Kasama");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kilala")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kilala");
                intent.putExtra("contentTv", "Kilala");
                intent.putExtra("contentTv1", "Know a Person");
                intent.putExtra("contentTv2", "be aware of through observation, inquiry, or information.");
                intent.putExtra("contentTv3", "Kilala");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kilat")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kilat");
                intent.putExtra("contentTv", "Kilat");
                intent.putExtra("contentTv1", "Lightning");
                intent.putExtra("contentTv2", "the occurrence of a natural electrical discharge o very short duration and high voltage between a cloud and the ground or within a cloud, accompanied by a bright flash and typically also thunder");
                intent.putExtra("contentTv3", "Kidlat");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("koan")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "koan");
                intent.putExtra("contentTv", "koan");
                intent.putExtra("contentTv1", "What you may call it");
                intent.putExtra("contentTv2", "used for emphasizing that you think something is not as good as it should be, or is not what it claims to be");
                intent.putExtra("contentTv3", "Kung ano man ang tawag");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kodal")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kodal");
                intent.putExtra("contentTv", "Kodal");
                intent.putExtra("contentTv1", "Fence");
                intent.putExtra("contentTv2", "a barrier, railing, or other upright structure, typically of wood or wire, enclosing an area of ground to mark a boundary, control access, or prevent escape");
                intent.putExtra("contentTv3", "Bakod");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Koko")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Koko");
                intent.putExtra("contentTv", "Koko");
                intent.putExtra("contentTv1", "Fingernail");
                intent.putExtra("contentTv2", "the hard covering at the end of the fingers.");
                intent.putExtra("contentTv3", "Kuko sa Daliri");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kolit")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kolit");
                intent.putExtra("contentTv", "Kolit");
                intent.putExtra("contentTv1", "Skin");
                intent.putExtra("contentTv2", "the thin layer of tissue forming the natural outer covering of the body of a person or animal.");
                intent.putExtra("contentTv3", "Balat");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kong")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kong");
                intent.putExtra("contentTv", "Kong");
                intent.putExtra("contentTv1", "If");
                intent.putExtra("contentTv2", "(introducing a conditional clause) on the condition or supposition that; in the event that");
                intent.putExtra("contentTv3", "Paano");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Kotkot")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Kotkot");
                intent.putExtra("contentTv", "Kotkot");
                intent.putExtra("contentTv1", "Dig");
                intent.putExtra("contentTv2", "Soil digging is the most essential and primary activity of land preparation for gardening.");
                intent.putExtra("contentTv3", "Maghukay");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Koto")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Koto");
                intent.putExtra("contentTv", "Koto");
                intent.putExtra("contentTv1", "Lice");
                intent.putExtra("contentTv2", "Lice are tiny, wingless insects that feed on human blood. Lice spread from person to person through close contact and by sharing belongings");
                intent.putExtra("contentTv3", "Kuto");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Labeg")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Labeg");
                intent.putExtra("contentTv", "Labeg");
                intent.putExtra("contentTv1", "Long");
                intent.putExtra("contentTv2", "measuring a great distance from end to end");
                intent.putExtra("contentTv3", "Mahaba");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Laen")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Laen");
                intent.putExtra("contentTv", "Laen");
                intent.putExtra("contentTv1", "Coconut");
                intent.putExtra("contentTv2", "while brown ones are fully mature. Green coconuts have far less meat than mature ones. Instead, they're prized for their refreshing and healthy water");
                intent.putExtra("contentTv3", "Niyog");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Lagpak")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Lagpak");
                intent.putExtra("contentTv", "Lagpak");
                intent.putExtra("contentTv1", "Fall");
                intent.putExtra("contentTv2", "move downward, typically rapidly and freely without control, from a higher to a lower level.");
                intent.putExtra("contentTv3", "Hulog");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Lalagona")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Lalagona");
                intent.putExtra("contentTv", "Lalagona");
                intent.putExtra("contentTv1", "Lake");
                intent.putExtra("contentTv2", "a large body of water surrounded by land");
                intent.putExtra("contentTv3", "Lawa");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Lalaki")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Lalaki");
                intent.putExtra("contentTv", "Lalaki");
                intent.putExtra("contentTv1", "Man");
                intent.putExtra("contentTv2", "an adult male human being");
                intent.putExtra("contentTv3", "Lalaki");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("lamgam")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "lamgam");
                intent.putExtra("contentTv", "lamgam");
                intent.putExtra("contentTv1", "Bird");
                intent.putExtra("contentTv2", "any warm-blooded vertebrate of the class Aves, having a body covered with feathers, forelimbs");
                intent.putExtra("contentTv3", "Ibon");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Langaw")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Langaw");
                intent.putExtra("contentTv", "Langaw");
                intent.putExtra("contentTv1", "Fly");
                intent.putExtra("contentTv2", "of a bird, bat, or insect) move through the air using wings");
                intent.putExtra("contentTv3", "Langaw");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Langit")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Langit");
                intent.putExtra("contentTv", "Langit");
                intent.putExtra("contentTv1", "Sky");
                intent.putExtra("contentTv2", "the region of the atmosphere and outer space seen from the earth");
                intent.putExtra("contentTv3", "Langit");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Lawas")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Lawas");
                intent.putExtra("contentTv", "Lawas");
                intent.putExtra("contentTv1", "Body");
                intent.putExtra("contentTv2", "the physical structure of a person or an animal, including the bones, flesh, and organs");
                intent.putExtra("contentTv3", "Katawan");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Lebeng")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Lebeng");
                intent.putExtra("contentTv", "Lebeng");
                intent.putExtra("contentTv1", "Bury");
                intent.putExtra("contentTv2", "put or hide under ground");
                intent.putExtra("contentTv3", "Libing");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Likod")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Likod");
                intent.putExtra("contentTv", "Likod");
                intent.putExtra("contentTv1", "Back");
                intent.putExtra("contentTv2", "the rear part of the human body especially from the neck to the end of the spine");
                intent.putExtra("contentTv3", "Likod");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Lima")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Lima");
                intent.putExtra("contentTv", "Lima");
                intent.putExtra("contentTv1", "Five");
                intent.putExtra("contentTv2", "Number");
                intent.putExtra("contentTv3", "Lima");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Lintidageb")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Linti/Dageb");
                intent.putExtra("contentTv", "Linti/Dageb");
                intent.putExtra("contentTv1", "Thunder");
                intent.putExtra("contentTv2", "a loud rumbling or crashing noise heard after a lightning flash due to the expansion of rapidly heated air");
                intent.putExtra("contentTv3", "Kidlat");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Lipat")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Lipat");
                intent.putExtra("contentTv", "Lipat");
                intent.putExtra("contentTv1", "Forget");
                intent.putExtra("contentTv2", "fail to remember");
                intent.putExtra("contentTv3", "Nakalimutan");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Loa")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Loa");
                intent.putExtra("contentTv", "Loa");
                intent.putExtra("contentTv1", "Tear");
                intent.putExtra("contentTv2", "Tear is also a noun that refers to the drops of salty liquid that come out of the eye when one cries");
                intent.putExtra("contentTv3", "Luha");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Loag")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Loag");
                intent.putExtra("contentTv", "Loag");
                intent.putExtra("contentTv1", "Ladle of coconut Shell");
                intent.putExtra("contentTv2", "Made from coconut shell, this set of ladles is perfect to use with your hand-seasoned, natural cookware or even your existing cookware");
                intent.putExtra("contentTv3", "Sandok");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Lobid")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Lobid");
                intent.putExtra("contentTv", "Lobid");
                intent.putExtra("contentTv1", "String");
                intent.putExtra("contentTv2", "material consisting of threads of cotton, hemp, or other material twisted together to form a thin length");
                intent.putExtra("contentTv3", "Tali");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Logta")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Logta");
                intent.putExtra("contentTv", "Logta");
                intent.putExtra("contentTv1", "Earth");
                intent.putExtra("contentTv2", "the planet on which we live; the world");
                intent.putExtra("contentTv3", "Lupa");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Lokon")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Lokon");
                intent.putExtra("contentTv", "Lokon");
                intent.putExtra("contentTv1", "Eyebrow");
                intent.putExtra("contentTv2", "the strip of hair growing on the ridge above a person's eye socket");
                intent.putExtra("contentTv3", "Kilay");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Longmok")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Longmok");
                intent.putExtra("contentTv", "Longmok");
                intent.putExtra("contentTv1", "Mud");
                intent.putExtra("contentTv2", "soft, sticky matter resulting from the mixing of earth and water");
                intent.putExtra("contentTv3", "Putik");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Losong")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Losong");
                intent.putExtra("contentTv", "Losong");
                intent.putExtra("contentTv1", "Mortar");
                intent.putExtra("contentTv2", "a short smoothbore gun for firing shells (technically called bombs) at high angles");
                intent.putExtra("contentTv3", "Pandikdik");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Loya")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Loya");
                intent.putExtra("contentTv", "Loya");
                intent.putExtra("contentTv1", "Ginger");
                intent.putExtra("contentTv2", "a hot, fragrant spice made from the rhizome of a plant, which may be chopped or powdered for cooking, preserved in syrup, or candied");
                intent.putExtra("contentTv3", "Luya");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Maamot")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Maamot");
                intent.putExtra("contentTv", "Maamot");
                intent.putExtra("contentTv1", "Fragrant");
                intent.putExtra("contentTv2", "having a pleasant or sweet smell");
                intent.putExtra("contentTv3", "Mabango");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Maayad")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Maayad");
                intent.putExtra("contentTv", "Maayad");
                intent.putExtra("contentTv1", "Good");
                intent.putExtra("contentTv2", "to be desired or approved of");
                intent.putExtra("contentTv3", "Mabuti");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Mabael")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Mabael");
                intent.putExtra("contentTv", "Mabael");
                intent.putExtra("contentTv1", "Big");
                intent.putExtra("contentTv2", "Large");
                intent.putExtra("contentTv3", "Malaki");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Mabol")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Mabol");
                intent.putExtra("contentTv", "Mabol");
                intent.putExtra("contentTv1", "Dull (as Knife)");
                intent.putExtra("contentTv2", "A dull knife can slip and slide over your ingredients and require applying more pressure to make a full cut");
                intent.putExtra("contentTv3", "Mapurol");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Maboring")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Maboring");
                intent.putExtra("contentTv", "Maboring");
                intent.putExtra("contentTv1", "dirty (clothes)");
                intent.putExtra("contentTv2", "marked with dirt, mud, etc. or containing something such as pollution");
                intent.putExtra("contentTv3", "Maduming Damit");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Mabui")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Mabui");
                intent.putExtra("contentTv", "Mabui");
                intent.putExtra("contentTv1", "Live (Dwell)");
                intent.putExtra("contentTv2", "remain alive");
                intent.putExtra("contentTv3", "Mabuhay");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Madalem")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Madalem");
                intent.putExtra("contentTv", "Madalem");
                intent.putExtra("contentTv1", "Deep");
                intent.putExtra("contentTv2", "extending far down from the top or surface");
                intent.putExtra("contentTv3", "Malalim");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Madamel")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Madamel");
                intent.putExtra("contentTv", "Madamel");
                intent.putExtra("contentTv1", "Thick (object)");
                intent.putExtra("contentTv2", "with opposite sides or surfaces that are a great or relatively great distance apart.");
                intent.putExtra("contentTv3", "Makapal");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Madasig")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Madasig");
                intent.putExtra("contentTv", "Madasig");
                intent.putExtra("contentTv1", "Fast");
                intent.putExtra("contentTv2", "moving or capable of moving at high speed");
                intent.putExtra("contentTv3", "Mabilis");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Madura")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Mawala/Madura");
                intent.putExtra("contentTv", "Mawala/Madura");
                intent.putExtra("contentTv1", "Lose");
                intent.putExtra("contentTv2", "be deprived of or cease to have or retain (something)");
                intent.putExtra("contentTv3", "Talo");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Magbayad")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Magbayad");
                intent.putExtra("contentTv", "Magbayad");
                intent.putExtra("contentTv1", "Pay");
                intent.putExtra("contentTv2", "give (someone) money that is due for work done, goods received, or a debt incurred");
                intent.putExtra("contentTv3", "Magbayad");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Magdalagan")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Magdalagan");
                intent.putExtra("contentTv", "Magdalagan");
                intent.putExtra("contentTv1", "Run");
                intent.putExtra("contentTv2", "move at a speed faster than a walk, never having both or all the feet on the ground at the same time");
                intent.putExtra("contentTv3", "Takbo");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Magkal")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Magkal");
                intent.putExtra("contentTv", "Magkal");
                intent.putExtra("contentTv1", "Snake");
                intent.putExtra("contentTv2", "a long limbless reptile which has no eyelids, a short tail, and jaws that are capable of considerable extension");
                intent.putExtra("contentTv3", "Ahas");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Magkalipot")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Magkalipot");
                intent.putExtra("contentTv", "Magkalipot");
                intent.putExtra("contentTv1", "Stick to");
                intent.putExtra("contentTv2", "to not change (a decision, belief, etc.) I intend to stick to my promise/word");
                intent.putExtra("contentTv3", "Dikit");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Maglepad")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Maglepad");
                intent.putExtra("contentTv", "Maglepad");
                intent.putExtra("contentTv1", "To Fly");
                intent.putExtra("contentTv2", "to move in air");
                intent.putExtra("contentTv3", "Lumipad");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("magloto")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "magloto");
                intent.putExtra("contentTv", "magloto");
                intent.putExtra("contentTv1", "to Cook");
                intent.putExtra("contentTv2", "Prepare (food, a dish, or a meal) by combining and heating the ingredients in various ways");
                intent.putExtra("contentTv3", "Magluto");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Magpandora")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Magpandora");
                intent.putExtra("contentTv", "Magpandora");
                intent.putExtra("contentTv1", "Spit");
                intent.putExtra("contentTv2", "eject saliva forcibly from one's mouth, sometimes as a gesture of contempt or anger");
                intent.putExtra("contentTv3", "Dura");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Mainit")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Mainit");
                intent.putExtra("contentTv", "Mainit");
                intent.putExtra("contentTv1", "Hot");
                intent.putExtra("contentTv2", "having a high degree of heat or a high temperature");
                intent.putExtra("contentTv3", "Mainit");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Maite")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Maite");
                intent.putExtra("contentTv", "Maite");
                intent.putExtra("contentTv1", "Small (object)");
                intent.putExtra("contentTv2", "of a size that is less than normal or usual");
                intent.putExtra("contentTv3", "Maliit");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Makatel")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Makatel");
                intent.putExtra("contentTv", "Makatel");
                intent.putExtra("contentTv1", "Itch");
                intent.putExtra("contentTv2", "an uncomfortable sensation on the skin that causes a desire to scratch");
                intent.putExtra("contentTv3", "Makati");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Makori")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Makori");
                intent.putExtra("contentTv", "Makori");
                intent.putExtra("contentTv1", "Difficult");
                intent.putExtra("contentTv2", "needing much effort or skill to accomplish, deal with, or understand");
                intent.putExtra("contentTv3", "Makori");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Malam")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Malam");
                intent.putExtra("contentTv", "Malam");
                intent.putExtra("contentTv1", "Old (person)\n");
                intent.putExtra("contentTv2", "having lived for a long time; no longer young");
                intent.putExtra("contentTv3", "Matanda");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Malapad")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Malapad");
                intent.putExtra("contentTv", "Malapad");
                intent.putExtra("contentTv1", "Wide");
                intent.putExtra("contentTv2", "of great or more than average width");
                intent.putExtra("contentTv3", "Mapalad");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Malinang_linang")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Malinang-linang");
                intent.putExtra("contentTv", "Malinang-linang");
                intent.putExtra("contentTv1", "Smooth");
                intent.putExtra("contentTv2", "having an even and regular surface or consistency; free from perceptible projections, lumps, or indentations");
                intent.putExtra("contentTv3", "Makinis");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Mani")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Mani");
                intent.putExtra("contentTv", "Mani");
                intent.putExtra("contentTv1", "Peanuts");
                intent.putExtra("contentTv2", "the oval seed of a South American plant, widely roasted and salted and eaten as a snack.");
                intent.putExtra("contentTv3", "Mani");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Manipis")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Manipis");
                intent.putExtra("contentTv", "Manipis");
                intent.putExtra("contentTv1", "Thin(object)\n");
                intent.putExtra("contentTv2", "having opposite surfaces or sides close together; of little thickness or depth");
                intent.putExtra("contentTv3", "Manipis");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Maniwang")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Maniwang");
                intent.putExtra("contentTv", "Maniwang");
                intent.putExtra("contentTv1", "Skinny");
                intent.putExtra("contentTv2", "(of a person or part of their body) unattractively or unusually thin");
                intent.putExtra("contentTv3", "Payat");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Manok")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Manok");
                intent.putExtra("contentTv", "Manok");
                intent.putExtra("contentTv1", "chicken");
                intent.putExtra("contentTv2", "a type of bird kept on a farm for its eggs or its meat, or the meat of this bird that is cooked and eaten");
                intent.putExtra("contentTv3", "Manok");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Mapait")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Mapait");
                intent.putExtra("contentTv", "Mapait");
                intent.putExtra("contentTv1", "Bitter");
                intent.putExtra("contentTv2", "having a sharp, pungent taste or smell; not sweet");
                intent.putExtra("contentTv3", "mapait");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Mapiet")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Mapiet");
                intent.putExtra("contentTv", "Mapiet");
                intent.putExtra("contentTv1", "Narrow");
                intent.putExtra("contentTv2", "(especially of something that is considerably longer or higher than it is wide) of small width");
                intent.putExtra("contentTv3", "Makitid");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Mapungaw")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Mapungaw");
                intent.putExtra("contentTv", "Mapungaw");
                intent.putExtra("contentTv1", "Lonely");
                intent.putExtra("contentTv2", "sad because one has no friends or company");
                intent.putExtra("contentTv3", "Malungkot");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Mara")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Mara");
                intent.putExtra("contentTv", "Mara");
                intent.putExtra("contentTv1", "Dry");
                intent.putExtra("contentTv2", "free from moisture or liquid; not wet or moist");
                intent.putExtra("contentTv3", "Tuyo");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Marapit")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Marapit");
                intent.putExtra("contentTv", "Marapit");
                intent.putExtra("contentTv1", "Near");
                intent.putExtra("contentTv2", "at or to a short distance away; nearby");
                intent.putExtra("contentTv3", "Malapit");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Marimo")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Marimo");
                intent.putExtra("contentTv", "Marimo");
                intent.putExtra("contentTv1", "Bad");
                intent.putExtra("contentTv2", "Failing to reach an acceptable standard: poor. A bad repair job");
                intent.putExtra("contentTv3", "Masama");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Maroya")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Maroya");
                intent.putExtra("contentTv", "Maroya");
                intent.putExtra("contentTv1", "Weak");
                intent.putExtra("contentTv2", "lacking the power to perform physically demanding tasks; lacking physical strength and energy");
                intent.putExtra("contentTv3", "Mahina");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Maslem")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Maslem");
                intent.putExtra("contentTv", "Maslem");
                intent.putExtra("contentTv1", "Sour");
                intent.putExtra("contentTv2", "having an acid taste like lemon or vinegar");
                intent.putExtra("contentTv3", "Maasim");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Mata")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Mata");
                intent.putExtra("contentTv", "Mata");
                intent.putExtra("contentTv1", "Eye");
                intent.putExtra("contentTv2", "each of a pair of globular organs in the head through which people and vertebrate animals see");
                intent.putExtra("contentTv3", "Mata");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Mataged")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Mataged");
                intent.putExtra("contentTv", "Mataged");
                intent.putExtra("contentTv1", "Short (object)");
                intent.putExtra("contentTv2", "measuring a small distance from end to end");
                intent.putExtra("contentTv3", "Maliit");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Matambok")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Matambok");
                intent.putExtra("contentTv", "Matambok");
                intent.putExtra("contentTv1", "Fast");
                intent.putExtra("contentTv2", "moving or capable of moving at high speed");
                intent.putExtra("contentTv3", "Mabilis");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Matamis")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Matamis");
                intent.putExtra("contentTv", "Matamis");
                intent.putExtra("contentTv1", "Sweet");
                intent.putExtra("contentTv2", "having the pleasant taste characteristic of sugar or honey; not salty, sour, or bitter");
                intent.putExtra("contentTv3", "Matamis");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Matarem")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Matarem");
                intent.putExtra("contentTv", "Matarem");
                intent.putExtra("contentTv1", "Sharp");
                intent.putExtra("contentTv2", "(of an object) having an edge or point that is able to cut or pierce something");
                intent.putExtra("contentTv3", "Matalim/Matulis");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Matas")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Matas");
                intent.putExtra("contentTv", "Matas");
                intent.putExtra("contentTv1", "High");
                intent.putExtra("contentTv2", "of great vertical extent");
                intent.putExtra("contentTv3", "Mataas");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Mga_bata")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Mga bata");
                intent.putExtra("contentTv", "Mga bata");
                intent.putExtra("contentTv1", "Offspring");
                intent.putExtra("contentTv2", "the product of the reproductive processes of a person, animal, or plant");
                intent.putExtra("contentTv3", "Mga bata");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Namok")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Namok");
                intent.putExtra("contentTv", "Namok");
                intent.putExtra("contentTv1", "Mosquito");
                intent.putExtra("contentTv2", "a slender long-legged fly with aquatic larvae. The bite of the bloodsucking female can transmit a number of serious diseases including malaria and encephalitis");
                intent.putExtra("contentTv3", "Lamok");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Nanay")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Nanay");
                intent.putExtra("contentTv", "Nanay");
                intent.putExtra("contentTv1", "Mother");
                intent.putExtra("contentTv2", "a woman in relation to her child or children");
                intent.putExtra("contentTv3", "Ina");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Nganga")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Nganga");
                intent.putExtra("contentTv", "Nganga");
                intent.putExtra("contentTv1", "Betel and areca nut chew");
                intent.putExtra("contentTv2", "Betel nut is the seed of the fruit of the areca palm. It is also known as areca nut");
                intent.putExtra("contentTv3", "Betel and areca nut chew");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Ngitit")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Ngitit");
                intent.putExtra("contentTv", "Ngitit");
                intent.putExtra("contentTv1", "Black");
                intent.putExtra("contentTv2", "The very darkest color owing to the absence of or complete absorption of light; the opposite of white");
                intent.putExtra("contentTv3", "Maitim");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Nipa")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Nipa");
                intent.putExtra("contentTv", "Nipa");
                intent.putExtra("contentTv1", "Nipa");
                intent.putExtra("contentTv2", "a palm tree with creeping roots, characteristic of mangrove swamps in India and the Pacific islands");
                intent.putExtra("contentTv3", "Nipa");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Obo")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Obo");
                intent.putExtra("contentTv", "Obo");
                intent.putExtra("contentTv1", "Cough");
                intent.putExtra("contentTv2", "expel air from the lungs with a sudden sharp sound");
                intent.putExtra("contentTv3", "Ubo");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Ogtong_adlaw")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Ogtong Adlaw");
                intent.putExtra("contentTv", "Ogtong Adlaw");
                intent.putExtra("contentTv1", "Noon");
                intent.putExtra("contentTv2", "twelve o'clock in the day; mid day.");
                intent.putExtra("contentTv3", "Tanghali");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Olas")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Olas");
                intent.putExtra("contentTv", "Olas");
                intent.putExtra("contentTv1", "Sweat");
                intent.putExtra("contentTv2", "moisture exuded through the pores of the skin, typically in profuse quantities as a reaction to heat, physical exertion, fever, or fear.\n");
                intent.putExtra("contentTv3", "Pawis");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Olit")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Olit");
                intent.putExtra("contentTv", "Olit");
                intent.putExtra("contentTv1", "Repeat");
                intent.putExtra("contentTv2", "say again something one has already said");
                intent.putExtra("contentTv3", "Ulit");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Ololonan")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Ololonan");
                intent.putExtra("contentTv", "Ololonan");
                intent.putExtra("contentTv1", "Pillow");
                intent.putExtra("contentTv2", "a rectangular cloth bag stuffed with feathers, foam rubber, or other soft materials, used to support the head when lying down");
                intent.putExtra("contentTv3", "Unan");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Opa")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Opa");
                intent.putExtra("contentTv", "Opa");
                intent.putExtra("contentTv1", "Husk of rice");
                intent.putExtra("contentTv2", "he coating on a seed or grain of rice");
                intent.putExtra("contentTv3", "Balat ng bigas");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Oran")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Oran");
                intent.putExtra("contentTv", "Oran");
                intent.putExtra("contentTv1", "Rain");
                intent.putExtra("contentTv2", "moisture condensed from the atmosphere that falls visibly in separate drops");
                intent.putExtra("contentTv3", "Ulan");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Oring")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Oring");
                intent.putExtra("contentTv", "Oring");
                intent.putExtra("contentTv1", "charcoal");
                intent.putExtra("contentTv2", "Charcoal is a lightweight black carbon residue produced by strongly heating wood in minimal oxygen to remove all water and volatile constituents");
                intent.putExtra("contentTv3", "Uling");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Osa")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Osa");
                intent.putExtra("contentTv", "Osa");
                intent.putExtra("contentTv1", "Deer");
                intent.putExtra("contentTv2", "A deer or true deer is a hoofed ruminant mammal of the family Cervidae");
                intent.putExtra("contentTv3", "Usa");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Osay")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Osay");
                intent.putExtra("contentTv", "Osay");
                intent.putExtra("contentTv1", "Comb");
                intent.putExtra("contentTv2", "A strip of plastic, metal, or wood with a row of narrow teeth, used for untangling or arranging the hair");
                intent.putExtra("contentTv3", "Suklay");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Oslon")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Oslon");
                intent.putExtra("contentTv", "Oslon");
                intent.putExtra("contentTv1", "Blanket");
                intent.putExtra("contentTv2", "A blanket is a swath of soft cloth large enough either to cover or to enfold most of the user's body and thick enough");
                intent.putExtra("contentTv3", "Kumot");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Otang")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Otang");
                intent.putExtra("contentTv", "Otang");
                intent.putExtra("contentTv1", "Dept");
                intent.putExtra("contentTv2", "something, typically money, that is owed or due");
                intent.putExtra("contentTv3", "Utang");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Otok")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Otok");
                intent.putExtra("contentTv", "Otok");
                intent.putExtra("contentTv1", "Brain");
                intent.putExtra("contentTv2", "The brain is the most complex part of the human body");
                intent.putExtra("contentTv3", "Utak");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Owaw")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Owaw");
                intent.putExtra("contentTv", "Owaw");
                intent.putExtra("contentTv1", "Thirst");
                intent.putExtra("contentTv2", "a feeling of needing or wanting to drink something");
                intent.putExtra("contentTv3", "Uhaw");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Oyen")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Oyen");
                intent.putExtra("contentTv", "Oyen");
                intent.putExtra("contentTv1", "cheeks");
                intent.putExtra("contentTv2", "either side of the face below the eye");
                intent.putExtra("contentTv3", "Pisngi");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Pakpak")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Pakpak");
                intent.putExtra("contentTv", "Pakpak");
                intent.putExtra("contentTv1", "Wings");
                intent.putExtra("contentTv2", "(in a bird) a modified forelimb that bears large feathers and is used for flying");
                intent.putExtra("contentTv3", "Pakpak");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Palad")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Palad");
                intent.putExtra("contentTv", "Palad");
                intent.putExtra("contentTv1", "Palm (of Hand)");
                intent.putExtra("contentTv2", "he somewhat concave part of the human hand between the bases of the fingers and the wrist or the corresponding part of the forefoot of a lower mammal");
                intent.putExtra("contentTv3", "Palad");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Palay")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Palay");
                intent.putExtra("contentTv", "Palay");
                intent.putExtra("contentTv1", "Rice (Husked)");
                intent.putExtra("contentTv2", "a swamp grass which is widely cultivated as a source of food, especially in Asia");
                intent.putExtra("contentTv3", "Kanin");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Pali")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Pali");
                intent.putExtra("contentTv", "Pali");
                intent.putExtra("contentTv1", "Scar");
                intent.putExtra("contentTv2", "a mark left on the skin or within body tissue where a wound, burn, or sore has not healed completely and fibrous connective tissue has developed");
                intent.putExtra("contentTv3", "Peklat");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Pamaw")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Pamaw");
                intent.putExtra("contentTv", "Pamaw");
                intent.putExtra("contentTv1", "Breakfast");
                intent.putExtra("contentTv2", "a meal eaten in the morning, the first of the day");
                intent.putExtra("contentTv3", "Almusal");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Panaw")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Panaw");
                intent.putExtra("contentTv", "Panaw");
                intent.putExtra("contentTv1", "Walk");
                intent.putExtra("contentTv2", "move at a regular pace by lifting and setting down each foot in turn, never having both feet off the ground at once");
                intent.putExtra("contentTv3", "Lakad");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Pangalamo")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Pangalamo");
                intent.putExtra("contentTv", "Pangalamo");
                intent.putExtra("contentTv1", "Smell");
                intent.putExtra("contentTv2", "the faculty or power of perceiving odors or scents by means of the organs in the nose");
                intent.putExtra("contentTv3", "Amoy");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Pangi")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Pangi");
                intent.putExtra("contentTv", "Pangi");
                intent.putExtra("contentTv1", "Urine");
                intent.putExtra("contentTv2", "a watery, typically yellowish fluid stored in the bladder and discharged through the urethra");
                intent.putExtra("contentTv3", "Ihi");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Pangka")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Pangka");
                intent.putExtra("contentTv", "Pangka");
                intent.putExtra("contentTv1", "Frog");
                intent.putExtra("contentTv2", "tailless amphibian with a short squat body, moist smooth skin, and very long hind legs for leaping");
                intent.putExtra("contentTv3", "Palaka");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Paray")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Paray");
                intent.putExtra("contentTv", "Paray");
                intent.putExtra("contentTv1", "Rice (unhusked)");
                intent.putExtra("contentTv2", "to remove the husk from (barley, rice, etc)");
                intent.putExtra("contentTv3", "Bigas");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Paribanaw")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Paribanaw");
                intent.putExtra("contentTv", "Paribanaw");
                intent.putExtra("contentTv1", "Wash Hands");
                intent.putExtra("contentTv2", "the act of cleaning one's hands with soap or handwash and water to remove viruses/bacteria/microorganisms, dirt, grease, or other harmful and unwanted substances stuck to the hands");
                intent.putExtra("contentTv3", "Paghuhugas ng kamay\n");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Patay")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Patay");
                intent.putExtra("contentTv", "Patay");
                intent.putExtra("contentTv1", "Dead");
                intent.putExtra("contentTv2", "no longer alive");
                intent.putExtra("contentTv3", "Patay");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Pawikan")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Pawikan");
                intent.putExtra("contentTv", "Pawikan");
                intent.putExtra("contentTv1", "Turtle");
                intent.putExtra("contentTv2", "a slow-moving reptile, enclosed in a scaly or leathery domed shell into which it can retract its head and thick legs");
                intent.putExtra("contentTv3", "Pagong");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Pilak")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Pilak");
                intent.putExtra("contentTv", "Pilak");
                intent.putExtra("contentTv1", "Throw");
                intent.putExtra("contentTv2", "propel (something) with force through the air by a movement of the arm and hand");
                intent.putExtra("contentTv3", "Hinagis");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Pilak_an")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Pilak(an)");
                intent.putExtra("contentTv", "Pilak(an)");
                intent.putExtra("contentTv1", "Throw Away");
                intent.putExtra("contentTv2", "discard something as useless or unwanted");
                intent.putExtra("contentTv3", "Tinapon");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Pili")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Pili");
                intent.putExtra("contentTv", "Pili");
                intent.putExtra("contentTv1", "Choose");
                intent.putExtra("contentTv2", "pick out or select (someone or something) as being the best or most appropriate of two or more alternatives");
                intent.putExtra("contentTv3", "Pili");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Pirakabilog")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Pira ka Bilog");
                intent.putExtra("contentTv", "Pira ka Bilog");
                intent.putExtra("contentTv1", "How many");
                intent.putExtra("contentTv2", "usually refers to a number representing some quantity");
                intent.putExtra("contentTv3", "Ilan");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Pisil")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Pisil");
                intent.putExtra("contentTv", "Pisil");
                intent.putExtra("contentTv1", "Squeeze");
                intent.putExtra("contentTv2", "firmly press (something soft or yielding), typically with one's fingers");
                intent.putExtra("contentTv3", "Pisil");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Pito")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Pito");
                intent.putExtra("contentTv", "Pito");
                intent.putExtra("contentTv1", "Seven");
                intent.putExtra("contentTv2", "Number");
                intent.putExtra("contentTv3", "Pito");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Pohol")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Pohol pohol");
                intent.putExtra("contentTv", "Pohol pohol");
                intent.putExtra("contentTv1", "Ankle");
                intent.putExtra("contentTv2", "The lower end of your leg, the part or joint connecting the foot with the leg");
                intent.putExtra("contentTv3", "Bukong Bukong");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Pola")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Mapola");
                intent.putExtra("contentTv", "Mapola");
                intent.putExtra("contentTv1", "Red");
                intent.putExtra("contentTv2", "Since red is the color of blood, it has historically been associated with sacrifice, danger, and courage");
                intent.putExtra("contentTv3", "Pula");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Ponaspaid")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Ponas/Paid");
                intent.putExtra("contentTv", "Ponas/Paid");
                intent.putExtra("contentTv1", "Wipe");
                intent.putExtra("contentTv2", "clean or dry (something) by rubbing its surface with a cloth, a piece of paper, or one's hand");
                intent.putExtra("contentTv3", "Punas");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Poti")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Poti");
                intent.putExtra("contentTv", "Poti");
                intent.putExtra("contentTv1", "White");
                intent.putExtra("contentTv2", "of the color of milk or fresh snow, due to the reflection of most wavelengths of visible light; the opposite of black");
                intent.putExtra("contentTv3", "Puti");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Puno")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Pono");
                intent.putExtra("contentTv", "Pono");
                intent.putExtra("contentTv1", "Full (container)");
                intent.putExtra("contentTv2", "containing or holding as much or as many as possible; having no empty space");
                intent.putExtra("contentTv3", "Puno");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Putot")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Putot");
                intent.putExtra("contentTv", "Putot");
                intent.putExtra("contentTv1", "Short (person)");
                intent.putExtra("contentTv2", "condition in which an individual's height is in the 3rd percentile for the mean height of a given age, sex, and population group");
                intent.putExtra("contentTv3", "Pandak");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Ramig")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Ramig");
                intent.putExtra("contentTv", "Ramig");
                intent.putExtra("contentTv1", "cold (of water)");
                intent.putExtra("contentTv2", "Cold water means water where the monthly mean low water temperature is normally 15 degrees Celsius (59 degrees Fahrenheit) or less");
                intent.putExtra("contentTv3", "Lamig");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Rapa_rapa")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Rapa-rapa");
                intent.putExtra("contentTv", "Rapa-rapa");
                intent.putExtra("contentTv1", "Sole of foot");
                intent.putExtra("contentTv2", "the undersurface of a foot. : the part of an item of footwear on which the sole rests and upon which the wearer treads");
                intent.putExtra("contentTv3", "Talampakan");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Raye")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Raye");
                intent.putExtra("contentTv", "Raye");
                intent.putExtra("contentTv1", "Far");
                intent.putExtra("contentTv2", "at, to, or by a great distance (used to indicate the extent to which one thing is distant from another)");
                intent.putExtra("contentTv3", "Malayo");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Ronot")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Ronot");
                intent.putExtra("contentTv", "Ronot");
                intent.putExtra("contentTv1", "Rotten (fruit)");
                intent.putExtra("contentTv2", "suffering from decay");
                intent.putExtra("contentTv3", "Bulok");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Sabat")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Sabat");
                intent.putExtra("contentTv", "Sabat");
                intent.putExtra("contentTv1", "Answer");
                intent.putExtra("contentTv2", "Rejoinder, reply, response, and retort. While all these words mean something spoken, written, or done in return, answer implies the satisfying of a question, demand, call, or need");
                intent.putExtra("contentTv3", "Sagot");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Saging")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Saging");
                intent.putExtra("contentTv", "Saging");
                intent.putExtra("contentTv1", "Banana");
                intent.putExtra("contentTv2", "A curved, yellow fruit with a thick skin and soft sweet flesh");
                intent.putExtra("contentTv3", "Saging");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Saka")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Saka");
                intent.putExtra("contentTv", "Saka");
                intent.putExtra("contentTv1", "climb");
                intent.putExtra("contentTv2", "go or come up (a slope, incline, or staircase), especially by using the feet and sometimes the hands; ascend");
                intent.putExtra("contentTv3", "Akyat");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Sakit")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Sakit");
                intent.putExtra("contentTv", "Sakit");
                intent.putExtra("contentTv1", "Pain");
                intent.putExtra("contentTv2", "physical suffering or discomfort caused by illness or injury");
                intent.putExtra("contentTv3", "Sakit");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Saleg")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Saleg");
                intent.putExtra("contentTv", "Saleg");
                intent.putExtra("contentTv1", "Floor");
                intent.putExtra("contentTv2", "the lower surface of a room, on which one may walk");
                intent.putExtra("contentTv3", "Sahig");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Sampolo")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Sampolo");
                intent.putExtra("contentTv", "Sampolo");
                intent.putExtra("contentTv1", "Ten");
                intent.putExtra("contentTv2", "equivalent to the product of five and two; one more than nine; 10");
                intent.putExtra("contentTv3", "Sampu");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Seleng")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Seleng");
                intent.putExtra("contentTv", "Seleng");
                intent.putExtra("contentTv1", "See");
                intent.putExtra("contentTv2", "perceive with the eyes; discern visually");
                intent.putExtra("contentTv3", "Tingnan");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Sepsep")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Sepsep");
                intent.putExtra("contentTv", "Sepsep");
                intent.putExtra("contentTv1", "Suck");
                intent.putExtra("contentTv2", "draw into the mouth by contracting the muscles of the lip and mouth to make a partial vacuum");
                intent.putExtra("contentTv3", "Sipsip");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Siam")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Siam");
                intent.putExtra("contentTv", "Siam");
                intent.putExtra("contentTv1", "Nine");
                intent.putExtra("contentTv2", "Number");
                intent.putExtra("contentTv3", "Siyam");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Sidlangan")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Sidlangan");
                intent.putExtra("contentTv", "Sidlangan");
                intent.putExtra("contentTv1", "East");
                intent.putExtra("contentTv2", "the general direction of sunrise : the direction toward the right of one facing north. : the compass point directly opposite to west");
                intent.putExtra("contentTv3", "Silangan");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Siitaladang")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Siitaladang");
                intent.putExtra("contentTv", "Siitaladang");
                intent.putExtra("contentTv1", "Thorn");
                intent.putExtra("contentTv2", "a stiff, sharp-pointed, straight or curved woody projection on the stem or other part of a plant");
                intent.putExtra("contentTv3", "Tinik");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Silag")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Silag");
                intent.putExtra("contentTv", "Silag");
                intent.putExtra("contentTv1", "Anger");
                intent.putExtra("contentTv2", "A strong feeling of being upset or annoyed because of something wrong or bad");
                intent.putExtra("contentTv3", "Galit");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Singsing")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Singsing");
                intent.putExtra("contentTv", "Singsing");
                intent.putExtra("contentTv1", "Ring");
                intent.putExtra("contentTv2", "a small circular band, typically of precious metal and often set with one or more gemstones, worn on a finger as an ornament or a token of marriage, engagement, or authority");
                intent.putExtra("contentTv3", "Singsing");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Sino")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Sino");
                intent.putExtra("contentTv", "Sino");
                intent.putExtra("contentTv1", "Who");
                intent.putExtra("contentTv2", "what or which person or people");
                intent.putExtra("contentTv3", "Sino");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Sipa")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Sipa");
                intent.putExtra("contentTv", "Sipa");
                intent.putExtra("contentTv1", "Kick");
                intent.putExtra("contentTv2", "strike or propel forcibly with the foot");
                intent.putExtra("contentTv3", "Sipa");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Soba")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Soba");
                intent.putExtra("contentTv", "Soba");
                intent.putExtra("contentTv1", "River");
                intent.putExtra("contentTv2", "a large natural stream of water flowing in a channel to the sea, a lake, or another such stream");
                intent.putExtra("contentTv3", "Ilog");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Soka")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Soka");
                intent.putExtra("contentTv", "Soka");
                intent.putExtra("contentTv1", "Vomit");
                intent.putExtra("contentTv2", "eject matter from the stomach through the mouth");
                intent.putExtra("contentTv3", "Suka");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Sonog")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Sonog");
                intent.putExtra("contentTv", "Sonog");
                intent.putExtra("contentTv1", "Burn");
                intent.putExtra("contentTv2", "an injury to the skin or other organic tissue primarily caused by heat or due to radiation, radioactivity, electricity, friction or contact with chemicals");
                intent.putExtra("contentTv3", "Sunog");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Suay")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Suay");
                intent.putExtra("contentTv", "Suay");
                intent.putExtra("contentTv1", "Fight");
                intent.putExtra("contentTv2", "take part in a violent struggle involving the exchange of physical blows or the use of weapons");
                intent.putExtra("contentTv3", "Laban/ Away");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tadleng")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tadleng");
                intent.putExtra("contentTv", "Tadleng");
                intent.putExtra("contentTv1", "Straight");
                intent.putExtra("contentTv2", "extending or moving uniformly in one direction only; without a curve or bend");
                intent.putExtra("contentTv3", "Tuwid");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tageban")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tageban");
                intent.putExtra("contentTv", "Tageban");
                intent.putExtra("contentTv1", "Sheath for Bolo");
                intent.putExtra("contentTv2", "Flat sheath consists of one piece of wood against which knife fite and is held in place by a single wooden loop");
                intent.putExtra("contentTv3", "Taga");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Taginep")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Taginep");
                intent.putExtra("contentTv", "Taginep");
                intent.putExtra("contentTv1", "Dream");
                intent.putExtra("contentTv2", "a series of thoughts, images, and sensations occurring in a person's mind during sleep");
                intent.putExtra("contentTv3", "Panaginip");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tago")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tago");
                intent.putExtra("contentTv", "Tago");
                intent.putExtra("contentTv1", "Hide");
                intent.putExtra("contentTv2", "put or keep out of sight; conceal from the view or notice of others");
                intent.putExtra("contentTv3", "Tago");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tai")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tai");
                intent.putExtra("contentTv", "Tai");
                intent.putExtra("contentTv1", "Excrement");
                intent.putExtra("contentTv2", "waste matter discharged from the bowels; feces");
                intent.putExtra("contentTv3", "Dumi");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Takaw")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Takaw");
                intent.putExtra("contentTv", "Takaw");
                intent.putExtra("contentTv1", "Steal");
                intent.putExtra("contentTv2", "take (another person's property) without permission or legal right and without intending to return it");
                intent.putExtra("contentTv3", "Pagnanakaw");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Talinga")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Talinga");
                intent.putExtra("contentTv", "Talinga");
                intent.putExtra("contentTv1", "Ear");
                intent.putExtra("contentTv2", "The ear is the organ of hearing and balance.");
                intent.putExtra("contentTv3", "Tainga");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tanan")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tanan");
                intent.putExtra("contentTv", "Tanan");
                intent.putExtra("contentTv1", "All");
                intent.putExtra("contentTv2", "Used to refer to the whole quantity or extent of a particular group or thing");
                intent.putExtra("contentTv3", "Lahat");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tanem")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tanem");
                intent.putExtra("contentTv", "Tanem");
                intent.putExtra("contentTv1", "Plant");
                intent.putExtra("contentTv2", "a living organism of the kind exemplified by trees, shrubs, herbs, grasses, ferns, and mosses, typically growing in a permanent site");
                intent.putExtra("contentTv3", "Halaman");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tangis")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tangis");
                intent.putExtra("contentTv", "Tangis");
                intent.putExtra("contentTv1", "Cry");
                intent.putExtra("contentTv2", "to produce tears as the result of a strong emotion, such as unhappiness or pain");
                intent.putExtra("contentTv3", "Iyak");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tao")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tao");
                intent.putExtra("contentTv", "Tao");
                intent.putExtra("contentTv1", "Give");
                intent.putExtra("contentTv2", "freely transfer the possession of (something) to (someone); hand over to");
                intent.putExtra("contentTv3", "Bigay");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tarong")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tarong");
                intent.putExtra("contentTv", "Tarong");
                intent.putExtra("contentTv1", "Eggplant");
                intent.putExtra("contentTv2", "the purple egg-shaped fruit of a tropical Old World plant, which is eaten as a vegetable");
                intent.putExtra("contentTv3", "Talong");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tasik")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tasik");
                intent.putExtra("contentTv", "Tasik");
                intent.putExtra("contentTv1", "Soup");
                intent.putExtra("contentTv2", "a liquid dish, typically made by boiling meat, fish, or vegetables, etc., in stock or water");
                intent.putExtra("contentTv3", "Sabaw");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tatay")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tatay");
                intent.putExtra("contentTv", "Tatay");
                intent.putExtra("contentTv1", "Father");
                intent.putExtra("contentTv2", "man in relation to his child or children");
                intent.putExtra("contentTv3", "Tatay/Ama");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tatlo")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tatlo");
                intent.putExtra("contentTv", "Tatlo");
                intent.putExtra("contentTv1", "Three");
                intent.putExtra("contentTv2", "equivalent to the sum of one and two; one more than two; 3");
                intent.putExtra("contentTv3", "Tatlo");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tawag")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tawag");
                intent.putExtra("contentTv", "Tawag");
                intent.putExtra("contentTv1", "Call");
                intent.putExtra("contentTv2", "a cry made as a summons or to attract someone's attention");
                intent.putExtra("contentTv3", "Tawag");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tebeg")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tebeg");
                intent.putExtra("contentTv", "Tebeg");
                intent.putExtra("contentTv1", "Throat");
                intent.putExtra("contentTv2", "the passage which leads from the back of the mouth of a person or animal");
                intent.putExtra("contentTv3", "Lalamunan");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Telen")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Telen");
                intent.putExtra("contentTv", "Telen");
                intent.putExtra("contentTv1", "Swallow");
                intent.putExtra("contentTv2", "cause or allow (something, especially food or drink) to pass down the throat");
                intent.putExtra("contentTv3", "Lunok");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tian")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tian");
                intent.putExtra("contentTv", "Tian");
                intent.putExtra("contentTv1", "belly");
                intent.putExtra("contentTv2", "the front part of the human trunk below the ribs, containing the stomach and bowels");
                intent.putExtra("contentTv3", "Tiyan");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tigas")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tigas");
                intent.putExtra("contentTv", "Tigas");
                intent.putExtra("contentTv1", "Hard");
                intent.putExtra("contentTv2", "those that cannot be crushed, cut, distorted, or scraped readily");
                intent.putExtra("contentTv3", "Matigas");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Timid")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Timid");
                intent.putExtra("contentTv", "Timid");
                intent.putExtra("contentTv1", "chin");
                intent.putExtra("contentTv2", "the protruding part of the face below the mouth, formed by the apex of the lower jaw");
                intent.putExtra("contentTv3", "Baba");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Timprano")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Timprano");
                intent.putExtra("contentTv", "Timprano");
                intent.putExtra("contentTv1", "Morning");
                intent.putExtra("contentTv2", "the period of time between midnight and noon, especially from sunrise to noon");
                intent.putExtra("contentTv3", "Umaga");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tinai")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tinai");
                intent.putExtra("contentTv", "Tinai");
                intent.putExtra("contentTv1", "Intestines");
                intent.putExtra("contentTv2", "the lower part of the alimentary canal from the end of the stomach to the anus");
                intent.putExtra("contentTv3", "Bituka");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tindeg")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tindeg");
                intent.putExtra("contentTv", "Tindeg");
                intent.putExtra("contentTv1", "Stand");
                intent.putExtra("contentTv2", "have or maintain an upright position, supported by one's feet");
                intent.putExtra("contentTv3", "Tindig");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tingway")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tingway");
                intent.putExtra("contentTv", "Tingway");
                intent.putExtra("contentTv1", "Needle");
                intent.putExtra("contentTv2", "a very fine slender piece of metal with a point at one end and a hole or eye for thread at the other, used in sewing");
                intent.putExtra("contentTv3", "Karayom");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tio")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tio");
                intent.putExtra("contentTv", "Tio");
                intent.putExtra("contentTv1", "Dog");
                intent.putExtra("contentTv2", "The dog is a domesticated descendant of the wolf. Also called the domestic dog");
                intent.putExtra("contentTv3", "Aso");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tobig")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tobig");
                intent.putExtra("contentTv", "Tobig");
                intent.putExtra("contentTv1", "Water");
                intent.putExtra("contentTv2", "the clear liquid that has no color, taste, or smell, that falls from clouds as rain");
                intent.putExtra("contentTv3", "Tubig");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tobo")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tobo");
                intent.putExtra("contentTv", "Tobo");
                intent.putExtra("contentTv1", "Sugar Cane");
                intent.putExtra("contentTv2", "stout tall perennial grass (Saccharum officinarum) native to tropical southeast Asia that has a large terminal panicle and is widely grown in warm regions as a source of sugar");
                intent.putExtra("contentTv3", "Tubo");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Todlo")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Todlo");
                intent.putExtra("contentTv", "Todlo");
                intent.putExtra("contentTv1", "Finger");
                intent.putExtra("contentTv2", "each of the four slender jointed parts attached to either hand (or five, if the thumb is included)");
                intent.putExtra("contentTv3", "Daliri");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tolan")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tolan");
                intent.putExtra("contentTv", "Tolan");
                intent.putExtra("contentTv1", "Bone");
                intent.putExtra("contentTv2", "made of connective tissue reinforced with calcium and specialised bone cells");
                intent.putExtra("contentTv3", "Buto");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tolod")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tolod");
                intent.putExtra("contentTv", "Tolod");
                intent.putExtra("contentTv1", "Push");
                intent.putExtra("contentTv2", "exert force on (someone or something), typically with one's hand, in order to move them away from oneself or the origin of the force");
                intent.putExtra("contentTv3", "Tulak");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Too")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Too");
                intent.putExtra("contentTv", "Too");
                intent.putExtra("contentTv1", "Right (hand)");
                intent.putExtra("contentTv2", "on or toward the right side of a person or thing");
                intent.putExtra("contentTv3", "Kanan");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Tood")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Tood");
                intent.putExtra("contentTv", "Tood");
                intent.putExtra("contentTv1", "Knee");
                intent.putExtra("contentTv2", "the joint between the thigh and the lower leg in humans");
                intent.putExtra("contentTv3", "Tuhod");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Ulu")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Ulu");
                intent.putExtra("contentTv", "Ulu");
                intent.putExtra("contentTv1", "Head");
                intent.putExtra("contentTv2", "the upper part of the human body, or the front or upper part of the body of an animal");
                intent.putExtra("contentTv3", "Ulo");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Wak")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Wak");
                intent.putExtra("contentTv", "Wak");
                intent.putExtra("contentTv1", "Crow");
                intent.putExtra("contentTv2", "A crow is a bird of the genus Corvus, or more broadly a synonym for all of Corvus");
                intent.putExtra("contentTv3", "Uwak");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Wala")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Wala");
                intent.putExtra("contentTv", "Wala");
                intent.putExtra("contentTv1", "Left (hand)");
                intent.putExtra("contentTv2", "on, toward, or relating to the side of a human body or of a thing that is to the west when the person or thing is facing north");
                intent.putExtra("contentTv3", "Kaliwa");
                mContext.startActivity(intent);
            } else if (selectedWord.equals("Walo")) {
                Intent intent = new Intent(mContext, NewActivity.class);
                intent.putExtra("actionBarTitle", "Walo");
                intent.putExtra("contentTv", "Walo");
                intent.putExtra("contentTv1", "Eight");
                intent.putExtra("contentTv2", "Number");
                intent.putExtra("contentTv3", "Walo");
                mContext.startActivity(intent);
            }

// You can add more words using the same pattern.


        });

        return view;
    }

    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modelList.clear();
        if (charText.length()==0){
            modelList.addAll(arrayList);
        }
        else {
            for (Model model : arrayList){
                if (model.getTitle().toLowerCase(Locale.getDefault()).contains(charText)){
                    modelList.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }

}










