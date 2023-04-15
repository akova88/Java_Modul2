package Access_modifier.sinhvien;

public class Test {
    public static void main(String[] args) {
        Sinhvien sv = new Sinhvien ();
        sv.setName("Akova");
        sv.setClasses("C01");
        System.out.println(sv.display());
        Sinhvien sv1 = new Sinhvien();
        sv1.setName("Phuoc");
        sv1.setClasses("C03");
        System.out.println(sv1.display());
    }
}
