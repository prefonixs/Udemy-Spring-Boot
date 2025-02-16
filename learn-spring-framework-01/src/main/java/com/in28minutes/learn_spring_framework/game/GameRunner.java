package com.in28minutes.learn_spring_framework.game;

public class GameRunner {
	private GammingConsole game;
	
	public GameRunner(GammingConsole game) {
		this.game=game;
	}

	public void run() {
		System.out.println("Running game: "+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
