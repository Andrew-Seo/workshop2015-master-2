package Level_2;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class soundPlayer implements Runnable
{
	String file;
	
	soundPlayer(String f){
		this.file = f;
	
	}
	
	void jump(){
		
	}

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		try
		{
			File sound = new File(file);
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength()/1000);
		} catch (Exception e)
		{
			// TODO: handle exception
			System.err.println("Error Loading Sound");
		}
	}

}
