package com.example.vbi_cpn;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToastTeProvider {
    public static List<ToastTesing> parse(String rssFeed) {
        List<ToastTesing> list = new ArrayList<>();
        Random r = new Random();
        // random number of item but at least 5
        Integer number = r.nextInt(10) + 5;
        for (int i = 0; i < number; i++) {
            // create sample data
            String s = String.valueOf(r.nextInt(1000));
            ToastTesing item = new ToastTesing("Summary " + s, "Description " + s);
            list.add(item);
        }
        return list;
    }
}
