package lk.ijse.collection;

/*
    @author DanujaV
    @created 10/30/23 - 11:27 AM   
*/

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(76);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(45);

        System.out.println(set);
    }
}
