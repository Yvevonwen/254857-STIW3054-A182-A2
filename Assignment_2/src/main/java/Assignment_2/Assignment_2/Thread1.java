package Assignment_2.Assignment_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Thread1 extends App implements Runnable{	
	private String lines[];
	
	public Thread1(String lines[]) {
		this.lines = lines;
	}
	public void run() {
		try {
		String total = null;
		for(String line : lines) {
			Pattern pattern = Pattern.compile("^\\d+");
			Matcher matcher = pattern.matcher(line);
			if(matcher.find()) {
				total= matcher.group();
			}
		}
		System.out.println(Thread.currentThread().getName()+"The total course is "+total+ " courses.");		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

