package lk.ijse.map;

/*
    @author DanujaV
    @created 10/30/23 - 11:45 AM   
*/

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("lk", "Kotte");
        map.put("uk", "London");
        map.put("aus", "Melbourne");
        map.put("usa", "New York");

        System.out.println(map);
    }
}
