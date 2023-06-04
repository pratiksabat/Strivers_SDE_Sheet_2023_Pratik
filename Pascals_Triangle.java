class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
				 ArrayList<Integer> firstRow = new ArrayList<>();
				 firstRow.add(1);
				 res.add(firstRow);
				 
				 for(int i=2;i<=numRows;i++){
					 res.add(generateNthRow(i));
				 }
         
      return res; 
    }
	public static List<Integer> generateNthRow(int n){
		List<Integer> rowList = new ArrayList<>();
		int ans=1;
		rowList.add(ans);
		for(int col=1;col<n;col++){
			ans=ans*(n-col);
			ans=ans/col;
			rowList.add(ans);
		}
		return rowList;
	}
}
