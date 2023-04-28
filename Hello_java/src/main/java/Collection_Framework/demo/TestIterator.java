package Collection_Framework.demo;

import java.util.*;
import java.util.Collection;

public class TestIterator {
    public static void main(String[] args) {
        Collection collection = new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString().toUpperCase() + " ");
        }

        for (Object element : collection) {
            System.out.print(element.toString().toUpperCase()+" ");
        }
    }
}
