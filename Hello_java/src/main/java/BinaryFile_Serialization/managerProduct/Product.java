package BinaryFile_Serialization.managerProduct;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private double price;
    private ECategory eCategory;
    private String description;

    public Product() {
    }

    public Product(int id, String name, double price, ECategory eCategory, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.eCategory = eCategory;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,", this.id, this.name,
                this.price, this.eCategory, this.description);
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ECategory geteCategory() {
        return eCategory;
    }

    public void setECategory(ECategory eCategory) {
        this.eCategory = eCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
