package Access_modifier.student;

public class Student {
    private int rollno;
    private String name;
    private static String college = "CODE GYM";
    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    static void change() {
        college = "CODE GYM HUE";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
