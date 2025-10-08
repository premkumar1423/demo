package prac;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int m , n;
		System.out.print("Enter No. Of Rows : ");
		m = s.nextInt();
		System.out.print("Enter No. Of Columns : ");
		n = s.nextInt();
		
		int[][] arr = new int[m][n];
		
		for(int i=0 ; i<m ; i++) {
			for(int j = 0 ; j<n ; j++) {
				System.out.print("Enter value of "+i+" , "+j+" : ");
				arr[i][j] = s.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0 ; i<m ; i++) {
			for(int j = 0 ; j<n ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
