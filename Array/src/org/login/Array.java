package org.login;

public class Array {
	public static void main(String[] args) {
		//Datatype [] variable = new datatyple[size]
		//one dimensional array
		int [] a = new int [6];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		a[5]=60;
		System.out.println(a[0]);
		System.out.println("-------------");
		
		//for loop i=0 i=1 i=2 i=3 i=4 i=5
		for (int i=0;i<=4;i++) {
			System.out.println(a[i]);
		}
		System.out.println("-------------");
		//Enhanced for loop/for each
		for(int e:a) {
			System.out.println(e);
		}
		System.out.println("-------------");
		//2d array
		//data type variable name [] [] = new datatype[size of row][size of coloumn]
		
		int a1[][]=new int [2][2];
		a1[0][0]=10;
		a1[0][1]=20;
		a1[1][0]=20;
		a1[1][1]=30;
		
		//nested enhanced  loop
		for (int[] d:a1) {
			for(int c:d) {
				System.out.println(c);
			}
		}
		System.out.println("-----------");
		//nested for loop
		for (int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				System.out.println(a1[i][j]);
			}
		}
		
	}

}
