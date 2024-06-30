package com.visithraa23.tictactoe.viewmodel;

import com.visithraa23.tictactoe.view.TicTacToeView;

public class TicTacToeViewModel {
	private TicTacToeView view;

	public TicTacToeViewModel(TicTacToeView ticTacToeView) {
		view = ticTacToeView;
	}

	public boolean isValid(char[][] board) {
		for (char[] grid : board) {
			if (grid[0] != '.' && grid[0] == grid[1] && grid[1] == grid[2])
				return true;
		}

		for (int i = 0; i < 3; i++) {
			if (board[0][i] != '.' && board[0][i] == board[1][i] && board[1][i] == board[2][i])
				return true;
		}

		if (board[1][1] != '.' && ((board[1][1] == board[0][0] && board[1][1] == board[2][2])
				|| (board[1][1] == board[0][2] && board[1][1] == board[2][0])))
			return true;
		return false;
	}

	public boolean place(char[][] board, int posX, int posY, char xo) {
		if (posX >= 3 || posY >= 3) {
			view.print("Wrong Position");
			return false;
		}

		if (board[posX][posY] != '.') {
			view.print("Position Already Occupied");
			return false;
		}
		board[posX][posY] = xo;
		return true;
	}

}
