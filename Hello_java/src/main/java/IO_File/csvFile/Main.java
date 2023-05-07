package IO_File.csvFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("countries.csv");
            file.createNewFile();
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File không tìm thấy");
        }
    }
    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }
    public static void printCountry(List<String> country) {
        System.out.println("Country [ id= "
        + country.get(0)
        + ", code = " + country.get(1)
        + " , name = " + country.get(2)
        + "]");
    }
}
