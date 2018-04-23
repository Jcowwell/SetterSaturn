package com.example.jevon.settersaturn;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jevon on 4/15/18.
 */

public class CourseSpinnerArrayAdapter extends ArrayAdapter {

    public CourseSpinnerArrayAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public CourseSpinnerArrayAdapter(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public CourseSpinnerArrayAdapter(@NonNull Context context, int resource, @NonNull Object[] objects) {
        super(context, resource, objects);
    }

    public CourseSpinnerArrayAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull Object[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public CourseSpinnerArrayAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
    }

    public CourseSpinnerArrayAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List objects) {
        super(context, resource, textViewResourceId, objects);
    }



    @Override
    public void setDropDownViewResource(int resource) {
        resource = R.layout.spinner_dropdown_item;
        super.setDropDownViewResource(resource);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        

        return super.getDropDownView(position, convertView, parent);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }


}

