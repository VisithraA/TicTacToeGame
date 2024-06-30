package com.visithraa23.tictactoe;

import com.visithraa23.tictactoe.view.TicTacToeView;

public class MainClass {
	private TicTacToeView view;

	public MainClass() {
		view = new TicTacToeView();
	}

	public static void main(String[] args) {
		MainClass mainClass = new MainClass();
		mainClass.view.init();
	}
}
