package application;

import java.util.Locale;
import java.util.Scanner;

public class SumOfVectors {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum of vectors");
		System.out.print("How many values will each vector have? ");
		int n = sc.nextInt();
		double[] vectA = new double[n];
		double[] vectB = new double[n];
		double sum;
		
		
		System.out.println("Enter the values of vector A: ");
		for(int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextDouble();
		}
		System.out.println("Enter the values of vector B: ");
		for(int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextDouble();
		}
		
		System.out.println("Resulting value:");
		for(int i = 0; i< n; i++) {
			sum = vectA[i] + vectB[i];
			System.out.println(sum);
		}
		
		sc.close();
	}

}
