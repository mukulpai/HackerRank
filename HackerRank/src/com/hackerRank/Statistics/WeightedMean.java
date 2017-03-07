package com.hackerRank.Statistics;
import java.util.Scanner;	

public class WeightedMean {

	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] arr1 = new int[num];
		int[] arr2 = new int[num];
		for(int i =0; i < num ; i++){
			arr1[i] = in.nextInt();
		}

		float sum =0;
		float prod = 0; 

		for(int i =0; i < num ; i++){
			int nextNum = in.nextInt();
			sum = sum +  nextNum;
			prod = prod + (arr1[i] * nextNum);
		}

float op = prod/sum;
		System.out.println(String.format("%.1f", op));	

	}
}		