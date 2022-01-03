package robot_window_interface_automation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyStringTo_Clipboard {

	public static void main(String[] args) throws Exception {
		
		//launching notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		
		String text="Error establishing a database connection, Wait for Response";
		
		//Copy String to Clipboard
		StringSelection stext=new StringSelection(text);
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stext, stext);   //Set Content to clipbaord
		
		
		Robot robot=new Robot();
		robot.setAutoDelay(200);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);

	}

}
