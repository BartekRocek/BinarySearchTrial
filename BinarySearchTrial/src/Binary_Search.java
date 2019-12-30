import java.util.Random;

public class Binary_Search {

	public static void main(String[] args) {
		
		Random randomNumber = new Random();
		
		int counter = 1; 
		
				for (int i = 0; i <= 10; i++) {
			
		
					int n = randomNumber.nextInt(101); //selecting one random number from 0-100 range
		
							System.out.println("Number " + counter + " is " + n);
		
							counter++; // counter iterated 
		}
		

	}

}
