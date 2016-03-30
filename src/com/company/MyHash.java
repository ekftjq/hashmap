package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Moon on 3/29/2016.
 */
public class MyHash implements MyDataType {
    HashMap hm;
    HashMap hm2;
    HashMap hm3;
    int count;

    public MyHash() {
        hm = new HashMap<String, String>();
        hm2 = new HashMap<String, String>();
        hm3 = new HashMap<String, String>();
        count = 0;
    }

    public void write(String key, String value) {
        hm.put(key, value);
        hm2.put(count, key);
        hm3.put(key, count);
        count++;
    }

    public String read(String key) {
        String s = (String) hm.get(key);
        return s;
    }

    public List<String> getKeys() {
        List<String> keylist = new ArrayList<String>(); // ERROR
        //System.out.println(hm2.size());
        for(int i = 0; i < hm3.size(); i++) {
            //System.out.println(hm2.get(i));
            if(hm2.get(i) != null) {
                String k = (String) hm2.get(i);
                keylist.add(k);
            }
        }
        return keylist;
    }

    public void delete(String key) {
        //System.out.println(hm);
        hm.remove(key);
        //System.out.println(hm);
        int s = (int) hm3.get(key);
        //System.out.println("The deleted : "+ s);
        //System.out.println(hm2);
        hm2.remove(s);
        //System.out.println(hm2);
        //hm2.get();
        //hm2.remove();
    }

}
