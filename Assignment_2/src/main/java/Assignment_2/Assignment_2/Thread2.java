package Assignment_2.Assignment_2;


import java.text.SimpleDateFormat;
import java.util.Date;


public class Thread2 extends App implements Runnable{
		SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyy");
		String firstDate = "25/5/2019";
		String lastDate = "20/6/2019";
		String holiday1 = "3/6/2019";
		String holiday2 = "10/6/2019";
		
		public Thread2() {
		}
		
		public void run() {
			try {
			Date firstDays = myFormat.parse(firstDate);
			Date lastDays = myFormat.parse(lastDate);
			Date holi_Day1 = myFormat.parse(holiday1);
			Date holi_Day2 = myFormat.parse(holiday2);
			long diff = lastDays.getTime() - firstDays.getTime();
			float examDay = (diff/(1000*60*60*24));
			long diff2 = holi_Day2.getTime() - holi_Day1.getTime();
			float holiDate = (diff2/(1000*60*60*24));
			float totalDays = examDay - holiDate;
			System.out.println("\n"+Thread.currentThread().getName()+"Total number day of exam is " +Math.round(totalDays)+ " days.");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
}
