package Assignment_2.Assignment_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Thread3 extends App implements Runnable{
	private String lines[];
	
	public Thread3(String lines[]) {
		this.lines = lines;
	}
	public void run() {
		try {
		System.out.println("\nList course of SOC:");
		for(String line : lines) {
			Pattern pattern = Pattern.compile("[A-Z]+\\d");
			Pattern listSOC = Pattern.compile("ST+[A-Z]+");
			Matcher matcher = pattern.matcher(line);
			if(line.equals("")) {
			}else {
				if (matcher.find()) {
					Matcher soc = listSOC.matcher(matcher.group());
					if(soc.find()) {
						if(soc.group().equals("STIV")) {
						}else {
							System.out.println(Thread.currentThread().getName()+ " " +line);
						}
					}
				}
			}
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
