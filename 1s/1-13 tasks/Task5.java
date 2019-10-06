public class Task5{
	public static void main(String[] args){

		double x = 0.5;

		final double EPS = 1e-9;
		double s,a;
		int i;
		a = 1;
		s = a;
		i = 1;
		while ((a>0 ? a : -a) > EPS){
			a = a * x / i ;
			s += a;
			i +=1;
		}
		System.out.println("Result : " + s);


	}
}