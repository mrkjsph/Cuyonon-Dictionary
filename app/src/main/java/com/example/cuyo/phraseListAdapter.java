package com.example.cuyo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.cuyo.phrase;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class phraseListAdapter extends ArrayAdapter<phrase> {

    private static final String TAG = "phraseListAdapter";
    private Context mContext;
    int mResource;
    public phraseListAdapter(Context context, int resource, ArrayList<phrase> objects){
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //get the phrases information
        String cuy = getItem(position).getCuy();
        String eng = getItem(position).getEng();
        String tag = getItem(position).getTag();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvCuy = (TextView) convertView.findViewById(R.id.textView1);
        TextView tvEng = (TextView) convertView.findViewById(R.id.textView2);
        TextView tvTag = (TextView) convertView.findViewById(R.id.textView3);

        tvCuy.setText(cuy);
        tvEng.setText(eng);
        tvTag.setText(tag);

        return convertView;
    }
}
