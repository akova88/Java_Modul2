package com.codegym;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        CollectionUtilsAdapter collectionUtilsAdapter = new CollectionUtilsAdapter();

        Client client = new Client(collectionUtilsAdapter);

        Set<Integer> numbers = new HashSet<>(Arrays.asList(100, 3, 5, 7, 9, 99));

        client.printMaxValue(numbers);
    }
}
