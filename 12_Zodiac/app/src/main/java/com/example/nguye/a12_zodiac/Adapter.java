package com.example.nguye.a12_zodiac;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {

    private List<Zodiacs> zodiacs;
    private LayoutInflater layoutInflater;
    private Context context;

    public Adapter(Context context, List<Zodiacs> zodiacs) {
        this.context = context;
        this.zodiacs = zodiacs;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return zodiacs.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public static int getScreenWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int getScreenHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;


        if (view == null) {
            view = layoutInflater.inflate(R.layout.activity_item, null);
            viewHolder = new ViewHolder();
            viewHolder.img_icon = (ImageView) view.findViewById(R.id.imageView_icon);
            viewHolder.txt_name = (TextView) view.findViewById(R.id.textView_name);
            viewHolder.txt_date = (TextView) view.findViewById(R.id.textView_date);
//            view.setLayoutParams(new ViewGroup.LayoutParams(getScreenWidth() / 4, getScreenHeight() / 6));
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        Zodiacs zodiacs = this.zodiacs.get(position);
        int imageId = zodiacs.getImgId();

        viewHolder.img_icon.setImageResource(imageId);
        viewHolder.txt_name.setText(zodiacs.getName());
        viewHolder.txt_date.setText(zodiacs.getDate());


        return view;
    }


    static class ViewHolder {
        ImageView img_icon;
        TextView txt_name;
        TextView txt_date;
    }
}
