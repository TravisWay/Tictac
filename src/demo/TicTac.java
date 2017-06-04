package demo;

import java.util.Arrays;
import java.util.Scanner;

public class TicTac {
	//declares and initializes variables and arrays needed throughout the program
	static Scanner input = new Scanner(System.in);
	static String[][] tictac = new String[3][3];
	static int row, col;
	static String[] taken = {"","","","","","","","","","",};

	public static void main(String[] args) {
		//Empties the tic tac toe board
		for (int j = 0; j < tictac.length; j++) {
			for (int i = 0; i < tictac.length; i++) {

				tictac[j][i] = " ";
			}
		}

		tictac[2][2] = "x";
		//Prints off instructions for the user
		System.out.println(
				"TictacToe Game v1.sideways8 \n\nTo enter a position on the board please enter two numbers. \nThe first number is row you would like to be in. \nThe second number will be the column \n\nSo for the bottom right corner, you would enter 3 then the enter key then 3 again and the enter key(3=third row, 3 column) \nAnd it would look like this \n"
						+ Arrays.toString(tictac[0]) + "\n" + Arrays.deepToString(tictac[1]) + "\n"
						+ Arrays.deepToString(tictac[2]) +"\n");
		tictac[2][2] = " ";
		//For 5 rounds the program gives each player one turn
		for (int i = 0; i < 5; i++) {
			turn("X");
			turn("O");
		}
	}

	public static void turn(String Player) {
		//Prompts user to enter row and column numbers for the wanted position and saves values
		System.out.println( Player + "'s: Enter the row number:");
		row = input.nextInt() - 1;
		System.out.println(Player + "'s: Enter the column number:");
		col = input.nextInt() - 1;
		//Error checking to see if space is already occupied by user and if so, prompts user to try again
		for (int i = 0; i < taken.length; i++) {
			while (taken[i].equals("" + row + col)) {
				System.out.println("\nPlease try another space, as that space is occupied");
				System.out.println("\nPlayer " + Player + ": Enter the row number:");
				row = input.nextInt() - 1;
				System.out.println("\nPlayer " + Player + ": Enter the column number:");
				col = input.nextInt() - 1;
			}
		}	
		//Saves current board positions so spaces can not be overwritten
		for (int j = 0; j < taken.length; j++) {
				if (taken[j].equals("")) {
				taken[j] = ("" + row + col);
				break;
			}
		}
		//Puts character of X or O on the board and prints the result
		tictac[row][col] = Player;
		System.out.println("\n" + Arrays.toString(tictac[0]) + "\n" + Arrays.deepToString(tictac[1]) + "\n"+ Arrays.deepToString(tictac[2]) + "\n");
	}
}
