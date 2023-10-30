package lk.ijse.collection;

/*
    @author DanujaV
    @created 10/30/23 - 10:05 AM   
*/

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);

        System.out.println(list);
    }
}
