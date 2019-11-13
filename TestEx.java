package Examples;

import java.util.InputMismatchException;

public class TestEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public boolean checkPositive(int x) {
		if(x == 0) throw new InputMismatchException();
		else if (x > 0) return true;
		else return false;
	}
	
	public String dropFirstLetter(String word) {
		return word.substring(1);
	}
}
