package IO_File.readFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc nội dung có lỗi");
        }
        return numbers;
    }
    public void writeFile(String filePath, int max) {
        try {
            FileWriter fileWriter = new FileWriter(filePath,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhất: " + max);
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Lỗi");
        }
    }

}
