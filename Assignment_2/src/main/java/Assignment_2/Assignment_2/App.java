package Assignment_2.Assignment_2;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;


public class App 
{
	public static String lines[];
    public static void main( String[] args ) throws IOException{
    	try{
    	  
    	  File file = new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\A182.pdf");
      	  PDDocument pdDocument = PDDocument.load(file);
      	  pdDocument.getClass();
      	  
      	  if(!pdDocument.isEncrypted()) {
      		 PDFTextStripperByArea stripper = new PDFTextStripperByArea();
      		 stripper.setSortByPosition(true);
      		 PDFTextStripper tStripper = new PDFTextStripper();
      		 String pdfFileInText = tStripper.getText(pdDocument);
      		 lines = pdfFileInText.split("\\r?\\n");
      	  }
         }catch (Exception e)
         {
      	   e.printStackTrace();
         }
    	 Thread1 thread_1 = new Thread1(lines);
     	 Thread t1 = new Thread(thread_1,"Thread-1:");
         t1.start();
         try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
     	 Thread2 thread_2 = new Thread2();
     	 Thread t2 = new Thread(thread_2,"Thread-2:");
     	 t2.start();
     	try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
     	 Thread4 thread_4 = new Thread4(lines);
     	 Thread t4 = new Thread(thread_4,"Thread-4:");
    	 t4.start();
    	 try {
 			t4.join();
 			Thread.sleep(2000);
 		}catch(InterruptedException e) {
 			e.printStackTrace();
 		}	 
     	 Thread3 thread_3 = new Thread3(lines);
     	 Thread t3 = new Thread(thread_3,"Thread-3:");
     	 t3.start();
     	try {
 			t3.join();
 			Thread.sleep(2000);
 		}catch(InterruptedException e) {
 			e.printStackTrace();
 		}	 
    	Thread5 thread_5 = new Thread5(lines);
     	Thread t5 = new Thread(thread_5,"Thread-5:");
    	t5.start();
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
}
