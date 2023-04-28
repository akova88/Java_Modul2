package Collection_Framework.sortAble_Ator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student_Comparable studentComparable = new Student_Comparable("Kien", 33, "HT");
        Student_Comparable studentComparable1 = new Student_Comparable("Nam", 26, "HN");
        Student_Comparable studentComparable2 = new Student_Comparable("Anh", 38, "HT" );
        Student_Comparable studentComparable3 = new Student_Comparable("Tung", 44, "HT" );

        List<Student_Comparable> lists = new ArrayList<>();
        lists.add(studentComparable);
        lists.add(studentComparable1);
        lists.add(studentComparable2);
        lists.add(studentComparable3);
        Collections.sort(lists);
        for (Student_Comparable sv : lists) {
            System.out.println(sv);
        }
        AgeComperator ageComperator = new AgeComperator();
        Collections.sort(lists, ageComperator);
        System.out.println("So sánh theo tuổi");
        for (Student_Comparable st : lists) {
            System.out.println(st);
        }
    }
}
