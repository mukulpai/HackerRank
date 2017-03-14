package com.hackerRank.WomensCS3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ChoosingRecipesBufferReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int tc;
		try {
			tc = Integer.parseInt(String.valueOf(in.readLine()));

			String[] nextLine;
			for (int a = 0; a < tc; a++) {

				nextLine = in.readLine().split(" ");

				int recipes = Integer.valueOf(nextLine[0]);
				int prices = Integer.valueOf(nextLine[1]);
				int dishes = Integer.valueOf(nextLine[2]);
				// int pantryContent = Integer.valueOf(nextLine[3]);

				int[] pantry = new int[prices];
				// List<Integer> pantry = new ArrayList<>();
				nextLine = in.readLine().split("\\s");
				int nextItem = 0;
				for (int i = 0, p = 0; i < prices; i++) {
					if (p < nextLine.length)
						nextItem = Integer.parseInt(nextLine[p++]);
					if (i == nextItem) {
						pantry[i] = nextItem;
					} else {
						pantry[i] = 0;
					}
					nextItem = 0;
				}

				int[] priceList = new int[prices];
				int nextPrice = 0;
				nextLine = in.readLine().split("\\s");
				for (int i = 0; i < nextLine.length; i++) {
					nextPrice = Integer.parseInt(nextLine[i]);
					// if (pantry.contains(i)) {
					// nextPrice = 0;
					// }
					priceList[i] = nextPrice;
				}

				if (recipes > 10) {
					recipes = 10;
				}

				int isRecipe = 0;
				int sum = 0;
				int resultSum = 0;

				int sumRecipeIngredients = 0;

				List<Integer> result = new ArrayList<>();
				Map<Integer, String[]> matrix = new TreeMap<>();
				for (int r = 0; r < recipes; r++) {
					nextLine = in.readLine().split(" ");
					for (int b = 0; b < prices; b++) {
						// recipeIng[b] = in.nextInt();
						isRecipe = Integer.parseInt(nextLine[b]);
						// if (!pantry.contains(b))
						sumRecipeIngredients = sumRecipeIngredients + isRecipe;

						// if (isRecipe == 1) {
						// sum = sum + priceList[b];
						// priceList[b] = 0;
						//
						// }
					}

					matrix.put(sumRecipeIngredients, nextLine);

					sumRecipeIngredients = 0;
				}

				Collections.sort(result);

				for (int z = 0; z < dishes; z++) {
					resultSum = resultSum + result.get(z);
				}
				System.out.println(resultSum);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
