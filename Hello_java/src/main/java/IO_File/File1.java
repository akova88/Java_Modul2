package IO_File;

import java.io.*;

public class File1 {
    public static void main(String[] args) throws IOException {
        File dir = new File("hello");
        if (!dir.exists()) {
            dir.mkdir();
        }
        File file = new File("hello/test.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fileReader = new FileReader(file);
        int c = fileReader.read();
        while (c != -1) {
            System.out.print((char) c);
            c = fileReader.read();
        }
        fileReader.close();
        String s = "Code gym Hue";
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(s);

        fileWriter.flush();
    }
}

