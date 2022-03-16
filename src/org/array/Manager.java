package org.array;

public class Manager {
	public static void main(String[] args) {
		int sum=0;
		int a[][] = new int[2][3];
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		for(int x[]:a) {
			for(int y:x) {
				
				sum=sum+y;
				
			}
			
		}
		System.out.println(sum);
		
	}
}
