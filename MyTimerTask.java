import java.util.TimerTask;
import java.util.*;


public class MyTimerTask extends TimerTask {
	MyTimerTask()
	{
		super();
	}

	@Override
	public void run() {
    Function.genRandF();
   do{ 
    AudioPlayer.ring(); 
    System.out.println("Enter the answer:::");
    Scanner input = new Scanner(System.in);  
    double userAnswer = input.nextDouble(); 
  }while(Function.answer() != userAnswer); // TODO: compare up to three digits after the comma 
  System.out.println("Great job!");
  AudioPlayer.stop();
  
	}
}
