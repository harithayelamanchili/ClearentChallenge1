package practice1;

public class Wallet1 {
	public  double wallet( double v[], double mc[], double d[]){
		double Vinterest = 0;
		double MCinterest = 0;
		double Dinterest = 0;
		double interest = 0; 
		Cards1 c = new Cards1();
		for(int i = 0; i < v.length; i++){
			Vinterest = Vinterest+c.visa(v[i]);
		}
		for(int i = 0; i < mc.length; i++){
			MCinterest = MCinterest+c.MC(mc[i]);
		}
		for(int i = 0; i < d.length; i++){
			Dinterest = Dinterest+c.Discover(d[i]);
		}
		interest = Vinterest + MCinterest + Dinterest; 
		return interest;
	} 
}

