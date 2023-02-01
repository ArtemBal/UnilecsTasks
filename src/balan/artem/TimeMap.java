package balan.artem;

import java.util.HashMap;

public class TimeMap {
    HashMap<String, HashMap<Integer, String>> timeMap;

    TimeMap() {
        timeMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if(!timeMap.containsKey(key)) {
            timeMap.put(key, new HashMap<>());
        }
        timeMap.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (timeMap.containsKey(key)) {
            for(int i = timestamp; i >= 0; i--)
                if(timeMap.get(key).containsKey(i))
                    return timeMap.get(key).get(i);
        }
        return "";
    }
}
