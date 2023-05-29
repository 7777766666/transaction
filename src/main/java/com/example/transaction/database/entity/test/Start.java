package com.example.transaction.database.entity.test;

import org.apache.logging.log4j.util.PropertySource;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Start {

    public static void main(String[] args) throws CloneNotSupportedException {

        A a = new A();

        A clone =(A) a.clone();

        System.out.println(clone.getClass() + "  lol");


        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("EightyEyght", 88);
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);
        hashMap.put("Minus40", -40);

        Map<String, Integer> stringIntegerMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return hashMap.get(o1).compareTo(hashMap.get(o2));

            }
        });

        stringIntegerMap.putAll(hashMap);



        for (String key: stringIntegerMap.keySet()){
            System.out.println(key + " " +hashMap.get(key)+ " ");
        }



    }

}
