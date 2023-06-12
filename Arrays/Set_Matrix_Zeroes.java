class Solution {
    public void setZeroes(int[][] matrix) {
     int row=matrix.length;
     int col=matrix[0].length;
    
     int col1=1;
     for(int i=0;i<row;i++){
         for(int j=0;j<col;j++){
             if(matrix[i][j]==0){
                 // set its corresponding col to 0;
                 matrix[i][0]=0;

                 // set its corresponding row to 0; 
                 // Be carefull, if we are in first col, then mark the var col1=0;
                 // else mark matrix with 0
                 if(j==0) col1=0;
                 else matrix[0][j]=0;
             }
         }
     }

     // For inner array, if any of the first row or first col is 0, then mark corresponding matrix[i][j]=0 
     for(int i=1;i<row;i++){
         for(int j=1;j<col;j++){
             if(matrix[i][0]==0 || matrix[0][j]==0){
                 matrix[i][j]=0;
             }
         }
     }

     // Remember, matrix[0][0] is a dependency for matrix[0][j], so iterate and mark it first;
     if(matrix[0][0]==0){
         for(int j=1;j<col;j++) matrix[0][j]=0;
     }
     // Since we didnt have a row element for col 0, we have to check variable col1, if its 0, then mark all its element as 0
     if(col1==0){
         for(int i=0;i<row;i++) matrix[i][0]=0;
     }

    }
}
