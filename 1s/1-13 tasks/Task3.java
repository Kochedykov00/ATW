import java.util.Scanner;

/**
*@author Alexandr Kochedykov
*11-801
*Task 03
*/
public class Task3{



		public static void main(String [] args){

		double x = 0.5;
		final double EPS = 1e-9;
		double s,a;
		int z,l,i,t,c,k;
		a = 1;z = 1;i = 1;k = 1;
		s = a;
	
		while((a > 0 ? a : -a)>EPS){
		for (l=1;l<=2*k;l++){
		z = z*l;
		l += 1;
		}

		 for (t=0;t<k;t++){

		 a = (a*x)/((i*i)*4);
		 i +=1;
		 }
		 a = a*l*(1-2*k);
		 a *= -1;
		 s += a;
		 k += 1;
			

			}
		
		System.out.println(s);	

		}
		

		}
		