package Models;

import java.util.Random;

public class Utils {

	public	static int getRandomNumber(int faixa, int randomLengh){
		Random generator = new Random();
		int i = faixa - generator.nextInt(randomLengh);
		
		return i;
	}
}
