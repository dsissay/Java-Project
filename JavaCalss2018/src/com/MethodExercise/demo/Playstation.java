package com.MethodExercise.demo;

public class Playstation implements PlayGame,LoadGame, SaveGame{
	//this is an interface implimetation example
	public void playGame() {
		System.out.print("Playing Game.... \n");
	}
	
	public void loadGame() {
		System.out.print("Loading.... \n");
	}
	
	public void saveGame() {
		System.out.print("Saving.... \n");
	}
	
	public static void main (String [] args) {
		Playstation pl =new Playstation();
		pl.playGame();
		pl.loadGame();
		pl.saveGame();
		
	}

	
}
