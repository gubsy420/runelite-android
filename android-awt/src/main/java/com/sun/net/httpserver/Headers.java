package com.sun.net.httpserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Headers extends HashMap<String, List<String>> {
    private static final long serialVersionUID = 1L;

    public void add(String key, String value) {
        computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }

    public String getFirst(String key) {
        List<String> list = get(key);
        return (list == null || list.isEmpty()) ? null : list.get(0);
    }

    public void set(String key, String value) {
        List<String> list = new ArrayList<>();
        list.add(value);
        put(key, list);
    }
}
