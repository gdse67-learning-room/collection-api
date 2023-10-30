package lk.ijse.collection;

/*
    @author DanujaV
    @created 10/30/23 - 11:25 AM   
*/

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(76);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(45);

        System.out.println(set);
    }
}
