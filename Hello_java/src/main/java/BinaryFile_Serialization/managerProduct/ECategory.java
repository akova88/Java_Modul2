package BinaryFile_Serialization.managerProduct;

public enum ECategory {
    PHONE(1, "Điện thoại"), TABLET(2, "Máy tính bảng");
    private int id;
    private String name;

    ECategory(int id, String name) {
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
    public static ECategory getECategoryById(int idCategory) {
        for (ECategory eCategory : ECategory.values()) {
            if (eCategory.getId() == idCategory) {
                return eCategory;
            }
        }
        return null;
    }
}
