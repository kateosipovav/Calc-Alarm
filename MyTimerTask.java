import java.util.TimerTask;
import java.util.*;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MyTimerTask extends TimerTask {
	MyTimerTask()
	{
		super();
	}

	@Override
	public void run() {
    System.out.println("Hello from run()");
    Function.genRandF();
   double userAnswer = -1000;

   //////////////////////////////
  AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("519155__tictac9__inst-1-funk-short-version-tictac9.wav"));
   Clip clip = AudioSystem.getClip();
   
     //Thread.sleep(10000); // looping as long as this thread is alive
    */
    do{ 
     ///////////////////////////
     clip.start(inputStream);
     clip.loop(Clip.LOOP_CONTINUOUSLY);
     ///////////////////////////
     System.out.println("Enter the answer:::");
     Scanner input = new Scanner(System.in);
    userAnswer = input.nextDouble();
     }while((int)(Function.answer()*1000) != (int)(userAnswer*1000));

  System.out.println("Great job!");

  clip.stop();
	}
}
