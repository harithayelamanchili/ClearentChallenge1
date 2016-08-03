package practice1;

import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) {
		//Visa 10%
		//MC 5%
		//Discover 1%
		
		double total = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of people ");
		int people = sc.nextInt(); // No. of wallets a person has

		//PersonsInput1 pi1 = new PersonsInput1();
		for(int k = 0; k < people; k++)
		{
			total = 0;
			PersonsInput1 pi1 = new PersonsInput1(k);
			total = pi1.getTotal();
		
			System.out.println("The total Interest for the Person  = " + total);
			System.out.println("-----------------");
		}
	}

	}



