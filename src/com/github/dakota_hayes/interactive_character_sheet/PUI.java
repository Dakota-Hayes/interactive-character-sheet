package com.github.dakota_hayes.interactive_character_sheet;

import java.util.Scanner;

public class PUI {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void Start() {

		MainSlide();

	}


	public static void MainSlide() {
		int navigationIntTemp = 0;
		System.out.println("---Main Menu---");
		System.out.println("------------------");
		System.out.println("Add Element Object To Current Element Object - 1");
		System.out.println("Remove Currently Selected Element Object - 2");
		System.out.println("Print All - 3");
		System.out.println("Change Element Currently Selected - 4");
		System.out.println("Print currently selected element - 5");
		System.out.println("Duplicate element to current element - 6");
		System.out.println("Input: ");
		navigationIntTemp = scanner.nextInt();
		scanner.nextLine();
		
		switch (navigationIntTemp) {
			case 1: {
			
				RootHost.AddElement();
			
				break;
			
			}
			case 2: {
		
				RootHost.RemoveElement();
			
				break;
			
			}
			
			case 3: {
			
				RootHost.PrintAll();	
				
				break;
			
			}
			
			case 4: {
				
				RootHost.ChangeParentElementFPath();
				
				break;
			
			}
			case 5: {
				
				RootHost.PrintFPathCurrentString();
				
				break;
			
			}
			case 6: {
				RootHost.DuplicateElement();
				
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
