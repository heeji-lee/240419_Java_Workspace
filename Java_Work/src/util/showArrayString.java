package util;

public class showArrayString {
	public static void show(String[] arrayString) {
		for (int i = 0; i < arrayString.length; i++) {
			if(i == 0) {
				System.out.print(arrayString[i]);	
			} else {
				System.out.print(", " + arrayString[i]);	
			}
			
		}
	}
}