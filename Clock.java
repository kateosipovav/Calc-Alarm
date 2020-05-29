import java.util.*;

public class Clock {
	private Date running, alarm;
	private Timer timer;
	
	Clock()
	{
		this(7, 0);
	}
	Clock(int min)
	{
		this(min / 60, min %= 60);
	}
	@SuppressWarnings("deprecation")
	Clock(int hr, int min)
	{
    System.out.println("Hello from clock constructor!");
		timer = new Timer();
		running = new Date();
		
		int dt = running.getDate();
		if (hr < running.getHours())
			dt++;
		else if (hr == running.getHours() && min < running.getMinutes())
			dt++;
		alarm = new Date(running.getYear(), running.getMonth(), dt, hr, min);
		timer.schedule(new MyTimerTask(), alarm);
	}
	
	@SuppressWarnings("deprecation")
	public void print()
	{
		String str = "";
		if (running.getHours() < 10)
			str += 0;
		str += running.getHours() + " ";
		if (running.getMinutes() < 10)
			str += 0;
		str += running.getMinutes() + " ";
		if (running.getSeconds() < 10)
			str += 0;
		str += running.getSeconds();
		System.out.println(str);
	}
	
	public int[] getCurrTime()
	{
		@SuppressWarnings("deprecation")
		int[] rtn = {running.getHours(), running.getMinutes(), running.getSeconds()};
		return rtn;
	}
	public int[] getAlrmTime()
	{
		@SuppressWarnings("deprecation")
		int[] rtn = {alarm.getHours(), alarm.getMinutes(), alarm.getSeconds()};
		return rtn;
	}
}
