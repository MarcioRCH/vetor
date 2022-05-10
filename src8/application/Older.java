package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Objects;

public class Older {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Older");
		System.out.printf("How many people will you type? ");
		int n = sc.nextInt();
		System.out.println(" ");
		Objects[] vect = new Objects[n];
		sc.nextLine();
		
		for(int i = 0; i < vect.length; i++) {
			if(i == 0) {
				System.out.print((i + 1) + "st person data:");
			}else if(i == 1) {
				sc.nextLine();
				System.out.printf("\n" + (i + 1) + "nd person data: ");
			}else {
				sc.nextLine();
				System.out.printf("\n" + (i + 1) + "rd person data: ");
			}
			System.out.printf("\nName: ");
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			vect[i] = new Objects(name, age);
		}
		System.out.printf("\nOlder person: ");
		int higher = vect[0].getAge();
		String name = null;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getAge() > higher) {
				higher = vect[i].getAge();
				name = vect[i].getName();
			}
		}
		System.out.println(name);		
		sc.close();
	}

}
