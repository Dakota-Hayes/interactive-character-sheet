package com.github.dakota_hayes.interactive_character_sheet;

public class RootHost extends Element{
	
	static Element root;
	
	public static Element GetRoot()
	{
		return root;
		
	}
	
	public static void NewRoot()
	{
		
		root = new CustomObject("root","root","",true,".ROT");
		
	}
	
}
