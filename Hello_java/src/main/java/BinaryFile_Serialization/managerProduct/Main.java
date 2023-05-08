package BinaryFile_Serialization.managerProduct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Iphone11",1000,ECategory.PHONE,"Chính hãng"));
        products.add(new Product(2, "Iphone12",2000,ECategory.PHONE,"Xách tay"));
        products.add(new Product(3, "Ipad11",1500,ECategory.TABLET,"Chính hãng"));
        products.add(new Product(4, "Iphone14",2200,ECategory.PHONE,"Hàng cũ"));
        products.add(new Product(5, "Ipad8",800,ECategory.TABLET,"Chính hãng"));
//        writeDataToFile("product.txt",products);
        List<Product> productDataFromFile = readDataFromFile("product.txt");
        showProducts(productDataFromFile);

        System.out.println("Nhập ID:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Name:");
        String name = sc.nextLine();
        System.out.println("Nhập Giá:");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Chọn Category:");
        for (ECategory eCategory : ECategory.values()) {
            System.out.printf("Chọn %-5s %-10s", eCategory.getId(),eCategory.getName());
        }
        int idCategory = Integer.parseInt(sc.nextLine());
        ECategory eCategory = ECategory.getECategoryById(idCategory);
        System.out.println("Nhập Mô tả:");
        String description = sc.nextLine();
        Product newP = new Product(id, name, price, eCategory,description);
        addProductToFile("product.txt", newP);

        System.out.println("Nhập id sản phẩm cần tìm: ");
        int idF = Integer.parseInt(sc.nextLine());
        findProductById("product.txt", idF);
    }
    public static void writeDataToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            fos.close();
            oos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    public static List<Product> readDataFromFile(String path) {
        List<Product> result = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("product.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            result = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public static void showProducts(List<Product> productDataFromFile) {
        System.out.printf("%-15s %-20s %-10s %-20s\n", "ID", "NAME", "PRICE", "DESCRIPTION");
        for (Product p : productDataFromFile) {
            System.out.printf("%-15s %-20s %-10s %-20s\n",p.getId(),p.getName(),p.getPrice(),p.getDescription());
        }
    }
    public static void addProductToFile(String path, Product newProduct) {
        List<Product> productsToAdd = readDataFromFile(path);
        productsToAdd.add(newProduct);
        writeDataToFile(path, productsToAdd);
        showProducts(productsToAdd);
    }
    public static void findProductById(String path, int id) {
        List<Product> products = readDataFromFile(path);
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.printf("%-15s %-20s %-10s %-20s\n",product.getId(),product.getName(),product.getPrice(),product.getDescription());
            }
        }
    }
}
