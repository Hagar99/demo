package observer_Pattern;

public class Main {

	public static void main(String[] args) {
	
		NewsAgency agency = new NewsAgency();
	    NewChannel channel = new NewChannel();
		
		agency.addObserver(channel);
		agency.updateObservers_notify("gogo");
		System.out.println(agency.news == channel.news);
		System.out.println(channel.news);
	}

}
