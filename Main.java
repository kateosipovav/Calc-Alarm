import java.util.*;

public class Main{
public static void main(String[] args){
System.out.println("Enter hours");
    Scanner input = new Scanner(System.in);  
    int hours = input.nextInt(); 
System.out.println("Enter minutes");
    Scanner input2 = new Scanner(System.in);  
    int minutes = input2.nextInt(); 
    Clock c = new Clock(hours, minutes);
    System.out.println("You are all set!");
}
}
