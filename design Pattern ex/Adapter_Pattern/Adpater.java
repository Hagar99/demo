package Adapter_Pattern;


// help media player class to play vlc & mp4

public class Adpater implements MediaPlayer{
	AdvancedMedia obj;
	
	public Adpater(String audio) {
		
	}
	
	public void mediaAdapter(String audioType) {
		
		if(audioType.equalsIgnoreCase("mp4"))
			obj = new MP4MediaPlayer();
		else if(audioType.equalsIgnoreCase("vlc"))
			obj = new VLCMediaPlayer();
		
	}



	@Override
	public void play(String audio) {
	
		if(obj != null) obj.play();
	}
}
