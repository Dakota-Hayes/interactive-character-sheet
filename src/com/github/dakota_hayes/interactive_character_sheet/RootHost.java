package com.github.dakota_hayes.interactive_character_sheet;

import java.util.*;

public class RootHost extends Element{
	
	private static Map<String, Element> elementContainer;
	private static Scanner scanner = new Scanner(System.in);
	private static String fPathLastString = "/ROOTHOST/ROOT";
	private static String fPathCurrentString = null;
	
	//Reset RootHost
	public static void InitializeRootHost()
	{
		
		fPathLastString = "/ROOTHOST/ROOT";
		fPathCurrentString = null;
			
		Map<String, Element> elementContainerTemp = new HashMap<>();
		elementContainer = elementContainerTemp;
		elementContainer.put("/ROOTHOST/ROOT", new ElementObject("ROOT","ROOT ELEMENT OBJECT.","/ROOTHOST",true,false,".ROOT"));
		
	}
	
	//Get the last selected fPath
	public String GetFPathLastString()
	{
		return fPathLastString;
		
	}
	
	//Set the last selected fPath
	public static void  SetFPathLastString(String fPathLastStringArgs)
	{
	
		fPathLastString = fPathLastStringArgs;
		
	}
	
	//Get the currently selected fPath
	public String GetFPathCurrentString()
	{
		return fPathCurrentString;
		
	}
	
	//Set the currently selected fpath
	public static void SetFPathCurrentString(String fPathCurrentStringArgs)
	{
		
		SetFPathLastString(fPathCurrentString);
		fPathCurrentString = fPathCurrentStringArgs;
		
	}
	
	// Change rotate to new current fPath and new last fPath
	public static void ChangeParentElementFPath(String fPathStringArgs) {

		fPathCurrentString = fPathLastString;	
		fPathLastString = fPathStringArgs;

	}
	
	// Change Parent Element FPath
	public static void ChangeParentElementFPath() {

		fPathCurrentString = fPathLastString;
		System.out.print("Element Object FPath (ex: /ROOT/ELEMENTOBJECT.ELE): ");
		String fPathStringTemp = scanner.nextLine();
		fPathLastString = fPathStringTemp;

	}
	
	// Duplicate Element
	public static void DuplicateElement()
	{
		
		String fPathLastStringNew = fPathCurrentString;
		String fPathStringOld = fPathLastString;
		Element elementTemp = new ElementObject(fPathLastStringNew,elementContainer.get(fPathStringOld));
		AddElement(elementTemp);
			
		for (int i = 0; i < elementContainer.get(fPathStringOld).GetFPathChildStringContainer().length; i++) {
	        
			
			DuplicateElement(elementTemp.GetFPathChildStringContainer()[i],elementTemp.GetFPathString());
	    
		}
	
	}
		
	// Duplicate Element
	public static void DuplicateElement(String fPathStringOldArgs, String fPathLastStringNewArgs)
	{
	
		String fPathLastStringNew = fPathLastStringNewArgs;
		String fPathStringOld = fPathStringOldArgs;
		Element elementTemp = new ElementObject(fPathLastStringNew,elementContainer.get(fPathStringOld));
		AddElement(elementTemp);
			
		for (int i = 0; i < elementContainer.get(fPathStringOld).GetFPathChildStringContainer().length; i++) {
	        
			
			DuplicateElement(elementTemp.GetFPathChildStringContainer()[i],elementTemp.GetFPathString());
	    
		}
	
	}
	
	// Make template
	public static void MakeElementTemplate()
	{
		if(elementContainer.get("/ROOTHOST/ROOT/TEMPLATES") == null)
		{
			elementContainer.put("/ROOTHOST/ROOT/TEMPLATES", ElementObject("TEMPLATES","Template element object.","/ROOTHOST/ROOT",true,false,".TMP"));
		}
		
	}
	
	// Get element
	public static Element GetElement(String nameStringArgs) {

		return elementContainer.get(nameStringArgs);

	}

	// Set element
	public static void SetElement(String nameStringArgs, Element elementArgs) {

		elementContainer.put(nameStringArgs, elementArgs);

	}
	
	// Add Element
	public static void AddElement()
	{
			
		System.out.println("Add Element Object");
			
		System.out.print("Element Object Name (ex: ELEMENT OBJECT): ");
		String nameStringTemp = scanner.nextLine();
			
		System.out.print("Element Object Description (ex: This is a element object.): ");
		String descriptionStringTemp = scanner.nextLine();
			
		System.out.print("Element Object Active (ex: true/false): ");
		boolean activeBooleanTemp = scanner.nextBoolean();
		scanner.nextLine();
		
		System.out.print("Element Object Template (ex: true/false): ");
		boolean templateBooleanTemp = scanner.nextBoolean();
		scanner.nextLine();
		
		System.out.print("Element Object Extension (ex: .ELE): ");
		String extensionStringTemp = scanner.nextLine();

		String fPathLastStringTemp = fPathLastString;
		Element elementTemp = new ElementObject(nameStringTemp,descriptionStringTemp,fPathLastStringTemp,activeBooleanTemp,templateBooleanTemp,extensionStringTemp);
		AddElement(elementTemp);	
		
		fPathCurrentString = fPathLastString;
		fPathLastString = elementTemp.GetFPathString();
		elementContainer.get(elementTemp.GetFPathString()).Print();
		
	}

	// Add Element to container
	public static void AddElement(Element elementArgs) {

		elementContainer.put(elementArgs.GetFPathString(), elementArgs);
		elementContainer.get(elementArgs.GetFPathParentString()).AddToFPathChildStringContainer(elementArgs.GetFPathString());
	
	}

	// Remove Element from container
	public static void RemoveElement(Element elementArgs) {

		elementContainer.get(elementArgs.GetFPathParentString()).RemoveFromFPathChildStringContainer(elementArgs.GetFPathString());
		elementContainer.remove(elementArgs.GetFPathString());
		
	}

	
	// Remove Element from container
	public static void RemoveElement() 
	{
	
		System.out.print("Element Object fPath (ex: /ROOT/ELEMENTNAME.EXTENSION): ");
		String fPathStringTemp = scanner.nextLine();
			
		elementContainer.remove(fPathStringTemp);

	}
	
	public static void PrintFPathLastString()
	{
		
		System.out.println(fPathLastString);
		
	}
	
	public static void PrintFPathCurrentString()
	{
		
		System.out.println(fPathCurrentString);
		
	}
	
	public static void PrintAll()
	{
		for (Map.Entry<String, Element> entry : elementContainer.entrySet()) {
            String name = entry.getKey();
            Element elementTemp = entry.getValue();
            System.out.println(elementTemp.GetFPathString());
        }
		
	}
	
	public static void CreateCharacterElementObject()
	{

		System.out.println("Add Character Element Object");		
		System.out.print("Element Object Name (ex: ELEMENT OBJECT): ");
		String nameStringTemp = scanner.nextLine();
		System.out.print("Element Object Description (ex: This is a element object.): ");
		String descriptionStringTemp = scanner.nextLine();
		boolean activeBooleanTemp = true;
		boolean templateBooleanTemp = false;
		String extensionStringTemp = ".CHC";
		String fPathLastStringTemp = fPathLastString;
		Element elementTemp = new ElementObject(nameStringTemp,descriptionStringTemp,fPathLastStringTemp,activeBooleanTemp,templateBooleanTemp,extensionStringTemp);
		AddElement(elementTemp);	
		SetFPathCurrentString(elementTemp.GetFPathString());
		elementContainer.get(elementTemp.GetFPathString()).Print();

	}
	
	public static void CreateTriggerElementObject()
	{

		System.out.println("Add Trigger Element Object");		
		System.out.print("Element Object Name (ex: ELEMENT OBJECT): ");
		String nameStringTemp = scanner.nextLine();
		System.out.print("Element Object Description (ex: This is a element object.): ");
		String descriptionStringTemp = scanner.nextLine();
		boolean activeBooleanTemp = true;
		boolean templateBooleanTemp = false;
		String extensionStringTemp = ".TRI";
		String fPathLastStringTemp = fPathLastString;
		Element elementTemp = new ElementObject(nameStringTemp,descriptionStringTemp,fPathLastStringTemp,activeBooleanTemp,templateBooleanTemp,extensionStringTemp);
		AddElement(elementTemp);	
		SetFPathCurrentString(elementTemp.GetFPathString());
		elementContainer.get(elementTemp.GetFPathString()).Print();

	}
	
	public static void CreateAttributeElementObject()
	{

		System.out.println("Add Attribute Element Object");		
		System.out.print("Element Object Name (ex: ELEMENT OBJECT): ");
		String nameStringTemp = scanner.nextLine();
		System.out.print("Element Object Description (ex: This is a element object.): ");
		String descriptionStringTemp = scanner.nextLine();
		boolean activeBooleanTemp = true;
		boolean templateBooleanTemp = false;
		String extensionStringTemp = ".ATT";
		String fPathLastStringTemp = fPathLastString;
		Element elementTemp = new ElementObject(nameStringTemp,descriptionStringTemp,fPathLastStringTemp,activeBooleanTemp,templateBooleanTemp,extensionStringTemp);
		AddElement(elementTemp);	
		SetFPathCurrentString(elementTemp.GetFPathString());
		elementContainer.get(elementTemp.GetFPathString()).Print();

	}
	
	public static void CreateItemElementObject()
	{

		System.out.println("Add Item Element Object");		
		System.out.print("Element Object Name (ex: ELEMENT OBJECT): ");
		String nameStringTemp = scanner.nextLine();
		System.out.print("Element Object Description (ex: This is a element object.): ");
		String descriptionStringTemp = scanner.nextLine();
		boolean activeBooleanTemp = true;
		boolean templateBooleanTemp = false;
		String extensionStringTemp = ".ITM";
		String fPathLastStringTemp = fPathLastString;
		Element elementTemp = new ElementObject(nameStringTemp,descriptionStringTemp,fPathLastStringTemp,activeBooleanTemp,templateBooleanTemp,extensionStringTemp);
		AddElement(elementTemp);	
		SetFPathCurrentString(elementTemp.GetFPathString());
		elementContainer.get(elementTemp.GetFPathString()).Print();

	}

	public static void CreateObjectiveElementObject()
	{

		System.out.println("Add Objective Element Object");		
		System.out.print("Element Object Name (ex: ELEMENT OBJECT): ");
		String nameStringTemp = scanner.nextLine();
		System.out.print("Element Object Description (ex: This is a element object.): ");
		String descriptionStringTemp = scanner.nextLine();
		boolean activeBooleanTemp = true;
		boolean templateBooleanTemp = false;
		String extensionStringTemp = ".OBJ";
		String fPathLastStringTemp = fPathLastString;
		Element elementTemp = new ElementObject(nameStringTemp,descriptionStringTemp,fPathLastStringTemp,activeBooleanTemp,templateBooleanTemp,extensionStringTemp);
		AddElement(elementTemp);	
		SetFPathCurrentString(elementTemp.GetFPathString());
		elementContainer.get(elementTemp.GetFPathString()).Print();

	}

	public static void CreateStoryElementObject()
	{

		System.out.println("Add Story Element Object");		
		System.out.print("Element Object Name (ex: ELEMENT OBJECT): ");
		String nameStringTemp = scanner.nextLine();
		System.out.print("Element Object Description (ex: This is a element object.): ");
		String descriptionStringTemp = scanner.nextLine();
		boolean activeBooleanTemp = true;
		boolean templateBooleanTemp = false;
		String extensionStringTemp = ".STY";
		String fPathLastStringTemp = fPathLastString;
		Element elementTemp = new ElementObject(nameStringTemp,descriptionStringTemp,fPathLastStringTemp,activeBooleanTemp,templateBooleanTemp,extensionStringTemp);
		AddElement(elementTemp);	
		SetFPathCurrentString(elementTemp.GetFPathString());
		elementContainer.get(elementTemp.GetFPathString()).Print();

	}
	
	public static void CreateGameElementObject()
	{

		System.out.println("Add Game Element Object");		
		System.out.print("Element Object Name (ex: ELEMENT OBJECT): ");
		String nameStringTemp = scanner.nextLine();
		System.out.print("Element Object Description (ex: This is a element object.): ");
		String descriptionStringTemp = scanner.nextLine();
		boolean activeBooleanTemp = true;
		boolean templateBooleanTemp = false;
		String extensionStringTemp = ".GME";
		String fPathLastStringTemp = fPathLastString;
		Element elementTemp = new ElementObject(nameStringTemp,descriptionStringTemp,fPathLastStringTemp,activeBooleanTemp,templateBooleanTemp,extensionStringTemp);
		AddElement(elementTemp);	
		SetFPathCurrentString(elementTemp.GetFPathString());
		elementContainer.get(elementTemp.GetFPathString()).Print();

	}	
	
	public static void CreateImageElementObject()
	{

		System.out.println("Add Image Element Object");		
		System.out.print("Element Object Name (ex: ELEMENT OBJECT): ");
		String nameStringTemp = scanner.nextLine();
		System.out.print("Element Object Description (ex: This is a element object.): ");
		String descriptionStringTemp = scanner.nextLine();
		boolean activeBooleanTemp = true;
		boolean templateBooleanTemp = false;
		String extensionStringTemp = ".IMG";
		String fPathLastStringTemp = fPathLastString;
		Element elementTemp = new ElementObject(nameStringTemp,descriptionStringTemp,fPathLastStringTemp,activeBooleanTemp,templateBooleanTemp,extensionStringTemp);
		AddElement(elementTemp);	
		SetFPathCurrentString(elementTemp.GetFPathString());
		elementContainer.get(elementTemp.GetFPathString()).Print();

	}

	public static void CreateActionElementObject()
	{

		System.out.println("Add Action Element Object");		
		System.out.print("Element Object Name (ex: ELEMENT OBJECT): ");
		String nameStringTemp = scanner.nextLine();
		System.out.print("Element Object Description (ex: This is a element object.): ");
		String descriptionStringTemp = scanner.nextLine();
		boolean activeBooleanTemp = true;
		boolean templateBooleanTemp = false;
		String extensionStringTemp = ".ACT";
		String fPathLastStringTemp = fPathLastString;
		Element elementTemp = new ElementObject(nameStringTemp,descriptionStringTemp,fPathLastStringTemp,activeBooleanTemp,templateBooleanTemp,extensionStringTemp);
		AddElement(elementTemp);	
		SetFPathCurrentString(elementTemp.GetFPathString());
		elementContainer.get(elementTemp.GetFPathString()).Print();

	}

}
