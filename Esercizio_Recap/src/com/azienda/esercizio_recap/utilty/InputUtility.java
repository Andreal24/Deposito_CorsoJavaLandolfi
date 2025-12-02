package com.azienda.esercizio_recap.utilty;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtility {


	private static final Scanner scanner = new Scanner(System.in); 


	public static boolean leggiBoolean(String messaggio) {
		boolean inputValido = false;
		boolean valore = false;

		do {
			System.out.print(messaggio + " (true/false): ");


			try {

				valore = scanner.nextBoolean();
				inputValido = true; 

			} catch (InputMismatchException e) {
				System.out.println("Errore! Inserisci solo 'true' o 'false'.");

				scanner.nextLine(); 

			}
		} while (!inputValido);

		return valore;
	}


	public static float leggiFloat(String messaggio) {
		boolean inputValido = false;
		float valore = 0.0f;

		do {
			System.out.print(messaggio + ": ");

			try {

				valore = scanner.nextFloat();
				inputValido = true; 

			} catch (InputMismatchException e) {
				System.out.println("Errore! Inserisci un numero decimale valido");

				scanner.nextLine(); 

			}
		} while (!inputValido);


		scanner.nextLine();

		return valore;
	}


}