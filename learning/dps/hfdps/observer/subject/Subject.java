package learning.dps.hfdps.observer.subject;

import learning.dps.hfdps.observer.observers.Observer;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
