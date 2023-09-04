package com.github.dakota_hayes.interactive_character_sheet;

import java.util.*;

public abstract class Element {

	private String nameString = "NULL";
	private String descriptionString = "NULL";
	private String fPathString = "NULL";
	private String fPathParentString = "NULL";
	private String[] fPathChildStringContainer = null;
	private boolean activeBoolean = false;
	private boolean templateBoolean = false;
	private String extensionString = ".ELE";	
	
	private String valueString = "NULL";
	private double valueDouble = 0.0;
	private int valueInt = 0;
	private boolean valueBoolean = false;
	
	private String attributeOneFPathString = "NULL";
	private String attributeTwoFPathString = "NULL";
	private String attributeThreeFPathString = "NULL";
	private String attributeFourFPathString = "NULL";

	
	private String typeString = "ELEMENT OBJECT";
	
	// Empty Element Constructor
	public Element() {

	}

	// Filled Element Constructor
	public Element(String nameStringArgs, String descriptionStringArgs, String fPathParentStringArgs,
			boolean activeBooleanArgs, boolean templateBooleanArgs, String extensionStringArgs) {

		this.fPathParentString = fPathParentStringArgs;
		this.fPathString = fPathParentStringArgs +  "/" + nameStringArgs;
		this.nameString = nameStringArgs;
		this.descriptionString = descriptionStringArgs;
		this.activeBoolean = activeBooleanArgs;
		this.templateBoolean = templateBooleanArgs;
		this.extensionString = extensionStringArgs;
		this.fPathChildStringContainer = new String[0];

	}
	
	// Duplicate Element Constructor
	public Element(String fPathParentStringArgs, Element elementArgs) {

		this.nameString = elementArgs.GetNameString();
		this.fPathParentString = fPathParentStringArgs;
		this.fPathString = fPathParentStringArgs +  "/" + this.nameString;
			
		this.nameString = elementArgs.GetNameString();
		this.descriptionString = elementArgs.GetDescriptionString();
		this.fPathChildStringContainer = null;
		this.activeBoolean = elementArgs.GetActiveBoolean();
		this.templateBoolean = elementArgs.GetTemplateBoolean();
		this.extensionString = elementArgs.GetExtensionString();	
			
		this.valueString = elementArgs.GetValueString();
		this.valueDouble = elementArgs.GetValueDouble();
		this.valueInt = elementArgs.GetValueInt();
		this.valueBoolean = elementArgs.GetValueBoolean();
			
		this.attributeOneFPathString = elementArgs.GetAttributeOneFPathString();
		this.attributeTwoFPathString = elementArgs.GetAttributeTwoFPathString();
		this.attributeThreeFPathString = elementArgs.GetAttributeThreeFPathString();
		this.attributeFourFPathString = elementArgs.GetAttributeFourFPathString();

			
		this.typeString = elementArgs.GetTypeString();


	
	}
	
	// Add to fPathChildStringContainer
	public void AddToFPathChildStringContainer(String fPathStringArgs) {
		
		String[] fPathChildStringContainerTemp = new String[this.fPathChildStringContainer.length + 1];
		
		for(int i = 0; i < this.fPathChildStringContainer.length; i++)
		{
			
			fPathChildStringContainerTemp[i] = this.fPathChildStringContainer[i];
		
		}
		
		fPathChildStringContainerTemp[this.fPathChildStringContainer.length] = fPathStringArgs;
		
		this.fPathChildStringContainer = fPathChildStringContainerTemp;

	}
	
	// Remove from fPathChildStringContainer
	public void RemoveFromFPathChildStringContainer(String fPathStringArgs) {

		String[] fPathChildStringContainerTemp = new String[this.fPathChildStringContainer.length - 1];
		int i2 = 0;
		
		for(int i = 0; i < this.fPathChildStringContainer.length; i++)
		{
		
			if(this.fPathChildStringContainer[i] != fPathStringArgs)
			{

				fPathChildStringContainerTemp[i2] = this.fPathChildStringContainer[i];
				i2++;
				
			}
		
		}
		
		this.fPathChildStringContainer = fPathChildStringContainerTemp;

	}

	// Get fPathChildStringContainer
	public String[] GetFPathChildStringContainer() {

		return this.fPathChildStringContainer;

	}
	
	// Get nameString
	// Get nameString
	public String GetNameString() {

		return this.nameString;

	}

	// Set nameString
	// Set nameString
	public void SetNameString(String nameStringArgs) {

		this.nameString = nameStringArgs;

	}

	// Get fpathString
	public String GetFPathString() {

		return this.fPathString;

	}

	// Set fpathString
	public void SetFPathString(String fPathStringArgs) {

		this.fPathString = fPathStringArgs;

	}

	// Get fPathParentString
	public String GetFPathParentString() {

		return this.fPathParentString;

	}

	// Set fpathParentString
	public void SetFPathParentString(String fPathParentStringArgs) {

		this.fPathParentString = fPathParentStringArgs;

	}
	
	// Get templateBoolean
	public boolean GetTemplateBoolean()
	{
		
		return this.templateBoolean;
		
	}
	
	// Set templateBoolean
	public void SetTemplateBoolean(boolean templateBooleanArgs)
	{
		
		this.templateBoolean = templateBooleanArgs;
		
	}
	
	// Get descriptionString
	public String GetDescriptionString() {

		return this.descriptionString;

	}

	// Set descriptionString
	public void SetDecriptionString(String descriptionStringArgs) {

		this.descriptionString = descriptionStringArgs;

	}

	// Get activeBoolean
	public boolean GetActiveBoolean() {

		return this.activeBoolean;

	}

	// Set activeBoolean
	public void SetActiveBoolean(Boolean activeBooleanArgs) {

		this.activeBoolean = activeBooleanArgs;

	}

	// Get extensionString
	public String GetExtensionString() {

		return this.extensionString;

	}

	// Set extensionString
	public void SetExtensionString(String extensionStringArgs) {

		this.extensionString = extensionStringArgs;

	}

	// Print
	public void Print() {

	}

	// Get the typeString
	public String GetTypeString()
	{
		
		return this.typeString;
		
	}
	
	// Set the typeString of the attribute
	public void SetTypeString(String typeStringArgs)
	{
		
		this.typeString = typeStringArgs;
		
	}

	// Attribute Start
	// -------------------------------------------------------------------------------------------------
	
	// Get the string value of the attribute
	public String GetValueString() {
		return this.valueString;
	}
	
	// Set the string value of the attribute
	public void SetValueString(String valueStringArgs) {
		this.valueString = valueStringArgs;
	}
	
	// Get the int value of the attribute
	public int GetValueInt() {
		return this.valueInt;
	}
	
	// Set the int value of the attribute
	public void SetValueInt(int valueIntArgs) {
		this.valueInt = valueIntArgs;
	}
		
	// Get the double value of the attribute
	
	public double GetValueDouble() {
		return this.valueDouble;
	}
	
	// Set the double value of the attribute
	public void SetValueDouble(double valueDoubleArgs) {
		this.valueDouble = valueDoubleArgs;
	}
	
	// Get the boolean value of the attribute
	public boolean GetValueBoolean() {
		return this.valueBoolean;
	}

	// Set the boolean value of the attribute
	public void SetValueBoolean(boolean valueBooleanArgs) {
		this.valueBoolean = valueBooleanArgs;
	}
	// Attribute End
	// ------------------------------------------------------------------------------------------------------
	// Trigger Start
	
	// Get the string value of the attributeOneFPathString
	public String GetAttributeOneFPathString() {
		return this.attributeOneFPathString;
	}

	// Set the string value of the attributeOneFPathString
	public void SetAttributeOneFPathString(String fPathStringArgs) {
		this.attributeOneFPathString = fPathStringArgs;
	}

	// Get the string value of the attributeTwoFPathString
	public String GetAttributeTwoFPathString() {
		return this.attributeTwoFPathString;
	}

	
	// Set the string value of the attributeTwoFPathString
	public void SetAttributeTwoFPathString(String fPathStringArgs) {
		this.attributeTwoFPathString = fPathStringArgs;
	}

	// Get the string value of the attributeThreeFPathString
	public String GetAttributeThreeFPathString() {
		return this.attributeThreeFPathString;
	}

	// Set the string value of the attributeThreeFPathString
	public void SetAttributeThreeFPathString(String fPathStringArgs) {
		this.attributeThreeFPathString = fPathStringArgs;
	}

	// Get the string value of the attributeFourFPathString
	public String GetAttributeFourFPathString() {
		return this.attributeFourFPathString;
	}

	// Set the string value of the attributeFourFPathString
	public void SetAttributeFourFPathString(String fPathStringArgs) {
		this.attributeFourFPathString = fPathStringArgs;
	}
	// Check Trigger
	public void CheckTrigger() {

		if (this.typeString.equals("ADD")) {
			if (RootHost.GetElement(attributeFourFPathString).GetTypeString().equals("int")) {
				if (RootHost.GetElement(attributeOneFPathString).GetValueInt() == RootHost
						.GetElement(attributeFourFPathString).GetValueInt()) {
					RootHost.GetElement(attributeFourFPathString)
							.SetValueInt(RootHost.GetElement(attributeFourFPathString).GetValueInt()
									+ RootHost.GetElement(attributeThreeFPathString).GetValueInt());
				}
			} else if (RootHost.GetElement(attributeFourFPathString).GetTypeString().equals("double")) {
				if (RootHost.GetElement(attributeOneFPathString).GetValueDouble() == RootHost
						.GetElement(attributeFourFPathString).GetValueDouble()) {
					RootHost.GetElement(attributeFourFPathString)
							.SetValueDouble(RootHost.GetElement(attributeFourFPathString).GetValueDouble()
									+ RootHost.GetElement(attributeThreeFPathString).GetValueDouble());
				}
			}

		} else if (this.typeString.equals("SUBTRACT")) {
			if (RootHost.GetElement(attributeFourFPathString).GetTypeString().equals("int")) {
				if (RootHost.GetElement(attributeOneFPathString).GetValueInt() == RootHost
						.GetElement(attributeFourFPathString).GetValueInt()) {
					RootHost.GetElement(attributeFourFPathString)
							.SetValueInt(RootHost.GetElement(attributeFourFPathString).GetValueInt()
									- RootHost.GetElement(attributeThreeFPathString).GetValueInt());
				}
			} else if (RootHost.GetElement(attributeFourFPathString).GetTypeString().equals("double")) {
				if (RootHost.GetElement(attributeOneFPathString).GetValueDouble() == RootHost
						.GetElement(attributeFourFPathString).GetValueDouble()) {
					RootHost.GetElement(attributeFourFPathString)
							.SetValueDouble(RootHost.GetElement(attributeFourFPathString).GetValueDouble()
									- RootHost.GetElement(attributeThreeFPathString).GetValueDouble());
				}
			}
		} else if (this.typeString.equals("MULTIPLY")) {
			if (RootHost.GetElement(attributeFourFPathString).GetTypeString().equals("int")) {
				if (RootHost.GetElement(attributeOneFPathString).GetValueInt() == RootHost
						.GetElement(attributeFourFPathString).GetValueInt()) {
					RootHost.GetElement(attributeFourFPathString)
							.SetValueInt(RootHost.GetElement(attributeFourFPathString).GetValueInt()
									* RootHost.GetElement(attributeThreeFPathString).GetValueInt());
				}
			} else if (RootHost.GetElement(attributeFourFPathString).GetTypeString().equals("double")) {
				if (RootHost.GetElement(attributeOneFPathString).GetValueDouble() == RootHost
						.GetElement(attributeFourFPathString).GetValueDouble()) {
					RootHost.GetElement(attributeFourFPathString)
							.SetValueDouble(RootHost.GetElement(attributeFourFPathString).GetValueDouble()
									* RootHost.GetElement(attributeThreeFPathString).GetValueDouble());
				}
			}
		} else if (this.typeString.equals("DIVIDE")) {
			if (RootHost.GetElement(attributeFourFPathString).GetTypeString().equals("double")) {
				if (RootHost.GetElement(attributeOneFPathString).GetValueDouble() == RootHost
						.GetElement(attributeFourFPathString).GetValueDouble()) {
					RootHost.GetElement(attributeFourFPathString)
							.SetValueDouble(RootHost.GetElement(attributeFourFPathString).GetValueDouble()
									/ RootHost.GetElement(attributeThreeFPathString).GetValueDouble());
				}
			}
		} else if (this.typeString.equals("SET")) {
			if (RootHost.GetElement(attributeFourFPathString).GetTypeString().equals("String")) {
				if (RootHost.GetElement(attributeOneFPathString).GetValueString() == RootHost
						.GetElement(attributeFourFPathString).GetValueString()) {
					RootHost.GetElement(attributeFourFPathString)
							.SetValueString(RootHost.GetElement(attributeThreeFPathString).GetValueString());
				}
			} else if (RootHost.GetElement(attributeFourFPathString).GetTypeString().equals("int")) {
				if (RootHost.GetElement(attributeOneFPathString).GetValueInt() == RootHost
						.GetElement(attributeFourFPathString).GetValueInt()) {
					RootHost.GetElement(attributeFourFPathString)
							.SetValueInt(RootHost.GetElement(attributeThreeFPathString).GetValueInt());
				}
			} else if (RootHost.GetElement(attributeFourFPathString).GetTypeString().equals("double")) {
				if (RootHost.GetElement(attributeOneFPathString).GetValueDouble() == RootHost
						.GetElement(attributeFourFPathString).GetValueDouble()) {
					RootHost.GetElement(attributeFourFPathString)
							.SetValueDouble(RootHost.GetElement(attributeThreeFPathString).GetValueDouble());
				}
			} else if (RootHost.GetElement(attributeFourFPathString).GetTypeString().equals("boolean")) {
				if (RootHost.GetElement(attributeOneFPathString).GetValueBoolean() == RootHost
						.GetElement(attributeFourFPathString).GetValueBoolean()) {
					RootHost.GetElement(attributeFourFPathString).SetValueBoolean(
							RootHost.GetElement(attributeThreeFPathString).GetValueBoolean());
				}
			}
		} else if (this.typeString.equals("TOGGLE")) {
			if (RootHost.GetElement(attributeFourFPathString).GetTypeString().equals("String")) {
				if (RootHost.GetElement(attributeFourFPathString).GetTypeString().equals("boolean")) {
					if (RootHost.GetElement(attributeOneFPathString).GetValueBoolean() == true) {
						RootHost.GetElement(attributeFourFPathString).SetValueBoolean(false);
					} else if (RootHost.GetElement(attributeOneFPathString).GetValueBoolean() == false) {
						RootHost.GetElement(attributeFourFPathString).SetValueBoolean(true);
					}
				}
			}
		}
	}

	// Trigger End
	// ------------------------------------------------------------------------------------------------------

}