package firstPackage;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
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
                Dimension windowSize = this.getSize();
                System.out.println(windowSize.getWidth() + "," + windowSize.getHeight());
		for(int i = 0; i < 19; i++){
                        int circleSize = getRandomIntegerRange(50, 200); // Generates random int between 50 - 200;
			int xPosition = getRandomIntegerRange(0, (int)windowSize.getWidth() - circleSize);
                        int yPosition = getRandomIntegerRange(0, (int)windowSize.getHeight() - circleSize);
			g.drawOval(xPosition, yPosition, circleSize, circleSize);
                }
		g.drawString("Custom Panel", 350, 20); // Test for g.method();
	}
        
        public int getRandomIntegerRange(int min, int max){
            // nextInt is normally exclusive of the top value,
            // so add 1 to make it inclusive
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            return randomNum;
        }
}