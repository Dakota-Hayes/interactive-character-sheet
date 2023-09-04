package com.github.dakota_hayes.interactive_character_sheet;

import java.util.*;

public class ElementObject extends Element {

	public ElementObject() {

		super();

	}

	public ElementObject(String nameStringArgs, String descriptionStringArgs, String fPathParentStringArgs,
			boolean activeBooleanArgs, boolean templateBooleanArgs,String extensionStringArgs) {

		super(nameStringArgs, descriptionStringArgs, fPathParentStringArgs, activeBooleanArgs, templateBooleanArgs, extensionStringArgs);

	}

	// Duplicate Element Constructor
	public ElementObject(String fPathParentStringArgs, Element elementArgs) {

		super(fPathParentStringArgs,elementArgs);


	
	}
	
}