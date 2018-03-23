package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	
	public static void main(String[] args) {
		Robot blue;
		Robot yellow;
		Robot black;
		Robot green;
		Robot red;
		blue = new Robot(400, 600);
		yellow = new Robot(550, 700);
		black = new Robot(700, 600);
		green = new Robot(850, 700);
		red = new Robot(1000, 600);

		blue.setSpeed(15);
		yellow.setSpeed(15);
		black.setSpeed(15);
		green.setSpeed(15);
		red.setSpeed(15);
		
		blue.penDown();
		yellow.penDown();
		black.penDown();
		green.penDown();
		red.penDown();
		
		blue.setPenColor(Color.BLUE);
		yellow.setPenColor(Color.YELLOW);
		black.setPenColor(Color.BLACK);
		green.setPenColor(Color.GREEN);
		red.setPenColor(Color.RED);
		
		new Thread(()->{
			for (int i = 0; i < 360; i++) {
				blue.turn(1);
				blue.move(2);
			}	
		}).start();
		new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				yellow.turn(1);
				yellow.move(2);
			}	
		}).start();
		new Thread(() ->{
			for (int i = 0; i < 360; i++) {
				black.turn(1);
				black.move(2);
			}	
		}).start();
		new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				green.turn(1);
				green.move(2);
			}	
		}).start();
		new Thread(() ->{
			for (int i = 0; i < 360; i++) {
				red.turn(1);
				red.move(2);
			}	
		}).start();

	}

}
