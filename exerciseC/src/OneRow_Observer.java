/*
 * File Name: OneRow_Observer.java
 * Assignment: Lab 5 Exercise C
 * Completed by: Jaskirat Singh (Jazz)
 * Submission Date: 30 October 2024
 */
import java.util.ArrayList;

public class OneRow_Observer implements Observer {
    public OneRow_Observer(Subject subject) {
        subject.registerObserver(this);
    }

    /**
     * update() method
     *
     * @param inputData the input data array
     */
    @Override
    public void update(ArrayList<Double> inputData) {
        System.out.println("Printing with One-Row Observer");
        // Loop through all data
        for (int i = 0; i < inputData.size(); i++) {
            System.out.print(inputData.get(i) + " ");
        }
        System.out.println();
    }
}
