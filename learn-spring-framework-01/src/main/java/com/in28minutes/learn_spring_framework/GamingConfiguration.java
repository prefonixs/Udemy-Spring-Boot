package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GammingConsole;
import com.in28minutes.learn_spring_framework.game.PacManGame;

@Configuration
public class GamingConfiguration {

	@Bean
	public GammingConsole game() {
		var game = new PacManGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GammingConsole game) {
		var gameRunner=new GameRunner(game);
		return gameRunner;
	}
//	var game=new MarioGame();
//	var game=new SuperContraGame();
//	var game=new PacManGame();

//	var gameRunner=new GameRunner(game);
//	gameRunner.run();
}
