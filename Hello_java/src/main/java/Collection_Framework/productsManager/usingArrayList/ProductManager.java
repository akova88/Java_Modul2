package Collection_Framework.productsManager.usingArrayList;

import java.util.ArrayList;
import java.util.Scanner;


public class ProductManager {
    public static Scanner scanner = new Scanner(System.in);
    ArrayList<Product> products;
    public ProductManager() {
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        this.products.add(product);
    }
    public boolean deleteProduct(int id) {
        Product productToRemove = null;
        for (Product product : products) {
            if (product.getId() == id) {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove == null){
            return false;
        }
        else {
            products.remove(productToRemove);
            return true;
        }
    }
    public void showProducts() {
        int count = 0;
        for (Product product : products) {
            count++;
            System.out.println(product);
        }
        if (count==0)
            System.out.println("Không có sản phẩm nào trong danh sách");
    }
    public void searchByName( String name) {
        for (Product product : products) {
            if (product.getNameProduct().equalsIgnoreCase(name)) {
                System.out.println(product);
            }
        }

    }
    public Product searchById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
    public void editById (int id) {
        Product productToEdit = searchById(id);
        boolean action = true;
        while (action) {
            showMenuEdit();
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    System.out.println("Sửa ID: "+productToEdit.getId()+" thành: ");
                    int newId = Integer.parseInt(scanner.nextLine());
                    productToEdit.setId(newId);
                    break;
                case 2:
                    System.out.println("Sửa tên sản phẩm: "+productToEdit.getNameProduct()+" thành: ");
                    String newName = scanner.nextLine();
                    productToEdit.setNameProduct(newName);
                    break;
                case 3:
                    System.out.println("Sửa giá sản phẩm: "+productToEdit.getPrice()+" thành: ");
                    int newPrice = Integer.parseInt(scanner.nextLine());
                    productToEdit.setPrice(newPrice);
                    break;
                case 0:
                    action = false;
                    break;
                default:
                    System.out.println("invalid");
            }
        }
    }

    public void shortByPrice() {
        PriceComparator priceComparator = new PriceComparator();
        products.sort(priceComparator);
    }

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        boolean actionMainMenu = true;
        while (actionMainMenu) {
            showMainMenu();
            System.out.println("Nhập lựa chọn của bạn: ");
            int input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    Product newSp = addSp();
                    productManager.addProduct(newSp);
                    System.out.println(newSp);
                    break;
                case 2:
                    System.out.println("Nhập Id để tìm sản phẩm cần sửa: ");
                    int idFind = Integer.parseInt(scanner.nextLine());
                    productManager.editById(idFind);
                    break;
                case 3:
                    System.out.println("Nhập Id để tìm sản phẩm cần xoá: ");
                    int idDel = Integer.parseInt(scanner.nextLine());
                    System.out.println(productManager.deleteProduct(idDel)? "Success" : "Fail");

                    break;
                case 4:
                    productManager.showProducts();
                    break;
                case 5:
                    System.out.println("Nhập tên để tìm sản phẩm: ");
                    String nameFind = scanner.nextLine();
                    productManager.searchByName(nameFind);
                    break;
                case 6:
                    productManager.shortByPrice();
                    productManager.showProducts();
                    break;
                case 0:
                    actionMainMenu = false;
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }

    }

    public static void showMainMenu() {
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║                                               ║");
        System.out.println("╠----------------QUẢN LÝ SẢN PHẨM---------------╣");
        System.out.println("║                                               ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        System.out.println("║ ► 1.Thêm sản phẩm                             ║");
        System.out.println("║ ► 2.Sửa thông tin sản phẩm theo Id            ║");
        System.out.println("║ ► 3.Xoá sản phẩm                              ║");
        System.out.println("║ ► 4.Hiển thị danh sách sản phẩm               ║");
        System.out.println("║ ► 5.Tìm kiếm sản phẩm theo tên                ║");
        System.out.println("║ ► 6.Sắp xếp sản phẩm                          ║");
        System.out.println("║ ► 0.Thoát chương trình                        ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
    }
    private static void showMenuEdit() {
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("╠------------------SỬA SẢN PHẨM-----------------╣");
        System.out.println("╚═══════════════════════════════════════════════╝");
        System.out.println("║ ► 1.Sửa ID                                    ║");
        System.out.println("║ ► 2.Sửa tên sản phẩm                          ║");
        System.out.println("║ ► 3.Sửa giá sản pẩm                           ║");
        System.out.println("║ ► 0.Thoát chương trình                        ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
    }
    public static Product addSp() {
        System.out.print("► Nhập ID sản phẩm: ");
        int idSp = Integer.parseInt(scanner.nextLine());
        System.out.print("► Nhập tên sản phẩm: ");
        String nameSp = scanner.nextLine();
        System.out.print("► Nhập giá của sản phẩm: ");
        int priceSp = Integer.parseInt(scanner.nextLine());
        return new Product(idSp,nameSp,priceSp);
    }
}



