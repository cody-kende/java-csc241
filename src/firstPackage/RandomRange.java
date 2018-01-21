package firstPackage;
import java.util.Random;
/**
*
* @author CJ Kende, S02058050
* @version 2018-01-19, CSC-241 Assignment 01
*/
public class RandomRange{
	public static void main(String[] args){
	// Random range for pixel size of circles.
		int START=100;
		int END=200;
		Random random = new Random();
		for(int i = 100; i < 200; ++i){
			randomInteger(START, END, random);
		}
	}

	// Generates the random integer between specified(START & END) random range.
	public static void randomInteger(int aStart, int aEnd, Random aRandom){
		if (aStart > aEnd) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		//get range, cast long() to avoid overflow problems
		long range = (long)aEnd - (long)aStart + 1;
		// compute a fraction of the range, 0 <= frac < range
		long fraction = (long)(range * aRandom.nextDouble());
		int randomNumber =  (int)(fraction + aStart);
	}
}