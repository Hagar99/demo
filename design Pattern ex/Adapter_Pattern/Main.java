package Adapter_Pattern;

public class Main {
	public static void main(String[] args) {
		
		MediaPlayerClass temp = new MediaPlayerClass();
		temp.play("MP4");
		temp.play("mp3");
		temp.play("vlc");
	}

}
