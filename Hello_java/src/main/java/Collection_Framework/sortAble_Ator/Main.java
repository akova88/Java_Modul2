package Collection_Framework.sortAble_Ator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien", 33, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("Tung", 44, "HT" );

        List<Student> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student sv : lists) {
            System.out.println(sv);
        }
        AgeComperator ageComperator = new AgeComperator();
        Collections.sort(lists, ageComperator);
        System.out.println("So sánh theo tuổi");
        for (Student st : lists) {
            System.out.println(st);
        }
    }
}
