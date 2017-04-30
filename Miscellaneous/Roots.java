// Roots.Java
// Adam Zoubeidi azoubeid
// Pa 4

// notes
// findroot2, body of main funciton is almost exactly like funciton findroot. a and b and tolerance are all input, so ger rid of that line
// also an array of coefficients also passed in(dub[] C). width is diff bw 2 end points. do return instead of sys,outprint.
// in place of F, put poly(C, a)

// poly, index 0 is x^0, index 1 is x^1. x is what youre plugging into the polynomial
// needs to be a double array

//diff
//takes in array, and returns derivative polynomialuse the d_k = (k +1)c_k+1 equation

// find odd roots of derivative and plug into the original function, see if f(root) < threshold

//in main, look at poly and see if sign change across that subinterval. if yes then run find root on that interval
// if no sign change there might be an even root, so run the derivative to see if root, then run those roots through original function(poly)
// and see if below threshold.
// #4 in description of fn main. width is resolution
// a = L;
// b = (a + resolution);
// while(a <= R){
//
//
// a = b;
// b = (a + resolution);
// }

import java.util.Scanner;

class Roots{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int degree; // must be positive
    double[] co, roots;
    double L, R, a, b, resolution=Math.pow(10, -2), tolerance=Math.pow(10, -7);
    double threshold=Math.pow(10, -3);

    System.out.print("Enter the degree: ");
    degree = sc.nextInt() + 1;
    co = new double[degree];
    System.out.print("Enter " + degree + " coefficients: ");
    for(int i=0; i<degree; i++){
      co[i] = sc.nextInt();
    }
    System.out.print("Enter the left and right endpoints: ");
    L = sc.nextInt();
    R = sc.nextInt();

    a = L;
    b = (a + resolution);
    while(a <= R){
      for(double i = a; i < b; i +=resolution){
        if (poly(co, i) * poly(co, b) < 0){
          double odd = findRoot(co, a, b, tolerance);
          System.out.printf("Root found at: %.5f\n", odd);
          System.out.println("1st\n");
        }
        else if (poly(co, i) * poly(co, b) >= 0){
          double even = findRoot(diff(co), a, b, tolerance);
          if (Math.abs(poly(co, even)) < threshold){
            System.out.printf("Root found at: %.5f\n", even);
            System.out.println("2nd\n");
          }
        }
        else{
            continue;
        }
      }
      a = b;
      b = (a + resolution);

    }
    if (poly(co, L) * poly(co, R) > 0){
      System.out.println("No roots were found in the specified range.");
    }

  }

    static double[] diff(double[] C){
      double[] D= new double[C.length-1];
      for(int i=0; i<D.length; i++){
        D[i] = (i+1) * C[i+1];
      }
      return D;
    }

    static double poly(double[] C, double x){
      double sum = 0.0;
      for(int i=0; i<C.length; i++){
        sum += C[i] * (Math.pow(x, i));
      }
      return sum;
    }


    static double findRoot(double[] C, double a, double b, double tolerance){
      double width = (b - a), mid = 0.0;
      while(width > tolerance){
        mid = (a+b)/2;
        if((poly(C, a)) * (poly(C, mid)) <=0){
          b = mid;
        }
        else{
          a = mid;
        }
        width = b-a;
      }
      return mid;
    }
}
