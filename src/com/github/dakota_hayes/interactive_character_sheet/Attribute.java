package com.github.dakota_hayes.interactive_character_sheet;

public class Attribute extends Element {
	
	private String valueString;
	private double valueDouble;
	private int valueInt;
	private boolean valueBoolean;
	
	private String typeString;
	
	// Default constructor
	public Attribute() {
		
		super();
		
		this.valueString = "";
		this.valueInt = 0;
		this.valueDouble = 0.0;
		this.valueBoolean = false;
		this.typeString = null;
		
	}

	// Int based value constructor
	public Attribute(String nameStringArgs, String descriptionStringArgs, String fPathStringArgs, boolean activeBooleanArgs) {
	
		super(nameStringArgs, descriptionStringArgs, fPathStringArgs, activeBooleanArgs,".ATT");
	
		this.valueString = "";
		this.valueInt = 0;
		this.valueDouble = 0.0;
		this.valueBoolean = false;
		this.typeString = null;
		
	}
	
	@Override 
	// Get the typeString
	public String GetTypeString()
	{
		
		return this.typeString;
		
	}
	
	@Override
	// Set the typeString of the attribute
	public void SetTypeString(String typeStringArgs)
	{
		
		this.typeString = typeStringArgs;
		
	}
	
	@Override
	// Get the string value of the attribute
	public String GetValueString() {
		return this.valueString;
	}
	
	@Override
	// Set the string value of the attribute
	public void SetValueString(String valueStringArgs) {
		this.valueString = valueStringArgs;
	}
	
	@Override
	// Get the int value of the attribute
	public int GetValueInt() {
		return this.valueInt;
	}
	
	@Override
	// Set the int value of the attribute
	public void SetValueInt(int valueIntArgs) {
		this.valueInt = valueIntArgs;
	}
		
	@Override
	// Get the double value of the attribute
	
	public double GetValueDouble() {
		return this.valueDouble;
	}
	
	@Override
	// Set the double value of the attribute
	public void SetValueDouble(double valueDoubleArgs) {
		this.valueDouble = valueDoubleArgs;
	}
	
	@Override
	// Get the boolean value of the attribute
	public boolean GetValueBoolean() {
		return this.valueBoolean;
	}

	@Override
	// Set the boolean value of the attribute
	public void SetValueBoolean(boolean valueBooleanArgs) {
		this.valueBoolean = valueBooleanArgs;
	}
		
	@Override
	// Print the attribute value
	public void Print() {
		System.out.print(this.GetFPathString() + " ");
		
		if (this.valueString != null) {
			System.out.println(this.GetNameString() + " " + this.valueString);
		}
		if (this.valueInt != 0) {
			System.out.println(this.GetNameString() + " " + this.valueInt);
		}
		if (this.valueDouble != 0.0) {
			System.out.println(this.GetNameString() + " " + this.valueDouble);
		}
		if (this.valueBoolean != false) {
			System.out.println(this.GetNameString() + " " + this.valueBoolean);
		}
	}
}
