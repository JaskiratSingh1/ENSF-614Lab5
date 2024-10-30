/*
 * File Name: DoublArrayListSubject.java [Misspellt in instructions so I kept the name]
 * Assignment: Lab 5 Exercise C
 * Completed by: Jaskirat Singh (Jazz)
 * Submission Date: 30 October 2024
 */
import java.util.ArrayList;

/**
 * Realization of Subject as a Double ArrayList
 */
public class DoublArrayListSubject implements Subject {
    private ArrayList<Double> data;
    private ArrayList<Observer> observers;

    /**
     * Instantiate data and observers
     */
    public DoublArrayListSubject() {
        data = new ArrayList<>();
        observers = new ArrayList<>();
    }

    /**
     * Add data
     *
     * @param x the data to be added
     */
    public void addData(double x) {
        data.add(x);
        notifyObservers();
    }

    /**
     * Set data
     *
     * @param index the index where the data is to be set
     * @param x     the data to be set
     */
    public void setData(double x, int index) {
        // Check if valid index is provided
        if(index < data.size() && index >= 0) {
            data.set(index, x);
            notifyObservers();
        }
    }

    /**
     * Mass populate the data array
     *
     * @param data the data to be added
     */
    public void populate(double[] data) {
        // Calling data.add(d) instead of addData(d) to
        // only notify observers after populating the entire data
        for(Double d : data) {
            this.data.add(d);
        }
        notifyObservers();
    }

    /**
     * Gets all data
     *
     * @return the data in ArrayList format
     */
    public ArrayList<Double> getData() {
        return data;
    }

    /**
     * Display contents
     */
    public void display() {
        for(Double d : data) {
            System.out.println(d);
        }
    }

    /**
     * Remove observer
     *
     * @param o the observer
     */
    public void remove(Observer o) {
        observers.remove(o);
    }

    /**
     * Register the observer
     *
     * @param o the observer object
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        o.update(data);
    }

    /**
     * Remove the observer
     *
     * @param o the observer object
     */
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * Notify the observers
     */
    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(data));
    }
}
