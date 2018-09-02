package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by BinaryWorld on 17-Sep-16.
 */
public class WordAdapter extends BaseAdapter {

    Context context ;
    ArrayList <Word> words;
    int mColor;

    public WordAdapter(Context context,ArrayList<Word> words,int color ){

        this.context = context;
        this.words =words;
        this.mColor=color;
    }


    @Override
    public int getCount() {
        return words.size();
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


        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View root = inflater.inflate(R.layout.list_item,parent,false);

        TextView mDefaultTranslation = (TextView) root.findViewById(R.id.default_text_view);
        TextView mMiwokTranslation =(TextView) root.findViewById(R.id.miwok_text_view);
        ImageView mImageResource = (ImageView) root.findViewById(R.id.image);



        if(words.get(position).isHasImage()==false){

            mImageResource.setVisibility(View.GONE);
            mDefaultTranslation.setText(words.get(position).getmDefaultTranslation().toString());
            mMiwokTranslation.setText(words.get(position).getmMiwokTranslation().toString());
        }

        else {
            mDefaultTranslation.setText(words.get(position).getmDefaultTranslation().toString());
            mMiwokTranslation.setText(words.get(position).getmMiwokTranslation().toString());
            mImageResource.setImageResource(words.get(position).getImageResourceId());
        }

        View text_container=root.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(context, mColor);
        text_container.setBackgroundColor(color);


              return root;
    }

    public boolean hasImage(boolean b){
        return b;
    }
}

