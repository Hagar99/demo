package observer_Pattern;

public class NewChannel implements ChannelObserver{

	String news;
	
	 public void update(String news) {
	  this.news = news;	
	}
}
