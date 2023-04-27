package Collection_Framework.sortAble_Ator;

import java.util.Comparator;

public class AgeComperator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }

}
