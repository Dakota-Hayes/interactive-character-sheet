package com.github.dakota_hayes.interactive_character_sheet;

public class Trigger extends Element {
	private String attributeOneFPathString;
	private String attributeTwoFPathString;
	private String attributeThreeFPathString;
	private String attributeFourFPathString;

	// Default constructor
	public Trigger() {

		super();

		this.attributeOneFPathString = null;
		this.attributeTwoFPathString = null;
		this.attributeThreeFPathString = null;
		this.attributeFourFPathString = null;

	}

	// Int based value constructor
	public Trigger(String nameStringArgs, String descriptionStringArgs, String fPathParentStringArgs,
			boolean activeBooleanArgs,boolean templateBooleanArgs) {

		super(nameStringArgs, descriptionStringArgs, fPathParentStringArgs, activeBooleanArgs, templateBooleanArgs, ".TRI");

		this.attributeOneFPathString = null;
		this.attributeTwoFPathString = null;
		this.attributeThreeFPathString = null;
		this.attributeFourFPathString = null;
		
	}
}