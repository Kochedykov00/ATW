package ru.kfpu.itis.group801.Kochedykov.basicClasses;

public class ComplexNumber {
	double a;
	double b;
	
	ComplexNumber() {
		this(0,0);
	}
	
	public ComplexNumber(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public ComplexNumber add(ComplexNumber a2) {
		return new ComplexNumber(a + a2.a, b + a2.b);
	}
	
	public void add2(ComplexNumber a2) {
		a += a2.a;
		b += a2.b;
	}
	
	public ComplexNumber sub(ComplexNumber a2) {
		return new ComplexNumber(a - a2.a, b - a2.b);
	}
	
	public void sub2(ComplexNumber a2) {
		a -= a2.a;
		b -= a2.b;
	}
	
	public void multiNumber2(double n) {
		a = n*a;
		b = n*b;
	}
	
	public ComplexNumber multiNumber(double n) {
		return new ComplexNumber(a*n, b*n);
	}
	
	public ComplexNumber mult(ComplexNumber a2) {
		return new ComplexNumber(a*a2.a + b*a2.b*-1, a*a2.b + a2.a*b);
	}
	
	public void mult2(ComplexNumber a2) {
		a = a*a2.a + b*a2.b * -1;
		b = a*a2.b + a2.a*b;
	}
	
	public ComplexNumber div(ComplexNumber a2) {
		return new ComplexNumber((a*a2.a + b*a2.b)/(a2.a*a2.a + a2.b*a2.b ),(a*a2.a - b*a2.b)/(a2.a*a2.a + a2.b*a2.b ));
	}
	
	public double length() {
		return Math.sqrt(a*a + b*b);
	}
	
	public double arg() {
		return Math.atan(b/a);
	}
	
	/*public ComplexNumber pow(double n) {
		return (Math.pow(a*a+b*b,n)*(Math.cos(Math.atan(b/a)*n))- Math.sin(Math.atan(b/a)*n));
	}
	*/
	
	public boolean equals(ComplexNumber a2) {
		if ((a == a2.a) & (b == a2.b)){
			return true;
		}
			else {
				return false;
			}
		}
	
	
	public String toString() {
		return "" + a + " + " + b + "i" + "";
	}

	
}
	
	
	
		
	
	
		