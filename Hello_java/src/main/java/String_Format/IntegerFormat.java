package String_Format;

public class IntegerFormat {
    public static void main(String[] args) {
/*----------Định dạng kiểu số nguyên-----------
        %d : sẽ in số nguyên như tham số đầu vào.
        %6d : sẽ in số nguyên như tham số đầu vào. Nếu số chữ số nhỏ hơn 6,
        đầu ra sẽ được thêm khoảng trắng ở bên trái.
        %-6d : sẽ in số nguyên như tham số đầu vào. Nếu số chữ số nhỏ hơn 6,
        đầu ra sẽ được thêm khoảng trắng ở bên phải.
        %06d : sẽ in số nguyên như tham số đầu vào. Nếu số chữ số nhỏ hơn 6,
        đầu ra sẽ được thêm ký tự số 0 ở bên trái.
        %.2d : in tối đa 2 chữ số của số nguyên.
 */
        System.out.printf("%-12s%-12s%s\n","Column 1","Column 2","Column3");
        System.out.printf("%-12d%-12d%07d\n", 15, 12, 5);

/*-----------Định dạng kiểu chuỗi----------
    %s : sẽ in chuỗi tham số đầu vào.
    %15s : sẽ in chuỗi như tham số đầu vào. Nếu số chữ số nhỏ hơn 15,
    đầu ra sẽ được thêm khoảng trắng ở bên trái.
    %-6s : sẽ in chuỗi như tham số đầu vào. Nếu số chữ số nhỏ hơn 6,
    đầu ra sẽ được thêm khoảng trắng ở bên phải.
    %.8s : in tối đa tối chuỗi 8 ký tự.
* */
        System.out.printf("%-12s%-12s%s\n","Column 1","Column 2","Column3");
        System.out.printf("%-12.5s%s\n", "Hello World","World");

/*------------Định dạng kiểu số thực------------
%f : sẽ in số thực như tham số đầu vào.
%15f : sẽ in số thực như tham số đầu vào. Nếu số chữ số nhỏ hơn 15,
đầu ra sẽ được thêm khoảng trắng ở bên trái.
%.8f : hiển thị tối đa 8 chữ số thập phân của số.
%9.4f : hiển thị tối đa 4 chữ số thập phân của số. Đầu ra sẽ chiếm ít nhất 9 ký tự.
Nếu số chữ số không đủ, nó sẽ được đệm khoảng trắng.
* */

        System.out.printf("%-12s%-12s\n","Column 1","Column 2");
        System.out.printf("%-12.5f%.20f\n", 12.23429837482,9.10212023134);

/*-------------Sử dụng String.format------------

* */
        String header = String.format("%-12s%-12s%s","Column 1","Column 2","Column3");
        String row = String.format("%-12d%-12d%07d", 15, 12, 5);
        System.out.println(header);
        System.out.println(row);
    }
}
