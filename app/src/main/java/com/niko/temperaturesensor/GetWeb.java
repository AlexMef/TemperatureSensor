package com.niko.temperaturesensor;

import android.os.AsyncTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GetWeb extends AsyncTask<Void, Void, String> {
    @Override
    protected String doInBackground(Void... voids) {
//        Document doc = Jsoup.parse("https://ua.sinoptik.ua/%D0%BF%D0%BE%D0%B3%D0%BE%D0%B4%D0%B0-%D0%BE%D0%B4%D0%B5%D1%81%D0%B0");
//        Element link = doc.select("div").first();

//        String temp = link.attr("class");

//        return temp;
        return null; // delete!!!
    }
}
