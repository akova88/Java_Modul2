package BinaryFile_Serialization;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        try {
            File file = new File("temp.dat");
            file.createNewFile();
            DataOutputStream output = new DataOutputStream(new FileOutputStream(file));
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("Susan");
            output.writeDouble(185.5);
            output.writeUTF("Kim");
            output.writeDouble(105.25);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"))) {
//            System.out.println(input.readUTF() + " " + input.readDouble());
//            System.out.println(input.readUTF() + " " + input.readDouble());
//            System.out.println(input.readUTF() + " " + input.readDouble());
            while (true) {
            System.out.println(input.readUTF() + " " + input.readDouble());
            }
        } catch (EOFException e) {
            System.out.println("All data were read");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
