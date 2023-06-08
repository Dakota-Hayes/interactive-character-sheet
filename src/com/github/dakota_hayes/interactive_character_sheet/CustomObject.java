package com.github.dakota_hayes.interactive_character_sheet;

import java.util.*;

public class CustomObject extends Element {

	public CustomObject() {

		super();

	}

	public CustomObject(String nameStringArgs, String descriptionStringArgs, String fPathStringArgs,
			boolean activeBooleanArgs, String extensionStringArgs) {

		super(nameStringArgs, descriptionStringArgs, fPathStringArgs, activeBooleanArgs, extensionStringArgs);

	}

	@Override
	// print
	public void Print()
	{
		
		System.out.println(this.GetFPathString());
		
	}
	
}