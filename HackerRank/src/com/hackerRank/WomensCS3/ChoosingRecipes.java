package com.hackerRank.WomensCS3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ChoosingRecipes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int tc = in.nextInt();

		for (int a = 0; a < tc; a++) {

			int recipes = in.nextInt();
			int prices = in.nextInt();
			int dishes = in.nextInt();
			int pantryContent = in.nextInt();

			int[] pantry = new int[pantryContent];

			for (int p = 0; p < pantryContent; p++) {
				pantry[p] = in.nextInt();
			}

			int[] priceList = new int[prices];
			for (int pl = 0; pl < prices; pl++) {
				priceList[pl] = in.nextInt();
			}

			if (recipes > 10) {
				recipes = 10;
			}
			int isRecipe = 0;
			// int[] recipeIng = new int[prices];
			int sum = 0;
			int resultSum = 0;
			List<Integer> result = new ArrayList<>();
			for (int r = 0; r < recipes; r++) {
				for (int b = 0; b < prices; b++) {
					// recipeIng[b] = in.nextInt();
					isRecipe = in.nextInt();
					if (isRecipe == 1) {
						if (!checkIngredient(b, pantry, priceList[b])) {
							sum = sum + priceList[b];
						}

					}
				}

				result.add(sum);
				sum = 0;

			}

			Collections.sort(result);

			for (int z = 0; z < dishes; z++) {
				resultSum = resultSum + result.get(z);
			}
			System.out.println(resultSum);
		}
	}

	private static boolean checkIngredient(int b, int[] pantry, int priceList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < pantry.length; i++) {
			if (pantry[i] == b) {
				return true;
			}
		}
		return false;
	}

}
