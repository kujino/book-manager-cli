package src;

import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		InputHandler inputHandler = new InputHandler(scanner);

		Menu menu = new Menu(inputHandler);
		menu.startMenu();
	}

}
