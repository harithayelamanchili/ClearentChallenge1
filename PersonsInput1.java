package practice1;

import java.util.Scanner;
public class PersonsInput1 
{
	double total = 0;

	public PersonsInput1(int k)
	{

		int  n, m , p;   // No. of Visa, MC and Discover cards.

		double ans = 0;
		total = this.total;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of wallets the person "+(k+1)+" has ");

		int numOfWallet = sc.nextInt(); // No. of wallets a person has

		double Wallets[] = new double[numOfWallet];

		Person1 p1 = new Person1();

		for(int i = 0; i < numOfWallet; i++)
		{
			System.out.println("In Wallet "+(i+1));
			System.out.println("The no. of Visa Cards the wallet has " );
			n = sc.nextInt();
			System.out.println("The no. of MC Cards the wallet has " );
			m = sc.nextInt();
			System.out.println("The no. of Discover Cards the wallet has " );
			p = sc.nextInt();

			double visa[] = new double[n];
			double MC[] = new double[m];
			double Discover[] = new double[p];

			for(int j = 0; j < n; j++ )
			{

				System.out.println("The Amount in  Visa Card "+(j+1)+" of wallet "+(i+1));
				visa[j] = sc.nextDouble();

			}
			for(int j = 0; j < m; j++ )
			{
				System.out.println("The Amount in MC Card "+(j+1)+" of wallet "+(i+1));
				MC[j] = sc.nextDouble();

			}
			for(int j = 0; j < p; j++ )
			{
				System.out.println("The Amount in Discover Card "+(j+1)+" of wallet "+(i+1));
				Discover[j] = sc.nextDouble();	
			}

			ans = p1.person(i,visa,MC,Discover);

			Wallets[i] = ans;

			total = total + ans;


			System.out.println("The total Interest for the wallet " + (i+1)+" = " +ans );

		}
	}

	public double getTotal()
	{
		return this.total;
	}

}
