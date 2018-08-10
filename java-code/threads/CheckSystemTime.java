//package threads;
//https://www.youtube.com/watch?v=G2Xd5avyk_0&index=18&list=PLE7E8B7F4856C9B19

import java.text.DateFormat;
import java.util.*;

public class CheckSystemTime implements Runnable{
	
 public void run(){
		
 Date rightNow;
 Locale currentLocale;
 DateFormat timeFormatter;
 String timeOutput;
		
 rightNow = new Date();
 currentLocale = new Locale("en");
		
 timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
	timeOutput = timeFormatter.format(rightNow);
		
	System.out.println("Time: " + timeOutput);
 }
	
}