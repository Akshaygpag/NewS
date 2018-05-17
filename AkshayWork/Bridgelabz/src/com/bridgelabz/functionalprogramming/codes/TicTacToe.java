package com.bridgelabz.functionalprogramming.codes;

import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.functionalprogramming.util.ArrayHelper;

class Position {
	int row;
	int col;

	public Position() {

		Random random = new Random();
		this.row = random.nextInt(2);
		this.col = random.nextInt(2);
		
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

}

public class TicTacToe {
	final String NAME;
	char[][] ticGame = { { '_', '_', '_' }, { '_', '_', '_' }, { '_', '_', '_' } };
	static boolean endGame;
	static boolean playerWins;

	public TicTacToe(String name) {
		// TODO Auto-generated constructor stub
		NAME = name;
	}

	private void playerPlays(TicTacToe game) {
		// TODO Auto-generated method stub
		Position position = new Position();
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose position x");
		int x = Integer.parseInt(scan.nextLine());

		System.out.println("Choose position y");
		int y = Integer.parseInt(scan.nextLine());
		boolean endGame = game.ifValidMove(x, y, game, 'X');

		if (!endGame) {
			// computerPlays(game);
		} else {
			System.out.println("game ends.....");
		}
		ArrayHelper.printTicTacToe(game.ticGame);
		System.out.println("Computer your turn ...");
	}

	private void computerPlays(TicTacToe game) {
		try {

			// TODO Auto-generated method stub
			Position position = new Position();
			boolean endGame = game.ifValidMove(position.getRow(), position.getCol(), game, 'O');

			if (!endGame) {
				// computerPlays(game);
			} else {
				System.out.println("game ends.....");

			}
			ArrayHelper.printTicTacToe(game.ticGame);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean ifValidMove(int row, int col, TicTacToe game, char symbol) {
		// TODO Auto-generated method stub

		endGame = checkIfEmpty(game);

		if (endGame) {
			if (ticGame[row][col] != 'X' && ticGame[row][col] != 'O') {

				ticGame[row][col] = symbol;
				return true;

			} else {

				// endGame = checkIfEmpty(game);
				Position pos = new Position();

				ifValidMove(pos.getRow(), pos.getCol(), game, symbol);

			}

		}

		return endGame;

	}

	private boolean checkIfEmpty(TicTacToe game) {
		// TODO Auto-generated method stub

		for (int i = 0; i < game.ticGame.length; i++) {
			for (int j = 0; j < game.ticGame[i].length; j++) {

				if (game.ticGame[i][j] == '_') {
					return true;
				}

			}

		}

		return false;

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("Welcome player name ?");
		Scanner scan = new Scanner(System.in);
		TicTacToe game = new TicTacToe(scan.nextLine());
		System.out.println("Computer is player 1 .");
		System.out.println("You are player 2 .");
		endGame = true;
		while (endGame) {
			boolean value;
			game.computerPlays(game);
			value = isThereAWinner('O', game);
			if (value) {
				break;
			}
			System.out.println("Player your turn ...");
			game.playerPlays(game);
			playerWins = isThereAWinner('X', game);
			value = playerWins;
			if (value) {
				break;
			}
		}

		if (playerWins) {

			System.out.println("Bravo ");

		} else {
			System.out.println("game over");
		}

	}

	private static boolean isThereAWinner(char symbol, TicTacToe game) {
		// TODO Auto-generated method stub
return false;
//		return checkHorizontally(symbol, game) || checkVertically(symbol, game) || checkDiagonally(symbol, game);

	}

	private static boolean checkDiagonally(char symbol, TicTacToe game) {
		// TODO Auto-generated method stub
		if (game.ticGame[1][1] != symbol) {
			return false;
		}

		return game.leftDaigonal(symbol, game) || game.rightDiagonal(symbol, game);

	}

	private boolean rightDiagonal(char symbol, TicTacToe game) {

		for (int i = 0; i < game.ticGame.length; i++) {

			for (int j = 0; j < game.ticGame[i].length; j++) {
				if (j + i == 2) {
					if (!(game.ticGame[i][j] == symbol)) {
						return false;
					}

				}

			}

		}
		return true;
	}

	private boolean leftDaigonal(char symbol, TicTacToe game) {
		for (int i = 0; i < game.ticGame.length; i++) {

			for (int j = 0; j < game.ticGame[i].length; j++) {
				if (j == i) {
					if (!(game.ticGame[i][j] == symbol)) {
						return false;
					}

				}

			}

		}

		return true;
	}

	private static boolean checkVertically(char symbol, TicTacToe game) {
		boolean verticalFlag = false;

		for (int i = 0; i < game.ticGame.length; i++) {

			for (int j = 0; j < game.ticGame[i].length; j++) {
				if (j == i) {
					if (!(game.ticGame[j][i] == symbol)) {
						verticalFlag = false;
						break;
					} else {
						verticalFlag = true;

					}
				}

			}
		}
		return verticalFlag;

	}

	private static boolean checkHorizontally(char symbol, TicTacToe game) {
		boolean horizontalFlag = false;
		for (int i = 0; i < game.ticGame.length; i++) {

			for (int j = 0; j < game.ticGame[i].length; j++) {
				if (!(game.ticGame[i][j] == symbol)) {
					horizontalFlag = false;
					break;
				} else {
					horizontalFlag = true;

				}
			}
		}

		return horizontalFlag;
	}

}
