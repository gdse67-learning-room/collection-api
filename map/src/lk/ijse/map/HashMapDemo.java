package lk.ijse.map;

/*
    @author DanujaV
    @created 10/30/23 - 11:32 AM   
*/

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map map = new HashMap<>();  // key-value pairing

        map.put("lk", "Kotte");
        map.put("uk", "London");
        map.put("usa", "New York");

        System.out.println(map);

        Object lk = map.get("lk");
        System.out.println("get(lk): " + lk);


        Map<String, Integer> mapList = new HashMap<>();

        mapList.put("kamal", 25);
        mapList.put("saman", 18);

//        mapList.put(1, "18");

    }
}
