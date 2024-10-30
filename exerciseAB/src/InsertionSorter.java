/*
 * File Name: InsertionSorter.java
 * Assignment: Lab 5 Exercise A and B
 * Completed by: Jaskirat Singh (Jazz)
 * Submission Date: 30 October 2024
 */

import java.util.ArrayList;

/**
 * Insertion sorter
 *
 * @param <E> the type parameter
 */
public class InsertionSorter<E extends Number & Comparable<E>> implements Sorter<E> {
    @Override
    public void sort(ArrayList<Item<E>> items) {
        // Got InsertionSort algorithm from ENSF-694 work
        for (int i = 1; i < items.size(); i++) {
            Item<E> key = items.get(i);
            int j = i - 1;
            while (j >= 0 && items.get(j).getItem().doubleValue() > key.getItem().doubleValue()) {
                items.set(j + 1, items.get(j));
                j = j - 1;
            }
            items.set(j + 1, key);
        }
    }
}