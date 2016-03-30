package com.company;


import java.util.List;

/**
 * Created by Moon on 3/29/2016.
 */
public interface MyDataType {
    public void write(String key, String value);
    public String read(String key);
    public List<String> getKeys();    // return the keys in the order that it was written
    public void delete(String key);
}
