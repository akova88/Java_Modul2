package Access_modifier.sinhvien;

public class Sinhvien {
    private String name = "John";
    private String classes = "C02";

    protected void setName(String name) {
        this.name = name;
    }
    void setClasses(String classes){
        this.classes = classes;
    }
    protected String display() {
        return "Tên: " + this.name + " - Lớp: " + this.classes;
    }
}
