package com.twu.biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
	
	final String INVALID_INTEGER_MSG = "Must be an integer! Please, try again."; 

	public void println(String line) {
		System.out.println(line);
	}

	public int readInteger() {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				return scanner.nextInt();
			} catch (InputMismatchException e) {
				println(INVALID_INTEGER_MSG);
			}
		}
	}

}
