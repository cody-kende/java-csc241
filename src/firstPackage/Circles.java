package firstPackage;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.Math;
import java.awt.Color;
/**
*
* @author CJ Kende, S02058050
* @version 2018-01-19, CSC-241 Assignment 01
*/
public class Circles extends JPanel{
    Circle[] arrayOfCircles = new Circle[20];
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("Custom Panel", 350, 20); // A test for g.method().
		
		for(int i=0;i<arrayOfCircles.length; i++){
			g.setColor(arrayOfCircles[i].color);
			g.drawOval(arrayOfCircles[i].x, arrayOfCircles[i].y, arrayOfCircles[i].diameter, arrayOfCircles[i].diameter);
		}
	}

	public void createArrayOfCircles(){
		Dimension windowSize = this.getSize(); // Declare type 'Dimension' window size set to method getSize() of window instance.
		System.out.println(windowSize.getWidth() + "," + windowSize.getHeight()); 	// Uses methods getWidth() and getHeight() to
		for(int i = 0; i < arrayOfCircles.length; i++){
			int circleSize = getRandomIntegerRange(50, 200); // Declares circleSize to a 'random' int ranging from 50 - 200.
			int xPosition = getRandomIntegerRange(0, (int)windowSize.getWidth() - circleSize);
			int yPosition = getRandomIntegerRange(0, (int)windowSize.getHeight() - circleSize);
			arrayOfCircles[i]=new Circle(circleSize, xPosition, yPosition);
		}

		for(int i=0;i<arrayOfCircles.length; i++){
			if(isIntersectingCircle(arrayOfCircles[i], i) == false){
				arrayOfCircles[i].color = Color.red;
			}else{
				arrayOfCircles[i].color = Color.blue;
			}
		}
	}
        
    public int getRandomIntegerRange(int min, int max){
        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomNum;
    }

    public boolean isIntersectingCircle(Circle circlesToCompare, int i){
    		int radiusOfCircleA=circlesToCompare.diameter/2;
    		int xCenterOfCircleA=circlesToCompare.x + radiusOfCircleA;
    		int yCenterOfCircleA=circlesToCompare.y + radiusOfCircleA;
    		for(int j = 0; j < arrayOfCircles.length; j++){
    			if(i != j){
					int radiusOfCircleB=arrayOfCircles[j].diameter/2;
    				int xCenterOfCircleB=arrayOfCircles[j].x + radiusOfCircleB;
    				int yCenterOfCircleB=arrayOfCircles[j].y + radiusOfCircleB;
    				int heightOfTriangle=Math.abs(yCenterOfCircleA - yCenterOfCircleB);
    				int widthOfTriangle=Math.abs(xCenterOfCircleA - xCenterOfCircleB);
    				double distanceBetweenCircles=Math.sqrt(Math.pow(heightOfTriangle, 2)+Math.pow(widthOfTriangle, 2));
    				if(distanceBetweenCircles > radiusOfCircleA + radiusOfCircleB || distanceBetweenCircles < Math.abs(radiusOfCircleA - radiusOfCircleB)){
						//not intersecting - dont' do anyhing, keep looping 
    				}else{
    					return true; //once we know it does intersect ANY OTHER CIRCLE return true
    				}
    			}
    		}

    		//else we got , it didn't interstect any circle
    		return false;


    	}
    }

}