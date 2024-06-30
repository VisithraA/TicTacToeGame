package com.visithraa23.tictactoe.view;

import java.util.Arrays;
import java.util.Scanner;

import com.visithraa23.tictactoe.viewmodel.TicTacToeViewModel;

public class TicTacToeView {
	private TicTacToeViewModel viewModel;

	public TicTacToeView() {
		viewModel = new TicTacToeViewModel(this);
	}

	public void init() {
		Scanner sc = new Scanner(System.in);
		TicTacToeView view = new TicTacToeView();
		char[][] board = new char[3][3];
		for (char[] ch : board) {
			Arrays.fill(ch, '.');
		}

		int count = 0, i = 0;
		char[] xo = { 'X', 'O' };

		do {
			view.printBorad(board);
			System.out.println(">> " + xo[i] + "'s Turn : ");
			System.out.print("<< ");
			int posX = sc.nextInt();
			int posY = sc.nextInt();

			boolean placed = viewModel.place(board, posX, posY, xo[i]);

			if (viewModel.isValid(board)) {
				System.out.println(xo[i] + " wins");
				return;
			}

			if (placed) {
				if (i == 1) {
					i = 0;
				} else {
					i++;
				}
				count++;
			}
		} while (count < 9);

		if (count == 9 && !viewModel.isValid(board)) {
			view.print("Match Draw");
		}
	}

	public void print(String output) {
		System.out.println(output);
	}

	public void printBorad(char[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(board[i][j] + " ");
			System.out.println();
		}
	}

}
