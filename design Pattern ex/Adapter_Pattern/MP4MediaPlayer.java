package Adapter_Pattern;

public class MP4MediaPlayer implements AdvancedMedia{

	public void vlc() {
		// do nothing
	}


	public void mp4() {
		
		System.out.println("MP4");
	}
	
	public void play() {
		
		System.out.println("MP4 is palying");
	}
}
