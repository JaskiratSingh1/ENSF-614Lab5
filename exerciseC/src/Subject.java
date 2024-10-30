/*
 * File Name: Subject.java
 * Assignment: Lab 5 Exercise C
 * Completed by: Jaskirat Singh (Jazz)
 * Submission Date: 30 October 2024
 */

/**
 * The Subject interface
 */
public interface Subject {
    /**
     * Register the observer
     *
     * @param o the observer object
     */
    public void registerObserver(Observer o);

    /**
     * Remove the observer
     *
     * @param o the observer object
     */
    public void removeObserver(Observer o);

    /**
     * Notify the observers
     */
    public void notifyObservers();
}
