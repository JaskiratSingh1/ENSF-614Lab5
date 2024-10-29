// SelectionSorter.java
import java.util.ArrayList;

/**
 * Selection Sort class
 *
 * @param <E> the type parameter
 */
public class SelectionSorter<E extends Number & Comparable<E>> implements Sorter<E> {
    @Override
    public void sort(ArrayList<Item<E>> items) {
        int n = items.size();
        for (int i = 0; i < n - 1; i++) {
            // Assume the min is the first element
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (items.get(j).getItem().doubleValue() < items.get(minIndex).getItem().doubleValue()) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            Item<E> temp = items.get(minIndex);
            items.set(minIndex, items.get(i));
            items.set(i, temp);
        }
    }
}