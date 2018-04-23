package com.example.jevon.settersaturn;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;

public class HomeActivity extends AppCompatActivity {

    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        linkXMLElements();
//        CourseSearchTask courseSearchTask = new CourseSearchTask(this);
//        courseSearchTask.execute();
        Intent intent = new Intent(this, CourseSearchActivity.class);
        startActivity(intent);
    }

    private void linkXMLElements() {
        frameLayout = findViewById(R.id.home_frame_layout);
    }

    private void switchFrameLayout(Fragment fragment) {
        getFragmentManager().beginTransaction().replace(frameLayout.getId(), fragment).commit();
    }

}
