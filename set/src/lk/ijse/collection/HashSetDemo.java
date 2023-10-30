package lk.ijse.collection;

/*
    @author DanujaV
    @created 10/30/23 - 11:17 AM   
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        System.out.println("list: " + list);

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);

        System.out.println("set: " + set);
    }
}
