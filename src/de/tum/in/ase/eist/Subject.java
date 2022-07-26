package de.tum.in.ase.eist;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Subject<T> {

    private T t;
    private final Set<Observer<T>> observers = new HashSet<>();

    public void subscribe(Observer<T> tObserver) {
        Objects.requireNonNull(tObserver);
        observers.add(tObserver);
    }

    public void unsubscribe(Observer<T> tObserver) {
        Objects.requireNonNull(tObserver);
        observers.remove(tObserver);
    }
    public abstract T getUpdate();

    public void notifyObservers() {
        for (Observer<T> observer : observers) {
            observer.update(getUpdate());
        }
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }




    // TODO realize observer pattern
}
