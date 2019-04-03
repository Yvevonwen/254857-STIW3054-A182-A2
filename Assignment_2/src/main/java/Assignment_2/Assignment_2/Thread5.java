package Assignment_2.Assignment_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Thread5 extends App implements Runnable{
	private String lines[];
	
	public Thread5(String lines[]) {
		this.lines = lines;
	}
	public void run() {
		try {
		
		for (String line : lines) {
			Pattern pattern = Pattern.compile("STIW3054");
			Matcher matcher = pattern.matcher(line);
			 if (matcher.find()) {
				 System.out.println("\n"+Thread.currentThread().getName()+"The information of STIW3054 is \n"+line);
			 }
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
