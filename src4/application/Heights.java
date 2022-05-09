package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Methods;

public class Heights {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Heights");
		System.out.print("How many peoples will be entered? ");
		int n = sc.nextInt();
		System.out.println(" ");
		Methods[] vect = new Methods[n];

		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println((i + 1) + "st person data:");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			System.out.print("Height: ");
			double height = sc.nextDouble();
			vect[i] = new Methods(name, age, height);
			System.out.println(" ");
		}
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getHeight();
		}
		double avg = sum / n;
		System.out.printf("Average height: %.2f\n", avg);
		
		double percent = 0.0;
		sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getAge() < 16) {
				sum += 1;
			}
		}
		percent = (100 / n) * sum;
		System.out.printf("People under 16 years old: %.2f%%\n", percent);
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		sc.close();
	}
}