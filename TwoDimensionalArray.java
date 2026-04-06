package vbvhj;
import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int array[][] = {{120,250,789,7},{58,79,31,87},{8,1,2,3},{99,98,97,96}};
		
//		for (int i=0; i<array.length; i++) {
//			for ( int a=0;a<array[i].length;a++) {
//				System.out.println("enter number: ");
//				array[i][a] = s.nextInt();
//			}
//		}
		for (int i=0; i<array.length; i++) {
			for ( int a=0;a<array[i].length;a++) {
				System.out.print(array[i][a] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i=0; i<array.length; i++) {
			for ( int a=0;a<array[i].length;a++) {
				
			if (array[i][a]==1) {
				System.out.println("Row is in row " + i + " and column " + a);
			}
		}
		}
		System.out.println();
		array[2][1] = 50;
		for (int i=0; i<array.length; i++) {
			for ( int a=0;a<array[i].length;a++) {
				System.out.print(array[i][a] + " ");
			}
			System.out.println();
		}
		for (int i=0; i<array.length; i++) {
			for ( int a=0;a<array[i].length;a++) {
				if (i == 1) array[i][a] = 0;
			}
		}
		System.out.println();
		for (int i=0; i<array.length; i++) {
			for ( int a=0;a<array[i].length;a++) {
				System.out.print(array[i][a] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
