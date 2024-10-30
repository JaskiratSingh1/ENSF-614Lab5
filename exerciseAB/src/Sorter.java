/*
 * File Name: Sorter.java
 * Assignment: Lab 5 Exercise A and B
 * Completed by: Jaskirat Singh (Jazz)
 * Submission Date: 30 October 2024
 */
import java.util.ArrayList;

/**
 * Sorter interface
 *
 * @param <E> the type parameter
 */
public interface Sorter<E extends Number & Comparable<E>> {
    void sort(ArrayList<Item<E>> items);
}