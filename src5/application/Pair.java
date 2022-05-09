package application;

import java.util.Locale;
import java.util.Scanner;

public class Pair {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Pair");
		System.out.print("How many numbers you will type?: ");
		int n = sc.nextInt();
		System.out.println(" ");
		
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Type a number: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.printf("\nPAIRS NUMBERS: \n");
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(vect[i]% 2 == 0) {
				System.out.print(vect[i] + " ");
				count += 1;
			}
		}
		System.out.printf("\n\nPAIRS QUANTITY = " + count);
		sc.close();
	}

}
