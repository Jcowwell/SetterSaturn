package com.example.jevon.settersaturn;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.NumberPicker;

import java.util.ArrayList;

/**
 * Created by Jevon on 4/10/18.
 *
 * Meant to use strings instead of numbers via formatting.
 */

public class StringPicker extends NumberPicker {

    //Data String list for Picker View
    private ArrayList<String> stringArrayList = new ArrayList<String>();

    //CONSTRUCTORS
    public StringPicker(Context context) {
        super(context);
        setMinValue(0);
    }

    public StringPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
        setMinValue(0);
    }
    //GETTER
    public ArrayList<String> getStringArrayList() {
        return stringArrayList;
    }

    //SETTER
    public void setStringArrayList(ArrayList<String> stringArrayList) {
        this.stringArrayList = stringArrayList;
        setMaxValue();
    }

    //VALUE SETTER
    public void setStringArrayListValue(String stringArrayListValue) {
        stringArrayList.add(stringArrayListValue);
        setMaxValue();
    }

    //MAX VALUE SETTER
    public void setMaxValue() {
        setMaxValue(stringArrayList.size() - 1);
    }

    //STRING FORMAT SETTER
//    public void setStringFormat() {
//        super.setFormatter(new Formatter() {
//            @Override
//            public String format(int value) {
//                return stringArrayList.get(value);
//            }
//        });
//    }

    @Override
    public void setFormatter(Formatter formatter) {
        super.setFormatter(new Formatter() {
            @Override
            public String format(int value) {
                return stringArrayList.get(value);
            }
        });
    }
}
