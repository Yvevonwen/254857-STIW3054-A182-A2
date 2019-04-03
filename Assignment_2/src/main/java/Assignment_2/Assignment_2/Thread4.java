package Assignment_2.Assignment_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Thread4 extends App implements Runnable{
		private String lines[];
		private int count = 0 ;
		public Thread4(String lines[]) {
			this.lines = lines;
		}
		public void run() {
			try {
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
								count++;
							}
						}
					}
				}
			}
			System.out.println("\n"+Thread.currentThread().getName()+"Total number of SOC course is "+ count + " courses.");
			}catch(Exception e) {
				e.printStackTrace();
			}
			}
			
}
