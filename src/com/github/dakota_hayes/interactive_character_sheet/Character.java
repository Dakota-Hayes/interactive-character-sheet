package com.github.dakota_hayes.interactive_character_sheet;
import java.io.*;

public class Character {
	
	private boolean nonPlayableCharacterBoolean = false;
	
	private String playerNameString = "";
	private String characterNameString = "";
	
	/*
	private String characterNickname = "";
	private String chracterGender = "";
	
	private int chracterAge = 0;
	private int characterXp = 0;
	private int characterBaseLifeTotal = 0;
	private int characterCurrentLifeTotal = 0;
	private int characterBaseArmor = 0;
	private int characterCurrentArmor = 0;
	private int characterBaseWeight = 0;
	private int characterCurrentWeight = 0;
	private int characterBaseHeight = 0;
	private int characterCurrentHeight = 0;
	*/
	
	public Character(boolean nonPlayableCharacterBooleanInput, String characterNameStringInput, String playerNameStringInput)
	{
		
		nonPlayableCharacterBoolean = nonPlayableCharacterBooleanInput;
		characterNameString = characterNameStringInput;
		playerNameString = playerNameStringInput;
		
	}
	
	public void setCharacterNameString(String characterNameStringInput)
	{
		
		characterNameString = characterNameStringInput;
		
	}
	
	public String getCharacterNameString()
	{
		
		return characterNameString;
		
	}
	
	public void setPlayerNameString(String playerNameStringInput)
	{
		
		playerNameString = playerNameStringInput;
		
	}
	
	public String getPlayerNameString()
	{
		
		return playerNameString;
		
	}
	
	public void setNonPlayableCharacterBoolean (boolean nonPlayableCharacterBooleanInput)
	{
		
		nonPlayableCharacterBoolean = nonPlayableCharacterBooleanInput;
		
	}
	
	public boolean getNonPlayableCharacterBoolean()
	{
		
		return nonPlayableCharacterBoolean;
		
	}
	
	public void printCharacter()
	{
		
		System.out.println("Player Name: " + getPlayerNameString());
		System.out.println("Character Name: " + getCharacterNameString());
		System.out.println("Non-Playable Character: " + getNonPlayableCharacterBoolean());
		
	}
	
	/*public static void main(String args[]) 
	{
		character[] characterContainer = new character[10];
		
		character characterOne = new character (false,"Robert","Roberta");
		characterOne.printCharacter();
		
		characterContainer[0] = characterOne;
		characterContainer[0].printCharacter();
		
		System.out.println(characterContainer.length);
	
	}
	*/
}
