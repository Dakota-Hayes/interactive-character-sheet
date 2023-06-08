package com.github.dakota_hayes.interactive_character_sheet;

public class Trigger extends Element {
	private String attributeOneFPathString;
	private String attributeTwoFPathString;
	private String attributeThreeFPathString;
	private String attributeFourFPathString;

	private String typeString;

	// Default constructor
	public Trigger() {

		super();

		this.attributeOneFPathString = null;
		this.attributeTwoFPathString = null;
		this.attributeThreeFPathString = null;
		this.attributeFourFPathString = null;
		this.typeString = null;

	}

	// Int based value constructor
	public Trigger(String nameStringArgs, String descriptionStringArgs, String fPathStringArgs,
			boolean activeBooleanArgs) {

		super(nameStringArgs, descriptionStringArgs, fPathStringArgs, activeBooleanArgs, ".TRI");

		this.attributeOneFPathString = null;
		this.attributeTwoFPathString = null;
		this.attributeThreeFPathString = null;
		this.attributeFourFPathString = null;
		this.typeString = null;

	}

	@Override
	// Get the string value of the attributeOneFPathString
	public String GetAttributeOneFPathString() {
		return this.attributeOneFPathString;
	}

	@Override
	// Set the string value of the attributeOneFPathString
	public void SetAttributeOneFPathString(String fPathStringArgs) {
		this.attributeOneFPathString = fPathStringArgs;
	}

	@Override
	// Get the string value of the attributeTwoFPathString
	public String GetAttributeTwoFPathString() {
		return this.attributeTwoFPathString;
	}

	@Override
	// Set the string value of the attributeTwoFPathString
	public void SetAttributeTwoFPathString(String fPathStringArgs) {
		this.attributeTwoFPathString = fPathStringArgs;
	}

	@Override
	// Get the string value of the attributeThreeFPathString
	public String GetAttributeThreeFPathString() {
		return this.attributeThreeFPathString;
	}

	@Override
	// Set the string value of the attributeThreeFPathString
	public void SetAttributeThreeFPathString(String fPathStringArgs) {
		this.attributeThreeFPathString = fPathStringArgs;
	}

	@Override
	// Get the string value of the attributeFourFPathString
	public String GetAttributeFourFPathString() {
		return this.attributeFourFPathString;
	}

	@Override
	// Set the string value of the attributeFourFPathString
	public void SetAttributeFourFPathString(String fPathStringArgs) {
		this.attributeFourFPathString = fPathStringArgs;
	}

	@Override
	// Get the string value of the typeString
	public String GetTypeString() {
		return this.typeString;
	}

	@Override
	// Set the string value of the typeString
	public void SetTypeString(String typeStringArgs) {
		this.typeString = typeStringArgs;
	}

	@Override
	// Check Trigger
	public void CheckTrigger() {

		if (this.typeString.equals("ADD")) {
			if (RootHost.GetRoot().GetElement(attributeFourFPathString).GetTypeString().equals("int")) {
				if (RootHost.GetRoot().GetElement(attributeOneFPathString).GetValueInt() == RootHost.GetRoot()
						.GetElement(attributeFourFPathString).GetValueInt()) {
					RootHost.GetRoot().GetElement(attributeFourFPathString)
							.SetValueInt(RootHost.GetRoot().GetElement(attributeFourFPathString).GetValueInt()
									+ RootHost.GetRoot().GetElement(attributeThreeFPathString).GetValueInt());
				}
			} else if (RootHost.GetRoot().GetElement(attributeFourFPathString).GetTypeString().equals("double")) {
				if (RootHost.GetRoot().GetElement(attributeOneFPathString).GetValueDouble() == RootHost.GetRoot()
						.GetElement(attributeFourFPathString).GetValueDouble()) {
					RootHost.GetRoot().GetElement(attributeFourFPathString)
							.SetValueDouble(RootHost.GetRoot().GetElement(attributeFourFPathString).GetValueDouble()
									+ RootHost.GetRoot().GetElement(attributeThreeFPathString).GetValueDouble());
				}
			}

		} else if (this.typeString.equals("SUBTRACT")) {
			if (RootHost.GetRoot().GetElement(attributeFourFPathString).GetTypeString().equals("int")) {
				if (RootHost.GetRoot().GetElement(attributeOneFPathString).GetValueInt() == RootHost.GetRoot()
						.GetElement(attributeFourFPathString).GetValueInt()) {
					RootHost.GetRoot().GetElement(attributeFourFPathString)
							.SetValueInt(RootHost.GetRoot().GetElement(attributeFourFPathString).GetValueInt()
									- RootHost.GetRoot().GetElement(attributeThreeFPathString).GetValueInt());
				}
			} else if (RootHost.GetRoot().GetElement(attributeFourFPathString).GetTypeString().equals("double")) {
				if (RootHost.GetRoot().GetElement(attributeOneFPathString).GetValueDouble() == RootHost.GetRoot()
						.GetElement(attributeFourFPathString).GetValueDouble()) {
					RootHost.GetRoot().GetElement(attributeFourFPathString)
							.SetValueDouble(RootHost.GetRoot().GetElement(attributeFourFPathString).GetValueDouble()
									- RootHost.GetRoot().GetElement(attributeThreeFPathString).GetValueDouble());
				}
			}
		} else if (this.typeString.equals("MULTIPLY")) {
			if (RootHost.GetRoot().GetElement(attributeFourFPathString).GetTypeString().equals("int")) {
				if (RootHost.GetRoot().GetElement(attributeOneFPathString).GetValueInt() == RootHost.GetRoot()
						.GetElement(attributeFourFPathString).GetValueInt()) {
					RootHost.GetRoot().GetElement(attributeFourFPathString)
							.SetValueInt(RootHost.GetRoot().GetElement(attributeFourFPathString).GetValueInt()
									* RootHost.GetRoot().GetElement(attributeThreeFPathString).GetValueInt());
				}
			} else if (RootHost.GetRoot().GetElement(attributeFourFPathString).GetTypeString().equals("double")) {
				if (RootHost.GetRoot().GetElement(attributeOneFPathString).GetValueDouble() == RootHost.GetRoot()
						.GetElement(attributeFourFPathString).GetValueDouble()) {
					RootHost.GetRoot().GetElement(attributeFourFPathString)
							.SetValueDouble(RootHost.GetRoot().GetElement(attributeFourFPathString).GetValueDouble()
									* RootHost.GetRoot().GetElement(attributeThreeFPathString).GetValueDouble());
				}
			}
		} else if (this.typeString.equals("DIVIDE")) {
			if (RootHost.GetRoot().GetElement(attributeFourFPathString).GetTypeString().equals("double")) {
				if (RootHost.GetRoot().GetElement(attributeOneFPathString).GetValueDouble() == RootHost.GetRoot()
						.GetElement(attributeFourFPathString).GetValueDouble()) {
					RootHost.GetRoot().GetElement(attributeFourFPathString)
							.SetValueDouble(RootHost.GetRoot().GetElement(attributeFourFPathString).GetValueDouble()
									/ RootHost.GetRoot().GetElement(attributeThreeFPathString).GetValueDouble());
				}
			}
		} else if (this.typeString.equals("SET")) {
			if (RootHost.GetRoot().GetElement(attributeFourFPathString).GetTypeString().equals("String")) {
				if (RootHost.GetRoot().GetElement(attributeOneFPathString).GetValueString() == RootHost.GetRoot()
						.GetElement(attributeFourFPathString).GetValueString()) {
					RootHost.GetRoot().GetElement(attributeFourFPathString)
							.SetValueString(RootHost.GetRoot().GetElement(attributeThreeFPathString).GetValueString());
				}
			} else if (RootHost.GetRoot().GetElement(attributeFourFPathString).GetTypeString().equals("int")) {
				if (RootHost.GetRoot().GetElement(attributeOneFPathString).GetValueInt() == RootHost.GetRoot()
						.GetElement(attributeFourFPathString).GetValueInt()) {
					RootHost.GetRoot().GetElement(attributeFourFPathString)
							.SetValueInt(RootHost.GetRoot().GetElement(attributeThreeFPathString).GetValueInt());
				}
			} else if (RootHost.GetRoot().GetElement(attributeFourFPathString).GetTypeString().equals("double")) {
				if (RootHost.GetRoot().GetElement(attributeOneFPathString).GetValueDouble() == RootHost.GetRoot()
						.GetElement(attributeFourFPathString).GetValueDouble()) {
					RootHost.GetRoot().GetElement(attributeFourFPathString)
							.SetValueDouble(RootHost.GetRoot().GetElement(attributeThreeFPathString).GetValueDouble());
				}
			} else if (RootHost.GetRoot().GetElement(attributeFourFPathString).GetTypeString().equals("boolean")) {
				if (RootHost.GetRoot().GetElement(attributeOneFPathString).GetValueBoolean() == RootHost.GetRoot()
						.GetElement(attributeFourFPathString).GetValueBoolean()) {
					RootHost.GetRoot().GetElement(attributeFourFPathString).SetValueBoolean(
							RootHost.GetRoot().GetElement(attributeThreeFPathString).GetValueBoolean());
				}
			}
		} else if (this.typeString.equals("TOGGLE")) {
			if (RootHost.GetRoot().GetElement(attributeFourFPathString).GetTypeString().equals("String")) {
				if (RootHost.GetRoot().GetElement(attributeFourFPathString).GetTypeString().equals("boolean")) {
					if (RootHost.GetRoot().GetElement(attributeOneFPathString).GetValueBoolean() == true) {
						RootHost.GetRoot().GetElement(attributeFourFPathString).SetValueBoolean(false);
					} else if (RootHost.GetRoot().GetElement(attributeOneFPathString).GetValueBoolean() == false) {
						RootHost.GetRoot().GetElement(attributeFourFPathString).SetValueBoolean(true);
					}
				}
			}
		}
	}

	@Override
	// Print the attribute value
	public void Print() {
		System.out.println(this.GetFPathString());
	}
}