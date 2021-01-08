package com.qa.main;

import java.util.Random;

public class Arrays {
	//tutorials
	//single dimensional array
	int[] ageArray; 
	int[] ageArray2= {25,43,23,46,30};	
	
	//multi dimensional array
	int[][] multiAgeArray= {{25,30,21},{56,67,39},{8}};
	//3 arrays with 2 values each, initialised with empty values
	int[][] arrayThreeTwo=new int[3][2];
	//assigning values
	static int[] ageArraySD=new int[5];
	static int[][] ageArrayMD=new int[3][2];
	
	public static void main(String[] args) {
	//assign 33 to index 2 in single array
	ageArraySD[2]=33;
	//assign 59 to array index 2 value index 1
	ageArrayMD[2][1]=59;
	
	//Looping thru array(will only do multi dim coz single dim is straightorward)
	int twoDArray[][]= {{0,1,2},{1,2,3},{2,3,4}};
	for (int i=0;i<twoDArray.length;i++) {
		for (int j=0; j<twoDArray[i].length;j++) {
			System.out.println(twoDArray[i][j]);
		}
		System.out.println();
	}
	
	for (int[] a:twoDArray) {
		for (int b:a) {
			System.out.println(b);
		}
		System.out.println();
	}
	
	//both for loop and for each
	int[] nums= {1,2,3,4,5};
	for (int i:nums) {
		for (int j=0;j<nums.length;j++) {
			if (nums[j]==i) {
				System.out.println("@ i:"+i +" and j:" +j + ", i and j match");
			}
		}
	}
	
	//EXERCISES
	//1
	int[] integers=new int[10];
	Random rand=new Random();
	
	//generate random array of integers and prints it out
		for (int i=0; i<integers.length;i++) {
			integers[i]=rand.nextInt(100);
			System.out.println(integers[i]);
		}
//	//2 replaces each integer in array with integer*10
		for (int integer:integers) {
			integer*=10;
			System.out.println(integer);
			
		}
		
	}
}
