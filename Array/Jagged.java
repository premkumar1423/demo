package prac;

public class Jagged {
	public static void main(String args[]) {
		int[][] ar = {{1,2,3},{4,5},{6},{7,8,9,0}};
		
		for(int i=0 ; i< ar.length ; i++) {
			for(int j = 0 ; j< ar[i].length ; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

}
