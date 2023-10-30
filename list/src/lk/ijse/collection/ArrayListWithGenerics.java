package lk.ijse.collection;

/*
    @author DanujaV
    @created 10/30/23 - 10:00 AM   
*/

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithGenerics {
    public static void main(String[] args) {
        List<Double> prfMarks = new ArrayList<>();
        prfMarks.add(75.6);
        prfMarks.add(45.0);

//        prfMarks.add("Saman");

        List<String> nameList = new ArrayList<>();
        nameList.add("Kamal");
        nameList.add("Savinda");

//        nameList.add(10);
    }
}
