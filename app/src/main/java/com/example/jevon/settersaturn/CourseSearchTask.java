package com.example.jevon.settersaturn;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Jevon on 4/22/18.
 */

public class CourseSearchTask extends AsyncTask<HashMap<String, Elements>, Void, HashMap<String, Elements>> {

    private HashMap<String, Elements> elementsHashMap;

    public interface MyAsyncTaskCallback {
        void onAsyncTaskComplete(HashMap<String, Elements> elementsHashMap);
    }

    private MyAsyncTaskCallback myAsyncTaskCallback;

    public CourseSearchTask(Context context) {
        super();
        myAsyncTaskCallback = (MyAsyncTaskCallback) context;
    }

    @Override
    protected HashMap<String, Elements> doInBackground(HashMap<String, Elements>[] hashMaps) {
        connect();
        return elementsHashMap;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(HashMap<String, Elements> elementsHashMap) {
        super.onPostExecute(elementsHashMap);
        myAsyncTaskCallback.onAsyncTaskComplete(elementsHashMap);
    }

    private void connect() {
        final String SCHEDULE_EXPLORER_URL = "https://appsrv.pace.edu/ScheduleExplorerLive/";
        elementsHashMap = new HashMap<>();

        try {
            Document doc = Jsoup.connect(SCHEDULE_EXPLORER_URL)
                    .get();

            //FIXME: Change name attr to id for future proofing

            //Elements for Course Search Spanner

            Elements terms = doc.select("select[name=term] > optgroup[label=-----------------------------------------------------------]");

            Elements summerTerms = doc.select("select[name=term] > optgroup[label=-----------Summer Courses---------------------]");

            terms.addAll(summerTerms);

            elementsHashMap.put("terms", terms);

            Elements courseLevels = doc.select("select[name=level]");

            elementsHashMap.put("levels", courseLevels);
            //getcoursenumbers.cfm?subject=CS"
            //Elements courseNumber = Jsoup.connect("https://appsrv.pace.edu/ScheduleExplorerlive/getcoursenumbers.cfm?subject=CS").get().select("select[name=coursenumber]");

            //"getsubjects.cfm?r=756276&level="+level
            Elements subjects = doc.select("select[name=subject]");

            elementsHashMap.put("subjects", subjects);

            Elements days = doc.select("select[name=day]");

            elementsHashMap.put("days",days);

            Elements times = doc.select("select[name=time]");

            elementsHashMap.put("times", times);

            Elements instructors = doc.select("select[name=professor]");

            elementsHashMap.put("instructors", instructors);

            Elements locations = doc.select("select[name=location]");


            elementsHashMap.put("locations", locations);

            Elements attributes = doc.select("select[name=AOK]");

            elementsHashMap.put("attributes", attributes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
