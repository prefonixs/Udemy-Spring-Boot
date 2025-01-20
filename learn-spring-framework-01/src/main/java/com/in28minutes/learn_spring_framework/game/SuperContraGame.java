package com.in28minutes.learn_spring_framework.game;

public class SuperContraGame implements GammingConsole{
	public void up() {
		System.out.println("Up");
	}
	public void down() {
		System.out.println("Down");
	}
	public void left() {
		System.out.println("Go back");
	}
	public void right() {
		System.out.println("Shoot a bullet");
	}
}
