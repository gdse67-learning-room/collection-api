package lk.ijse.map;

/*
    @author DanujaV
    @created 10/30/23 - 11:42 AM   
*/

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();

        map.put("lk", "Kotte");
        map.put("uk", "London");
        map.put("aus", "Melbourne");
        map.put("usa", "New York");

        System.out.println(map);
    }
}
