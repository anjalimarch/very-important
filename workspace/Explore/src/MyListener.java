

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;



public class MyListener extends AbstractWebDriverEventListener{
	
	
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("Hello");
	}


	public void onException(Throwable arg0, WebDriver arg1) {
		System.out.println("in function");
		
		String filename = generateRandomFilename(arg0);
        createScreenCaptureJPEG(filename);
        System.out.println("in function");
	}
        private String generateRandomFilename(Throwable arg0) {
	        System.out.println("in function");
        	Calendar c = Calendar.getInstance();
	        String filename = arg0.getMessage();
	        int i = filename.indexOf('\n');
	        filename = filename.substring(0, i).replaceAll("\\s", "_").replaceAll(":", "") + ".jpg";
	        filename = "" + c.get(Calendar.YEAR) + 
	            "-" + c.get(Calendar.MONTH) + 
	            "-" + c.get(Calendar.DAY_OF_MONTH) +
	            "-" + c.get(Calendar.HOUR_OF_DAY) +
	            "-" + c.get(Calendar.MINUTE) +
	            "-" + c.get(Calendar.SECOND) +
	            "-" + filename;
	        System.out.println("returnin");
	        return filename;
	    }


	
	private void createScreenCaptureJPEG(String filename) {
	  try {
	   BufferedImage img = getScreenAsBufferedImage();
	   File output = new File("D\\",filename);
	   ImageIO.write(img, "jpg", output);
	  } catch (IOException e) {
	   e.printStackTrace();
	  }
	 }
	 
	 private BufferedImage getScreenAsBufferedImage() {
	  BufferedImage img = null;
	  try {
	   Robot r;
	   r = new Robot();
	   Toolkit t = Toolkit.getDefaultToolkit();
	   Rectangle rect = new Rectangle(t.getScreenSize());
	   img = r.createScreenCapture(rect);
	  } catch (AWTException e) {
	   e.printStackTrace();
	  }
	  return img;
	 }




}
