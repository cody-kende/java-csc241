package firstPackage;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
*
* @author CJ Kende, S02058050
* @version 2018-01-19, CSC-241 Assignment 01
*/
public class IntersectingCircles{
	/**
	* Main entry point.
	* <p>
	* Execute: </p>
	* <pre>java program</pre>
	* 
	* @param args      not used.
	*/
	public static void main(String[] args){
		JOptionPane.showMessageDialog(null, "Welcome to Java");
                Circles panel = new Circles();
                JFrame application = new JFrame();
                JButton button = new JButton("New Circles!");
                button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				// recreate the random circles and repaint panel when the button is pressed
				panel.createArrayOfCircles();
				panel.repaint();
			}
		});

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		panel.add(button);
		application.setSize(750,750); // .setSize(width, height);
		application.setVisible(true);
                panel.createArrayOfCircles();
	}
}	