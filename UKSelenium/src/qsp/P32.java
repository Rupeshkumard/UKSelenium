package qsp;

import java.awt.AWTException;
import java.awt.Robot;

public class P32 {//Mouse action using robot class

	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot r1 = new Robot();// to automate mouse and keyboard actions
		
		for(int i=0;i<50;i++) {
			
			r1.mouseMove(i,100);
			Thread.sleep(500);
		}

	}

}
