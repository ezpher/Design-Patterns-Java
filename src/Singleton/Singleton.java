package Singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {
	
	private static Singleton _instance = null;
	
	Singleton() {}
	
	public static Singleton GetInstance() {
		if (_instance == null) {
			_instance = new Singleton();
		}
		
		Collections.shuffle( _instance.letterList);		
		
		return _instance;
		
	}
	
	String[] letterArrays = {"a", "b", "c", "d", "e", "f", "g", 
			  "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", 
			  "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	
	LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(letterArrays));
	
	public LinkedList<String> GetLetterList() {
		return _instance.letterList;
	}
	
	public LinkedList<String> GetTileSet(int numberOfTiles) {
		
		LinkedList<String> tileSet = new LinkedList<String>();
		
		for (int i = 0; i < numberOfTiles; i++) {
			tileSet.add(_instance.letterList.get(i)); 
		}
		
		return tileSet;
	}
	
}
