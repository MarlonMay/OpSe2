package observers;

public interface Observable {
	public void addObserver(Observer obs);
	public void removeObserfer(Observer obs);
	public void notifyObservers();
}
