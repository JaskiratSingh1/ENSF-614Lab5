/*
 * File Name: MyVector.java
 * Assignment: Lab 5 Exercise A and B
 * Completed by: Jaskirat Singh (Jazz)
 * Submission Date: 30 October 2024
 */

import java.util.ArrayList;

/**
 * MyVector class
 *
 * @param <E> the type parameter
 */
public class MyVector <E extends Number & Comparable<E>> {
    private ArrayList<Item<E>> storageM;
    private Sorter<E> sorter;

    /**
     * Allocate memory for array with n elements
     *
     * @param n the number of elements
     */
    public MyVector(int n){
        storageM = new ArrayList<>(n);
    }

    /**
     * Makes storageM an exact copy of arr
     *
     * @param arr the array
     */
    public MyVector(ArrayList<Item<E>> arr) {
        storageM = new ArrayList<>(arr);
    }

    /**
     * Add a new Item<E> value to storageM
     *
     * @param value the value to be added
     */
    public void add(Item<E> value) {
        storageM.add(value);
    }

    /**
     * Set sorting strategy
     *
     * @param s the sorting strategy
     */
    public void setSortStrategy(Sorter <E> s) {
        this.sorter = s;
    }

    /**
     * Perform sorting with current sort strategy
     */
    public void performSort() {
        if (sorter != null) {
            sorter.sort(storageM);
        } else {
            System.out.println("Sorter strategy not set.");
        }
    }

    /**
     * Display contents of storageM
     */
    public void display() {
        for(Item<E> item : storageM) {
            System.out.print(item.getItem() + " ");
        }
        System.out.println();
    }
}

