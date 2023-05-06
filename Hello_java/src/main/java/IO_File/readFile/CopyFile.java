package IO_File.readFile;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
            copyFile("source.txt","target.txt");
    }
    public static void copyFile(String sourcePath, String targetPath) {

        try {
            File sourceFile = new File(sourcePath);
            if (!sourceFile.exists()) {
                throw new FileNotFoundException();
            }
            File targetFile = new File(targetPath);
            if (targetFile.exists()) {
                System.out.println("Tệp đích " + targetPath + " đã tồn tại và sẽ bị ghi đè dữ liệu!");
            } else {
                System.out.println("Tệp đích " + targetPath + " sẽ được tạo mới và được chép dữ liệu vào");
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
            }
            bufferedReader.close();
            bufferedWriter.flush();
        } catch (Exception e) {
            System.err.println(" File không tồn tại");
        }
    }
}
