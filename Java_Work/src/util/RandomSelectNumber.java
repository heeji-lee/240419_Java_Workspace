package util;

import java.util.Random;

public class RandomSelectNumber {
	
	public static int selectInt(int boundary) {
		Random random = new Random();
		int randomNumber = random.nextInt(boundary)+1;
		return randomNumber;
	}
	
}
