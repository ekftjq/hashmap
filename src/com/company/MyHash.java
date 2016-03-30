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
        count = 0;
    }

    public void write(String key, String value) {
        hm.put(key, value);
        hm2.put(count, key);
        count++;
    }

    public String read(String key) {
        String s = (String) hm.get(key);
        return s;
    }

    public List<String> getKeys() {
        List<String> keylist = new ArrayList<String>(); // ERROR
        for(int i = 0; i<hm2.size(); i++) {
            String k = (String) hm2.get(i);
            keylist.add(k);
        }
        return keylist;
    }

    public void delete(String key) {
        hm.remove(key);
        hm2.get();
        hm2.remove();
    }

}
