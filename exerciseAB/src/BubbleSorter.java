/*
 * File Name: BubbleSorter.java
 * Assignment: Lab 5 Exercise A and B
 * Completed by: Jaskirat Singh (Jazz)
 * Submission Date: 30 October 2024
 */

import java.util.ArrayList;

/**
 * Bubble sorter
 *
 * @param <E> the type parameter
 */
public class BubbleSorter<E extends Number & Comparable<E>> implements Sorter<E> {
    @Override
    public void sort(ArrayList<Item<E>> items) {
        // Got bubble sorting algorithm from ENSF-694 work
        int n = items.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (items.get(j).getItem().doubleValue() > items.get(j + 1).getItem().doubleValue()) {
                    // Swap items
                    Item<E> temp = items.get(j);
                    items.set(j, items.get(j + 1));
                    items.set(j + 1, temp);
                }
            }
        }
    }
}