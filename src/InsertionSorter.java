// InsertionSorter.java
import java.util.ArrayList;

public class InsertionSorter<E extends Number & Comparable<E>> implements Sorter<E> {
    @Override
    public void sort(ArrayList<Item<E>> items) {
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