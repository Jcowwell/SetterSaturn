package com.example.jevon.settersaturn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.jevon.settersaturn.CourseSearchTask.MyAsyncTaskCallback;

import org.jsoup.select.Elements;

import java.util.HashMap;

/**
 * Created by Jevon on 4/15/18.
 */

public class CourseSearchActivity extends AppCompatActivity implements MyAsyncTaskCallback {

//    Required Spinner Fields

    Spinner termSpinner;
    Spinner courseLevelSpinner;
    Spinner subjectSpinner;

//    Optional Spinner Fields

    Spinner courseNumberSpinner;
    Spinner campusSpinner;
    Spinner instructorSpinner;
    Spinner attributeSpinner;
    Spinner daySpinner;
    Spinner timeSpinner;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_search);
        linkXMLElements();
        setAdapters();

    }


//    Method to Java Objects to XML Elements

    private void linkXMLElements() {

        termSpinner = findViewById(R.id.term_spinner);
        courseLevelSpinner = findViewById(R.id.course_level_spinner);
        subjectSpinner = findViewById(R.id.subject_spinner);
        courseNumberSpinner = findViewById(R.id.course_number_spinner);
        campusSpinner = findViewById(R.id.campus_spinner);
        instructorSpinner = findViewById(R.id.instructor_spinner);
        attributeSpinner = findViewById(R.id.attributes_spinner);
        daySpinner = findViewById(R.id.day_spinner);
        timeSpinner = findViewById(R.id.time_spinner);
    }

//    Method to set Anonymous Adapters

    private void setAdapters() {
        int spinnerLayout = R.layout.spinner_item;

        termSpinner.setAdapter(new CourseSpinnerArrayAdapter(this, spinnerLayout, getArrayData(getString(R.string.term_label))));
        courseLevelSpinner.setAdapter(new CourseSpinnerArrayAdapter(this, spinnerLayout, getArrayData(getString(R.string.course_level_label))));
        subjectSpinner.setAdapter(new CourseSpinnerArrayAdapter(this, spinnerLayout, getArrayData(getString(R.string.subject_label))));
        courseNumberSpinner.setAdapter(new CourseSpinnerArrayAdapter(this, spinnerLayout, getArrayData(getString(R.string.course_number_label))));
        campusSpinner.setAdapter(new CourseSpinnerArrayAdapter(this, spinnerLayout, getArrayData(getString(R.string.campus_label))));
        instructorSpinner.setAdapter(new CourseSpinnerArrayAdapter(this, spinnerLayout, getArrayData(getString(R.string.instructor_label))));
        attributeSpinner.setAdapter(new CourseSpinnerArrayAdapter(this, spinnerLayout, getArrayData(getString(R.string.attributes_label))));
        daySpinner.setAdapter(new CourseSpinnerArrayAdapter(this, spinnerLayout, getArrayData(getString(R.string.day_label))));
        timeSpinner.setAdapter(new CourseSpinnerArrayAdapter(this, spinnerLayout, getArrayData(getString(R.string.time_label))));

    }

//    Method to get Data for Spinners

    private String[] getArrayData(String spinnerKey) {

        switch(spinnerKey) {
            case "Term":
                return getResources().getStringArray(R.array.terms);
            case "Course Level":
                return getResources().getStringArray(R.array.course_levels);
            case "Subject":
                return getResources().getStringArray(R.array.subjects);
            case "Course Number":
                return getResources().getStringArray(R.array.subjects);
            case "Campus":
                return getResources().getStringArray(R.array.campuses);
            case "Instructor":
                return getResources().getStringArray(R.array.instructors);
            case "Attributes":
                getResources().getStringArray(R.array.attributes);
            case "Day":
                return getResources().getStringArray(R.array.days);
            case "Time":
                return getResources().getStringArray(R.array.times);
            default:
                System.out.println(spinnerKey);
                return getResources().getStringArray(R.array.errors);

        }
    }


    @Override
    public void onAsyncTaskComplete(HashMap<String, Elements> elementsHashMap) {
        int spinnerLayout = R.layout.spinner_item;

        termSpinner.setAdapter(new CourseSpinnerArrayAdapter(this, spinnerLayout, getArrayData(String.valueOf(R.string.term_label))));
        courseLevelSpinner.setAdapter(new CourseSpinnerArrayAdapter(this, spinnerLayout, getArrayData(String.valueOf(R.string.course_level_label))));
        subjectSpinner.setAdapter(new CourseSpinnerArrayAdapter(this, spinnerLayout, getArrayData(String.valueOf(R.string.subject_label))));
        courseNumberSpinner.setAdapter(new CourseSpinnerArrayAdapter(this, spinnerLayout, getArrayData(String.valueOf(R.string.course_number_label))));
        campusSpinner.setAdapter(new CourseSpinnerArrayAdapter(this, spinnerLayout, getArrayData(String.valueOf(R.string.campus_label))));
        instructorSpinner.setAdapter(new CourseSpinnerArrayAdapter(this, spinnerLayout, getArrayData(String.valueOf(R.string.instructor_label))));
        attributeSpinner.setAdapter(new CourseSpinnerArrayAdapter(this, spinnerLayout, getArrayData(String.valueOf(R.string.attributes_label))));
        daySpinner.setAdapter(new CourseSpinnerArrayAdapter(this, spinnerLayout, getArrayData(String.valueOf(R.string.day_label))));
        timeSpinner.setAdapter(new CourseSpinnerArrayAdapter(this, spinnerLayout, getArrayData(String.valueOf(R.string.time_label))));

    }
}
