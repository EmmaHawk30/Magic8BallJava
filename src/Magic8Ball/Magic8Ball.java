package Magic8Ball;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

	public static void main(String[] args) {
		//Generate random number
		Random random = new Random();
		int randomNumber = random.nextInt(10);
		
		//Magic 8 Ball answers
		String mb1 = "Don't count on it";
		String mb2 = "It is decidedly so";
		String mb3 = "Signs point to yes";
		String mb4 = "Ask again later";
		String mb5 = "Outlook not so good";
		String mb6 = "Reply hazy, try again";
		String mb7 = "Most likely";
		String mb8 = "Very doubtful";
		String mb9 = "Concentrate and ask again";
		
		System.out.println("Ask the Magic 8 Ball a yes or no question");
		
		//Take user input
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    String question = myObj.nextLine();  // Read user input
		
	    if(question != null)
	    {
	    	//Assign answer to random number
			switch(randomNumber) {
			case 1:
				System.out.println(mb1);
				break;
			case 2:
				System.out.println(mb2);
				break;
			case 3:
				System.out.println(mb3);
				break;
			case 4:
				System.out.println(mb4);
				break;
			case 5:
				System.out.println(mb5);
				break;
			case 6:
				System.out.println(mb6);
				break;
			case 7:
				System.out.println(mb7);
				break;
			case 8:
				System.out.println(mb8);
				break;
			case 9:
				System.out.println(mb9);
				break;
			default:
				System.out.println("Ask again");
				break;
			}
	    }
		
	}

}
