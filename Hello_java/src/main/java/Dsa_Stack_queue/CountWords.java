package Dsa_Stack_queue;

import java.util.Scanner;
import java.util.TreeMap;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String input = sc.nextLine();
        TreeMap<String, Integer> wordCount = new TreeMap<>();

        String[] words = input.split(" ");
        for (String word : words) {
            word = word.toLowerCase();
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word); // => trả về giá trị value
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word,1);
            }
        }
        for (String word : wordCount.keySet()) {
            System.out.println(word+ ": "+ wordCount.get(word));
        }
    }
}
