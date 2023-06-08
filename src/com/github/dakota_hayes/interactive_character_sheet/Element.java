package com.github.dakota_hayes.interactive_character_sheet;

import java.util.*;

public abstract class Element {

	private String nameString;
	private String descriptionString;
	private String fPathString;
	private String[] fPathStringContainer;
	boolean activeBoolean;
	private String extensionString;
	private Map<String, Element> elementContainer;
	private int stepCountInt;

	// Empty Element Constructor
	public Element() {

		this.fPathString = "/New Element";
		this.nameString = "New Element";
		this.descriptionString = "This is a element.";
		this.activeBoolean = false;
		this.extensionString = ".ELE";
		this.elementContainer = new HashMap<String, Element>();
		this.fPathStringContainer = this.fPathString.split("/");
		this.stepCountInt = 1;

	}

	// Filled Element Constructor
	public Element(String nameStringArgs, String descriptionStringArgs, String fPathStringArgs,
			boolean activeBooleanArgs, String extensionStringArgs) {

		this.fPathString = fPathStringArgs + "/" + nameStringArgs;
		this.nameString = nameStringArgs;
		this.descriptionString = descriptionStringArgs;
		this.activeBoolean = activeBooleanArgs;
		this.extensionString = extensionStringArgs;
		this.elementContainer = new HashMap<String, Element>();
		this.fPathStringContainer = this.fPathString.split("/");
		this.stepCountInt = fPathStringContainer.length;

	}

	// Add Element to container
	public void AddElement(Element elementArgs) {

		this.elementContainer.put(elementArgs.GetFPathString(), elementArgs);

	}

	// Remove Element from container
	public void RemoveElement(Element elementArgs) {

		this.elementContainer.remove(elementArgs.GetFPathString());

	}

	// Set fPathStringContainer
	public void SetFPathStringContainer(String fPathStringArgs) {

		this.fPathStringContainer = fPathStringArgs.split("/");

	}

	// Get fPathStringContainer
	public String[] GetFPathStringContainer() {

		return this.fPathStringContainer;

	}

	// Set fPathStringContainerSingle
	public void SetFPathStringContainerSingle(int indexIntArgs, String fPathStringArgs) {

		this.fPathStringContainer[indexIntArgs] = fPathStringArgs;

	}

	// Get fPathStringContainerSingle
	public String GetFPathStringContainerSingle(int indexIntArgs) {

		return this.fPathStringContainer[indexIntArgs];

	}

	// Set stepCountInt
	public void SetStepCountInt() {

		this.stepCountInt = fPathStringContainer.length;

	}

	// Get stepCountInt
	public int GetStepCountInt() {

		return this.stepCountInt;

	}

	// Get elementCount
	public int GetElementCount() {

		return this.elementContainer.size();

	}

	// Get element
	public Element GetElement(String nameStringArgs) {

		return this.elementContainer.get(nameStringArgs);

	}

	// Set element
	public void SetElement(String nameStringArgs, Element elementArgs) {

		this.elementContainer.put(nameStringArgs, elementArgs);

	}

	// Get nameString
	public String GetNameString() {

		return this.nameString;

	}

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

		this.fPathString = fPathStringArgs + "/" + this.nameString + ".ELE";

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

	// PrintAll
	public void PrintAll() {

		for(int indexIntTemp = 0; indexIntTemp <  this.stepCountInt; indexIntTemp++)
		{
			System.out.print("  ");				
		}
		System.out.println(this.fPathString);

		for (Map.Entry<String, Element> entry : elementContainer.entrySet()) {
			for(int indexIntTemp = 0; indexIntTemp <  RootHost.GetRoot().GetElement(entry.getKey()).GetStepCountInt(); indexIntTemp++)
			{
				System.out.print("  ");				
			}
			
			System.out.println(entry.getKey());
		
		}

	}

	// Attribute Start
	// -------------------------------------------------------------------------------------------------
	// Get the typeString of the attribute

	public String GetTypeString() {
		return null;
	}

	// Set the typeString of the attribute
	public void SetTypeString(String typeStringArgs) {
	}

	// Get the string value of the attribute
	public String GetValueString() {
		return null;
	}

	// Set the string value of the attribute
	public void SetValueString(String valueStringArgs) {
	}

	// Get the int value of the attribute
	public int GetValueInt() {
		return 0;
	}

	// Set the int value of the attribute
	public void SetValueInt(int valueIntArgs) {
	}

	// Get the double value of the attribute
	public double GetValueDouble() {
		return 0.0;
	}

	// Set the double value of the attribute
	public void SetValueDouble(double valueDoubleArgs) {
	}

	// Get the boolean value of the attribute
	public boolean GetValueBoolean() {
		return false;
	}

	// Set the boolean value of the attribute
	public void SetValueBoolean(boolean valueBooleanArgs) {
	}

	// Attribute End
	// ------------------------------------------------------------------------------------------------------
	// Trigger Start

	// Get the string value of the attributeOneFPathString
	public String GetAttributeOneFPathString() {
		return null;
	}

	// Set the string value of the attributeOneFPathString
	public void SetAttributeOneFPathString(String fPathStringArgs) {
	}

	// Get the string value of the attributeTwoFPathString
	public String GetAttributeTwoFPathString() {
		return null;
	}

	// Set the string value of the attributeTwoFPathString
	public void SetAttributeTwoFPathString(String fPathStringArgs) {
	}

	// Get the string value of the attributeThreeFPathString
	public String GetAttributeThreeFPathString() {
		return null;
	}

	// Set the string value of the attributeThreeFPathString
	public void SetAttributeThreeFPathString(String fPathStringArgs) {
	}

	// Get the string value of the attributeFourFPathString
	public String GetAttributeFourFPathString() {
		return null;
	}

	// Set the string value of the attributeFourFPathString
	public void SetAttributeFourFPathString(String fPathStringArgs) {
	}

	// Set the string value of the typeString
	public void SetTypeString() {
	}

	// Check Trigger
	public void CheckTrigger() {
	}

	// Trigger End
	// ------------------------------------------------------------------------------------------------------

}