package SortingSeraching;

import java.util.Scanner;
class Roots {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double resolution = 0.01;
		double tolerance = 0.0000001;
		double threshold = 0.001;
		int n;


//int n will represent the degree a positive integer 
//This will check to see if the input is both positive and an integer
		System.out.print("Enter the degree: ");
		while(true) {
			if(sc.hasNextInt()) {
				n = sc.nextInt();
				if (n>0) break;
			} else {
				sc.next();
			}
			System.out.print("Please enter a positive integer for the degree: ");
		}


//Coefficents are the degree + 1, or n +1
//They should only coefficents n+1 time so we need to limit this
//L and R are going to represent the left and right endpoints : [L , R]

		n = n + 1;
		double[] C = new double[n];
		System.out.print("Enter " + n + " coefficients: ");
		for (int i = 0 ; i< n; i ++) {
			C[i] = sc.nextDouble();

		}
		
		System.out.println("Enter the left and right endpoints: ");
		double L  = sc.nextDouble();
		double R = sc.nextDouble();
		double D [] = diff(C);
		double a = L; 
		int flag = 0;
		double root = 0.0;
		double b = a + resolution;
		while (b  <= R) {
			if (poly (C,a) * poly(C,b) <=0) {	
				root = findRoot(C,a,b, tolerance);
				System.out.print("Root found at " );
				System.out.printf("%.5f%n" , root);
				flag = 1;
			} else if (poly(D, a) * poly (D,b) <=0) {
				root = findRoot( D ,a, b, tolerance);
				if (Math.abs(poly (C,root)) < threshold) {
					System.out.println("Root found at " );
					System.out.printf("%.fn" , root);
					flag = 1;
				}

			}
			a = b;
			b = a + resolution;

		} 
		if (flag == 0)
			System.out.println("No roots were found in the specified range.");
	}




//A call to poly(c,x) will return the value at x of the polyn	omial w/coefficient array C.	
	static double poly(double[] C, double x) {
		double sum = 0.0;
		for (int i=0; i < C.length; i++) {
			sum += C[i] * Math.pow(x ,i);

		}

		return sum;
	}
	static double [] diff(double[] C) {
		double[] D = new double[C.length-1];
		for(int i=0; i < D.length; i++) {
			D[i]= C[i+1]*(i); 
		}
		return D;

	}
static double findRoot(double[]C, double a, double b, double tolerance) {
		double width = b-a;
		double mid= (a+b)/2;
		while (width > tolerance ) {
			mid = (a+b)/2;
			if (poly (C ,a) * poly (C, mid) <= 0) {
				b = mid;

			} else {
				a = mid;
			}
			width = b - a;
			
		}
		return mid;
	}

}


