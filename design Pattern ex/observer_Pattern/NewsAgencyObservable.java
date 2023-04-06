package observer_Pattern;

public interface NewsAgencyObservable {

	 void addObserver(NewChannel channel);

	 public void removeObserver(NewChannel channel);
	 
	 public void updateObservers_notify(String news);
}
