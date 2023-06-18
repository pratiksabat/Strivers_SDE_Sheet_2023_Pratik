import java.util.*;
import java.io.*;

public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K) {
		// ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		// Arrays.sort(arr);
		// // Write your code here.
		// for (int i = 0; i < arr.length-2; i++) {
		// int l=i+1;
		// int r=arr.length-1;
		// while (l<r) {
		// int sum=arr[i]+arr[l]+arr[r];
		// if(sum==K){
		// ArrayList<Integer> a = new ArrayList<>(i);
		// ArrayList<Integer> b = new ArrayList<>(l);
		// ArrayList<Integer> c = new ArrayList<>(r);
		// res.add(a);
		// res.add(b);
		// res.add(c);
		// return res;
		// }
		// l++;
		// r--;
		// }
		// }
		// return res;

		// Write your code here.

		Arrays.sort(arr);

		// Write your code here.

		java.util.HashSet<ArrayList<Integer>> map = new java.util.HashSet<>();

		for (int i = 0; i < n; i++)

		{

			int left = i + 1;

			int right = n - 1;

			int sum = K - arr[i];

			while (left < right)

			{

				if ((arr[left] + arr[right]) == sum)

				{

					ArrayList<Integer> one = new ArrayList<>();

					one.add(arr[i]);

					one.add(arr[left]);

					one.add(arr[right]);

					map.add(one);

					left++;

				}

				else if ((arr[left] + arr[right]) < sum)

				{

					left++;

				}

				else if ((arr[left] + arr[right]) > sum)

				{

					right--;

				}

			}

		}

		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

		ans.addAll(map);

		return ans;
	}
}
