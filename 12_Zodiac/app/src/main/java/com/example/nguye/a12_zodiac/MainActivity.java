package com.example.nguye.a12_zodiac;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final List<Zodiacs> zodiacs = getListZodiacs();
        GridView gridView = (GridView) findViewById(R.id.grid_view_list_zodiac);
        final WebView webView = findViewById(R.id.web_view);
        gridView.setAdapter(new Adapter(this, zodiacs));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Intent intent = new Intent(MainActivity.this, ZodiacDetail.class);
                intent.putExtra("url", zodiacs.get(position).getUrl());
                startActivity(intent);
            }
        });
    }

    private List<Zodiacs> getListZodiacs() {
        List<Zodiacs> listZodiacs = new ArrayList<>();
        Zodiacs aquarius = new Zodiacs(R.drawable.aquarius, "Aquarius", "20/1-18/02", "file:///android_asset/aquarius.html");
        Zodiacs aries = new Zodiacs(R.drawable.aries, "Aries", "21/3-20/04", "file:///android_asset/aries.html");
        Zodiacs cancer = new Zodiacs(R.drawable.cancer, "Cancer", "22/06-22/07", "file:///android_asset/cancer.html");
        Zodiacs capricorn = new Zodiacs(R.drawable.capricorn, "Capricorn", "22/12-19/01", "file:///android_asset/capricorn.html");
        Zodiacs gemini = new Zodiacs(R.drawable.gemini, "Gemini", "21/05-21/06", "file:///android_asset/gemini.html");
        Zodiacs leo = new Zodiacs(R.drawable.leo, "Leo", "23/07-22/08", "file:///android_asset/leo.html");
        Zodiacs libra = new Zodiacs(R.drawable.libra, "Libra", "23/09-23/10", "file:///android_asset/libra.html");
        Zodiacs pisces = new Zodiacs(R.drawable.pisces, "Pisces", "19/02-20/03", "file:///android_asset/pisces.html");
        Zodiacs sagittarius = new Zodiacs(R.drawable.sagittarius, "Sagittarius", "23/11-21/12", "file:///android_asset/sagittarius.html");
        Zodiacs scorpio = new Zodiacs(R.drawable.scorpio, "Scorpio", "24/10-22/11", "file:///android_asset/scorpio.html");
        Zodiacs taurus = new Zodiacs(R.drawable.taurus, "Taurus", "21/04-20/05", "file:///android_asset/taurus.html");
        Zodiacs virgo = new Zodiacs(R.drawable.virgo, "Virgo", "23/08-22/09", "file:///android_asset/virgo.html");
        listZodiacs.add(aquarius);
        listZodiacs.add(aries);
        listZodiacs.add(cancer);
        listZodiacs.add(capricorn);
        listZodiacs.add(gemini);
        listZodiacs.add(leo);
        listZodiacs.add(libra);
        listZodiacs.add(pisces);
        listZodiacs.add(sagittarius);
        listZodiacs.add(scorpio);
        listZodiacs.add(taurus);
        listZodiacs.add(virgo);


        return listZodiacs;
    }
}
