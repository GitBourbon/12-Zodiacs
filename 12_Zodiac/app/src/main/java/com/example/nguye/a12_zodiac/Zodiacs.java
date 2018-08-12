package com.example.nguye.a12_zodiac;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class Zodiacs {

    private int imgId;
    private String url;

    public int getImgId() {
        return imgId;
    }

    public String getUrl() {
        return url;
    }

    private String name;
    private String date;


    public Zodiacs(int imgId, String name, String date, String url) {
        this.url = url;
        this.imgId = imgId;
        this.name = name;
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {

        return name;
    }

    public String getDate() {
        return date;
    }

}
