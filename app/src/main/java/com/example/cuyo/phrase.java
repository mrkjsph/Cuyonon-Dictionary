package com.example.cuyo;

public class phrase {
    private String cuy;
    private String eng;
    private String tag;
    private int audioResourceId;

    public phrase(String cuy, String eng, String tag ,int audioResourceId){
        this.cuy = cuy;
        this.eng = eng;
        this.tag = tag;
    }

    public int getAudioResourceId() {
        return audioResourceId;
    }
    public String getCuy() {
        return cuy;
    }

    public void setCuy(String cuy) {
        this.cuy = cuy;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
