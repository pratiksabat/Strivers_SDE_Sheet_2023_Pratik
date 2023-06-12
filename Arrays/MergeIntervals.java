class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        
        Arrays.sort(intervals,new Comparator<>(){
            public int compare(int[] a,int[] b){
                return a[0]-b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(ans.isEmpty() || intervals[i][0]>ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            }else{
                ans.get(ans.size()-1).set(1,Math.max(intervals[i][1],ans.get(ans.size()-1).get(1)));
            }
        }

        int[][] res = new int[ans.size()][2];
        int c=0;
        for(List<Integer> ar: ans){
            res[c][0]=ar.get(0);
            res[c][1]=ar.get(1);
            c++;
        }

        return res;
    }
}
