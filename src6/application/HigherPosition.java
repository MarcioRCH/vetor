package application;

import java.util.Locale;
import java.util.Scanner;

public class HigherPosition {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Higher Position");
		System.out.print("How many numbers you will type?: ");
		int n = sc.nextInt();
		System.out.println(" ");
		
		double[] vect = new double[n];
		double higher = vect[0];
		int position = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Type a number: ");
			vect[i] = sc.nextInt();
			if(vect[i] > higher) {
				higher = vect[i];
				position = i;
			}
		}
		System.out.printf("\nHIGHER VALUE: " + higher);
		System.out.printf("\nHIGHER VALUE POSITION: " + position);
	}

}
