package Adapter_Pattern;

public class MediaPlayerClass implements MediaPlayer{

	Adpater adapter;
	
	@Override
	public void play(String audioType) {
		if(audioType.equalsIgnoreCase("mp3"))
			System.out.println("MP3 is playing");
		
		else if(audioType.equalsIgnoreCase("mp4")) { //adapter convert before playing
			adapter = new Adpater(audioType);
			adapter.mediaAdapter(audioType);
			adapter.play(audioType);
		
		}else if(audioType.equalsIgnoreCase("vlc")){
			adapter = new Adpater(audioType);
			adapter.mediaAdapter(audioType);
			adapter.play(audioType);	
		}
			
	}

	
}
