package Collection_Framework.sortAble_Ator;

import java.util.Comparator;

public class AgeComperator implements Comparator<Student_Comparable> {
    public int compare(Student_Comparable o1, Student_Comparable o2) {
        return o1.getAge()-o2.getAge();
    }

}
