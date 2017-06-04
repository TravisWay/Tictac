package demo;

import java.util.Arrays;
import java.util.Scanner;

import javax.jws.Oneway;

public class TicTac {

	static Scanner input = new Scanner(System.in);
	static String[][] tictac = new String[3][3];
	static int row, col;
	static String taken = "44";

	public static void main(String[] args) {

		for (int j = 0; j < tictac.length; j++) {
			for (int i = 0; i < tictac.length; i++) {

				tictac[j][i] = " ";
			}
		}

		tictac[2][2] = "x";
		System.out.println(
				"TictacToe Game v1.sideways8 \n\nTo enter a position on the board please enter two numbers. \nThe first number is row you would like to be in. \nThe second number will be the column \n\nSo for the bottom right corner, you would enter 3 then the enter key then 3 again and the enter key(3=third row, 3 column) \nAnd it would look like this \n"
						+ Arrays.toString(tictac[0]) + "\n" + Arrays.deepToString(tictac[1]) + "\n"
						+ Arrays.deepToString(tictac[2]));
		tictac[2][2] = " ";

		for (int i = 0; i < 5; i++) {
			turn("One, X's");
			turn("Two, O's");
		}
	}

	public static void turn(String Player) {

		do {
			System.out.println("\nPlayer " + Player + ": Enter the row number:");
			row = input.nextInt() - 1;
			System.out.println("\nPlayer " + Player + ": Enter the column number:");
			col = input.nextInt() - 1;
		}

		while (("" + row + col).equals(taken));

		taken = "" + row + col;
		tictac[row][col] = "X";
		System.out.println("\n" + Arrays.toString(tictac[0]) + "\n" + Arrays.deepToString(tictac[1]) + "\n"
				+ Arrays.deepToString(tictac[2]));
		}
	}
