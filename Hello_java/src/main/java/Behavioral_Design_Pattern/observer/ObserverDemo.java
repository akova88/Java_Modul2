package Behavioral_Design_Pattern.observer;

import java.util.Scanner;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new OctObserver(subject);
        new HexObserver(subject);
        new BinObserver(subject);

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("\nEnter a number: ");
            subject.setState(scan.nextInt());
        }
    }
}
