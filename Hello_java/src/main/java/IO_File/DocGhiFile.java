package IO_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DocGhiFile {
    public static void main(String[] args) throws IOException {
        // Tạo 1 file mới
        File file = new File("test.txt");

        if (!file.exists()) {
            file.createNewFile();
        }
        //Đọc dl từ file hiện thị ra console
        FileInputStream fileInputStream = new FileInputStream(file);
        int c = fileInputStream.read();
        while (c != -1) {
            System.out.print((char) c);
            c = fileInputStream.read();
        }
        fileInputStream.close();
        // Ghi dữ liệu vào file
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String s = "goodbye";
        fileOutputStream.write(s.getBytes());
        fileOutputStream.close();
    }
}
