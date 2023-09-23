package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	//2. create an array of 5 robots.
		Robot[] robots = new Robot[10];
	//3. use a for loop to initialize the robots.
		for(int i=0; i<robots.length; i++) {
			 robots[i] = new Robot();
		//4. make each robot start at the bottom of the screen, side by side, facing up
			 robots[i].setX(50+i*100);
			 robots[i].setY(500);
		}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		Random random = new Random();
		int i = 500;
		
		while(i>80) {
			for(int i2=0; i2<robots.length; i2++) {
				robots[i2].setSpeed(6);
				int r=random.nextInt(50);
				if(robots[i2].getY() - r < 80) {
					robots[i2].move(80 - robots[i2].getY());
				}
				else {
					robots[i2].move(i);
				}
					robots[i2].move(r);
				i = robots[i2].getY();
			
				if(i<80) {
					i2+=1;
					JOptionPane.showMessageDialog(null, "Robot number "+i2+ " is the winner!");
					
					while(true) {
						robots[i2-1].turn(20);
					}
				}
			}
		}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
