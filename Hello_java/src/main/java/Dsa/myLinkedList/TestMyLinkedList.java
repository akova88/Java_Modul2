package Dsa.myLinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<Student>();
        Student student1 = new Student(1, "Trung");
        Student student2 = new Student(2, "Hải");
        Student student3 = new Student(3, "Kiên");
        Student student4 = new Student(4, "Đức");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
//        System.out.println(myLinkedList.contains(student4));
//        System.out.println(myLinkedList.indexOf(student4));
//        myLinkedList.clear();
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());

//        myLinkedList.printList();
//        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();
//        for (int i = 0; i < cloneLinkedList.size(); i++) {
//            Student student = (Student) myLinkedList.get(i);
//            System.out.println(((Student) cloneLinkedList.get(i)).getName());
//        }
//        myLinkedList.add(2,student4);
//        myLinkedList.remove(3);
//        myLinkedList.remove(0);
        for (int i = 0; i < myLinkedList.size(); i++) {
//            Student student = (Student) myLinkedList.get(i);
            System.out.println(((Student) myLinkedList.get(i)).getName());
        }
    }
}
