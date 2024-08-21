package RandomNumber;

import java.util.Random;
import java.util.Scanner;

public class Random1 {

	public static void main(String[] args) {
		
		Scanner A=new Scanner(System.in);
		int number;
		
		Random random =new Random();
		number =random.nextInt(1, 9);
		int i=1;
		System.out.println("welcome to the game lets start-->>");
		while(i<=3) {
			System.out.println();
			System.out.println("enter a number-->..-->");
			int userInput=A.nextInt();
			if(number==userInput) {
				System.out.println("you won the game");
				break;
			}
			else {
				if(i<=2)
				System.out.println("try again ");
				if(i==3) {
					System.out.println("you lost the game");
					
				}
				}
			
			i++;
		}
		System.out.println();
		System.out.println("random number is -->" + number);
		}
	
}