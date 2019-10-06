/**
*@author Alexandr Kochedykov
*11-801
*Task 06
*/
public class Task6{



		public static void main(String [] args){
		double x = 0.3;
		final double EPS = 1e-9;
		double s,a;
		int i,k;
		a = x;
		s = a;
		i = 2;
		k = 1;
		while((a > 0 ? a : -a)>EPS){

			a = a*x/i;
			a *= -1;
			s += a;
			i +=1;
			

			}
		
			System.out.println("Result" +s);

		}
		

		}
		