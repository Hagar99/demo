package observer_Pattern;

import java.util.ArrayList;

public class NewsAgency implements NewsAgencyObservable{

	String news;

	ArrayList<NewChannel> channels = new ArrayList<>();
	
	public void addObserver(NewChannel channel) {
		
		channels.add(channel);
	}
	
	public void removeObserver(NewChannel channel){
		
		channels.remove(channel);
	}
	
	public void updateObservers_notify(String news) {
		this.news = news;
		channels.forEach((c) -> c.update(news));
	}
}



