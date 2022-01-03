package robot_window_interface_automation;

import java.awt.Robot;
import java.awt.event.InputEvent;

public class Mouse_Actions_With_Robot {

	public static void main(String[] args) throws Exception {
		
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		robot.mouseMove(24, 576);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		robot.mouseMove(87, 455);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);

		robot.mouseMove(301, 356);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		robot.mouseMove(340, 452);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		
		

	}

}
