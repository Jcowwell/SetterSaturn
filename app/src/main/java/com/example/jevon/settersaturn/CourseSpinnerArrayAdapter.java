package com.example.jevon.settersaturn;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.sax.Element;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.jsoup.select.Elements;

/**
 * Created by Jevon on 4/15/18.
 */

public class CourseSpinnerArrayAdapter extends ArrayAdapter {

    private Elements elements;
    private final Context mContext;
    private final LayoutInflater mInflater;
    private final int mResource;


    public CourseSpinnerArrayAdapter(@NonNull Context context, int resource, @NonNull Object[] objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
        mInflater = LayoutInflater.from(context);

    }

    public CourseSpinnerArrayAdapter(@NonNull Context context, int resource, @NonNull Elements elements) {
        super(context, resource, elements);
        mContext = context;
        mResource = resource;
        this.elements = elements;
        mInflater = LayoutInflater.from(context);

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;
        ViewHolder viewHolder;

        if (view == null) {
            LayoutInflater inflater = mInflater;
            view = inflater.inflate(R.layout.spinner_item, null);
            viewHolder = new ViewHolder();
            viewHolder.elementText = view.findViewById(R.id.spinner_textview);
            view.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder)view.getTag();
        }

        viewHolder.elementText = view.findViewById(R.id.spinner_textview);
        viewHolder.elementText.setTypeface(Typeface.createFromAsset(mContext.getAssets(), "fonts/brandon_light.otf"));
        viewHolder.elementText.setTextColor(Color.WHITE);
        viewHolder.elementText.setText(elements.get(position).text());
        return view;

    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        
        View view = convertView;
        ViewHolder viewHolder;

        if (view == null) {
            LayoutInflater inflater = mInflater;
            view = inflater.inflate(R.layout.spinner_dropdown_item, null);
            viewHolder = new ViewHolder();
            viewHolder.elementText = view.findViewById(R.id.spinner_dropdown_textview);

            view.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder)view.getTag();
        }



        viewHolder.elementText = view.findViewById(R.id.spinner_dropdown_textview);
        viewHolder.elementText.setTypeface(Typeface.createFromAsset(mContext.getAssets(), "fonts/brandon_light.otf"));
        viewHolder.elementText.setTextColor(mContext.getResources().getColor(R.color.pace_gold, mContext.getTheme()));
        viewHolder.elementText.setText(elements.get(position).text());

        return convertView;
    }

    @Override
    public void setDropDownViewResource(int resource) {
        resource = R.layout.spinner_dropdown_item;
        super.setDropDownViewResource(resource);
    }


    @Override
    public int getCount() {
        return elements.size();
    }


    static class ViewHolder {
        TextView elementText;

    }



}

