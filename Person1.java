package practice1;

public class Person1 
{
	
	public  double person(int noOfWallet,double visa[], double MC[], double Discover[])
	{
		double ans;
		Wallet1 w1 = new Wallet1();
	ans = w1.wallet(visa,MC,Discover);

	return ans;
	}
}
