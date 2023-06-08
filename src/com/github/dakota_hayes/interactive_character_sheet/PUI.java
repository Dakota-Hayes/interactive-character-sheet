package com.github.dakota_hayes.interactive_character_sheet;

import java.util.Scanner;

public class PUI {

	private static Scanner scanner = new Scanner(System.in);
	private static String indexString =  "root";
	
	public static void Start() {

		MainSlide();

	}

	public static void Clear() {

		System.out.print("\n");
		System.out.flush();

	}

	public static void MainSlide() {
		int navigationIntTemp = 0;
		System.out.println("---Main Menu---");
		System.out.println("------------------");
		System.out.println("Add Custom Object 1");
		System.out.println("Remove Custom Object 2");
		System.out.println("Input: ");
		navigationIntTemp = scanner.nextInt();
		scanner.nextLine();
		
		switch (navigationIntTemp) {
		case 1: {
			System.out.print("Parent FPATH: ");
			String fPathStringTemp = scanner.nextLine();
			
			System.out.print("Name: ");
			String nameStringTemp = scanner.nextLine();
			
			System.out.print("Description: ");
			String descriptionStringTemp = scanner.nextLine();
			
			System.out.print("Active: ");
			boolean activeBooleanTemp = scanner.nextBoolean();
			scanner.nextLine();
			
			System.out.print("Extension: ");
			String extensionStringTemp = scanner.nextLine();
			
			RootHost.GetRoot().AddElement(new CustomObject(nameStringTemp,descriptionStringTemp,fPathStringTemp,activeBooleanTemp,extensionStringTemp));
			RootHost.GetRoot().PrintAll();
			break;
			
		}
		case 2: {
		
			System.out.print("FPATH: ");
			String fPathStringTemp = scanner.nextLine();
			RootHost.GetRoot().RemoveElement(RootHost.GetRoot().GetElement(fPathStringTemp));
			break;
		}
		case 3: {
			break;
		}
		case 4: {
			break;
		}
		default: {
			MainSlide();
			break;
		}
		}
		MainSlide();
	}

	public static void end() {

	}

}
