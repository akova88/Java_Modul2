package com.codegym;

import java.util.List;

public class RandomListFacade {
    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade() {
        this.randomList = new RandomList();
        this.listFilter = new ListFilter();
        this.listPrinter = new ListPrinter();
    }

    public void printRandomEvenList(int size, int min, int max) {
        List<Integer> randomListData = randomList.generateList(size, min, max);
        listPrinter.printList(randomListData);
        System.out.println();
        List<Integer> evenList = listFilter.filterOdd(randomListData);
        listPrinter.printList(evenList);
    }
}
