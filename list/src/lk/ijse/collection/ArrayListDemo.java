package lk.ijse.collection;

/*
    @author DanujaV
    @created 10/30/23 - 9:41 AM   
*/

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();

        boolean listEmpty = list.isEmpty();
        System.out.println("listEmpty: " + listEmpty);

        list.add(10);
        list.add(65);
        list.add("Saman");
        list.add("Kamal");
        list.add('A');
        list.add(true);

        System.out.println(list);

        boolean isDeleted = list.remove("Kamal");
        System.out.println(isDeleted);

        System.out.println(list);

        Object removedObj = list.remove(3);
        System.out.println("removedObj: " + removedObj);

        System.out.println(list);

        boolean isContains = list.contains("heeee");
        System.out.println("isContains: " + isContains);

        int index = list.indexOf("Saman");
        System.out.println("index: " + index);

        listEmpty = list.isEmpty();
        System.out.println("listEmpty: " + listEmpty);

        int size = list.size();
        System.out.println("size: " + size);
    }
}
