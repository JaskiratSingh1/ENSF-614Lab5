/*
 * File Name: ThreeColumnTable_Observer.java
 * Assignment: Lab 5 Exercise C
 * Completed by: Jaskirat Singh (Jazz)
 * Submission Date: 30 October 2024
 */

import java.util.ArrayList;

public class ThreeColumnTable_Observer implements Observer {
    public ThreeColumnTable_Observer(Subject subject) {
        subject.registerObserver(this);
    }


    /**
     * update() method
     *
     * @param inputData the input data array
     */
    @Override
    public void update(ArrayList<Double> inputData) {
        System.out.println("Printing with ThreeColumnTable_Observer");
        // Loop through all data
        for (int i = 0; i < inputData.size(); i++) {
            System.out.print(inputData.get(i) + " ");
            // Formatting in 3 columns
            if ((i + 1) % 3 == 0) System.out.println();
        }
        System.out.println();
    }
}
