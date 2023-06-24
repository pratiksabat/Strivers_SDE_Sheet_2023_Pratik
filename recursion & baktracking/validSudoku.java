public class Solution {

	public static boolean isItSudoku(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j]==0){
					for (int k = 1; k <=9; k++) {
						if (isValid(i,j,k,matrix)) {
							matrix[i][j]=k;
							if(isItSudoku(matrix)){
								return true;
							}else matrix[i][j]=0;
						}
					}

					return false;
				}
			}
		}
		return true;
	}

	public static boolean isValid(int row,int col,int val,int matrix[][]){
		for (int i = 0; i < matrix.length; i++) {
			if(matrix[row][i]==val) return false;
			if(matrix[i][col]==val) return false;

			if(matrix[3*(row/3)+i/3][3*(col/3)+i%3]==val) return false;
		}

		return true;
	}
}
