class Solution {
    public void rotate(int[][] matrix) {
        int c=matrix[0].length-1;
        int r=matrix.length-1;

        for(int i=0;i<=r;i++){
            for(int j=i+1;j<=c;j++){
                // swap(matrix[i],i,j);
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        
        for(int i=0;i<=r;i++){
        reverse(matrix[i],0,c);
        }
    }

    public void swap(int[] matrix, int l, int r){
        int t=matrix[l];
        matrix[l]=matrix[r];
        matrix[r]=t;
    }

    public void reverse(int[] matrix, int l, int r){
        while(l<r){
        swap(matrix,l++,r--);    
        }
    }
}
