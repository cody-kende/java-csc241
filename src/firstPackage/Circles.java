package firstPackage;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.util.Random;
/**
*
* @author CJ Kende, S02058050
* @version 2018-01-19, CSC-241 Assignment 01
*/
public class Circles extends JPanel{
	public void paintComponent(Graphics g){
		Random randomGenerator = new Random();
		RandomRange randomDimensions = new RandomRange();
		super.paintComponent(g);
		for(int i = 0; i < 19; i++){
			int xCoordinateRandomPosition = randomGenerator.nextInt(1000);
			int yCoordinateRandomPosition = randomGenerator.nextInt(1000);
			g.drawOval(xCoordinateRandomPosition, yCoordinateRandomPosition, randomDimensions, randomDimensions);
		}
		g.drawString("Custom Panel", 350, 20); // Test for g.method();
	}
}