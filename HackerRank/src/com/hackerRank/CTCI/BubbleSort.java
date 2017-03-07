package com.hackerRank.CTCI;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String args[]){

		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		int[] arr = new int[size];

		//read array
		for(int i =0; i < size ; i++){
			arr[i] = in.nextInt();
		}

		int[] op= sortArray(arr);

		// for(int k =0; k < op.length; k++){
		// 	System.out.print(op[k] + " ");
		// }

		System.out.println(op[1]);
		System.out.println(op[op.length-1]);
	}

	private static int[] sortArray(int[] arr){
boolean isSorted = false;
int swapCount =0; 
		while(!isSorted){
			isSorted = true;
		for(int i = 0 ; i < arr.length -1; i++){
			if(arr[i] > arr[i+1]){
				swap(arr, i , i+1);
				swapCount++;
				isSorted = false;
			}
		}
		}
	
		System.out.println("Array is sorted in"+ swapCount + " swaps.");
		return arr;
	}

	private static void swap(int[] arr, int i , int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	} 
}