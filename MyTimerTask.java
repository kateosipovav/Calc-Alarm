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
    AudioPlayer ap = new AudioPlayer();
    ap.ring();
    System.out.println("Enter the answer:::");
    Scanner input = new Scanner(System.in);
    double userAnswer = input.nextDouble();
    while(Function.answer() != userAnswer){ // TODO: compare up to three digits after the comma 
     ap.start();
     System.out.println("Enter the answer:::");
     Scanner input2 = new Scanner (System.in);
     double userAnswer = input2.nextDouble(); }
// copypasted some shit
  System.out.println("Great job!");
  ap.stop();
  
	}
}
