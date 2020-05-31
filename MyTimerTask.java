import java.util.TimerTask;
import java.util.*;

import java.io.*;

import javax.sound.sampled.*;

public class MyTimerTask extends TimerTask {
	MyTimerTask()
	{
		super();
	}

	@Override
	public void run(){
		try {
			ring();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
	}
	
	private void ring() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		System.out.println("Hello from run()");
		Function f = new Function();
		f.genRandF();
		double userAnswer = -1000;
		
		//////////////////////////////
		AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("519155__tictac9__inst-1-funk-short-version-tictac9.wav"));
		Clip clip = AudioSystem.getClip();

		//Thread.sleep(10000);
		clip.open(inputStream);
		clip.start();
		clip.loop(Clip.LOOP_CONTINUOUSLY);
		do{ 
			///////////////////////////
			///////////////////////////
			System.out.println("Enter the answer:::");
			//System.out.println(f.answer());	//prints the answer.. if you're too lazy to actually find the answer
			Scanner input = new Scanner(System.in);
			userAnswer = input.nextDouble();
		}while((int)(f.answer()*1000) != (int)(userAnswer*1000));
		
		System.out.println("Great job!");

		clip.stop();
	}
}
