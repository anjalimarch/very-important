package fileupload;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_Upload_Auto_it {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to("http://postimage.org/");
driver.findElement(By.xpath("//*[@id='uploadifive-file_upload']/input[2]")).click();// TODO Auto-generated method stub
//uploading image from prom process bulder
			
	/*	this code works wen we have given file name in script builder scite of auto it 
	 	scite code is given below you need to copy in scite editor
	 	$windowHandle =WinGetHandle("File Upload")
WinActivate($windowHandle)
ControlSetText("File Upload","","[CLASS:Edit;INSTANCE:1]","C:\Users\welcome\Desktop\Capture.PNG")
ControlClick("File Upload","","[CLASS:Button;INSTANCE:1]")
	 	
	 	
	 	
	 	try {
				Process process= new ProcessBuilder(System.getProperty("user.dir")+"\\src\\fileupload\\uploadingfile.exe","","open").start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			//giving file path from eclipse
//we need to write cmdline in site editor
//code for scite to pass file path in eclipse
/*$windowHandle =WinGetHandle("File Upload")
WinActivate($windowHandle)
ControlSetText("File Upload","","[CLASS:Edit;INSTANCE:1]",$CmdLine[1])
ControlClick("File Upload","","[CLASS:Button;INSTANCE:1]")*/


try {
				Process process= new ProcessBuilder(System.getProperty("user.dir")+"\\src\\fileupload\\filleuploadingnew.exe","C:\\Users\\welcome\\Desktop\\Lighthouse.jpg","open").start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
