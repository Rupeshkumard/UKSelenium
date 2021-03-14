package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class P33 {//Keyboard action using robot class

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		Runtime.getRuntime().exec("notepad");
		
		Thread.sleep(2000);
		
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_S);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_K);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_I);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_L);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_L);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_R);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_R);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_Y);
		Thread.sleep(2000);
		

	}

}
