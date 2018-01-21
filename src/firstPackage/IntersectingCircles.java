package firstPackage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(1000,1000);
		application.setVisible(true);
	}
}	