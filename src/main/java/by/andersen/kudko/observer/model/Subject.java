package by.andersen.kudko.observer.model;

public interface Subject {

    boolean registerObserver(Observer o);
    boolean removeObserver(Observer o);
    void notifyObservers();
}
