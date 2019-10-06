	/**
*@author Alexandr Kochedykov
*11-801
*Task 07
*/
public class Task7{



		public static void main(String [] args){
		double x = 0.5;
		final double EPS = 1e-9;
		double s,a;
		int i,k,t;
		a = 1;
		s = a;
		i = 1;
		k = 2;
		while((a > 0 ? a : -a)>EPS){
			for (t = 0;t < k;t++){
				a = a*x/i;
				i +=1;

			}
			a *= -1;
			s +=a;
			k +=2;
			

		}
		System.out.println("Result:" +s);

		}
		}