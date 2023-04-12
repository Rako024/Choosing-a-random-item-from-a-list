/*Author: Rashid Babazada
Author of idea: Fuad Qurbanov (FM)
The work the program does:
Randomly selecting a given number of people from a list of people's names in an external .txt file and printing 
them to the file.
* The list of human names must be written to a list called "list.txt" or the program will not work.
Date: 4/13/2023
*/

import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		boolean next = true;
		while(next) {
		System.out.println("Pleas select language :");
		System.out.println("1. English");
		System.out.println("2. Azərbaycanca");
		int n = in.nextInt();
		int slct;
		boolean t = true;
		switch (n) {
		case 1:
			t = true;
			break;
		case 2:
			t = false;
			break;
		default:
			t = true;
			break;
		}
		if (t) {
			System.out.print("\nWelcom, Pleas enter seletion number : ");

		} else {
			System.out.print("\nXoş gəlmisiniz, Xahiş edirik seçiləcək adamların sayını daxil edin : ");

		}
		slct = in.nextInt();
		WriterReader a = new WriterReader(slct);
		if(t) {
			System.out.println("\nShould your selection be written to a file or just printed to the screen?");
			System.out.println("1.Let it be printed in file.");
			System.out.println("2. Just print to the screen.");
			System.out.print("Your choice: ");
		}else {
			System.out.println("\nSeçiminiz fayla yazılmalı yoxsa sadəcə ekrana çap olunmalıdır?");
			System.out.println("1. Fayla çap olunsun.");
			System.out.println("2. Sadəcə ekrana çap edin.");
			System.out.print("Seçiminiz : ");
		}
		n = in.nextInt();
		System.out.println();
		if(n==1) {
			a.Print(a.Select(a.Reader()));
			a.Writer(a.Select(a.Reader()));
		}else {
			a.Print(a.Select(a.Reader()));
		}
		if(t) {
			System.out.println("\nRestart the program?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			System.out.print("Your choice : ");
		}else {
			System.out.println("\nProqram yenidən başlasın?");
			System.out.println("1. Bəli");
			System.out.println("2. Xeyir");
			System.out.print("Seçiminiz : ");
		}
		n= in.nextInt();
		if(n!=1) {
			next=false;
			if(t) {
				System.out.println("\n Bye-Bye :)");
			}else {
				System.out.println("\n Istifadə etdiyiniz üçün təşəkkürlər :)");
			}
		}
		}
		in.close();
	}

}
