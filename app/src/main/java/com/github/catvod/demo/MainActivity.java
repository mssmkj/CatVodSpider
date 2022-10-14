package com.github.catvod.demo;

import android.app.Activity;
import android.os.Bundle;

import com.github.catvod.R;
import com.github.catvod.net.OkHttpUtil;
import com.github.catvod.spider.Dm84;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread(() -> {
            try {

                  Dm84();


            } catch (Exception e) {
                e.printStackTrace();
            }


        }).start();
    }


    private void Dm84() {
        Dm84 dm = new Dm84();
        dm.init(MainActivity.this);

        String aa = dm.detailContent(Collections.singletonList("217"));
        System.out.println(aa);


    }

}