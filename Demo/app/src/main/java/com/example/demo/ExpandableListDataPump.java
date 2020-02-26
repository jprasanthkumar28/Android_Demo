package com.example.demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> Nilgiri = new ArrayList<String>();
        Nilgiri.add("N101");
        Nilgiri.add("N102");
        Nilgiri.add("N103");
        Nilgiri.add("N104");
        Nilgiri.add("N105");

        List<String> himalaya = new ArrayList<String>();
        himalaya.add("H101");
        himalaya.add("H102");
        himalaya.add("H103");
        himalaya.add("H104");
        himalaya.add("H105");

        List<String> vindhya = new ArrayList<String>();
        vindhya.add("V101");
        vindhya.add("V102");
        vindhya.add("V103");
        vindhya.add("V104");
        vindhya.add("V105");

        expandableListDetail.put("Nigiri Block", Nilgiri);
        expandableListDetail.put("Himalaya Block", himalaya);
        expandableListDetail.put("Vindhya Block", vindhya);
        return expandableListDetail;
    }
}
