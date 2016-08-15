package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
	Robot bob = new Robot("batman");
	Robot rob = new Robot("June");
	bob.setPenColor(100, 65, 255);
	bob.penDown();
	for (int i = 0; i < 4; i++) {
	bob.turn(90);	
	bob.move(99);
	rob.setPenColor(100, 65, 255);
	rob.penDown();
	
	rob.turn(-90);	
	rob.move(111 );
	}}}
	
	
	
	
	
	