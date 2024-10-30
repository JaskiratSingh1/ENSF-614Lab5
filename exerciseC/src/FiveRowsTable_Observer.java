/*
 * File Name: FiveRowsTable_Observer.java
 * Assignment: Lab 5 Exercise C
 * Completed by: Jaskirat Singh (Jazz)
 * Submission Date: 30 October 2024
 */
import java.util.ArrayList;

public class FiveRowsTable_Observer implements Observer {
    public FiveRowsTable_Observer(Subject subject) {
        subject.registerObserver(this);
    }

    /**
     * update() method
     *
     * @param inputData the input data array
     */
    @Override
    public void update(ArrayList<Double> inputData) {
        System.out.println("Printing with FiveRowsTable_Observer");
        // Calculate the elements per row for accommodating 5 total rows
        int elementsPerRow = (int) Math.ceil((double) inputData.size() / 5);
        // Loop through all data
        for (int i = 0; i < inputData.size(); i++) {
            System.out.print(inputData.get(i) + " ");
            // Formatting in 5 rows
            if ((i + 1) % elementsPerRow == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
