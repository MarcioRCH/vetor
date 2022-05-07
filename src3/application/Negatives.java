package application;

import java.util.Locale;
import java.util.Scanner;

public class Negatives {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Negatives");
		System.out.print("How many numbers will you type? ");
		int n = sc.nextInt();
		System.out.println(" ");
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
		}
		System.out.printf("\nNegatives numbers:\n");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}		
		sc.close();
	}

}
