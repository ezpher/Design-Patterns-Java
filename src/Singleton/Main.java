package Singleton;

public class Main {

	public static void main(String[] args) {
		Singleton firstInstance = Singleton.GetInstance();
		
		System.out.println("firstInstance Identity: " + System.identityHashCode(firstInstance));
		System.out.println("firstInstance LetterList: " + firstInstance.GetLetterList());
		System.out.println("firstInstance TileSet: " + firstInstance.GetTileSet(7));
		
		Singleton secondInstance = Singleton.GetInstance();
		
		System.out.println("secondInstance Identity: " + System.identityHashCode(secondInstance));
		System.out.println("secondInstance LetterList: " + secondInstance.GetLetterList());
		System.out.println("secondInstance TileSet: " + secondInstance.GetTileSet(7));

	}

}
