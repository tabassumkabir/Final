package com.example.finallogin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    int[] flags;
    String[] sylhet;
    private LayoutInflater inflater;

    CustomAdapter(Context context,int[]flags,String[]sylhet){
        this.context=context;
        this.flags=flags;
        this.sylhet=sylhet;

    }
    @Override
    public int getCount() {
        return sylhet.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.sample_view,parent,false);
        }

        ImageView imageView=convertView.findViewById(R.id.ratargul);
        TextView textView=convertView.findViewById(R.id.textView);
        imageView.setImageResource(flags[position]);
        textView.setText(sylhet[position]);
        return convertView;
    }
}
