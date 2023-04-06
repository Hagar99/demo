package Adapter_Pattern;

public class VLCMediaPlayer implements AdvancedMedia{

	public void vlc() {
		System.out.println("play VLC");
	}


	@Override
	public void mp4() {
		// do nothing
		
	}
	
	public void play() {
		
		System.out.println("VLC is palying");
	}
}
